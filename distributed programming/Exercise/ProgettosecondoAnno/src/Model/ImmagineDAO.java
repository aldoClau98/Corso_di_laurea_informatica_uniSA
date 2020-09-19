package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImmagineDAO {

	public synchronized int doSave(String locazione) {
		PreparedStatement ps = null;

		try (Connection conn = DriverManagerConnectionPool.getConnection();) {
			ps = conn.prepareStatement("insert into Immagini(locazione) values (?);");
			ps.setString(1, locazione);

			int rs = ps.executeUpdate();
			return rs;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return 0;
	}

	public synchronized Immagine doRetrieveIdByLocazione(String locazione) {
		PreparedStatement ps = null;
		Immagine a = new Immagine();
		try (Connection conn = DriverManagerConnectionPool.getConnection();) {
			ps = conn.prepareStatement("select * from Immagini where locazione=?");
			ps.setString(1,locazione);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				a.setLocazione(rs.getString("locazione"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}

}
