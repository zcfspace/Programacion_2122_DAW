package baseDatosCarrera;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.ConexionBD;

public class CampeonatoDAO {

	/**
	 * Funcion que devuelve un arraylist de carrera 4. CampeonatoDAO tiene un
	 * arrayList de CarreraVO
	 * 
	 * @return
	 */
	public static ArrayList<CarreraVO> listarCarrera() {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		// Creamos el arraylist
		ArrayList<CarreraVO> listaCarrera = new ArrayList<CarreraVO>();

		String query = "SELECT * FROM carreras";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos
			// En una estructura resultset
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				String idCarreras = res.getString(1);
				int numVueltas = res.getInt(2);
				double vueltaRapida = res.getDouble(3);
				int numAccidentes = res.getInt(4);
				String fecha = res.getString(5);
				String circuitosIdCircuitos = res.getString(6);
				String campeonatoIdCampeonato = res.getString(7);

				CarreraVO carrera = new CarreraVO(idCarreras, numVueltas, vueltaRapida, numAccidentes, fecha,
						circuitosIdCircuitos, campeonatoIdCampeonato);

				listaCarrera.add(carrera);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaCarrera;

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
			String query = "DELETE FROM campeonato WHERE idcoche=?";

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
	 * Funcioann para insertar un campeonato
	 * 
	 * @param campeonato
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int insertar(CampeonatoVO campeonato) {

		int okey = 1;
		int error = 0;

		// Consulta a ejecutar
		String query = "INSERT INTO  campeonato (?,?,?,?,?,?)";

		// Comprobamos que no nos hayan metido un campeonato nulo
		if (campeonato == null)
			return error;

		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, campeonato.getIdCampeonato());
			pStmt.setString(2, campeonato.getNombre());
			pStmt.setInt(3, campeonato.getAnio());
			pStmt.setInt(4, campeonato.getNumPilotos());
			pStmt.setInt(5, campeonato.getNumCircuitos());
			pStmt.setString(6, campeonato.getPilotoGanador());

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
	 * Funcioann para actualizar un campeonato
	 * 
	 * @param campeonato
	 * @return si ha habido fallo devuelve 0, si no 1
	 */
	public static int actualizar(CampeonatoVO campeonato) {

		int okey = 1;
		int error = 0;
		int posicion = 1;

		// Consulta a ejecutar
		String query = "UPDATE campeonato SET ";

		// Comprobamos que no nos hayan metido un campeonato nulo
		if (campeonato == null)
			return error;

		// Comprobamos si el nombre se ha introducido para modificar
		// En cuyo caso lo añadimos a la query
		if (campeonato.getNombre() != null && !campeonato.getNombre().equals("")) {
			query = query + "nombre=?";
			posicion++;
		}

		// Para los siguientes campos, hay que poner la "," si ya había antes
		// un campo previo en el set, lo sabemos porque la posicion
		// ya se habra incrementado y no sera 1

		if (campeonato.getAnio() >= 0) {
			if (posicion == 1)
				query = query + "anio=?";
			else
				query = query + ",anio=?";

			posicion++;
		}

		if (campeonato.getNumPilotos() >= 0) {
			if (posicion == 1)
				query = query + "numpilotos=?";
			else
				query = query + ",numpilotos=?";

			posicion++;
		}

		if (campeonato.getNumCircuitos() >= 0) {
			if (posicion == 1)
				query = query + "numcircuitos=?";
			else
				query = query + ",numcircuitos=?";

			posicion++;
		}
		if (campeonato.getPilotoGanador() != null && !campeonato.getPilotoGanador().equals("")) {
			if (posicion == 1)
				query = query + "piloto_ganador=?";
			else
				query = query + ",piloto_ganador=?";

			posicion++;
		}

		// Añadimos el where al final para que modifique solo el jugador
		query = query.concat(" WHERE idcampeonato=?");

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

			if (campeonato.getNombre() != null && !campeonato.getNombre().equals("")) {
				pStmt.setString(posicion, campeonato.getNombre());
				posicion++;
			}

			if (campeonato.getAnio() >= 0) {
				pStmt.setInt(posicion, campeonato.getAnio());
				posicion++;
			}

			if (campeonato.getNumPilotos() >= 0) {
				pStmt.setInt(posicion, campeonato.getNumPilotos());
				posicion++;
			}

			if (campeonato.getNumCircuitos() >= 0) {
				pStmt.setInt(posicion, campeonato.getNumCircuitos());
				posicion++;
			}

			if (campeonato.getPilotoGanador() != null && !campeonato.getPilotoGanador().equals("")) {
				pStmt.setString(posicion, campeonato.getPilotoGanador());
				posicion++;
			}

			// Ponemos el id del campeonato
			pStmt.setString(posicion, campeonato.getIdCampeonato());

			// Ejecutamos la instruccion
			okey = pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return okey;

	}

	/**
	 * Devuelve un objeto campeonato
	 * 
	 * @param codXX
	 * @return
	 */
	public static CampeonatoVO cargar(String codXX) {

		// Consulta a ejecutar
		String query = "SELECT * FROM campeonato WHERE idcampeonato=?";

		// Creamos el campeonato a devolver
		CampeonatoVO campeonato = new CampeonatoVO();

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();

		try {

			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			ResultSet res = pStmt.executeQuery();

			// Anadimos los campos de campeonato
			if (res.next()) {
				campeonato.setIdCampeonato(res.getString(1));
				campeonato.setNombre(res.getString(3));
				campeonato.setAnio(res.getInt(3));
				campeonato.setNumPilotos(res.getInt(4));
				campeonato.setNumCircuitos(res.getInt(5));
				campeonato.setPilotoGanador(res.getString(6));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return campeonato;
	}

	/**
	 * Devuleve un arraylist de carrera de un campeonato especifico
	 * 
	 * @param codCampeonato
	 * @return
	 */
	public static ArrayList<CarreraVO> cargarCarreras(String codCampeonato) {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		// Creamos el arraylist
		ArrayList<CarreraVO> listaCarrera = new ArrayList<CarreraVO>();

		String query = "SELECT * FROM carreras WHERE idcampeonato=?";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codCampeonato);

			// Ejecutamos la query y nos devuelve los datos
			// En una estructura resultset
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				String idCarreras = res.getString(1);
				int numVueltas = res.getInt(2);
				double vueltaRapida = res.getDouble(3);
				int numAccidentes = res.getInt(4);
				String fecha = res.getString(5);
				String circuitosIdCircuitos = res.getString(6);
				String campeonatoIdCampeonato = res.getString(7);

				CarreraVO carrera = new CarreraVO(idCarreras, numVueltas, vueltaRapida, numAccidentes, fecha,
						circuitosIdCircuitos, campeonatoIdCampeonato);

				listaCarrera.add(carrera);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaCarrera;
	}

	/**
	 * Funcion para contar la carreras que hay en un campeonato especifico
	 * 
	 * @param codCampeonato
	 * @return
	 */
	public static int cantidadCarreras(String codCampeonato) {

		int numCarrera = 0;

		// Consulta a ejecutar
		String query = "SELECT count(*) FROM carreras WHERE campeonato_idcampeonato =?";

		// Conexion para acceder a BD
		Connection con = ConexionBD.conectarBD();

		try {

			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codCampeonato);

			ResultSet res = pStmt.executeQuery();

			while (res.next()) {
				numCarrera = res.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return numCarrera;
	}

}
