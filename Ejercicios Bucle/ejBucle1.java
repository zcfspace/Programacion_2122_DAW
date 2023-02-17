package ejBucle2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejBucle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaraci�n de variables
		boolean salir = false;
		int opcion;
		int cantNumero, x = 0;
		int numero[];
		int numSuma = 0;
		int numMult = 1;

		// Lectura por teclado
		System.out.print("Cuantas numeros hay:");
		cantNumero = teclado.nextInt();

		// Nuevo array con n valor de cantNumero
		numero = new int[cantNumero];

		// Mientras que x sea menor cantNumero, seguir� ejecutando el bucle
		while (x < cantNumero) {
			// Introducci�n de valor
			System.out.print("Ingrese el numero " + (x + 1) + " : ");
			numero[x] = teclado.nextInt();
			// Si el n numero es mayor que 0 y menor que 10, hacan las operaciones
			if (numero[x] < 10 && numero[x] > 0) {
				numSuma += numero[x];
				numMult *= numero[x];
			} else {
				// Sino, muestra error por consola
				System.err.println("El numero debe ser positivo y menor que 10");
			}
			// Cada vez que haga el bucle suma 1.
			x++;
		}

		// Mienstras que no sea el caso 3, seguira haciendo el bucle.
		while (!salir) {
			// Opciones del menu
			System.out.println("\n1. Suma");
			System.out.println("2. Multiplicaci�n");
			System.out.println("3. Salir");

			try {
				System.out.println("Seleccione la operaci�n que deseas hacer: ");
				opcion = teclado.nextInt();

				// Selecci�n de menu
				switch (opcion) {
				case 1:
					System.out.println("La suma de todos los numeros es " + numSuma + "\n");
					break;
				case 2:
					System.out.println("La multiplicaci�n de todos los numeros es " + numMult + "\n");
					break;
				case 3:
					salir = true;
					break;
				// Si no coincide con ningun caso,
				default:
					System.err.println("\nSolo n�meros entre 1 y 3");
				}
				// Si no se introduce nada, muestra error por consola
			} catch (InputMismatchException e) {
				System.err.println("\nDebes insertar un n�mero");
				teclado.next();
			}
		}

		// Cerramos el teclado
		teclado.close();
	}

}
