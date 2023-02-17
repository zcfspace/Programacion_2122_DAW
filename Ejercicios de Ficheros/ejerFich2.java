package tema4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejerFich2 {

	public static final String RUTA = "c:\\logs\\";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// iniciamos teclado
		Scanner teclado = new Scanner(System.in);

		String fichero = "";

		System.out.print("Introduce el fichero a leer: ");
		fichero = teclado.next();

		System.out.println("El fichero contiene " + contarLineas(fichero) + " lineas.");

		teclado.close();
	}

	/**
	 * Funcion para contar las lineas de un fichero
	 * 
	 * @param fichero
	 * @return
	 */
	static int contarLineas(String fichero) {

		int i = 0;
		try {
			// especificamos el fichero a leer
			FileReader fr = new FileReader(RUTA + fichero);
			BufferedReader br = new BufferedReader(fr);

			// Leemos una linea
			String linea = br.readLine();
			i = 0;
			while (linea != null) {
				// Leemos la linea siguiente
				linea = br.readLine();
				i++;
			}
			// Cerramos los streams de lectura
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return i;

	}

}
