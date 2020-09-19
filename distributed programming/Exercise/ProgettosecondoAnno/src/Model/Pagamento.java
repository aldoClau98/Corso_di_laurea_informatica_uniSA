package Model;

import java.util.GregorianCalendar;

public class Pagamento {

	private int IDpagamento;
	private String indirizzo;
	private int cap;
	private String paese;
	private String citta ;
	private String tipoCarta;
	private String numeroCarta;
	private int IDordini;
	private int IDutenti;
	private GregorianCalendar data= new GregorianCalendar();
	
	
	public int getIDpagamento() {
		return IDpagamento;
	}
	public void setIDpagamento(int iDpagamento) {
		IDpagamento = iDpagamento;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getPaese() {
		return paese;
	}
	public void setPaese(String paese) {
		this.paese = paese;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getTipoCarta() {
		return tipoCarta;
	}
	public void setTipoCarta(String tipoCarta) {
		this.tipoCarta = tipoCarta;
	}
	public String getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(String string) {
		this.numeroCarta = string;
	}
	public int getIDordini() {
		return IDordini;
	}
	public void setIDordini(int iDordini) {
		IDordini = iDordini;
	}
	public int getIDutenti() {
		return IDutenti;
	}
	public void setIDutenti(int iDutenti) {
		IDutenti = iDutenti;
	}
	public GregorianCalendar getData() {
		return data;
	}
	public void setData(GregorianCalendar data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Pagamento [IDpagamento=" + IDpagamento + ", indirizzo=" + indirizzo + ", cap=" + cap + ", paese="
				+ paese + ", citta=" + citta + ", tipoCarta=" + tipoCarta + ", numeroCarta=" + numeroCarta
				+ ", IDordini=" + IDordini + ", IDutenti=" + IDutenti + ", data=" + data + "]";
	}
	
	

}
