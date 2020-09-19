import java.net.*;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import  java.util.logging.*;

public class Server {

		static Logger logger = Logger.getLogger("global");
		
		public static void main(String[] args) {
			try {
				ServerSocket serverSocket = new ServerSocket(9000);
				logger.info("Socket istanziato, accetto connessioni...");
				Socket socket= serverSocket.accept();
				logger.info("Accettata una connessione, attendo comandi...");
				ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
				String nome= (String) inStream.readObject();
				logger.info("Ricevuto: "+nome);
				outStream.writeObject("Hello "+nome);
				socket.close();
			}catch(EOFException e) {
				logger.severe("Problemi con la connessione: "+ e.getMessage());
				e.printStackTrace();
			}catch(Throwable t) {
				logger.severe("Lanciata Throwable: "+t.getMessage());
				t.printStackTrace();
			}
		}
		
	}

