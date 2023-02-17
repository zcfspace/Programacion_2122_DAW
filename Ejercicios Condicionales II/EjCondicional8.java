package EjCondicional2;

import java.util.Scanner;

public class EjCondicional8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para leer por teclado con scanner
		Scanner teclado = new Scanner(System.in);

		// Declaración variable
		int numero = 0;

		// introduccion de valor
		System.out.print("Ingrese el número:");
		numero = teclado.nextInt();

		// “A” si su módulo con 5 es 0
		// “B” si su módulo con 5 es 1
		// “C” si su módulo con 5 es 2
		// “D” si su módulo con 5 es 3
		// “E” si su módulo con 5 es 4
		// “F” en otro caso
		if (numero % 5 == 0) {
			System.out.println("A");
		} else {
			if (numero % 5 == 1) {
				System.out.println("B");
			} else {
				if (numero % 5 == 2) {
					System.out.println("C");
				} else {
					if (numero % 5 == 3) {
						System.out.println("D");
					} else {
						if (numero % 5 == 4) {
							System.out.println("E");
						} else {
							System.out.println("F");
						}
					}
				}
			}
		}

	}

}
