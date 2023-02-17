package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejForTut5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaraci�n de variables
		int f, lado1, lado2, lado3, cant1 = 0, cant2 = 0, cant3 = 0, n;

		System.out.print("Ingrese la cantidad de tri�ngulos:");
		n = teclado.nextInt();

		// Inicializaci�n contador ; Condici�n ; incremento contador
		// Mientras que f es menor que n, seguir� haciendo el bucle
		for (f = 1; f <= n; f++) {

			System.out.print("Ingrese lado 1:");
			lado1 = teclado.nextInt();

			System.out.print("Ingrese lado 2:");
			lado2 = teclado.nextInt();

			System.out.print("Ingrese lado 3:");
			lado3 = teclado.nextInt();

			// Si los tre lados son iguales, el triangulo es equilatero
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Es un tri�ngulo equilatero.");
				// Si es true, le suma uno al cant1
				cant1++;
				// Si alg�n lado del trangulo es igual, es is�sceles
			} else {
				if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("Es un tri�ngulo is�sceles.");
					cant2++;
					// Y si no es ecaleno
				} else {
					cant3++;
					System.out.println("Es un tri�ngulo escaleno.");
				}
			}
		}
		// Mostramos por consola
		System.out.println("Cantidad de tri�ngulos equilateros: " + cant1);
		System.out.println("Cantidad de tri�ngulos is�sceles:" + cant2);
		System.out.println("Cantidad de tri�ngulos escalenos:" + cant3);

		// Si cantidad1 uno es menor que cant2 y cant3, hay menor cantidad de
		// equilateros
		if (cant1 < cant2 && cant1 < cant3) {
			System.out.print("Hay menor cantidad de tri�ngulos equilateros.");
		} else {
			// Si no, comprueba si cant 2 es menor que cant3, si es true, hay menor cantidad
			// de is�sceles
			if (cant2 < cant3) {
				System.out.print("Han menor cantidad de tri�ngulos is�sceles");
			} else {
				// Y si no, escaleno
				System.out.print("Han menor cantidad de tri�ngulos escalenos");
			}
		}
		// Cierre de teclado
		teclado.close();
	}

}
