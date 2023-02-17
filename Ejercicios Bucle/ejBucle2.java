package ejBucle2;

import java.util.Scanner;

public class ejBucle2 {

	public static void main(String[] args) {

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int numLeido = 0;
		int numFact = 1;
		int numSum = 0;

		System.out.print("Introduce un número:");
		numLeido = teclado.nextInt();

		for (int i = 1; i <= numLeido; i++) {
			numSum += i;
			numFact *= i;
		}

		System.out.println("Factorial: " + numFact);
		System.out.println("Sumatoria: " + numSum);

		// Cerramos teclado
		teclado.close();
	}

}
