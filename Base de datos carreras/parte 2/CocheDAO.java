package baseDatosCarrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

public class CocheDAO {

	/**
	 * Funcion para eliminar un elemento en base de datos
	 * 
	 * @param codXX
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int eliminar(String codXX) {

		int okey = 1;
		int error = 0;

		// Conexion para acceder a BD
		Connection con = null;
		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "DELETE FROM coche WHERE idcoche =?";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			// Ejecutamos la query
			okey = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return error;
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return error;
		}

		return okey;
	}

	/**
	 * Funcioann para insertar una coche
	 * 
	 * @param coche
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int insertar(CocheVO coche) {

		int okey = 1;
		int error = 0;

		// Consulta a ejecutar
		String query = "INSERT INTO  coche (?,?,?,?,?)";

		// Comprobamos que no nos hayan metido un coche nulo
		if (coche == null)
			return error;

		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, coche.getIdCoche());
			pStmt.setString(2, coche.getMarca());
			pStmt.setString(3, coche.getMarca());
			pStmt.setInt(4, coche.getPeso());
			pStmt.setInt(5, coche.getPotencia());

			// Ejecutamos la query
			okey = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return error;
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return error;
		}

		return okey;
	}

	/**
	 * Funcioann para actualizar una coche
	 * 
	 * @param coche
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int actualizar(CocheVO coche) {

		int okey = 1;
		int error = 0;
		int posicion = 1;

		// Consulta a ejecutar
		String query = "UPDATE coche SET ";

		// Comprobamos que no nos hayan metido un coche nulo
		if (coche == null)
			return error;

		// Comprobamos si el marca se ha introducido para modificar
		// En cuyo caso lo añadimos a la query
		if (coche.getMarca() != null && !coche.getMarca().equals("")) {
			query = query + "marca=?";
			posicion++;
		}

		// Para los siguientes campos, hay que poner la "," si ya había antes
		// un campo previo en el set, lo sabemos porque la posicion
		// ya se habra incrementado y no sera 1

		if (coche.getModelo() != null && !coche.getModelo().equals("")) {
			if (posicion == 1)
				query = query + "modelo=?";
			else
				query = query + ",modelo=?";

			posicion++;
		}

		if (coche.getPeso() >= 0) {
			if (posicion == 1)
				query = query + "peso=?";
			else
				query = query + ",peso=?";

			posicion++;
		}

		if (coche.getPotencia() >= 0) {
			if (posicion == 1)
				query = query + "potencia=?";
			else
				query = query + ",potencia=?";

			posicion++;
		}

		// Añadimos el where al final para que modifique solo el coche
		query = query.concat(" WHERE idcoche=?");

		// Si no hay ningun campo a modificar nos salimos
		if (posicion == 1)
			return error;

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();
		try {
			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			// Reseteamos la posicion
			posicion = 1;

			if (coche.getMarca() != null && !coche.getMarca().equals("")) {
				pStmt.setString(posicion, coche.getMarca());
				posicion++;
			}

			if (coche.getModelo() != null && !coche.getModelo().equals("")) {
				pStmt.setString(posicion, coche.getModelo());
				posicion++;
			}

			if (coche.getPeso() >= 0) {
				pStmt.setInt(posicion, coche.getPeso());
				posicion++;
			}

			if (coche.getPotencia() >= 0) {
				pStmt.setInt(posicion, coche.getPotencia());
				posicion++;
			}

			// Ponemos el id del coche
			pStmt.setString(posicion, coche.getIdCoche());

			// Ejecutamos la instruccion
			okey = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return error;

		}

		return okey;
	}

	/**
	 * Devuelve un objeto coche
	 * 
	 * @param codXX
	 * @return
	 */
	public static CocheVO cargar(String codXX) {

		// Consulta a ejecutar
		String query = "SELECT * FROM coche WHERE idcoche=?";

		// Creamos el coche a devolver
		CocheVO coche = new CocheVO();

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();

		try {
			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			ResultSet res = pStmt.executeQuery();

			// Anadimos los campos de coche
			if (res.next()) {

				coche.setIdCoche(res.getString(1));
				coche.setMarca(res.getString(2));
				coche.setModelo(res.getString(3));
				coche.setPeso(res.getInt(4));
				coche.setPotencia(res.getInt(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return coche;
	}
}
