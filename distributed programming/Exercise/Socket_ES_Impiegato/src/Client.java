

import java.util.logging.*;



public class Client {
	
	static Logger logger = Logger.getLogger("global");
	
	
	public static void main(String[] args) {
		try {
		//si  istanzia un impiegato
		Impiegato imp= new Impiegato_Stub(args[0]); //host
		System.out.println("Nome: "+ imp.getNome());
		System.out.println("ID: "+imp.getID());
		System.out.println("Stipendio: "+imp.getStipendio());
		
		System.out.println("Aumenta lo  stipendio di 1000 euro");
		System.out.println("Stipendio: "+imp.aumentaStipendio(1000));
		
		((Impiegato_Stub)imp).close();
		}catch(Throwable t) {
			 t.printStackTrace();
		}
	}

}
