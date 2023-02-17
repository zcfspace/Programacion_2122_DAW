package EjCondicional2;

import java.util.Scanner;

public class EjCondicional9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para leer por teclado con scanner
		Scanner teclado = new Scanner(System.in);

		// Declaración variable
		double l1, l2, l3;

		// introduccion de valor
		System.out.print("Introduzca el primer segmento:");
		l1 = teclado.nextDouble();

		System.out.print("Introduzca el segundo segmento:");
		l2 = teclado.nextDouble();

		System.out.print("Introduzca el tercer segmento:");
		l3 = teclado.nextDouble();

		// Si algún de los segmentos es menor o igual que 0, no es un triangulo.
		// Si los tres segmentos tiene el mismo longitud, el triangulo es equilatero.
		// Si algún segmento tiene el mismo longitud, el triangulo es Isoceles.
		// Si todos los lados diferentes, es escaleno.
		if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
			System.out.println("No es un triángulo");
		} else {
			if (l1 == l2 && l2 == l3)
				System.out.println("El triangulo es equilatero");
			else {
				if (l1 == l2 || l1 == l3 || l2 == l3)
					System.out.println("El triangulo es isoceles");
				else {
					if (l1 != l2 || l1 != l3 || l3 != l2)
						System.out.println("El triangulo es escaleno");
				}
			}
		}

	}

}
