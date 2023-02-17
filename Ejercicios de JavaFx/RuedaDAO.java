package baseDatosCarrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.ConexionBD;

public class RuedaDAO {

	public static ArrayList<RuedaVO> listaRueda() {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		// Creamos el arraylist
		ArrayList<RuedaVO> listaRueda = new ArrayList<RuedaVO>();

		String query = "SELECT * FROM ruedas";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos
			// En una estructura resultset
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				String idRuedas = res.getString(1);
				String marca = res.getString(2);
				String modelo = res.getString(3);
				int dimensiones = res.getInt(4);
				int peso = res.getInt(5);
				String componente = res.getString(6);
				String estado = res.getString(7);
				String idCoche = res.getString(8);
				String fecha = res.getString(9);
				int sesion = res.getInt(10);

				// idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion
				RuedaVO rueda = new RuedaVO(idRuedas, marca, modelo, dimensiones, peso, componente, estado, idCoche,
						fecha, sesion);

				listaRueda.add(rueda);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaRueda;

	}

	/**
	 * Funcioann para insertar una rueda
	 * 
	 * @param rueda
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int insertar(RuedaVO rueda) {

		int okey = 1;
		int error = 0;

		// Consulta a ejecutar
		String query = "INSERT INTO rueda (?,?,?,?,?,?,?,?,?,?)";

		// Comprobamos que no nos hayan metido un rueda nulo
		if (rueda == null)
			return error;

		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			// idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion

			pStmt.setString(1, rueda.getIdRuedas());
			pStmt.setString(2, rueda.getMarca());
			pStmt.setString(3, rueda.getModelo());
			pStmt.setInt(4, rueda.getDimensiones());
			pStmt.setInt(5, rueda.getPeso());
			pStmt.setString(6, rueda.getComponente());
			pStmt.setString(7, rueda.getEstado());
			pStmt.setString(8, rueda.getCocheIdCoche());
			pStmt.setString(9, rueda.getFecha());
			pStmt.setInt(10, rueda.getSesion());

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
	 * Funcion para eliminar un elemento en base de datos
	 * 
	 * @param idRueda
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int eliminar(String idRueda) {

		int okey = 1;
		int error = 0;

		// Conexion para acceder a BD
		Connection con = null;
		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "DELETE FROM ruedas WHERE idruedas=?";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, idRueda);

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
	 * Funcioann para actualizar una rueda
	 * 
	 * @param rueda
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int actualizar(RuedaVO rueda) {

		int okey = 1;
		int error = 0;
		int posicion = 1;

		// Consulta a ejecutar
		String query = "UPDATE ruedas SET ";

		// Comprobamos que no nos hayan metido un rueda nulo
		if (rueda == null)
			return error;

		// Comprobamos si el numVueltas se ha introducido para modificar
		// En cuyo caso lo a�adimos a la query

		// idruedas,marca,modelo,dimensiones,peso,componente,estado,coche_idcoche,fecha,sesion
		if (rueda.getMarca() != null && !rueda.getMarca().equals("")) {
			query = query + "marca=?";
			posicion++;
		}

		// Para los siguientes campos, hay que poner la "," si ya hab�a antes
		// un campo previo en el set, lo sabemos porque la posicion
		// ya se habra incrementado y no sera 1

		if (rueda.getModelo() != null && !rueda.getModelo().equals("")) {
			if (posicion == 1)
				query = query + "modelo=?";
			else
				query = query + ",modelo=?";

			posicion++;
		}

		if (rueda.getDimensiones() >= 0) {
			if (posicion == 1)
				query = query + "dimensiones=?";
			else
				query = query + ",dimensiones=?";

			posicion++;
		}

		if (rueda.getPeso() >= 0) {
			if (posicion == 1)
				query = query + "peso=?";
			else
				query = query + ",peso=?";

			posicion++;
		}

		if (rueda.getComponente() != null && !rueda.getComponente().equals("")) {
			if (posicion == 1)
				query = query + "componente=?";
			else
				query = query + ",componente=?";

			posicion++;
		}

		if (rueda.getEstado() != null && !rueda.getEstado().equals("")) {
			if (posicion == 1)
				query = query + "estado=?";
			else
				query = query + ",estado=?";

			posicion++;
		}

		if (rueda.getCocheIdCoche() != null && !rueda.getCocheIdCoche().equals("")) {
			if (posicion == 1)
				query = query + "coche_idcoche=?";
			else
				query = query + ",coche_idcoche=?";

			posicion++;
		}

		if (rueda.getFecha() != null && !rueda.getFecha().equals("")) {
			if (posicion == 1)
				query = query + "fecha=?";
			else
				query = query + ",fecha=?";

			posicion++;
		}

		if (rueda.getSesion() >= 0) {
			if (posicion == 1)
				query = query + "sesion=?";
			else
				query = query + ",sesion=?";

			posicion++;
		}

		// A�adimos el where al final para que modifique solo el jugador
		query = query.concat(" WHERE idruedas=?");

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

			if (rueda.getMarca() != null && !rueda.getMarca().equals("")) {
				pStmt.setString(posicion, rueda.getModelo());
				posicion++;
			}

			if (rueda.getModelo() != null && !rueda.getModelo().equals("")) {
				pStmt.setString(posicion, rueda.getModelo());
				posicion++;
			}

			if (rueda.getDimensiones() >= 0) {
				pStmt.setInt(posicion, rueda.getDimensiones());
				posicion++;
			}

			if (rueda.getPeso() >= 0) {
				pStmt.setInt(posicion, rueda.getPeso());
				posicion++;
			}

			if (rueda.getComponente() != null && !rueda.getComponente().equals("")) {
				pStmt.setString(posicion, rueda.getComponente());
				posicion++;
			}

			if (rueda.getEstado() != null && !rueda.getEstado().equals("")) {
				pStmt.setString(posicion, rueda.getEstado());
				posicion++;
			}

			if (rueda.getCocheIdCoche() != null && !rueda.getCocheIdCoche().equals("")) {
				pStmt.setString(posicion, rueda.getCocheIdCoche());
				posicion++;
			}

			if (rueda.getFecha() != null && !rueda.getFecha().equals("")) {
				pStmt.setString(posicion, rueda.getFecha());
				posicion++;
			}

			if (rueda.getSesion() >= 0) {
				pStmt.setInt(posicion, rueda.getSesion());
				posicion++;
			}

			// Ponemos el id del rueda
			pStmt.setString(posicion, rueda.getIdRuedas());

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

}
