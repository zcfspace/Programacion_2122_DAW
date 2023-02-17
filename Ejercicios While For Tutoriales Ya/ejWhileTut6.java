package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejWhileTut6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int valor, x = 1, suma1 = 0, suma2 = 0;

		System.out.println("Primer lista");

		// Mientras que x es menor o igual que 25, seguira haciendo el bucle
		while (x <= 15) {
			System.out.print("Ingrese valor " + x + " la primera lista: ");
			valor = teclado.nextInt();
			// Cada vez que haga el bucle suma valor introducido por teclado al suma1, hasta
			// llegar a 15 vecez
			suma1 += valor;
			// Cada vez que haga un bucle suma 1 al x
			x++;
		}

		System.out.println("Segunda lista");
		// Reasignamos el valor a x para la lista2

		x = 1;
		// Mientras que x es menor o igual que 25, seguira haciendo el bucle
		while (x <= 15) {
			System.out.print("Ingrese valor " + x + " la segunda lista: ");
			valor = teclado.nextInt();
			// Cada vez que haga el bucle suma valor introducido por teclado al suma2, hasta
			// llegar a 15 vecez
			suma2 += valor;
			// Cada vez que haga un bucle suma 1 al x
			x++;
		}
		/**
		 * Si la suma de la primera lista es mayor que la segunda, muestra por consola:
		 * Lista 1 mayor. Si false, comprueba que si la segunda lista es mayor que la
		 * primera. Si false, muestra las listas son iguales
		 */
		if (suma1 > suma2) {
			System.out.print("Lista 1 mayor.");
		} else {
			if (suma2 > suma1) {
				System.out.print("Lista2 mayor.");
			} else {
				System.out.print("Listas iguales.");
			}
		}
		teclado.close();
	}

}
