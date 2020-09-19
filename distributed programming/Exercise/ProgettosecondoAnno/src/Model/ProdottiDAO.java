package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdottiDAO {
	
	
	public   Prodotti  doRetrieveById(int id) {
		try (Connection con = DriverManagerConnectionPool.getConnection()) {
			PreparedStatement ps = con
					.prepareStatement("select IDprodotto, nome  , numero ,prezzo, descrizione , IDcategorie, NomeCategoria, locazioni from prodotti join categorie  on IDcategorie=IDcategoria WHERE IDprodotto=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Prodotti p = new Prodotti();
				p.setIDprodotto(rs.getInt(1));
				p.setNome(rs.getString(2));
				p.setNumero(rs.getInt(3));
				p.setPrezzo(rs.getInt(4));
				p.setDescrizione(rs.getString(5));
				p.setNomecategoria(rs.getString(7));
				p.setLocazioni(rs.getString(8));
				return p;
			
	}
			return null;
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
public ArrayList<Prodotti> doRetrieveAll() {
		
		try (Connection con = DriverManagerConnectionPool.getConnection()){
			PreparedStatement ps= con.prepareStatement("select IDprodotto, nome, numero, prezzo, descrizione, IDcategorie, NomeCategoria , locazioni FROM prodotti join categorie  on IDcategorie=IDcategoria");
				
				ArrayList<Prodotti> listaProdotti = new ArrayList<>();
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Prodotti p = new Prodotti();
					p.setIDprodotto(rs.getInt(1));
					p.setNome(rs.getString(2));
					p.setNumero(rs.getInt(3));
					p.setPrezzo(rs.getDouble(4));
					p.setDescrizione(rs.getString(5));
					p.setNomecategoria(rs.getString(7));
					p.setLocazioni(rs.getString(8));
					
					listaProdotti.add(p);
				}
				return listaProdotti;
		}catch(SQLException e) {
			throw  new  RuntimeException(e);
		}
	}

public  int  doSave( String nome,int numero, double prezzo,  String descrizione, int IDcategorie, String locazione) {
	int rs =0;
	try (Connection con = DriverManagerConnectionPool.getConnection()){
		PreparedStatement ps= con.prepareStatement("insert into  Prodotti( nome  , numero ,prezzo, descrizione , IDcategorie,locazioni) value(?,?,?,?,?,?);");
	
			ps.setString(1,nome);
			ps.setInt(2, numero);
			ps.setDouble(3, prezzo);
			ps.setString(4, descrizione);
			ps.setInt(5, IDcategorie);
			ps.setString(6, locazione);
			
		rs= ps.executeUpdate();
			return rs;
	}catch(SQLException e) {
		throw  new  RuntimeException(e);
	}
}

public int  doUpdate( int IDprodotto, String nome,int numero, double prezzo,  String descrizione) {
	int rs=0;
	try (Connection con = DriverManagerConnectionPool.getConnection()){
		PreparedStatement ps= con.prepareStatement("UPDATE prodotti SET  nome=?  , numero=? ,prezzo=?, descrizione=? WHERE IDprodotto = ?;");
			
			ps.setString(1,nome);
			ps.setInt(2, numero);
			ps.setDouble(3, prezzo);
			ps.setString(4, descrizione);
			ps.setInt(5, IDprodotto);
		rs=	 ps.executeUpdate();
			
			return rs;
	}catch(SQLException e) {
		throw  new  RuntimeException(e);
	}
}

public  void doDelete(int IDprodotto) {  
	System.out.println(IDprodotto +"iddel prodotto");
try (Connection con = DriverManagerConnectionPool.getConnection()){
	PreparedStatement ps= con.prepareStatement("DELETE FROM Prodotti WHERE IDprodotto=?;");
		ps.setInt(1, IDprodotto);
		

		ps.executeUpdate();

}catch(SQLException e) {
	throw  new  RuntimeException(e);
}

}
public ArrayList<Prodotti> doRetrieveCategoria(String categoria) {
	
	try (Connection con = DriverManagerConnectionPool.getConnection()){
		PreparedStatement ps= con.prepareStatement("select IDprodotto, nome, numero, prezzo, descrizione, IDcategorie, NomeCategoria,locazioni FROM prodotti join categorie  on IDcategorie=IDcategoria WHERE NomeCategoria=?");
			
			ArrayList<Prodotti> listaProdotti = new ArrayList<>();
			ps.setString(1, categoria);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Prodotti p = new Prodotti();
				p.setIDprodotto(rs.getInt(1));
				p.setNome(rs.getString(2));
				p.setNumero(rs.getInt(3));
				p.setPrezzo(rs.getDouble(4));
				p.setDescrizione(rs.getString(5));
				p.setNomecategoria(rs.getString(7));
				p.setLocazioni(rs.getString(8));
				listaProdotti.add(p);
			}
			return listaProdotti;
	}catch(SQLException e) {
		throw  new  RuntimeException(e);
	}
}

public   int   getCategoria(String nomecategoria) {
	try (Connection con = DriverManagerConnectionPool.getConnection()) {
		PreparedStatement ps = con
				.prepareStatement("select  IDcategoria, NomeCategoria from categorie   WHERE NomeCategoria=?");
		ps.setString(1, nomecategoria);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int p;
			p=rs.getInt(1);
			return p;
		
}
		return -1;
	}
	catch (SQLException e) {
		throw new RuntimeException(e);
	}
}


public static ArrayList<Prodotti> doRetrieveAllSearch(String ricerca, int limit) {

	try (Connection conn = DriverManagerConnectionPool.getConnection();) {
		java.sql.Statement st = conn.createStatement();
		String ricerca2 = "'" + ricerca + "%'";
		String query = "select * from Prodotti  where Prodotti.nome like"
				+ ricerca2;
		
		ResultSet result = st.executeQuery(query);

		ArrayList<Prodotti> lista = new ArrayList<Prodotti>();
		while (result.next()) {
			Prodotti a = new Prodotti();
			a.setIDprodotto(result.getInt("IDprodotto"));
			a.setNome(result.getString("nome"));
			a.setDescrizione(result.getString("descrizione"));
			a.setPrezzo(result.getFloat("prezzo"));
		
			lista.add(a);
		}
		return lista;
	} catch (SQLException e) {
		e.printStackTrace();
	}

	return null;
}

}
