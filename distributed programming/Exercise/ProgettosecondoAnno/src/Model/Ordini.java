package Model;

public class Ordini {

	private int IDordine;
	private int IDpagamenti;
	private int IDprodotti;

	public Ordini() {
		super();

	}

	
	@Override
	public String toString() {
		return "Ordini [IDordine=" + IDordine + ", IDpagamenti=" + IDpagamenti + ", IDprodotti=" + IDprodotti + "]";
	}


	public int getIDordine() {
		return IDordine;
	}


	public void setIDordine(int iDordine) {
		IDordine = iDordine;
	}


	public int getIDpagamenti() {
		return IDpagamenti;
	}


	public void setIDpagamenti(int iDpagamenti) {
		IDpagamenti = iDpagamenti;
	}


	public int getIDprodotti() {
		return IDprodotti;
	}


	public void setIDprodotti(int iDprodotti) {
		IDprodotti = iDprodotti;
	}

}
