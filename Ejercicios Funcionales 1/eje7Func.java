package ejFunc1;

import java.util.Scanner;

public class eje7Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion de varibles
		int num = 0;

		// Leemos por teclado
		System.out.print("Numero: ");
		num = teclado.nextInt();

		System.out.println("El sumatorio es:" + sumatorio(num));

		// Cierre del teclado
		teclado.close();
	}

	/**
	 * Funcion para calcular la sumatoria
	 * 
	 * @param num
	 * @return el resultado de la suma
	 */
	static int sumatorio(int num) {
		// Si el num es igual a 0, devuelve 0
		if (num == 0)
			return 0;
		// Y si no suma el num + el sumatorio. Cada vez que haga una recurcividad resta
		// 1 al num hasta que no se le pueda restar más.
		else
			return num + sumatorio(num - 1);
	}
}
