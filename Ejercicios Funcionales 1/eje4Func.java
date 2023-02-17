package ejFunc1;

import java.util.Scanner;

public class eje4Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion de variables
		String cadena = "";
		char caract;

		// Intorducimos por teclado
		System.out.print("Introduce la cadena: ");
		cadena = teclado.nextLine();

		System.out.print("Introduce un caráter: ");
		caract = teclado.next().charAt(0);

		System.out.println("Cantidad de vecez que muestra: " + cant(cadena, caract));

		// Cierre del teclado
		teclado.close();
	}

	/**
	 * Funcion para contar la vecez que repite un caracter en una cadena
	 * 
	 * @param cadena
	 * @param caract
	 * @return cantidad de vecez que repide en la cadena
	 */
	static int cant(String cadena, char caract) {

		int cantVec = 0;

		// Creamos nuevo array con las caracteres de la flase
		char[] separado = cadena.toCharArray();

		// Inicialización contador ; Condición ; incremento contador
		// Comprobamos todos lo caracteres de la cadena
		for (int i = 0; i < separado.length; i++) {
			if (separado[i] == caract) {
				cantVec++;
			}
		}

		return cantVec;

	}

}
