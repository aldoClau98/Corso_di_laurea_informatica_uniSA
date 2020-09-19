import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.logging.*;

public class Server {

	static Logger logger=  Logger.getLogger("global");
	
	public static void main(String[] args) {
		HashMap<String, RecordRegistro> hash= new HashMap<String, RecordRegistro>();
		Socket socket= null;
		System.out.println("in attesa di connessioni...");
		try {
			ServerSocket serverSocket = new  ServerSocket(7000);
			while(true) {
				socket = serverSocket.accept();
				
				ObjectInputStream in = new  ObjectInputStream(socket.getInputStream());
				
				RecordRegistro  record= (RecordRegistro) in.readObject();
				if(record.getIndirizzo()!=null) {//inserimento
					logger.info("Inserisco: "+record.getName()+", "+record.getIndirizzo());
					
					hash.put(record.getName(), record);
					
				}else {//ricerca
					logger.info("Cerco: "+record.getName());
					RecordRegistro res= hash.get(record.getName());
					ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
					out.writeObject(res);
					out.flush();
				}
				socket.close();
			}//fine while
			
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(Throwable t) {
			t.printStackTrace();
		}
		finally {
			try { socket.close();
			}catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
}
