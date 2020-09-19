import java.util.*;
import java.io.*;
import  java.net.*;
public class Server {
	public static void main(String[] args) {
		
		Socket socket= null;
		System.out.println("In attesa  di  connessioni...");
		try {
			ServerSocket serverSocket = new  ServerSocket(8000);
			while(true) {
				socket= serverSocket.accept();
				
				ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
				
				ArrayList<Somma> lista =(ArrayList<Somma>) in.readObject();
				
				for(int i=0;i<lista.size();i++) {
					Somma x= lista.get(i);
				
				System.out.println("La somma è: "+(x.getA()+x.getB()));
				}
			}
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
