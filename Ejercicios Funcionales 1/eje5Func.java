package ejFunc1;

import java.util.Scanner;

public class eje5Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion de varibles
		int num = 0;
		int dividendo = 0;
		int divisor = 0;

		System.out.print("numero: ");
		num = teclado.nextInt();

		System.out.print("Dividendo: ");
		dividendo = teclado.nextInt();

		System.out.print("Divisor: ");
		divisor = teclado.nextInt();

		// Mostramos por consola
		System.out.println("¿Es primo? " + esPrimo(num));
		System.out.println("¿Es divisible? " + esDivisible(dividendo, divisor));
		System.out.println("Divisores: ");
		int resultado[] = arrayDivisores(num);
		mostrarContenido(resultado);

		teclado.close();

	}

	/**
	 * Funcion para determinar si el numero es primo
	 * 
	 * @param num
	 * @return true o false
	 */
	static boolean esPrimo(int num) {

		boolean esPrimo = false;

		// El 0, 1 y 4 no son primos
		if (num == 0 || num == 1 || num == 4) {
			esPrimo = false;
			return esPrimo;
		}

		for (int i = 2; i < num / 2; i++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (num % i == 0) {
				esPrimo = false;
				return esPrimo;
			}
		}

		esPrimo = true;
		return esPrimo;

	}

	/**
	 * Funcion para determinar si el divisibles
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return true o false
	 */
	static boolean esDivisible(int dividendo, int divisor) {

		boolean esDivisible = false;

		if (dividendo % divisor == 0) {
			esDivisible = true;
		}

		return esDivisible;

	}

	/**
	 * Funciona para mostrar todos los divisores de un numero
	 * 
	 * @param num
	 * @return los divisores del num
	 */
	static int[] arrayDivisores(int num) {

		// Nuevo array con tamano num +1
		int resultado[] = new int[num + 1];

		// Si el resto de la division es 0, es divisor
		for (int i = 1; i < resultado.length; i++) {
			if (num % i == 0) {
				resultado[i] = i;

			}
		}

		return resultado;

	}

	/**
	 * Funicona para mostrar el array
	 * 
	 * @param resultado
	 */
	static void mostrarContenido(int resultado[]) {

		// Mostramos todos los elementos que no sea 0
		for (int i = 0; i < resultado.length; i++) {
			if (resultado[i] != 0) {
				System.out.println(resultado[i]);
			}

		}

	}

}
