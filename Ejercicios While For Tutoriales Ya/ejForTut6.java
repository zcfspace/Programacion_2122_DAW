package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejForTut6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int n, f, x, y, cant1 = 0, cant2 = 0, cant3 = 0, cant4 = 0;

		System.out.print("Cantidad de puntos:");
		n = teclado.nextInt();

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor que n, seguirá haciendo el bucle
		for (f = 1; f <= n; f++) {

			System.out.print("Ingrese coordenada x:");
			x = teclado.nextInt();

			System.out.print("Ingrese coordenada y:");
			y = teclado.nextInt();

			// Si x y y es mayor que 0, suma 1 al cant1
			if (x > 0 && y > 0) {
				cant1++;
			} else {
				// Si x es menor que 0 y mayor que 0, suma uno al cant2
				if (x < 0 && y > 0) {
					cant2++;
				} else {
					// Si x y y es menor que 0, suma uno al cant3
					if (x < 0 && y < 0) {
						cant3++;
					} else {
						// Si x menor que 0 y y mayor que 0, suma uno al cant4
						if (x > 0 && y < 0) {
							cant4++;
						}
					}
				}
			}
		}

		// Mostramos por consola
		System.out.println("Cantidad de puntos en el primer cuadrante:" + cant1);
		System.out.println("Cantidad de puntos en el segundo cuadrante:" + cant2);
		System.out.println("Cantidad de puntos en el tercer cuadrante:" + cant3);
		System.out.println("Cantidad de puntos en el cuarto cuadrante:" + cant4);

		// Cierre de teclado
		teclado.close();
	}

}
