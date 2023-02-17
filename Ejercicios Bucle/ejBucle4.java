package ejBucle2;

import java.util.Scanner;

public class ejBucle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int n, torneo, mediaTorneo = 0;
		String nombre = "";
		int atp = 0;
		String bestAtp = "";
		String bestTorneo = "";
		int maxAtp = 100;
		int maxTorneo = 0;
		int sumTorneo = 0;

		System.out.print("Numero de jugadores: ");
		n = teclado.nextInt();

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor que n, seguirá haciendo el bucle
		for (int i = 0; i < n; i++) {

			System.out.print("\nNombre:");
			nombre = teclado.next();

			System.out.print("Torneos ganados:");
			torneo = teclado.nextInt();

			System.out.print("Posición atp:");
			atp = teclado.nextInt();

			// El jugador con mejor Atp
			if (atp < maxAtp) {
				maxAtp = atp;
				bestAtp = nombre;
			}

			// El jugador con más torneos ganados
			if (torneo > maxTorneo) {
				maxTorneo = torneo;
				bestTorneo = nombre;
			}

			sumTorneo += torneo;
		}

		// Calculo de torneos media ganado
		mediaTorneo = sumTorneo / n;

		// Mostramos por pantalla
		System.out.println("El jugador con mejor Atp: " + bestAtp);
		System.out.println("El jugador con más torneos ganados: " + bestTorneo);
		System.out.println("La media torneos ganado: " + mediaTorneo);

		// Cerramos por teclado
		teclado.close();
	}

}
