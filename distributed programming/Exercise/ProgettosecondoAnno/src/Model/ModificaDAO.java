package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModificaDAO {

	public ArrayList<Modifica> doRetrieveById(int id) {
		ArrayList<Modifica> lista = new ArrayList<Modifica>();
				try (Connection con = DriverManagerConnectionPool.getConnection()) {
			PreparedStatement ps = con
					.prepareStatement("select ordini.IDordine,prodotti.nome ,Pagamenti.TipoCarta, prodotti.prezzo \r\n" + 
							"from ordini join Pagamenti on IDpagamenti=IDpagamento \r\n" + 
							"join prodotti on ordini.IDprodotti= prodotti.IDprodotto \r\n" + 
							"where IDutenti=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Modifica p = new Modifica();
				p.setIdordine(rs.getInt(1));
				p.setNomeprodotto(rs.getString(2));
				p.setPrezzo(rs.getInt(4));
				p.setTipocarta(rs.getString(3));
				 lista.add(p);

			}
			return lista;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
