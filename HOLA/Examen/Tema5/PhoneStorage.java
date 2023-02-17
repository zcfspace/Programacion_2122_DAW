package examenTema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {
			System.out.println("**** Bienvenido a PhoneStorage ****");
			System.out.println("****     Administración   *******");
			System.out.println("1. Introducir Datos de Terminales");
			System.out.println("2. Modificar Terminal");
			System.out.println("3. Mostrar Terminales");
			System.out.println("4. Eliminar Terminal");
			System.out.println("5. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = teclado.nextInt();

				switch (opcion) {
				case 1:
					PhoneStorageFunc.opcion1();
					break;
				case 2:
					PhoneStorageFunc.opcion2();
					break;
				case 3:
					PhoneStorageFunc.opcion3();
					break;
				case 4:
					PhoneStorageFunc.opcion4();
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 5");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				teclado.next();
			}
		}

		teclado.close();
	}

}
