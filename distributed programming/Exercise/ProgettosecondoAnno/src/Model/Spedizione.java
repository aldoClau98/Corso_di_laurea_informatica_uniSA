package Model;

import java.util.Random;

public class Spedizione {
	private int IDspedizione;
	
	private String corriere;
	private String[] lista = { "Bartolini", "DHL", "SDA", "GLS", "Fedex", "UPS","simoncelli"};
	private int IDpagamenti;
	private Random r;

	
	public Spedizione() {
		super();
		
			r = new Random();
			int j = r.nextInt(7);
			String corriere = lista[j];
			setCorriere(corriere);
	
	}


	public int getIDspedizione() {
		return IDspedizione;
	}


	public void setIDspedizione(int iDspedizione) {
		IDspedizione = iDspedizione;
	}


	public String getCorriere() {
		return corriere;
	}


	public void setCorriere(String corriere) {
		this.corriere = corriere;
	}


	public String[] getLista() {
		return lista;
	}


	public void setLista(String[] lista) {
		this.lista = lista;
	}


	public int getIDpagamenti() {
		return IDpagamenti;
	}


	public void setIDpagamenti(int iDpagamenti) {
		IDpagamenti = iDpagamenti;
	}


	public Random getR() {
		return r;
	}


	public void setR(Random r) {
		this.r = r;
	}


}
