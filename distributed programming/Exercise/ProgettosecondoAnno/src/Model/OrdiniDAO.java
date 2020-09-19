package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdiniDAO {
	
	
	public synchronized int doSave(int i, int j) {
		PreparedStatement ps = null;

		try (Connection conn = DriverManagerConnectionPool.getConnection();) {
			ps = conn.prepareStatement(
					"insert into ordini(IDpagamenti, IDprodotti) values (?,?);");
			ps.setInt(1, i);;
			ps.setInt(2, j);

			int rs = ps.executeUpdate();
			return rs;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return 0;
	}

}
