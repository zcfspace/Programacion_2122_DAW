package baseDatosCarrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConexionBD;

public class PilotoDAO {

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
			String query = "DELETE FROM piloto WHERE idpiloto=?";

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
	 * Funcioann para insertar un piloto
	 * 
	 * @param campeonato
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int insertar(PilotoVO piloto) {

		int okey = 1;
		int error = 0;

		// Consulta a ejecutar
		String query = "INSERT INTO  carrera (?,?,?,?,?,?,?)";

		// Comprobamos que no nos hayan metido un piloto nulo
		if (piloto == null)
			return error;

		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, piloto.getIdPiloto());
			pStmt.setString(2, piloto.getDni());
			pStmt.setString(3, piloto.getNombre());
			pStmt.setInt(4, piloto.getEdad());
			pStmt.setString(5, piloto.getSexo());
			pStmt.setString(6, piloto.getDireccion());
			pStmt.setString(6, piloto.getCocheIdCoche());

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
	 * Funcicion para actualizar una piloto
	 * 
	 * @param campeonato
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int actualizar(PilotoVO piloto) {

		int okey = 1;
		int error = 0;
		int posicion = 1;

		// Consulta a ejecutar
		String query = "UPDATE piloto SET ";

		// Comprobamos que no nos hayan metido un piloto nulo
		if (piloto == null)
			return error;

		// Comprobamos si el dni se ha introducido para modificar
		// En cuyo caso lo añadimos a la query
		if (piloto.getDni() != null && !piloto.getDni().equals("")) {
			query = query + "dni=?";
			posicion++;
		}

		// Para los siguientes campos, hay que poner la "," si ya había antes
		// un campo previo en el set, lo sabemos porque la posicion
		// ya se habra incrementado y no sera 1

		if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {
			if (posicion == 1)
				query = query + "nombre=?";
			else
				query = query + ",nombre=?";

			posicion++;
		}

		if (piloto.getEdad() >= 0) {
			if (posicion == 1)
				query = query + "edad=?";
			else
				query = query + ",edad=?";

			posicion++;
		}

		if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {
			if (posicion == 1)
				query = query + "sexo=?";
			else
				query = query + ",sexo=?";

			posicion++;
		}

		if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {
			if (posicion == 1)
				query = query + "direccion=?";
			else
				query = query + ",direccion=?";

			posicion++;
		}

		if (piloto.getCocheIdCoche() != null && !piloto.getCocheIdCoche().equals("")) {
			if (posicion == 1)
				query = query + "coche_idcoche=?";
			else
				query = query + ",coche_idcoche=?";

			posicion++;
		}

		// Añadimos el where al final para que modifique solo el pilotp
		query = query.concat(" WHERE idpiloto=?");

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

			if (piloto.getDni() != null && !piloto.getDni().equals("")) {
				pStmt.setString(posicion, piloto.getDni());
				posicion++;
			}

			if (piloto.getNombre() != null && !piloto.getNombre().equals("")) {
				pStmt.setString(posicion, piloto.getNombre());
				posicion++;
			}

			if (piloto.getEdad() >= 0) {
				pStmt.setInt(posicion, piloto.getEdad());
				posicion++;
			}

			if (piloto.getSexo() != null && !piloto.getSexo().equals("")) {
				pStmt.setString(posicion, piloto.getSexo());
				posicion++;
			}

			if (piloto.getDireccion() != null && !piloto.getDireccion().equals("")) {
				pStmt.setString(posicion, piloto.getDireccion());
				posicion++;
			}

			if (piloto.getCocheIdCoche() != null && !piloto.getCocheIdCoche().equals("")) {
				pStmt.setString(posicion, piloto.getCocheIdCoche());
				posicion++;
			}

			// Ponemos el id del piloto
			pStmt.setString(posicion, piloto.getIdPiloto());

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
	 * Devuelve un objeto campeonato
	 * 
	 * @param codXX
	 * @return
	 */
	public static PilotoVO cargarPiloto(String codPiloto) {

		// Consulta a ejecutar
		String query = "SELECT * FROM piloto WHERE idpiloto=?";

		// Creamos el piloto a devolver
		PilotoVO piloto = new PilotoVO();

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();

		try {

			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codPiloto);

			ResultSet res = pStmt.executeQuery();

			// Anadimos los campos de piloto
			if (res.next()) {
				piloto.setIdPiloto(res.getString(1));
				piloto.setDni(res.getString(2));
				piloto.setNombre(res.getString(3));
				piloto.setEdad(res.getInt(4));
				piloto.setSexo(res.getString(5));
				piloto.setDireccion(res.getString(6));
				piloto.setCocheIdCoche(res.getString(7));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return piloto;
	}

	/**
	 * Devuelve un objeto coche
	 * 
	 * @param codXX
	 * @return
	 */
	public static CocheVO cargarCoche(String codCoche) {

		// Consulta a ejecutar
		String query = "SELECT * FROM coche WHERE idcoche=?";

		// Creamos el coche a devolver
		CocheVO coche = new CocheVO();

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();

		try {
			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codCoche);

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
