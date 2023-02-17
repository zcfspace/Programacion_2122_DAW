package ejFunc1;

import java.util.Scanner;

public class eje3Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion variables
		int numeros[];
		int catNum = 0;

		System.out.print("Cantidad de numero: ");
		catNum = teclado.nextInt();

		// Array de numeros
		numeros = new int[catNum];

		// Un bucle para introducir los numeros
		for (int i = 0; i < catNum; i++) {
			System.out.print("Numero " + (i + 1) + " : ");
			numeros[i] = teclado.nextInt();
		}

		// Mostramos por pantalla el resultado
		System.out.println("¿Esta ordenado de menor a mayor? " + orden(numeros, catNum));

		teclado.close();
	}

	/**
	 * Funcion para comprobar si el array esta ordenado de menor a mayor
	 * 
	 * @param numeros
	 * @param catNum
	 * @return true o false
	 */
	static boolean orden(int numeros[], int catNum) {

		boolean estaOrdenado = true;

		// Si el numero de la posiicion i-1 es menor que el numero de la posicion i, es
		// true y sigue haciendo el bucle
		// Si si no, es false y termina el bucle
		for (int i = 1; i < catNum; i++) {
			if (numeros[i - 1] < numeros[i]) {
				estaOrdenado = true;
			} else {
				estaOrdenado = false;
				break;
			}
		}

		return estaOrdenado;
	}

}
