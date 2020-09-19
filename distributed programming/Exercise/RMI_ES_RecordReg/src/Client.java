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
import java.net.*;

public class Client {

	static Logger logger=  Logger.getLogger("global");
	
	public static void main(String args[]) {
		
	try {
		
			Impiegato imp= new Impiegato_Stub("localhost");//host
			System.out.println("Nome: "+imp.getNome());
			System.out.println("ID: "+imp.getID());
			System.out.println("Stipendio: "+imp.getStipendio());
			System.out.println("Aumentiamo l stipendio di 1000 euro: ");
			System.out.println("Ora il suo stipendio è di: "+imp.aumentaStipendio(1000));
			((Impiegato_Stub)imp).close();
		
	
	}catch(Throwable t) {
		logger.severe("Lanciata Throwable: "+t.getMessage());
		t.printStackTrace();
	}
	
}
}
				
				
				
				
				
				

