import java.io.*;
import java.net.*;


public class Impiegato_Stub implements Impiegato{
	
	//costruttore
	public Impiegato_Stub(String host) throws Throwable{
		//inizializzazione variabili di istanza
		socket = new Socket(host,9000);
		out= new ObjectOutputStream(socket.getOutputStream());
		in = new ObjectInputStream(socket.getInputStream());
	}
	
	//metodo remoto di  accesso al nome
	public String getNome() throws Throwable{
		out.writeObject("getNome");
		out.flush();
		return (String) in.readObject();
	}
	//metodo remoto per l'accesso all'ID
	public String getID() throws Throwable{
		out.writeObject("getID");
		out.flush();
		return (String) in.readObject();
	}
	//metodo  remoto per laccesso allo stipendio
	
	public int getStipendio() throws Throwable{
		out.writeObject("getStipendio");
		out.flush();
		return  in.readInt();
	}
	
	//metodo remoto per l'aumento  dello stipendio
	public int aumentaStipendio(int diQuanto) throws Throwable{
		out.writeObject("aumentaStipendio");
		out.writeInt(diQuanto);
		out.flush();
		return  in.readInt();
	}
	//Metodo  locale per la chiusura del socket con lo  sckeleton
	public void close() {
		try {
			socket.close();
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}
	
	//variabili  di  istanza
	
	Socket socket;
	ObjectOutputStream out;
	ObjectInputStream in;
}
