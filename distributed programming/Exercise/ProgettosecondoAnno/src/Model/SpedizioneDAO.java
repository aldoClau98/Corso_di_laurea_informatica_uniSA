package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SpedizioneDAO {

	public SpedizioneDAO() {
		super();
	};
	/*
	public  Spedizione  doRetrieveById(int id) {
		try (Connection con = DriverManagerConnectionPool.getConnection()) {
			PreparedStatement ps = con
					.prepareStatement("SELECT IDspedizione, data_spedizione, corriere, IDordini FROM spedizioni join ordini on IDordini=IDordine WHERE IDspedizione=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Spedizione p = new Spedizione();
				p.setIDspedizione(rs.getInt(1));
				p.setData_spedizione(rs.getString(2));
				p.setCorriere(rs.getString(3));
				p.setIDordini(rs.getInt(4));
				return p;
			
	}
			return null;
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public ArrayList<Spedizione> doRetrieveAll() {
		
		try (Connection con = DriverManagerConnectionPool.getConnection()){
			PreparedStatement ps= con.prepareStatement("SELECT IDspedizione, data_spedizione, corriere, IDordini FROM spedizioni join ordini on IDordini=IDordine;");
				
				ArrayList<Spedizione> spedizioni = new ArrayList<>();
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					Spedizione p = new  Spedizione();
					p.setIDspedizione(rs.getInt(1));
					p.setData_spedizione(rs.getString(2));
					p.setCorriere(rs.getString(3));
					p.setIDordini(rs.getInt(4));
					spedizioni.add(p);
				}
				return spedizioni;
		}catch(SQLException e) {
			throw  new  RuntimeException(e);
		}
	}
	
	
	*/

		public  void doSave(String corriere, int IDpagamenti) {
			try (Connection con = DriverManagerConnectionPool.getConnection()){
				PreparedStatement ps= con.prepareStatement("insert into  spedizioni(corriere,IDpagamenti) value(?,?);");
				
					ps.setString(1,corriere);
					ps.setInt(2, IDpagamenti);
					
				ps.executeUpdate();
		
			}catch(SQLException e) {
				throw  new  RuntimeException(e);
			}
		}
		
		
		}

