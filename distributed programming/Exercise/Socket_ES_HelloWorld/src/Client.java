import java.io.*;
import java.net.*;
import java.util.logging.*;

public class Client {
	static Logger logger = Logger.getLogger("global");
	
	public static void main(String[] args) {
		try {
			Socket socket= new Socket ("localhost",9000);
			ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
			
			out.writeObject("Aldo");
			System.out.println(in.readObject());
			socket.close();
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}

}
