package ejWhileForTutorialYa;

import java.util.Scanner;

public class ejForTuT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int f, valor;

		// lectura por consola
		System.out.print("Ingrese un valor entre 1 y 10:");
		valor = teclado.nextInt();

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor o igual que el valor multiplicado por 12, seguirá
		// haciendo el bucle
		for (f = valor; f <= valor * 12; f += valor) {
			System.out.print(f);
			System.out.print("-");
		}

		// Cierre del teclado
		teclado.close();
	}

}
