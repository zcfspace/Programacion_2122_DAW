package ejBucle2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejBucle8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		boolean salir = false;
		int opcion;
		int carrera = 0;
		String nomCarrera = "";
		String bestCarrera = "";
		int posicion = 0;
		int cantAdel = 0;
		int safety[];
		int booleanCover[];
		boolean accidente[];
		int mejorPosicion = 100;
		int puntCamp = 0;
		float porAccid = 0.00f;
		float posMedia = 0.00f;
		int sumPos = 0;
		int sumAcc = 0;
		int totalSafety = 0;
		float porSafety[] = null;
		float porAccidPorCarrera[] = null;

		// Mienstras que no sea el caso 3, seguira haciendo el bucle
		while (!salir) {

			System.out.println("\n1. Introducir datos");
			System.out.println("2. Estadísticas ");
			System.out.println("3. Salir");

			try {

				System.out.print("\nSeleccione la operación que deseas hacer: ");
				opcion = teclado.nextInt();

				// Selección de menu
				switch (opcion) {
				case 1:
					System.out.print("\nCantidad de carreras: ");
					carrera = teclado.nextInt();

					safety = new int[carrera];
					porSafety = new float[carrera];
					accidente = new boolean[carrera];
					porAccidPorCarrera = new float[carrera];
					booleanCover = new int[carrera];

					// Inicialización contador ; Condición ; incremento contador
					// Mientras que i es menor que carrera seguirá haciendo el bucle
					for (int i = 0; i < carrera; i++) {
						System.out.print("\nNombre de carrera: ");
						nomCarrera = teclado.next();

						System.out.print("Cantidad de adelantamientos: ");
						cantAdel = teclado.nextInt();

						System.out.print("Posición: ");
						posicion = teclado.nextInt();

						System.out.print("Cantidad de Safety: ");
						safety[i] = teclado.nextInt();

						System.out.print("Accidente? (true/false) : ");
						accidente[i] = teclado.nextBoolean();

						// la mejor posición en la que ha quedado y el nombre del circuito en el que la
						// ha conseguido,
						if (posicion < mejorPosicion) {
							mejorPosicion = posicion;
							bestCarrera = nomCarrera;
						}

						// Porcentaje de safety cars
						totalSafety += safety[i];

						// calculo posición
						sumPos += posicion;
						posMedia = sumPos / carrera;

						// calculo accidente
						if (accidente[i] == true) {
							sumAcc++;
						}

						for (int j = 0; j < accidente.length; j++) {
							if (accidente[j] == true) {
								booleanCover[j] = 1;
							} else {
								booleanCover[j] = 0;
							}
						}

						// calculo de puntos de campeonato
						/*
						 * 1º 25 puntos - 2º 18 puntos - 3º 15 puntos - 4º 12 puntos - 5º 10 puntos - 6º
						 * 8 puntos - 7º 6 puntos - 8º 4 puntos - 9º 2 puntos - 10º 1 puntos.
						 */
						switch (posicion) {
						case 1:
							puntCamp += 25;
							break;
						case 2:
							puntCamp += 18;
							break;
						case 3:
							puntCamp += 15;
							break;
						case 4:
							puntCamp += 12;
							break;
						case 5:
							puntCamp += 10;
							break;
						case 6:
							puntCamp += 8;
							break;
						case 7:
							puntCamp += 6;
							break;
						case 8:
							puntCamp += 4;
							break;
						case 9:
							puntCamp += 2;
							break;
						case 10:
							puntCamp += 1;
							break;
						default:
							puntCamp += 0;
						}

					}

					for (int j = 0; j < safety.length; j++) {
						porSafety[j] = (float) (100 / (float) totalSafety) * safety[j];
					}

					for (int j = 0; j < accidente.length; j++) {
						porAccidPorCarrera[j] = (float) (100 / (float) sumAcc) * booleanCover[j];
					}

					break;

				case 2:
					if (carrera == 0) {
						System.err.println("Primero debes introducir los dados");
					} else {
						System.out.println("Tu mejor posición ha sido " + mejorPosicion + " puesto en la carrera de "
								+ bestCarrera);
						System.out.println("Punto de campeonato total: " + puntCamp);
						System.out.println("Porcentaje de accidente: " + porAccid + "%");

						// Mostrará una felicitación si la posición media es superior a 3, sino le
						// comentará que no ha conseguido los objetivos y que está despedido.
						if (posMedia >= 3) {
							System.out.println("Felicidades, eres un crack");
						} else {
							System.out.println("No has conseguido tu objetivo, adios :)");
						}

						// Si ha realizado más de 3 adelantamientos por carrera se le otorgará el título
						// al piloto más audaz..
						if (cantAdel > 3) {
							System.out.println("Has obtenido el titulo de piloto más audaz");
						}

						// Porcentaje de carreras de safety cars
						for (int i = 0; i < porSafety.length; i++) {
							System.out.println(
									"Poscentaje de safety cars de carrera " + (i + 1) + " : " + porSafety[i] + "%");
						}

						// Porcentaje de carreras de accidente por carrera
						for (int i = 0; i < porAccidPorCarrera.length; i++) {
							System.out.println("Poscentaje de accidente de carrera " + (i + 1) + " : "
									+ porAccidPorCarrera[i] + "%");
						}
					}

					break;
				case 3:
					salir = true;
					break;
				// Si no coincide con ningun caso.
				default:
					System.err.println("\nSolo números entre 1 y 3");
				}
				// Si no se introduce nada, muestra error por consola
			} catch (InputMismatchException e) {
				System.err.println("\nDebes insertar un número");
				teclado.next();
			}
		}
		// cerramos por teclado
		teclado.close();
	}

}
