import java.io.Serializable;
public class RecordRegistro implements Serializable {
private static final long servialVersionUID = 1L;

//costruttore
	public  RecordRegistro(String n, String i) {
		name=n;
		indirizzo=i;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	

	private String name;
	private String indirizzo;
}
