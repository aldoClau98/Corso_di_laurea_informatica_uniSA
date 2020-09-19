package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreferitiDAO {

	public synchronized ArrayList<Prodotti> doRetrieveByKey(int idCli) {
		PreparedStatement ps = null;
		ArrayList<Prodotti> lista = new ArrayList<Prodotti>();
		try (Connection conn = DriverManagerConnectionPool.getConnection()) {
			ps = conn.prepareStatement(
					"select Prodotti.IDprodotto,Prodotti.nome,prezzo,locazioni, descrizione from Prodotti join ListaPreferiti on ListaPreferiti.IDprodotti=Prodotti.IDprodotto join Utenti on ListaPreferiti.IDutenti=Utenti.IDutente join Immagini on Prodotti.locazioni=Immagini.locazione where ListaPreferiti.IDutenti=?;");
			ps.setInt(1, idCli);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Prodotti a = new Prodotti();
				a.setIDprodotto(rs.getInt("IDprodotto"));
				a.setNome(rs.getString("nome"));
				a.setPrezzo(rs.getFloat("prezzo"));
				a.setLocazioni(rs.getString("locazioni"));
				a.setDescrizione(rs.getString("descrizione"));

				lista.add(a);
			}
			return lista;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Prodotti doRetrieveByIdList(int id) {

		PreparedStatement ps = null;

		try (Connection conn = DriverManagerConnectionPool.getConnection();) {
			ps = conn.prepareStatement(
					"select IDprodotto,nome,prezzo,locazioni,descrizione from Prodotti join Immagini on Immagini.locazione=Prodotti.locazioni where Prodotti.IDprodotto=?;");
			ps.setInt(1, id);

			ResultSet result = ps.executeQuery();

			if (result.next()) {
				Prodotti a = new Prodotti();
				a.setIDprodotto(result.getInt("IDpro"));
				a.setNome(result.getString("nome"));
				a.setPrezzo(result.getFloat("prezzo"));
				a.setLocazioni(result.getString("locazioni"));
				a.setDescrizione(result.getString("descrizione"));
				return a;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public synchronized int doSave(int IDcli, int IDprodotto) {
		PreparedStatement ps = null;
		try (Connection conn = DriverManagerConnectionPool.getConnection()) {
			ps = conn.prepareStatement("insert into ListaPreferiti(IDutenti,IDprodotti) values(?,?);");
			ps.setInt(1, IDcli);
			ps.setInt(2, IDprodotto);
			int rs = ps.executeUpdate();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public synchronized void deleteProdotto(int idCliente, int IDprodotto) {
		PreparedStatement ps = null;
		try (Connection conn = DriverManagerConnectionPool.getConnection()) {

			ps = conn.prepareStatement("delete from ListaPreferiti where IDprodotti=? and IDutenti=?;");
			ps.setInt(1, IDprodotto);
			ps.setInt(2, idCliente);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
