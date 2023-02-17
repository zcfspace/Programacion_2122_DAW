package examenTema5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import utils.ConexionBD;

public class PhoneStorageFunc {

	/**
	 * Opcion 1 Modulo para insertar un movil
	 */
	public static void opcion1() {

		Scanner teclado = new Scanner(System.in);

		int id;
		String brand;
		String model;
		int ram;
		int rom;
		String inches;
		String os;
		double price;
		int fiveg;

		System.out.println("idphones: ");
		id = teclado.nextInt();

		System.out.println("brand: ");
		brand = teclado.next();

		System.out.println("model: ");
		model = teclado.next();

		System.out.println("ram: ");
		ram = teclado.nextInt();

		System.out.println("rom: ");
		rom = teclado.nextInt();

		System.out.println("inches: ");
		inches = teclado.next();

		System.out.println("os: ");
		os = teclado.next();

		System.out.println("price: ");
		price = teclado.nextDouble();

		System.out.println("fiveg: ");
		fiveg = teclado.nextInt();

		teclado.close();

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		if (ifExists(id)) {
			System.out.println("El id ya exites");
			PhoneStorage.main(null);
		} else {
			try {

				// Consulta a ejecutar
				String query = "insert into phones values (?,?,?,?,?,?,?,?,?)";

				// El preparedStatement lo genera la conexion utilizando
				// la consulta/query a ejecutar
				PreparedStatement pStmt = con.prepareStatement(query);

				pStmt.setInt(1, id);
				pStmt.setString(2, brand);
				pStmt.setString(3, model);
				pStmt.setInt(4, ram);
				pStmt.setInt(5, rom);
				pStmt.setString(6, inches);
				pStmt.setString(7, os);
				pStmt.setDouble(8, price);
				pStmt.setInt(9, fiveg);

				// Ejecutamos la query
				pStmt.executeUpdate();

				// Cerramos el statement
				pStmt.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				PhoneStorage.main(null);

			}
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Funcion para determinar si el movil existe
	 * 
	 * @param nId
	 * @return
	 */
	public static boolean ifExists(int nId) {

		try {
			// Nos conectamos a la BD
			Connection con = ConexionBD.conectarBD();

			String query = "Select 1 from phones where id = ?";

			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, nId);

			ResultSet rs = pStmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return false;

	}

	/**
	 * Opcion 2
	 */
	public static void opcion2() {

		Scanner teclado = new Scanner(System.in);

		int id;

		System.out.println("Introduce el id del movil que desea ver: ");
		id = teclado.nextInt();

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		String query = "Select * from phones where idphones = ?";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, id);

			// Ejecutamos la query y nos devuelve los datos
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {
				System.out.println("Id: " + res.getInt("idphones"));
				System.out.println("brand: " + res.getString("brand"));
				System.out.println("model: " + res.getString("model"));
				System.out.println("ram: " + res.getInt("ram"));
				System.out.println("rom: " + res.getInt("rom"));
				System.out.println("inches: " + res.getString("inches"));
				System.out.println("os: " + res.getString("os"));
				System.out.println("price: " + res.getDouble("price"));
				System.out.println("fiveg: " + res.getInt("5g"));

				System.out.println("-----------------------------------");

			}

			modificarMovil(id);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PhoneStorage.main(null);

		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		teclado.close();
	}

	/**
	 * Modificar el movil
	 */
	public static void modificarMovil(int id) {

		Scanner teclado = new Scanner(System.in);

		String nomCampModf = "";
		String valor = "";

		System.out.println("Introduce el campo del nombre a modificar: ");
		nomCampModf = teclado.next();

		System.out.println("Introduce el campo del valor a modificar: ");
		valor = teclado.next();

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		// Consulta a ejecutar
		String query = "UPDATE phones SET ?=? WHERE idcarreras=?";

		try {
			// Creamos el preparedstaement
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, nomCampModf.toLowerCase());

			switch (nomCampModf.toLowerCase()) {
			case "idphones":
				pStmt.setInt(2, Integer.valueOf(valor));
				break;
			case "brand":
				pStmt.setString(2, valor);
				break;
			case "model":
				pStmt.setString(2, valor);
				break;
			case "ram":
				pStmt.setInt(2, Integer.valueOf(valor));
				break;
			case "rom":
				pStmt.setInt(2, Integer.valueOf(valor));
				break;
			case "inches":
				pStmt.setString(2, valor);
				break;
			case "os":
				pStmt.setString(2, valor);
				break;
			case "price":
				pStmt.setDouble(2, Double.parseDouble(valor));
				break;
			case "5g":
				pStmt.setString(2, valor);
				break;
			default:
				System.out.println("no exite ese campo");
				PhoneStorage.main(null);
			}
			pStmt.setInt(3, id);

			// Ejecutamos la instruccion
			pStmt.executeUpdate();

			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PhoneStorage.main(null);

		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		teclado.close();

	}

	/**
	 * Opcion 3
	 */
	public static void opcion3() {

		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {
			System.out.println("**** Estas es en la opcion 3 ****");
			System.out.println("1. Mostrar todos ordenados por nombre desc");
			System.out.println("2. Mostrar todos ordenados por precio desc");
			System.out.println("3. Mostrar los de Marca…");
			System.out.println("4. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = teclado.nextInt();

				switch (opcion) {
				case 1:
					mostrarMovilesDesMarca();
					break;
				case 2:
					mostrarMovilesDesPrecio();
					break;
				case 3:
					mostrarMarcaMoviles();
					break;
				case 4:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				teclado.next();
			}
		}

		teclado.close();
	}

	/**
	 * Modulo que muestra los jugadores en desc marca
	 */
	public static void mostrarMovilesDesMarca() {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		String query = "Select * from phones order by brand desc";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {

				System.out.println("Id: " + res.getInt("idphones"));
				System.out.println("brand: " + res.getString("brand"));
				System.out.println("model: " + res.getString("model"));
				System.out.println("ram: " + res.getInt("ram"));
				System.out.println("rom: " + res.getInt("rom"));
				System.out.println("inches: " + res.getString("inches"));
				System.out.println("os: " + res.getString("os"));
				System.out.println("price: " + res.getDouble("price"));
				System.out.println("fiveg: " + res.getInt("5g"));
				System.out.println("-----------------------------------");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PhoneStorage.main(null);

		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Modulo que muestra los jugadores en desc precio
	 */
	public static void mostrarMovilesDesPrecio() {

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		String query = "Select * from phones order by price desc";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {
				System.out.println("Id: " + res.getInt("idphones"));
				System.out.println("brand: " + res.getString("brand"));
				System.out.println("model: " + res.getString("model"));
				System.out.println("ram: " + res.getInt("ram"));
				System.out.println("rom: " + res.getInt("rom"));
				System.out.println("inches: " + res.getString("inches"));
				System.out.println("os: " + res.getString("os"));
				System.out.println("price: " + res.getDouble("price"));
				System.out.println("fiveg: " + res.getInt("5g"));
				System.out.println("-----------------------------------");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PhoneStorage.main(null);

		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Modulo todo los marcas de moviles
	 */
	public static void mostrarMarcaMoviles() {

		Scanner teclado = new Scanner(System.in);

		String marca = "";

		System.out.println("Introduce la marca");
		marca = teclado.next();

		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		String query = "Select * from phones where brand = ?";

		try {
			// Generamos el preparedStatement a partir de la query sql
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, marca.toLowerCase());

			// Ejecutamos la query y nos devuelve los datos
			ResultSet res = pStmt.executeQuery();

			while (res.next()) {
				System.out.println("Id: " + res.getInt("idphones"));
				System.out.println("brand: " + res.getString("brand"));
				System.out.println("model: " + res.getString("model"));
				System.out.println("ram: " + res.getInt("ram"));
				System.out.println("rom: " + res.getInt("rom"));
				System.out.println("inches: " + res.getString("inches"));
				System.out.println("os: " + res.getString("os"));
				System.out.println("price: " + res.getDouble("price"));
				System.out.println("fiveg: " + res.getInt("5g"));
				System.out.println("-----------------------------------");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PhoneStorage.main(null);

		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		teclado.close();
	}

	/**
	 * Elimina un elemento
	 * 
	 * @param codXX
	 * @return
	 */
	public static void opcion4() {

		Scanner teclado = new Scanner(System.in);

		String codXX = "";

		System.out.println("Introduce el id del movil a eliminar");
		codXX = teclado.next();

		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// Consulta a ejecutar
			String query = "DELETE FROM phones WHERE idphones=?";

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setString(1, codXX);

			// Ejecutamos la query
			pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PhoneStorage.main(null);
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		teclado.close();

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
