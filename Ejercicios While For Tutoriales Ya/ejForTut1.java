package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejForTut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaraci�n de variables
		int base, altura, superficie, cantidad = 0, f, n;

		System.out.print("Cuantos tri�ngulos procesar�:");
		n = teclado.nextInt();

		// Inicializaci�n contador ; Condici�n ; incremento contador
		// Mientras que f es menor que n, seguir� haciendo el bucle

		for (f = 1; f <= n; f++) {

			System.out.print("Ingrese el valor de la base:");
			base = teclado.nextInt();

			System.out.print("Ingrese el valor de la altura:");
			altura = teclado.nextInt();

			// Calculo de superficie
			superficie = base * altura / 2;

			System.out.println("La superficie es: " + superficie);

			// Si superficie es mayor que 12, suma uno a la cantidad
			if (superficie > 12) {
				cantidad++;
			}
		}

		// Mostramos por consola
		System.out.println("La cantidad de tri�ngulos con superficie superior a 12 son: " + cantidad);

		// cierre del teclado
		teclado.close();
	}

}
