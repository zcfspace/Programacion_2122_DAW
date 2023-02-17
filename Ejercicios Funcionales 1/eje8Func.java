package ejFunc1;

import java.util.Scanner;

public class eje8Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion de varibles
		int num = 0;

		// Leemos por teclado
		System.out.print("Numero: ");
		num = teclado.nextInt();

		System.out.println("Número invertido: " + (invertir(num)));

		// Cierre del teclado
		teclado.close();
	}

	/**
	 * Funcion para invertir un numero
	 * 
	 * @param num
	 * @return el numero invertido
	 */
	static String invertir(int num) {

		// Si el numero es menor que 10, devolvemos el numero tal cual ya que solo tiene
		// una cifra
		if (num < 10) {
			return String.valueOf(num);
			// Y si no dividimos el numero entre 10, y con el resto de la division
			// averiguamos el ultimo cifra. Y hacemos la recurcividad con el numero divido
			// entre 10
		} else {
			return String.valueOf(num % 10) + invertir(num / 10);
		}
	}
}
