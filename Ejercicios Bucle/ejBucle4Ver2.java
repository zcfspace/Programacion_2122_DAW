package ejBucle2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ejBucle4Ver2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub

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

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\zheng\\eclipse-workspace\\Programacion2021-2022\\bin\\ejBucle2\\fichero4.txt"));

		System.out.print("Numero de jugadores: ");
		n = teclado.nextInt();

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor que n, seguirá haciendo el bucle
		for (int i = 0; i < n; i++) {

			System.out.println("Nombre: (Lo lee del fichero)");
			nombre = br.readLine();

			System.out.print("Torneos ganados:");
			torneo = teclado.nextInt();

			System.out.print("Posición atp:");
			atp = teclado.nextInt();

			// El jugador con mejor Atp:
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

		mediaTorneo = sumTorneo / n;

		System.out.println("El jugador con mejor Atp: " + bestAtp);
		System.out.println("El jugador con más torneos ganados: " + bestTorneo);
		System.out.println("La media torneos ganado: " + mediaTorneo);

		teclado.close();
	}

}
