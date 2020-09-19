package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CarrelloDAO {

	
	
	//attiviamo  la ricerca del  carrello per l' id del  cliente
	public synchronized ArrayList<Prodotti> doRetrieveByCliente(String idCliente) {
		
		PreparedStatement ps = null;
		ArrayList<Prodotti> lista = new ArrayList<Prodotti>();
		try(Connection conn = DriverManagerConnectionPool.getConnection()){
			ps= conn.prepareStatement("select Carrello.IDcarrello, Carrello.IDprodotti, Carrello.IDclienti, Prodotti.IDprodotto, nome, numero, prezzo, descrizione, Categorie.IDcategoria, nomeCategoria, locazioni ,Carrello.quantitacarrello\r\n" + 
					"							from  Carrello  \r\n" + 
					"								join Prodotti on Carrello.IDprodotti=Prodotti.IDprodotto \r\n" + 
					"									join  Categorie on Prodotti.IDCategorie=Categorie.IDcategoria \r\n" + 
					"					                  where Carrello.IDclienti=?;");
			int id;
				id = Integer.parseInt(idCliente);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Prodotti a = new Prodotti();
						a.setIDprodotto(rs.getInt("IDprodotto"));
						a.setNome(rs.getString("nome"));
						a.setNomecategoria(rs.getString("nomeCategoria"));
						a.setNumero(rs.getInt("numero"));
						a.setPrezzo(rs.getDouble("prezzo"));
						a.setDescrizione(rs.getString("descrizione"));
						a.setLocazioni(rs.getString(11));
						a.setQuantitacarrello(rs.getInt("quantitacarrello"));
						lista.add(a);
				}
					return lista;
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
			return null;
		
	}
	//ativiamo la ricerca per  l'IDdel  carrello
	public  Prodotti  doRetrieveByCarrello(int idprodotto){
		PreparedStatement ps= null;
	Prodotti p = new Prodotti();
		try ( Connection conn=DriverManagerConnectionPool.getConnection();){
			ps = conn.prepareStatement("select Prodotti.IDprodotto, nome, numero, prezzo, descrizione, IDcategorie, locazioni from Prodotti where IDprodotto=?;");
			ps.setInt(1, idprodotto);
			
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					Prodotti a = new Prodotti();
					a.setIDprodotto(rs.getInt("IDprodotto"));
					a.setNome(rs.getString("nome"));
					a.setNomecategoria(rs.getString("IDcategorie"));
					a.setNumero(rs.getInt("numero"));
					a.setPrezzo(rs.getDouble("prezzo"));
					a.setDescrizione(rs.getString("descrizione"));
					a.setLocazioni(rs.getString("locazioni"));
					return a;
				}
				
				
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public synchronized void deleteProdotto(int idCliente, int IDprodotto) {
		PreparedStatement ps=null;
		try(Connection conn = DriverManagerConnectionPool.getConnection()) {
			
			ps=conn.prepareStatement("delete from Carrello where IDprodotti=? and IDclienti=?;");
			ps.setInt(1,IDprodotto);
			ps.setInt(2, idCliente);
			
			ps.executeUpdate();
			
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public synchronized void deleteProdottoOrdine(int idCliente) {
		PreparedStatement ps=null;
		try(Connection conn = DriverManagerConnectionPool.getConnection()) {
			
			ps=conn.prepareStatement("delete from Carrello where IDclienti=?;");
			ps.setInt(1,idCliente);
			
			ps.executeUpdate();
			
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized int UpdateQuantita(int idCliente, int IDprodotto, int quantita) {
		PreparedStatement ps = null;
		try (Connection conn = DriverManagerConnectionPool.getConnection()) {
			ps = conn.prepareStatement("update Carrello set quantitaCarrello=? where IDprodotti=? and IDclienti=?;");
			ps.setInt(1, quantita);
			ps.setInt(2, IDprodotto);
			ps.setInt(3, idCliente);
			int result = ps.executeUpdate();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public synchronized int doSave(int IDcli, int IDprodotto,int quantitaCarrello,int IDcarrello) {
		PreparedStatement ps = null;
		try (Connection conn = DriverManagerConnectionPool.getConnection()) {
			ps = conn.prepareStatement("insert into Carrello(IDcarrello,IDclienti,IDprodotti,quantitaCarrello) values(?,?,?,?)");
			ps.setInt(1, IDcarrello);
			ps.setInt(2, IDcli);
			ps.setInt(3, IDprodotto );
			ps.setInt(4, quantitaCarrello);
			int rs = ps.executeUpdate();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public  Carrello doRetrieveByNumberCart (int idcliente) {
		PreparedStatement ps= null;
		try (Connection conn = DriverManagerConnectionPool.getConnection()){
			ps = conn.prepareStatement("select IDcarrello , IDclienti from Carrello where  IDclienti=?;");
		
						ps.setInt(1, idcliente);
			
			
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						Carrello  cart = new Carrello();
						cart.setIdcarrello(rs.getInt("IDcarrello"));
						cart.setIdprodotto(rs.getInt("IDclienti"));
						return cart;
					}
				
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return  null;
	}
	
	
	public  Carrello  getCarrelloByUtente(int idutente) {
		
		PreparedStatement ps;
		try(Connection conn= DriverManagerConnectionPool.getConnection()){
			
			ps= conn.prepareStatement("select IDcarrello, IDclienti, IDprodotto, nome, numero, prezzo, descrizione, locazioni from carrello join Prodotti on carrello.IDprodotti=Prodotti.IDprodotto where IDclienti=?;");
			ps.setInt(1,idutente);
			ArrayList<Prodotti> listaProdotti = new ArrayList<Prodotti>();
			Carrello cart=new Carrello();
			
			
			ResultSet rs =  ps.executeQuery();

			while(rs.next()) {
				Prodotti e = new Prodotti();
				
				cart.setIdcarrello( rs.getInt("IDcarrello"));
				cart.setIdutente(rs.getInt("IDclienti"));
				//l' id prodotto non serve perche gia abbiamo la lista
				e.setIDprodotto(rs.getInt(3));
				e.setNome(rs.getString(4));
				//inserire il nome della categoria
				e.setPrezzo(rs.getDouble(6));
				e.setDescrizione(rs.getString(7));
				e.setLocazioni(rs.getString("locazioni"));
				listaProdotti.add(e);

				
			}
			cart.setListaProdotti(listaProdotti);
			return cart;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	



	
}
