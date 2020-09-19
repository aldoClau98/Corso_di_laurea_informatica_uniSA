import java.io.*;
import java.net.*;
import java.util.logging.*;

public class Server {
	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9000);
			logger.info("Socket inizializzato, accetto connessioni...");
			Socket socket = serverSocket.accept();
			logger.info("Accettata una connessione... Attendo  comandi");
			ObjectOutputStream outStream = new ObjectOutputStream (socket.getOutputStream());
			ObjectInputStream inStream = new ObjectInputStream (socket.getInputStream());
			String nome=(String) inStream.readObject();
			logger.info("Rcevuto: "+nome);
			outStream.writeObject("Hello "+nome);
			socket.close();
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
}
