package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejDoWhileTut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variable
		int cuenta;
		float saldo, suma;
		suma = 0;

		// Mientras que el saldo sea mayor 0, seguirá haciendo el bucle
		do {
			System.out.print("Ingrese número de cuenta:");
			cuenta = teclado.nextInt();

			if (cuenta >= 0) {
				System.out.print("Ingrese saldo:");
				saldo = teclado.nextFloat();

				// 'Acreedor' si el saldo es >0.
				// 'Deudor' si el saldo es <0.
				// 'Nulo' si el saldo es =0.
				if (saldo > 0) {
					System.out.println("Saldo Acreedor.");
					suma += saldo;
				} else {
					if (saldo < 0) {
						System.out.println("Saldo Deudor.");
					} else {
						System.out.println("Saldo Nulo.");
					}
				}
			}
			// Si el numero de cuenta es menor que 0, impreme el total saldo de los
			// acreedores
		} while (cuenta >= 0);

		System.out.println("Total de saldos Acreedores: " + suma);

		// cierre teclado
		teclado.close();
	}

}
