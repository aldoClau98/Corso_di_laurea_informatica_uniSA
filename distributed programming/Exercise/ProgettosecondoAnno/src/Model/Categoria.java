package Model;

public class Categoria {
	private int IDcategoria;
	private String nomeCategoria;
	public  Categoria() {
		super();
	}
	public int getIDcategoria() {
		return IDcategoria;
	}
	public void setIDcategoria(int iDcategoria) {
		IDcategoria = iDcategoria;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	@Override
	public String toString() {
		return "Categoria [IDcategoria=" + IDcategoria + ", nomeCategoria=" + nomeCategoria + "]";
	}

	

}
