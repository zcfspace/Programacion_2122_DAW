package EjCondicional2;

import java.util.Scanner;

public class EjCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para leer por teclado con scanner
		Scanner teclado = new Scanner(System.in);
		
		//Declaración variable
		float cantidad;

		// introduccion de valor
		System.out.print("Ingrese la cantidad de dinero: ");
		cantidad = teclado.nextFloat();
		
		//SI cantidad es igual a cuelquier valor de aquí abajo, es valido y sino no válido
		if (cantidad == 0.01 || cantidad == 0.02 || cantidad == 0.05 || cantidad == 0.10 || cantidad == 0.20
				|| cantidad == 0.50 || cantidad == 1 || cantidad == 2 || cantidad == 5 || cantidad == 10
				|| cantidad == 20 || cantidad == 50 || cantidad == 100 || cantidad == 200 || cantidad == 500) {
			System.out.println("Válido");
		} else {
			System.out.println("No válido");
		}

	}

}
