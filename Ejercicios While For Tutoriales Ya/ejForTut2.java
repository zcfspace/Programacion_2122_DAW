package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejForTut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variabls
		int f, valor, suma = 0;

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor que 10, seguirá haciendo el bucle
		for (f = 1; f <= 10; f++) {

			System.out.print("Ingrese un valor:");
			valor = teclado.nextInt();

			// Si f es mayor que 5, suma el valor
			if (f > 5) {
				suma += valor;
			}
		}

		// Mostramos por consolaa
		System.out.print("La suma de los últimos 5 valores es: " + suma);

		// Cierre de teclado
		teclado.close();
	}

}
