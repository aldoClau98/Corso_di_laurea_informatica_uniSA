
public class ImpiegatoServer {
	
	//Costruttore
	public ImpiegatoServer(String n, String  I, int s) {
		name=n;
		ID=I;
		stipendio=s;
	}
	
	//Metodi
	public int aumentaStipendio (int diQuanto) {
		if(diQuanto>0) 
			stipendio +=diQuanto;
			return stipendio;
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	private int stipendio;
	private String name;
	private String ID;
}
