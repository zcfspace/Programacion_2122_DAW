package ejBucle2;

import java.util.Scanner;

public class ejBucle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int numIntrod = 0;
		int numMax = 0;

		// Introducimos un numero
		System.out.print("Ingrese el número:");
		numIntrod = teclado.nextInt();

		// Transformamos el int a String para poder separar los digitos
		String num = String.valueOf(numIntrod);

		// Creamos nuevo array con las cifras del numero
		char[] digits1 = num.toCharArray();

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que i es menor que la cantidad de digito, seguirá haciendo el bucle
		for (int i = 0; i < digits1.length; i++) {
			// Si el digito maximos es menor que el digito i, el digito maximos será el
			// digito i
			if (numMax < digits1[i]) {
				numMax = digits1[i];
			}
		}

		// Mostramos por pantalla
		// Indexoff es para buscar la posicion de numero digito maximo
		// Y +1, es porque la posición empiza por 0
		System.out.println("La posición de la cifra mayor es: " + (num.indexOf(numMax) + 1));

		// Cerramos el teclado
		teclado.close();
	}

}
