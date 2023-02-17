package ejBucle2;

import java.util.Scanner;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre[], fecha[] = { "" }, categoria[] = { "" }, formato[] = { "" }, plataforma[] = { "" },
				lista1[] = { "" }, lista2[] = { "" };
		// fecha de publicacion - Categoria - precio - formato - plataforma (pc,ps4,etc)
		int n, copias[] = { 0 }; // j contador de lista 1
		float precio[] = { 0 }, puntuacion[];
		Scanner teclado = new Scanner(System.in);

		float precio2, precioMaximo = 0, cumulo = 0;
		String nombre2, nombreMaximo = "";
		int contadorfis = 0, contadordig = 0;

		System.out.print("¿Cuantos juegos vas a introducir?: ");
		n = teclado.nextInt();

		nombre = new String[n];
		fecha = new String[n];
		categoria = new String[n];
		formato = new String[n];
		plataforma = new String[n];
		puntuacion = new float[n];
		precio = new float[n];
		copias = new int[n];
		lista1 = new String[n];
		lista2 = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("\n<-------------JUEGO NUMERO " + i + "------------->\n");

			System.out.print("Nombre del Juego: ");
			nombre[i] = teclado.next();

			System.out.print("Número de copias vendidas ");
			copias[i] = teclado.nextInt();

			System.out.print("Puntuacion del juego en Metacritic: ");
			puntuacion[i] = teclado.nextFloat();

			System.out.print("Fecha de publicación (Año): ");
			fecha[i] = teclado.next();

			System.out.print("Categoría del juego(Acción, aventura, plataforma, deporte): ");
			categoria[i] = teclado.next();

			System.out.print("Precio: ");
			precio[i] = teclado.nextFloat();

			System.out.print("Formato (Digital o FÃ­sico): ");
			formato[i] = teclado.next();
			formato[i].toLowerCase();

			System.out.print("Plataforma(PC, PS4,etc...) ");
			plataforma[i] = teclado.next();
			plataforma[i].toLowerCase();

			if (copias[i] > 1000000) {
				if (fecha[i].equals("2021")) {
					lista1[i] = nombre[i]; // Lista 1
				}
			}
			if (plataforma[i].equals("ps5") || puntuacion[i] >= 8) {
				lista2[i] = nombre[i]; // lista 2
			}

			precio2 = precio[i];
			nombre2 = nombre[i];

			if (precio2 > precioMaximo) { // Esto ya da el precio maximo y el nombre del juego mas caro
				precioMaximo = precio2;
				nombreMaximo = nombre2;
			}

			cumulo = cumulo + precio2; // cumulo de la media de precio XXXXXXXXXXX Falta por poner fuera dividir entre
										// n

			if (formato[i].equals("digital")) {
				contadordig++;
			} else if (formato[i].equals("play4")) { // contadores de formatos XXXXXXXXXXX Faltan por dividir entre n
														// cada uno y mutilipcar por precio
				contadorfis++;
			}
		}

		System.out.println("<------------¡MAS VENDIDOS!------------>");
		for (int i = 0; i < lista1.length; i++) {
			System.out.println(i + "- " + lista1[i]);
		}

		System.out.println("<------------¡MAS HOT!------------>");
		for (int i = 0; i < lista2.length; i++) {
			System.out.println(i + "- " + lista2[i]);
		}

		contadorfis = (contadorfis / n) * 100;
		contadordig = (contadordig / n) * 100;

		System.out.println("<------------ESTADISTICAS------------>");
		System.out.println("La media de precio de los juegos introducidos es: " + (cumulo / n));
		System.out.println("El juego mas caro es " + nombreMaximo + " Y su precio es: " + precioMaximo);
		System.out.println("Un " + contadorfis + " de los juegos son Fisicos y un " + contadordig + " digitales.");
	}

}
