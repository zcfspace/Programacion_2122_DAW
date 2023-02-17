package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejWhileTut3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de varibles
		// conta1 empreados con sueldo menos de 300$
		// conta2 empreados con sueldo más de 300$
		// n = numero de empreado
		// Ponemos en x 1 porque se empiza contar desde 0
		int n, x = 1, conta1 = 0, conta2 = 0;
		float sueldo, gastos = 0f;

		System.out.print("Cuantos empleados tiene la empresa:");
		n = teclado.nextInt();

		// Mientras que x es menor o igual que n (numero de empreados), seguira haciendo
		// el bucle.

		while (x <= n) {

			System.out.print("Ingrese el sueldo del " + x + " empleado: ");
			sueldo = teclado.nextFloat();

			// Si el suledo es menos o igual que 300 y mas de 100 , suma 1 al conta1 y sino
			// al conta2
			if (sueldo <= 300 && sueldo >= 100) {
				conta1++;
			} else {
				if (sueldo > 300) {
					conta2++;
				}
			}

			// suma de altura de todos los gastos
			gastos += sueldo;

			// Cada vez que haga un bucle suma 1 al x
			x++;
		}

		// Mostramos por consola
		System.out.println("Cantidad de empleados con sueldos entre 100 y 300: " + conta1);
		System.out.println("Cantidad de empleados con sueldos mayor a 300: " + conta2);
		System.out.println("Gastos total de la empresa en sueldos: " + gastos);

		teclado.close();

	}

}
