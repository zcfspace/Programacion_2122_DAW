package ejBucle2;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realizar un programa en java que haga los siguientes cálculos.

		// Leerá una alineación de fútbol, con x jugadores, para cada jugador se leerán
		// los siguientes campos:

		// Nombre
		// Número de dorsal
		// Posición [D:delantero, C:Centrocampo, L:lateral, P:portero, E:defensa]
		// Edad
		// Goles Marcados

		// Y con dichos datos comprobará los siguiente una vez leídos todos los datos:

		// Solo hay un portero, en caso de que haya más de uno mostrará una advertencia
		// al final
		// La media de edad y el nombre del jugador más viejo y el más joven.
		// El porcentaje de jugadores en cada posición
		// Comprobar que no haya más de 3 delanteros.
		// Si hay algún menor de edad mostrará una advertencia
		// Mostrará el número de goles de los delanteros mayores de edad.

		// Definimos las variables
		int numJugadores;
		String nombre;
		int dorsal;
		char posicion;
		int edad;
		int numGoles;

		int numPorteros = 0;
		int numDelanteros = 0;
		int numCentrocampistas = 0;
		int numDefensas = 0;
		int numLaterales = 0;

		int sumaEdad = 0;
		int media;

		int mayorEdad = 0;
		String nombreMayorEdad = "";

		int menorEdad = 100000;
		String nombreMenorEdad = "";

		float porcentajeDelanteros;
		float porcentajeCentrocampistas;
		float porcentajeLaterales;
		float porcentajeDefensas;
		float porcentajePorteros;

		int totalGoles = 0;

		// Para leer creamos el objeto teclado
		Scanner teclado = new Scanner(System.in);

		// Introducimos el número de jugadores
		System.out.print("¿Por cuántos jugadores está formada la plantilla?:");
		numJugadores = teclado.nextInt();

		// Estructura for:
		for (int i = 1; i <= numJugadores; i++) {

			// Introducimos las variables
			System.out.print("\nNombre:");
			nombre = teclado.next();

			System.out.print("Dorsal:");
			dorsal = teclado.nextInt();

			System.out.print("Posición(D:delantero, C:Centrocampo, L:lateral, P:portero, E:defensa):");
			posicion = teclado.next().charAt(0);

			// Hallamos el número de jugadores en cada posición
			// Delanteros
			if (posicion == 'D' || posicion == 'd') {
				numDelanteros++;
			}

			// Centrocampistas
			if (posicion == 'C' || posicion == 'c') {
				numCentrocampistas++;
			}

			// Laterales
			if (posicion == 'L' || posicion == 'l') {
				numLaterales++;
			}

			// Defensas
			if (posicion == 'E' || posicion == 'e') {
				numDefensas++;
			}

			// Porteros
			if (posicion == 'P' || posicion == 'p') {
				numPorteros++;
			}

			System.out.print("Edad:");
			edad = teclado.nextInt();

			// Sumamos las edad que se van introduciendo
			sumaEdad = sumaEdad + edad;

			// Hallamos el nombre del jugador más mayor comparándolo con las demás edades
			if (edad > mayorEdad) {
				mayorEdad = edad;
				nombreMayorEdad = nombre;
			}

			// Hallamos el nombre del jugador más joven comparándolo con las demás edades
			else if (edad < menorEdad) {
				menorEdad = edad;
				nombreMenorEdad = nombre;
			}

			System.out.print("Goles marcados:");
			numGoles = teclado.nextInt();

			// Si el jugador es mayor de edad, se tendrán en cuenta el número de goles
			// marcados para hallar el total
			if (edad >= 18) {
				totalGoles = totalGoles + numGoles;
			}

			// Si el jugador es menor de edad se avisará por pantalla
			if (edad < 18) {
				System.out.println("(Jugador menor de edad)");

			}

		}

		// Hallamos la media diviendo la edad total de los jugadores entre el número de
		// jugadores que hay en la plantilla.
		media = sumaEdad / numJugadores;

		// Hallamos el porcentaje de jugadores que hay en cada posición
		porcentajeDelanteros = (float) (numDelanteros * 100) / numJugadores;
		porcentajeCentrocampistas = (float) (numCentrocampistas * 100) / numJugadores;
		porcentajeLaterales = (float) (numLaterales * 100) / numJugadores;
		porcentajeDefensas = (float) (numDefensas * 100) / numJugadores;
		porcentajePorteros = (float) (numPorteros * 100) / numJugadores;

		// Apartado Edad:
		System.out.println("\nEdad:");

		// Mostramos la media de edad por pantalla
		System.out.println("La media de edad es de " + media + " años");

		// Mostramos por pantalla el jugador más joven y el más veterano de la plantilla
		System.out.println("Jugador más joven: " + nombreMenorEdad);

		System.out.println("Jugador más veterano: " + nombreMayorEdad);
		// Mostramos los goles totales de los jugadores mayores de edad
		System.out.println("Los jugadores mayores de edad llevan " + totalGoles + " goles en esta temporada");

		// Apartado plantilla:
		System.out.println("\nPlantilla:");

		// Si el número de porteros es mayor que 1, se avisará por pantalla
		if (numPorteros > 1) {
			System.out.println("La plantilla cuenta con más de un portero");
		}

		// Mostramos por pantalla el porcentaje de jugadores por posición
		System.out.println("Hay:");
		System.out.println("- " + porcentajeDelanteros + "% de jugadores delanteros");
		System.out.println("- " + porcentajeCentrocampistas + "% de jugadores centrocampistas");
		System.out.println("- " + porcentajeLaterales + "% de jugadores laterales");
		System.out.println("- " + porcentajeDefensas + "% de jugadores defensas");
		System.out.println("- " + porcentajePorteros + "% de jugadores porteros");

		// En caso de haya más de 3 delanteros se le avisará por pantalla y se detendrá
		// el bucle
		if (numDelanteros > 3) {
			System.out.println("\nAVISO: La plantilla cuenta con más de 3 delanteros");
		}

		// Cerramos el teclado
	}

}
