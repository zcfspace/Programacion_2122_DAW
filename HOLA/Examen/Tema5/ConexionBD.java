package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	/**
	 * Funcion que se conecta a la BD de mysql y nos devuelve la conexion
	 * 
	 * @return Una conexion activa a la bd o null si no se pudo conectar
	 */
	public static Connection conectarBD() {

		// Parametros para la conexion a BD
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/phonestorage";
		// Conexion para acceder a BD
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Nos conectamos a la Base de Datos
			con = DriverManager.getConnection(url, user, password);

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

}
