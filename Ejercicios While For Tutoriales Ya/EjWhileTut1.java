package ejWhileForTutorialYa;

import java.util.Scanner;

public class EjWhileTut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		// Ponemos en i 1 porque se empiza contar desde 0.
		// Podemos poner 0, pero entoncez en la condición del while tendríamos que poner
		// 9.
		// conta1 = alumnos con mas o igual que 7
		// conta2 = alumnos con menos de 7
		int i = 1, conta1 = 0, conta2 = 0, nota;

		// Mientras que el i sea menor o igual que 10, seguira haciendo el bucle.
		while (i <= 10) {
			System.out.print("Ingrese nota del " + i + " alumno: ");
			nota = teclado.nextInt();
			// Si la nota es mayor o igual 7 suma 1 al conta1 y si no al conta2
			if (nota >= 7) {
				conta1++;
			} else {
				conta2++;
			}
			// Cade vez que termine el bucle, suma 1 al i.
			i = i + 1;
		}

		// Mostramos por consola
		System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + conta1);
		System.out.println("Cantidad de alumons con notas menores a 7: " + conta2);

		// Cerramos teclado
		teclado.close();

	}

}
