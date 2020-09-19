package Model;
import java.util.ArrayList;

public class Carrello {
	private int idcarrello, idprodotto, idutente;
	private ArrayList<Prodotti> listaProdotti = new ArrayList<Prodotti>();
	
	/*iniziaizzo il  costruttore vuoto
	Carrello() {
	}
*/

	public int getIdcarrello() {
		return idcarrello;
	}


	public void setIdcarrello(int idcarrello) {
		this.idcarrello = idcarrello;
	}


	public int getIdprodotto() {
		return idprodotto;
	}


	public void setIdprodotto(int idprodotto) {
		this.idprodotto = idprodotto;
	}


	public int getIdutente() {
		return idutente;
	}


	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}


	public ArrayList<Prodotti> getListaProdotti() {
		return listaProdotti;
	}


	public void setListaProdotti(ArrayList<Prodotti> listaProdotti) {
		this.listaProdotti = listaProdotti;
	}


	

	
	public int getSize() {
		return listaProdotti.size();
	}


	@Override
	public String toString() {
		return "Carrello [idcarrello=" + idcarrello + ", idprodotto=" + idprodotto + ", idutente=" + idutente
				+ ", listaProdotti=" + listaProdotti + "]";
	}
	
	
}
