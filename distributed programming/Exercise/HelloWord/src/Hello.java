import java.rmi.RemoteException;

public interface Hello  extends java.rmi.Remote{
	
	String dimmiQualcosa(String daChi) throws RemoteException;

}
