import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.*;

public class HelloImpl  extends UnicastRemoteObject implements Hello{
	//serialUID
	private static final  long serialversionUID= 1L;
	//Logger per la classe
	static Logger logger= Logger.getLogger("global");
	
	//Costruttore
	public HelloImpl() throws RemoteException {
		//VUOTO	 ma con la remoteException perche durante la creaione del  costruttore REMOTO potrebbero  verificarsi  vari tipi di errori  come quelli  di  rete
	}
	//metodo  remoto  dimmiQualcosa
	public String dimmiQualcosa(String daChi) throws RemoteException{
		logger.info("Sto salutando "+daChi);
		return "ciao!";
	
	}
	
	public static void main(String args[]) {
		System.setSecurityManager(new RMISecurityManager());//server per poter cercare classi dinamiche della rete 
		try {
			logger.info("Creo l'oggetto remoto...");
			HelloImpl obj = new HelloImpl();
			logger.info("...ora ne effettuo il  rebind...");
			Naming.rebind("HelloServer", obj);
			logger.info("....Pronto!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//end main

}//end clas helloImpl
