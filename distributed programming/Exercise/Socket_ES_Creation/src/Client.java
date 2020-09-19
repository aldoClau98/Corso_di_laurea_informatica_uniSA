import java.net.*;

import java.util.logging.*;
import java.io.*;
public class Client {
static Logger logger= Logger.getLogger("global");

public static void main(String[] args) {
	try {
		//apertura socket verso l host locale  dove abbiamo lanciato il  server
		Socket socket = new Socket("localhost",9000);
		//preleva gli  stream dal socket 
		//NB: si d eve aprire prima lo steam in output e poi  quello di input
		
		ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream inStream =  new ObjectInputStream(socket.getInputStream());
		//scrivo un  nome nello stream in output
		outStream.writeObject("Salvatore");
		System.out.println(inStream.readObject());
		//il client termina stampando  a video  quello che ha scritto  nello  stram in input 
		socket.close();
	}catch(EOFException e) {
		logger.severe("Problemi  di connessione: "+ e.getMessage());
		e.printStackTrace();
	}catch(Throwable t) {
		logger.severe("Lanciata Throwable: "+ t.getMessage());
		t.printStackTrace();
	}
}
	
}
