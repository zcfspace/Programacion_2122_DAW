package ejFunc1;

public class eje1Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables
		int num1 = 15, num2 = 8;

		// Mostramos por consola
		System.out.println("La suma de los dos numeros es: " + suma(num1, num2));
		System.out.println("La resta de los dos numeros es: " + resta(num1, num2));
		System.out.println("La minimo de los dos numeros es: " + min(num1, num2));
		System.out.println("La maximo de los dos numeros es: " + max(num1, num2));
		System.out.println("La multiplicación de los dos numeros es: " + mult(num1, num2));
		System.out.println("La división de los dos numeros es: " + div(num1, num2));

	}

	/**
	 * La funcion suma dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma
	 */
	static int suma(int num1, int num2) {
		int resultado = 0;
		resultado = num1 + num2;

		return resultado;
	}

	/**
	 * La funcion resta dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la resta
	 */
	static int resta(int num1, int num2) {
		int resultado = 0;
		resultado = num1 - num2;

		return resultado;
	}

	/**
	 * La funcion suma dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma
	 */
	static int min(int num1, int num2) {
		int min = Integer.MAX_VALUE;

		if (num1 < num2) {
			min = num1;
		} else {
			min = num2;
		}

		return min;
	}

	/**
	 * La funcion suma dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma
	 */
	static int max(int num1, int num2) {
		int max = Integer.MIN_VALUE;

		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}

		return max;
	}

	/**
	 * La funcion multiplica dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la multiplicación
	 */
	static int mult(int num1, int num2) {
		int resultado = 0;
		resultado = num1 * num2;

		return resultado;
	}

	/**
	 * La funcion divide dos numeros
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la division
	 */
	static float div(int num1, int num2) {
		float resultado = 0;
		resultado = (float) num1 / num2;

		return resultado;
	}

}
