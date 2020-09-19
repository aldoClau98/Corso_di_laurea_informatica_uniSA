package Model;

public class Prodotti {
	
	private int IDprodotto;
	private String nome;
	private int numero;
	private int quantitacarrello;
	private double prezzo;
	private String descrizione;
	private String nomecategoria;
	private String locazioni;
	
	public  Prodotti() {
		super();
		
	}

	public int getIDprodotto() {
		return IDprodotto;
	}

	public void setIDprodotto(int iDprodotto) {
		IDprodotto = iDprodotto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	
	}

	
	public String getNomecategoria() {
		return nomecategoria;
	}

	public void setNomecategoria(String nomecategoria) {
		this.nomecategoria = nomecategoria;
	}

	@Override
	public String toString() {
		return "Prodotti [IDprodotto=" + IDprodotto + ", nome=" + nome + ", numero=" + numero + ", quantitacarrello="
				+ quantitacarrello + ", prezzo=" + prezzo + ", descrizione=" + descrizione + ", nomecategoria="
				+ nomecategoria + ", locazioni=" + locazioni + "]";
	}

	public int getQuantitacarrello() {
		return quantitacarrello;
	}

	public void setQuantitacarrello(int quantitacarrello) {
		this.quantitacarrello = quantitacarrello;
	}

	public String getLocazioni() {
		return locazioni;
	}

	public void setLocazioni(String locazioni) {
		this.locazioni = locazioni;
	}
	

}
