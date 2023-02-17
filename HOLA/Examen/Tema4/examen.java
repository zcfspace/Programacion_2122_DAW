package examen4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class examen {

	public static final String RUTA = "c:\\logs\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String fichero = "";

		// Introducimos el nombre del fichero
		System.out.print("Introduce el fichero de destino: ");
		fichero = teclado.next();

		// Comprobamos los metodos
		guardarDatos(fichero);
		leerDatos(fichero);

		// Cerramos el teclado
		teclado.close();

	}

	/**
	 * Metodo para guardar los datos
	 * 
	 * @param fichero
	 */

	static void guardarDatos(String fichero) {

		// Iniciamos teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion de varibles
		String nombre = "";
		String marca = "";
		String modelo = "";
		double precio = 0;
		int stock = 0;
		String tipo = "";
		String producto = "";
		boolean hayMasAlticulos = true;

		try {

			// Creamos el fichero con FileWriter y utilizamos PrintWriter
			// Para escribir en el
			FileWriter fw = new FileWriter(RUTA + fichero + ".txt", false);
			PrintWriter pw = new PrintWriter(fw);

			// Mientras la variable hayMasAlticulos no sea true seguimos leyendo
			while (hayMasAlticulos != false) {

				System.out.print("\nIntroduce el nombre del producto:");
				nombre = teclado.next();

				System.out.print("Introduce la marca del producto:");
				marca = teclado.next();

				System.out.print("Introduce el modelo del producto:");
				modelo = teclado.next();

				System.out.print("Introduce el precio del producto:");
				precio = teclado.nextDouble();

				System.out.print("Cantidad de producto en stocks:");
				stock = teclado.nextInt();

				System.out.print("Introduce el tipo del producto:");
				tipo = teclado.next();

				// Para escribir los datos, se creará una variable string con todos los datos
				// separados por “:” y luego se escribirá dicha variable al fichero.

				producto = nombre + ":" + marca + ":" + modelo + ":" + precio + ":" + stock + ":" + tipo;

				pw.println(producto);

				System.out.print("Hay mas producto a introducir? (false o true):");
				hayMasAlticulos = teclado.nextBoolean();
			}

			// Cerramos los buffered
			fw.close();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" no se encuentra el fichero");

		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println(" no se pudo escribir en el fichero");
		}
		teclado.close();
	}

	/**
	 * Metodo para guardar los leer datos
	 * 
	 * @param fichero
	 */
	static void leerDatos(String fichero) {

		// Declaracion de variables
		String linea = "";

		File ficheroComponenete = new File(RUTA + fichero + ".txt");

		try {

			// Especificamos el fichero a leer

			FileReader fr = new FileReader(ficheroComponenete);
			BufferedReader br = new BufferedReader(fr);

			// Declaracion de variable
			int i = 1;
			String nombre = "";
			String marca = "";
			String modelo = "";
			String precio = "";
			String stock = "";
			String tipo = "";

			// Leemos linea a linea el fichero
			linea = br.readLine();

			// Mientras la linea leida no sea la ultima seguimos leyendo
			while (linea != null) {

				StringTokenizer st = new StringTokenizer(linea, ":");

				// En cada linea, los voy leyendo y se los voy asignando a las variables y por
				// lo ultimo lo imprimos por consola

				nombre = st.nextToken();
				marca = st.nextToken();
				modelo = st.nextToken();
				precio = st.nextToken();
				stock = st.nextToken();
				tipo = st.nextToken();

				System.out.println("\nComponente " + i + ": " + tipo + " " + nombre + " " + marca + " " + modelo);
				System.out.println("Precio: " + precio);
				System.out.println("Stock: " + stock);

				i++;
				linea = br.readLine();
			}

			// Cerramos los buffered
			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" no se encuentra el fichero");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
