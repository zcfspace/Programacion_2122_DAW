package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejWhileTut7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int n = 0, i = 0, x = 0, pares = 0, impares = 0, contador = 0;
		int valor[];
		int buscar;

		System.out.print("Introduzca cuantos numeros enteros quiere cargar: ");
		n = teclado.nextInt();

		// creamos un raid con cantiad n.
		valor = new int[n];

		// Mientras que x es menor o igual que n, seguira haciendo el bucle
		while (i < n) {
			System.out.print("Introduzca el valor " + (i + 1) + " : ");
			valor[i] = teclado.nextInt();
			// Si el valor divido entre 2 es 0, el numero es par. Sé sumará uno al pares.
			if (valor[i] % 2 == 0) {
				pares++;
			}
			// Si no, suma 1 al impares.
			else {
				impares++;
			}
			// cada vez que haga un bucle, suma 1 al 1
			i++;
		}

		// Mostramos por consola
		System.out.println("Cantadad de pares: " + pares);
		System.out.println("Cantidad de impares: " + impares);
		System.out.println("Cantidad de numero: " + n);

		// Buscar el valor
		System.out.println("\nIngrese el valor a buscar: ");
		buscar = teclado.nextInt();

		// Mienrtas que x no sea mayor que n (numero de numero que hay en array),
		// seguira ejecutando el bucle
		while (x < n) {
			// Si el el valor a buscar es igual al valor [n] del array, muestra por consola
			if (buscar == valor[x])
				System.out.println("El numero introducido esta en la array");
			// Si no, suma 1 al contador.
			else
				contador++;
			// Suma 1, cada vez que ejecute el bucle
			x++;

		}
		// Si se ha comprobado todos los numeros, y no se ha encontrado el numero,
		// mostrara por consola de que no esta en la array
		if (contador == n)
			System.out.println("El numero introducido no esta en la array");

		// cerramos teclado
		teclado.close();
	}

}
