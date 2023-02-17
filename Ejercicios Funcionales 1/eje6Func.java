package ejFunc1;

import java.util.Scanner;

public class eje6Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion variables
		int numero = 0;

		// Mostramos por teclado
		System.out.print("Introduce el numero: ");
		numero = teclado.nextInt();

		System.out.println("El numero en binario es: " + binario(numero));

		teclado.close();
	}

	/**
	 * Funcion para pasar de decimal a binario
	 * 
	 * @param numero
	 * @return el numeor en binario
	 */
	static String binario(int numero) {

		// Declaracion variable
		String binario = "";

		// Condicion para pasar decimal a binario
		if (numero > 0) {
			while (numero > 0) {
				if (numero % 2 == 0) {
					binario = "0" + binario;
				} else {
					binario = "1" + binario;
				}
				numero = (int) numero / 2;
			}
		} else if (numero == 0) {
			binario = "0";
		}

		// Devolvemos el resultado
		return binario;
	}

}
