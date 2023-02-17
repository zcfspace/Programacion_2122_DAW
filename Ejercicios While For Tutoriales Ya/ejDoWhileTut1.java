package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejDoWhileTut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración varible
		int suma = 0, valor;

		// Mientras que el valor no sea 9999, seguirá haciendo el bucle
		do {
			System.out.print("Ingrese un valor:");
			valor = teclado.nextInt();
			// Si el valor no es 9999, suma al valor acumulado
			if (valor != 9999) {
				suma += valor;
			}
			// Si el valor igual que 9999, imprime esto.
		} while (valor != 9999);

		System.out.println("El valor acumulado es " + suma);

		// Si la suma es 0, el valor acomulado es o y si no comprueba es es mayor que 0.
		// Si es true, es mayor que 0, y si no es menor que cero
		if (suma == 0) {
			System.out.println("El valor acumulado es cero.");
		} else {
			if (suma > 0) {
				System.out.println("El valor acumulado es mayor a cero.");
			} else {
				System.out.println("El valor acumulado es menor a cero");
			}
		}

		// Cierre teclado
		teclado.close();
	}

}
