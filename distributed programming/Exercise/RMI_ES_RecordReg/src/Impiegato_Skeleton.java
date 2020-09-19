import java.io.*;
import java.net.*;


import javax.sound.midi.SysexMessage;

public class Impiegato_Skeleton extends Thread {

	//variabili di  istanza
	ImpiegatoServer mioServer;
		
	
	//Costruttore
	public Impiegato_Skeleton(ImpiegatoServer server) {
		mioServer = server;
	}
	public static void main(String[] args) {
		//Istanziazione oggetto  Server
		ImpiegatoServer impiegato = new ImpiegatoServer("Mario Rossi", "01721",30000);
		//Istanziazione skeleton  e sua esecuzione
		Impiegato_Skeleton skel = new Impiegato_Skeleton(impiegato);
		skel.start();
	}
	

	public void run() {
		Socket socket = null;
		String metodo;
		int parametro;
		System.out.println("Attendo connessioni...");
		try {
			//creazione ed accept su socket
			ServerSocket serverSocket = new ServerSocket(9000);
			socket = serverSocket.accept();
			System.out.println("Accettata una connessione... attendo comandi.");
			ObjectInputStream inStream  = new ObjectInputStream (socket.getInputStream());
			ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
			while(true) {
				
				//Lettura del nome del metodo  da eseguire
				metodo = (String) inStream.readObject();
				System.out.println(("Commando richiesto: "+metodo));
				
				if(metodo.equals("getNome")) {
				outStream.writeObject(mioServer.getNome());
				outStream.flush();	
			}else if (metodo.equals("getID")){
				outStream.writeObject(mioServer.getID());
				outStream.flush();
			}else if(metodo.equals("getStipendio")) {
				outStream.writeObject(mioServer.getStipendio());
				outStream.flush();
			}else if(metodo.equals("aumentaStipendio")) {
				parametro = inStream.readInt();
				outStream.writeObject(mioServer.aumentaStipendio(parametro));
				outStream.flush();
			}else break;	
		}//fine while
		}catch(EOFException e) {
			System.out.println("Terminata la connessione");
		}
		catch(Throwable t) {
			t.printStackTrace();
			System.out.println(("Skeleton:"+t.getMessage()));
		}
		finally { //chiusura del  socket e terminazione programma
			try {
				socket.close();
			}catch(IOException e ) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}//fine run()
	
	
	
}
