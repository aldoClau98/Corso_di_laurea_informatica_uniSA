package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;

public class PagamentoDAO {

	public synchronized int doSave( String indirizzo, int cap, String paese,String citta,String tipoCarta, String numeroCarta,int  IDutenti, GregorianCalendar data) {
		PreparedStatement ps = null;

		try (Connection conn = DriverManagerConnectionPool.getConnection();) {
			ps = conn.prepareStatement(
					"insert into pagamenti(indirizzo,cap,paese,citta,tipocarta,numerocarta,idutenti,data_pagamento) values (?,?,?,?,?,?,?,?);");
			ps.setString(1, indirizzo);
			ps.setInt(2, cap);
			ps.setString(3, paese);
			ps.setString(4, citta);
			ps.setString(6, numeroCarta);
			ps.setString(5, tipoCarta);
			ps.setInt(7, IDutenti);
			ps.setDate(8,new Date(new GregorianCalendar().getTimeInMillis()));

			int rs = ps.executeUpdate();
			return rs;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return 0;

	}
	

	public synchronized Pagamento doRetrieveByIdCli(int IDcli) {
		PreparedStatement ps = null;
		Pagamento a =new Pagamento();

		try (Connection conn = DriverManagerConnectionPool.getConnection();) {
			ps = conn.prepareStatement("select * from pagamenti where IDutenti=?");
			ps.setInt(1, IDcli);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				a.setIDpagamento(rs.getInt("IDpagamento"));
				a.setNumeroCarta(rs.getString("NumeroCarta"));
				a.setTipoCarta(rs.getString("TipoCarta"));
				a.setCitta(rs.getString("citta"));
				a.setCap(rs.getInt("cap"));
				a.setPaese(rs.getString("paese"));
				a.setIndirizzo(rs.getString("indirizzo"));
			
				
				
		}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

}
