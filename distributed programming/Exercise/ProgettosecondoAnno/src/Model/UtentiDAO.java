package Model;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UtentiDAO {
	
	
	
	
	
	public   Utenti  doRetrieveById(int id) {
		try (Connection con = DriverManagerConnectionPool.getConnection()) {
			PreparedStatement ps = con
					.prepareStatement("SELECT IDutente, Username, email, password FROM Utenti WHERE IDutente=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Utenti p = new Utenti();
				p.setIDutenti(rs.getString(1));
				p.setUsername(rs.getString(2));
				p.setEmail(rs.getString(3));
				p.setPassword(rs.getString(4));
				return p;
			
	}
			return null;
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public ArrayList<Utenti> doRetrieveAll() {
		
		try (Connection con = DriverManagerConnectionPool.getConnection()){
			PreparedStatement ps= con.prepareStatement("SELECT IDutente, Username, email, Amministratore,password FROM utenti;");
				
				ArrayList<Utenti> users = new ArrayList<>();
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Utenti p = new  Utenti();
					p.setIDutenti(rs.getString(1));
					p.setPassword(rs.getString(5));
					p.setEmail(rs.getString(3));
					p.setUsername(rs.getString(2));
					p.setAmm(rs.getBoolean(4));
				
					users.add(p);
				}
				return users;
		}catch(SQLException e) {
			throw  new  RuntimeException(e);
		}
	}
	
	
	

		public  boolean doSave(String username, String email, String password,Boolean amstr) {
			try (Connection con = DriverManagerConnectionPool.getConnection()){
				PreparedStatement ps= con.prepareStatement("insert into  utenti(Username,Email,Password,Amministratore) value(?,?,?,?);");
					ps.setString(1, username);
					ps.setString(2,email);
					ps.setString(3, password);
					ps.setBoolean(4, amstr);
						ps.executeUpdate();
				
				
				return true;
			}catch(SQLException e) {
				throw  new  RuntimeException(e);
				
			}
		}
		
		public void  doUpdate( int IDutente, String  email, String password, String username, Boolean amstr) {
			
			try (Connection con = DriverManagerConnectionPool.getConnection()){
				PreparedStatement ps= con.prepareStatement("UPDATE utenti SET  Username=?, email=?, password=?, Amministratore=? WHERE IDutente = ?;");
					ps.setString(1, username);
					ps.setString(2,email);
					ps.setString(3, password);
					ps.setInt(5, IDutente);
					ps.setBoolean(4, amstr);
					 ps.executeUpdate();
		
			}catch(SQLException e) {
				throw  new  RuntimeException(e);
			}
			
		}

		public  void  doDelete(int idutente) {  
			
		try (Connection con = DriverManagerConnectionPool.getConnection()){
			PreparedStatement ps= con.prepareStatement("DELETE FROM Utenti WHERE IDutente=?;");
				ps.setInt(1, idutente);
				ps.executeUpdate();
	
		}catch(SQLException e) {
			throw  new  RuntimeException(e);
		}
		
		}
		
		
		public   Utenti  doRetrieveByLogin(String utente,String password) {
			try (Connection con = DriverManagerConnectionPool.getConnection()) {
				PreparedStatement ps = con.prepareStatement(
						"SELECT IDutente, Username, email, Amministratore,password FROM utenti WHERE Username=? AND password=?");
				ps.setString(1, utente);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					Utenti p = new  Utenti();
					p.setIDutenti(rs.getString(1));
					p.setPassword(rs.getString(5));
					p.setEmail(rs.getString(3));
					p.setUsername(rs.getString(2));
					p.setAmm(rs.getBoolean(4));
					return p;
				}
				return null;
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		public  ArrayList<Ordini> getOrdinibyIDutenti(int idutenti){
			try(Connection con = DriverManagerConnectionPool.getConnection()){
				
				ArrayList<Ordini> lista = new ArrayList<Ordini>();
				
				PreparedStatement ps = con.prepareStatement("select IDordine,IDpagamenti,IDprodotti from ordini join pagamenti on IDpagamenti=IDpagamento where IDutenti=?;");
				ps.setInt(1, idutenti);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					Ordini o = new Ordini();
					o.setIDordine(rs.getInt(1));
					o.setIDpagamenti(rs.getInt(2));
					o.setIDprodotti(rs.getInt(3));
					
					System.out.println(o.toString());
					lista.add(o);
				}return lista;
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
		}
		
		//metodi per il controllo
		
		
		public synchronized ArrayList<String> controlloUser(){
			PreparedStatement ps= null;
			ArrayList<String> array= new ArrayList<String>();
			try(Connection conn = DriverManagerConnectionPool.getConnection();) {
				ps= conn.prepareStatement("select Username from Utenti");
				ResultSet rs= ps.executeQuery();
			
				while(rs.next()) {
					String utente= rs.getString("Username");
					array.add(utente);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return array;
			
		}
		
		public synchronized ArrayList<String> controlloMail(){
			PreparedStatement ps= null;
			ArrayList<String> array= new ArrayList<String>();
			try(Connection conn = DriverManagerConnectionPool.getConnection();) {
				ps= conn.prepareStatement("select email from Utenti");
				ResultSet rs= ps.executeQuery();
			
				while(rs.next()) {
					String utente= rs.getString("email");
					array.add(utente);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return array;
			
		}

}
