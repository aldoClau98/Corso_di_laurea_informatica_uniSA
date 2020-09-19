import java.rmi.*;
import java.util.logging.*;

public class HelloClient  {

	static  Logger logger = Logger.getLogger("global");
	
	public static void main(String args[]) {
		
		try {
			logger.info("Sto cercado l'oggetto remoto...");
			Hello obj = (Hello) Naming.lookup("rmi://localhost/HelloServer");
			logger.info("...Trovato! ORa invoco il metodo...");
			String risultato = obj.dimmiQualcosa(" Aldo");
			System.out.println("Ricevuto: "+risultato);
		}catch(Exception  e) {
			e.printStackTrace();
		}
	}//fine main
}//fine classe HelloClient
