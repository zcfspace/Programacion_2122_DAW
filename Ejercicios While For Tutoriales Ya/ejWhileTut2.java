package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejWhileTut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		// n = numero de persona
		// Ponemos en x 1 porque se empiza contar desde 0.
		int n, x = 1;
		float altura, suma, promedio;
		suma = 0;

		System.out.print("Cuantas personas hay:");
		n = teclado.nextInt();

		// Mientras que x es menor o igual que n (numero de personas),seguira haciendo
		// el bucle.
		// Metemos suma dentro del bucle, para que cada vez haga un bucle sume.

		while (x <= n) {
			System.out.print("Ingrese la altura de la " + x + " persona: ");
			altura = teclado.nextFloat();

			// suma de altura de todas las personas
			suma += altura;
			// Cada vez que haga un bucle suma 1 al x
			x++;
		}

		// Operación para hallar el promedio
		promedio = suma / n;

		System.out.println("Altura promedio: " + promedio);

		teclado.close();

	}

}
