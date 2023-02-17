package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class examenRec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inciamos teclado
		Scanner teclado = new Scanner(System.in);

		// Declaramos las variables
		String cpu = "";
		int ram = 0;
		int capDisco = 0;
		String grafica = "";
		boolean ifSis;
		char tipoOrde;// Tipo (Portátil (P) Sobremesa (S))
		double precio = 0;

		int nOrdern = 0;

		String graficaMasCara = "";
		double precioMedio = 0;
		String OrdeMasEco = "";
		Double maxPrecio = Double.MIN_VALUE;
		Double minPrecio = Double.MAX_VALUE;

		ArrayList<String> listaCpu = new ArrayList<String>();

		int nSobremesaSinSis = 0;
		int nSobremesaConSis = 0;

		// Mostramos por pantalla
		System.out.print("Numeros de Ordenadores: ");
		nOrdern = teclado.nextInt();

		// Rellenamos a cada ordenador en un bucle
		for (int i = 1; i < (nOrdern + 1); i++) {

			// Pedimos tados por consola
			System.out.print("\nCpu del ordenador" + i + ": ");
			cpu = teclado.next();

			System.out.print("Ram del ordenador" + i + ": ");
			ram = teclado.nextInt();

			System.out.print("Cap. del disco del ordenador" + i + ": ");
			capDisco = teclado.nextInt();

			System.out.print("Grafica del ordenador" + i + ": ");
			grafica = teclado.next();

			System.out.print("Sistema instalado? : ");
			ifSis = teclado.nextBoolean();

			System.out.print("Tipo de ordenador (Portátil (P) Sobremesa (S):");
			tipoOrde = teclado.next().charAt(0);

			System.out.print("Precio del ordenador " + i + ": ");
			precio = teclado.nextDouble();

			// la media de precio
			precioMedio = precioMedio + precio;

			// El ordenador más económico
			if (precio < minPrecio) {
				minPrecio = precio;
				OrdeMasEco = "Ordenador" + i;
			}

			// La gráfica del ordenador más caro
			if (precio > maxPrecio) {
				maxPrecio = precio;
				graficaMasCara = grafica;
			}

			// Se debe de sacar un listado de las cpus de los ordenadores de más de 800
			// euros de tipo portátil que vengan sin el Sistema operativo instalado. Se
			// pueden ir sacando por pantalla según se leen, aunque se valorará guardarlas
			// en un array y mostrarlas al final.

			if (precio > 800 && (tipoOrde == 'P' || tipoOrde == 'p') && ifSis == false) {
				listaCpu.add(cpu);
			}

			// Mostrar también el porcentaje de ordenadores de sobremesa que vienen con el
			// s.o. instalado y los que no.

			// Si el ordenador es sobremesa y no tiene SO, suma una al contador
			if ((tipoOrde == 'S' || tipoOrde == 's') && ifSis == false) {
				nSobremesaSinSis++;
			} else {
				if ((tipoOrde == 'S' || tipoOrde == 's') && ifSis == true) {
					nSobremesaConSis++;
				}
			}

		}

		// Mostramos por consola
		System.out.println("\nEl ordenador mas economico es: " + OrdeMasEco);

		System.out.println("El precio medio de los ordenadores es: " + precioMedio / nOrdern);

		System.out.println("La grafica del ordenador mas cara es: " + graficaMasCara);

		System.out.println("Los Cpus de los ordenadores mas de 800 euros y sin SO: " + listaCpu);

		System.out.println(
				"El porcentaje de ordenadores de sobremesa sin SO: " + (float) (nSobremesaSinSis * 100) / nOrdern);

		System.out.println(
				"El porcentaje de ordenadores de sobremesa con SO: " + (float) (nSobremesaConSis * 100) / nOrdern);

		// Cerramos teclado
		teclado.close();

	}

}
