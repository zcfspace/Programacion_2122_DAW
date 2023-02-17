package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejForTut7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int f, valor, negativos = 0, positivos = 0, mult15 = 0, sumapares = 0;

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor que 10, seguirá haciendo el bucle
		for (f = 1; f <= 10; f++) {

			System.out.print("Ingrese valor:");
			valor = teclado.nextInt();

			// Si valor es mayor que 0, suma 1 al negativos y si el menor que 0, 1 al
			// positivo
			if (valor < 0) {
				negativos++;
			} else {
				if (valor > 0) {
					positivos++;
				}
			}

			// Si el resto es 0, suma 1 al mult5
			if (valor % 15 == 0) {
				mult15++;
			}
			// Si el resto es 0 suma el valor
			if (valor % 2 == 0) {
				sumapares += valor;
			}
		}

		// Mostramos por consola
		System.out.println("Cantidad de valores negativos:" + negativos);
		System.out.println("Cantidad de valores positivos:" + positivos);
		System.out.println("Cantidad de valores múltiplos de 15:" + mult15);
		System.out.println("Suma de los valores pares:" + sumapares);

		// Cierre de teclado
		teclado.close();
	}

}
