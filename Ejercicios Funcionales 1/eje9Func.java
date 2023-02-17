package ejFunc1;

import java.util.Scanner;

public class eje9Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		int arraynumero[];
		int num = 0;
		int min = 0;
		int cantNum = 0;

		// Leemos por teclado

		System.out.print("Cantidad de numero en el array: ");
		cantNum = teclado.nextInt();

		arraynumero = new int[cantNum];

		// Introducion de numero al array
		System.out.println("Debes introducirlo de menor a mayor");
		for (int i = 0; i < arraynumero.length; i++) {
			System.out.print("Introduce numero " + (i + 1) + " del array: ");
			arraynumero[i] = teclado.nextInt();
		}

		int max = arraynumero.length - 1;

		System.out.print("Introduce el numero a buscar: ");
		num = teclado.nextInt();

		System.out.println("Posición del numero (recursiva):  " + (recursiva(arraynumero, min, max, num) + 1));
		System.out.println("Posición del numero (iterativa): " + (iterativa(arraynumero, num) + 1));

		// Cierre del teclado
		teclado.close();
	}

	/**
	 * Funcion recursiva para hacer una busqueda binaria.
	 * 
	 * @param arraynumero
	 * @param min
	 * @param max
	 * @param num
	 * @return la pocisión del numero en el array
	 */
	static int recursiva(int arraynumero[], int min, int max, int num) {

		if (min > max)
			return -1;

		// Declaramos el numero medio del array
		int mid = min + (max - min) / 2;

		// Si el numero mid es mayor que el numero le quitamos 1 al mid
		if (arraynumero[mid] > num)
			return recursiva(arraynumero, min, mid - 1, num);

		// lo contrario
		if (arraynumero[mid] < num)
			return recursiva(arraynumero, mid + 1, max, num);

		return mid;
	}

	/**
	 * Funcion iterativa para hacer una busqueda binaria.
	 * 
	 * @param arraynumero
	 * @param num
	 * @return la pocisión del numero en el array
	 */
	static int iterativa(int arraynumero[], int num) {

		// Declaracion de variables
		int min = 0;
		int max = arraynumero.length - 1;

		// Mientras que el min sea igual o menor, seguira ejecutando el bucle
		while (min <= max) {

			// Declaramos el numero medio del array
			int mid = min + (max - min) / 2;

			// Si el numero mid es mayor que el numero sumanos 1 al max
			if (arraynumero[mid] > num)
				max = mid - 1;
			// y si no, lo contrario
			else if (arraynumero[mid] < num)
				min = mid + 1;
			else
				// y si no, el numero ya es el mid
				return mid;
		}

		return -1;
	}

}
