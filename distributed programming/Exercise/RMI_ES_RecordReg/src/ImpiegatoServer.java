
public class ImpiegatoServer  implements Impiegato{
	
	//costruttore
	public ImpiegatoServer(String n, String I, int s) {
		nome= n;
		ID=I;
		stipendio= s;
	}
		//metodi  necessari
	public String getNome() {
		return nome;
	}
	public String getID() {
		return ID;
		
	}
	public int getStipendio() {
		return stipendio;
		
	}
	
	//Metodi  specifici
	public int aumentaStipendio(int diQuanto) {
		if(diQuanto >0) {
			stipendio +=diQuanto;
		}
		return stipendio;
	}
	//variabili istanza
	private String nome;
	private String ID;
	private int stipendio;
}
