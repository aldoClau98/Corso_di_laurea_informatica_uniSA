import java.io.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.*;
import java.util.HashMap;
import java.util.logging.*;

public class Client {

	static Logger logger=  Logger.getLogger("global");
	
	public static void main(String args[]) {
		
		String host = "localhost";
		String cmd;
		 in = new BufferedReader(new  InputStreamReader(System.in));
		try {
			while(!(cmd= ask("Comandi>")).equals("quit")) {
				
				if(cmd.equals(("inserisci"))){
				System.out.println("Inserire i  dati: ");
				String nome= ask("nome: ");
				String indirizzo = ask("Indirizzo: ");
				RecordRegistro r = new RecordRegistro(nome, indirizzo);
				Socket socket= new Socket (host, 7000);
				ObjectOutputStream sock_out = new  ObjectOutputStream(socket.getOutputStream());
				sock_out.writeObject(r);
				sock_out.flush();
				socket.close();
				} else if(cmd.contentEquals("cerca")) {
					
					System.out.println("inserire il  nome per la ricerca: ");
					String nome= ask("nome: ");
					RecordRegistro r= new RecordRegistro(nome, null);
					//si invia un oggetto  con indirizzo vuoto
					Socket socket = new Socket(host,7000);
					ObjectOutputStream sock_out = new  ObjectOutputStream(socket.getOutputStream());
					sock_out.writeObject(r);
					sock_out.flush();
					ObjectInputStream sock_in = new ObjectInputStream(socket.getInputStream());
					RecordRegistro result = (RecordRegistro) sock_in.readObject();
					//se viene ottenuto un risultato allora si stampa l'indirizzo
					if(result!=null) {
						System.out.println("Indirizzo: "+result.getIndirizzo());
					} else
						System.out.println("Record non prensente!");
					socket.close();
				}else  System.out.println(ERRORMSG);
				
			}//end while
		}catch(Throwable t) {
			logger.severe("Lanciata throwable: "+ t.getMessage());
			t.printStackTrace();
		}
		System.out.println("bye bye");
	}
	
	
	
	private static String ask(String prompt) throws IOException{
		System.out.println(prompt+" ");
		return (in.readLine());
	}
	static final String  ERRORMSG="Cosa?";
	static BufferedReader in= null;
}
