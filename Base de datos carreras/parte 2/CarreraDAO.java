package baseDatosCarrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.ConexionBD;

public class CarreraDAO {

	/**
	 * Funcion que devuelve un arraylist de carrera CarreraDAO tiene un arraylist de
	 * pilotoVO.
	 * 
	 * @return
	 */
	public static ArrayList<PilotoVO> listarPiloto() {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		// Creamos el arraylist
		ArrayList<PilotoVO> listaPiloto = new ArrayList<PilotoVO>();

		String query = "SELECT * FROM piloto";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos
			// En una estructura resultset
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				String idPiloto = res.getString(1);
				String dni = res.getString(2);
				String nombre = res.getString(3);
				int edad = res.getInt(4);
				String sexo = res.getString(5);
				String direccion = res.getString(6);
				String cocheIdCoche = res.getString(7);

				PilotoVO piloto = new PilotoVO(idPiloto, dni, nombre, edad, sexo, direccion, cocheIdCoche);

				listaPiloto.add(piloto);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return listaPiloto;

	}

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
			String query = "DELETE FROM carreras WHERE idcarreras=?";

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
	 * Funcioann para insertar una carrera
	 * 
	 * @param carrera
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int insertar(CarreraVO carrera) {

		int okey = 1;
		int error = 0;

		// Consulta a ejecutar
		String query = "INSERT INTO  carrera (?,?,?,?,?,?,?)";

		// Comprobamos que no nos hayan metido un carrera nulo
		if (carrera == null)
			return error;

		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, carrera.getIdCarreras());
			pStmt.setInt(2, carrera.getNumVueltas());
			pStmt.setDouble(3, carrera.getVueltaRapida());
			pStmt.setInt(4, carrera.getNumAccidentes());
			pStmt.setString(5, carrera.getFecha());
			pStmt.setString(6, carrera.getCircuitosIdCircuitos());
			pStmt.setString(6, carrera.getCampeonatoIdCampeonato());

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
	 * Funcioann para actualizar una carrera
	 * 
	 * @param carrera
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int actualizar(CarreraVO carrera) {

		int okey = 1;
		int error = 0;
		int posicion = 1;

		// Consulta a ejecutar
		String query = "UPDATE carreras SET ";

		// Comprobamos que no nos hayan metido un carrera nulo
		if (carrera == null)
			return error;

		// Comprobamos si el numVueltas se ha introducido para modificar
		// En cuyo caso lo añadimos a la query
		if (carrera.getNumVueltas() >= 0) {
			query = query + "numvueltas=?";
			posicion++;
		}

		// Para los siguientes campos, hay que poner la "," si ya había antes
		// un campo previo en el set, lo sabemos porque la posicion
		// ya se habra incrementado y no sera 1

		if (carrera.getVueltaRapida() >= 0) {
			if (posicion == 1)
				query = query + "vueltarapida=?";
			else
				query = query + ",vueltarapida=?";

			posicion++;
		}

		if (carrera.getNumAccidentes() >= 0) {
			if (posicion == 1)
				query = query + "numaccidentes=?";
			else
				query = query + ",numaccidentes=?";

			posicion++;
		}

		if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {
			if (posicion == 1)
				query = query + "fecha=?";
			else
				query = query + ",fecha=?";

			posicion++;
		}

		if (carrera.getCircuitosIdCircuitos() != null && !carrera.getCircuitosIdCircuitos().equals("")) {
			if (posicion == 1)
				query = query + "circuitos_idcircuitos=?";
			else
				query = query + ",circuitos_idcircuitos=?";

			posicion++;
		}

		if (carrera.getCampeonatoIdCampeonato() != null && !carrera.getCampeonatoIdCampeonato().equals("")) {
			if (posicion == 1)
				query = query + "campeonato_idcampeonato=?";
			else
				query = query + ",campeonato_idcampeonato=?";

			posicion++;
		}

		// Añadimos el where al final para que modifique solo el jugador
		query = query.concat(" WHERE idcarreras=?");

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

			if (carrera.getNumVueltas() >= 0) {
				pStmt.setInt(posicion, carrera.getNumVueltas());
				posicion++;
			}

			if (carrera.getVueltaRapida() >= 0) {
				pStmt.setDouble(posicion, carrera.getVueltaRapida());
				posicion++;
			}

			if (carrera.getNumAccidentes() >= 0) {
				pStmt.setInt(posicion, carrera.getNumAccidentes());
				posicion++;
			}

			if (carrera.getFecha() != null && !carrera.getFecha().equals("")) {
				pStmt.setString(posicion, carrera.getFecha());
				posicion++;
			}

			if (carrera.getCircuitosIdCircuitos() != null && !carrera.getCircuitosIdCircuitos().equals("")) {
				pStmt.setString(posicion, carrera.getCircuitosIdCircuitos());
				posicion++;
			}

			if (carrera.getCampeonatoIdCampeonato() != null && !carrera.getCampeonatoIdCampeonato().equals("")) {
				pStmt.setString(posicion, carrera.getCampeonatoIdCampeonato());
				posicion++;
			}

			// Ponemos el id del carrera
			pStmt.setString(posicion, carrera.getIdCarreras());

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
	 * Devuelve un objeto carrera
	 * 
	 * @param codXX
	 * @return
	 */
	public static CarreraVO cargar(String codXX) {

		// Consulta a ejecutar
		String query = "SELECT * FROM carrera WHERE idcarreras=?";

		// Creamos el carrera a devolver
		CarreraVO carrera = new CarreraVO();

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();

		try {

			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			ResultSet res = pStmt.executeQuery();

			// Anadimos los campos de carrera
			if (res.next()) {
				carrera.setIdCarreras(res.getString(1));
				carrera.setNumVueltas(res.getInt(2));
				carrera.setVueltaRapida(res.getDouble(3));
				carrera.setNumAccidentes(res.getInt(4));
				carrera.setFecha(res.getString(5));
				carrera.setCircuitosIdCircuitos(res.getString(6));
				carrera.setCampeonatoIdCampeonato(res.getString(7));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return carrera;
	}

	/**
	 * Devuleve un arraylist de pilotos de un carrera especifico
	 * 
	 * @param codCampeonato
	 * @return
	 */
	public static ArrayList<PilotoVO> cargarPilotos(String codCarrera) {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		// Creamos el arraylist
		ArrayList<PilotoVO> listaPilotos = new ArrayList<PilotoVO>();

		String query = "SELECT * FROM piloto WHERE idcarreras=?";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codCarrera);

			// Ejecutamos la query y nos devuelve los datos
			// En una estructura resultset
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				String idPiloto = res.getString(1);
				String dni = res.getString(2);
				String nombre = res.getString(3);
				int edad = res.getInt(4);
				String sexo = res.getString(5);
				String direccion = res.getString(6);
				String cocheIdCoche = res.getString(7);

				PilotoVO piloto = new PilotoVO(idPiloto, dni, nombre, edad, sexo, direccion, cocheIdCoche);

				listaPilotos.add(piloto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaPilotos;
	}

}
