package ejBucle2;

import java.util.Scanner;

public class ejBucle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int filas, columnas;

		// leer número de filas hasta que sea un número > 1

		do {
			System.out.print("Introduce número de filas: ");
			filas = teclado.nextInt();
		} while (filas < 2);

		// leer número de columnas hasta que sea un número > 1
		do {
			System.out.print("Introduce número de columnas: ");
			columnas = teclado.nextInt();
		} while (columnas < 2);
		for (int i = 1; i <= filas; i++) { // for para las filas
			for (int j = 1; j <= columnas; j++) { // for para las columnas
				System.out.print(" * ");
			} // fin del for para las columnas
			System.out.println();
		} // fin del for para las filas

		// Cerramos el teclado
		teclado.close();
	}

}
