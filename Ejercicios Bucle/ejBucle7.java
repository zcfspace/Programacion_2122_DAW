package ejBucle2;

import java.util.Scanner;

public class ejBucle7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int x, y;

		// Leemos por teclado
		System.out.print("Introduce numero y: ");
		y = teclado.nextInt();

		System.out.print("Introduce numero x: ");
		x = teclado.nextInt();

		System.out.print("Divisores de " + y + ": ");

		// Inicialización contador ; Condición ; incremento contador
		for (int i = 1; i < x; i++) {
			// Si el resto de la división de "y".
			if (y % i == 0) {
				System.out.print(i + " ");

			}
		}
		// Cerramos por teclado
		teclado.close();

	}

}
