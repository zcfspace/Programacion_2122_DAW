package ejWhileForTutorialYa;

public class ejForTut8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primer turno
		// Nuevo array con 50 numero

		int suma1, suma2, suma3, pro1, pro2, pro3;
		suma1 = 0;
		suma2 = 0;
		suma3 = 0;

		int[] edad = new int[50];

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor o igual que 50, seguirá haciendo el bucle
		for (int i = 0; i < edad.length; i++) {
			edad[i] = (int) (Math.random() * (100));
			System.out.print(edad[i] + " - ");
			suma1 += edad[i];
		}
		// Calculo de promedio
		pro1 = suma1 / 50;
		System.out.println("\nPromedio de edades del turno mañana:" + pro1);

		// Condicion para calcular la edad maxima
		int max = edad[0];

		// Inicialización contador ; Condición ; incremento contador
		for (int i = 0; i < edad.length; i++) {
			// Si edad es mayor que max, max es edad.
			if (edad[i] > max) {
				max = edad[i];
			}
		}
		System.out.println("La edad maxima del primer turno es: " + max);

		// Condicion para calcular la edad minima
		int min = edad[0];
		// Inicialización contador ; Condición ; incremento contador
		for (int i = 0; i < edad.length; i++) {
			// Si edad es menor que min, min es edad.
			if (edad[i] < min) {
				min = edad[i];
			}
		}
		System.out.println("La edad minima del primer turno es: " + min + "\n");

		// Segundo turno
		// Nuevo array con 60 numero
		int[] edad2 = new int[60];

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor o igual que 60, seguirá haciendo el bucle
		for (int i = 0; i < edad2.length; i++) {
			edad2[i] = (int) (Math.random() * (100));
			System.out.print(edad2[i] + " - ");
			suma2 += edad2[i];
		}
		// Calculo de promedio
		pro2 = suma2 / 60;
		System.out.println("\nPromedio de edades del turno tarde:" + pro2);

		int max2 = edad2[0];
		// Inicialización contador ; Condición ; incremento contador
		for (int i = 0; i < edad2.length; i++) {
			// Si edad es mayor que max, max es edad.
			if (edad2[i] > max2) {
				max2 = edad2[i];
			}
		}
		System.out.println("La edad maxima del segundo turno es: " + max2);

		int min2 = edad2[0];
		// Inicialización contador ; Condición ; incremento contador
		for (int i = 0; i < edad2.length; i++) {
			// Si edad es menor que min, min es edad.
			if (edad2[i] < min2) {
				min2 = edad2[i];
			}
		}
		System.out.println("La edad minima del segundo turno es: " + min2 + "\n");

		// Tercer turno
		// Nuevo array con 110 numero
		int[] edad3 = new int[110];

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que f es menor o igual que 110, seguirá haciendo el bucle
		for (int i = 0; i < edad3.length; i++) {
			edad3[i] = (int) (Math.random() * (100));
			System.out.print(edad3[i] + " - ");
			suma3 += edad3[i];
		}

		// Calculo de promedio
		pro3 = suma3 / 60;
		System.out.println("\nPromedio de edades del turno noche:" + pro3);

		int max3 = edad3[0];
		// Inicialización contador ; Condición ; incremento contador
		for (int i = 0; i < edad3.length; i++) {
			// Si edad es mayor que max, max es edad.
			if (edad3[i] > max3) {
				max3 = edad3[i];
			}
		}

		System.out.println("La edad maxima del tercer turno es: " + max3);

		int min3 = edad3[0];
		// Inicialización contador ; Condición ; incremento contador
		for (int i = 0; i < edad3.length; i++) {
			// Si edad es menor que min, min es edad.
			if (edad3[i] < min3) {
				min3 = edad3[i];
			}
		}
		System.out.println("La edad minima del tercer turno es: " + min3 + "\n");

		// Calcular el max de todo los turnos.
		// Si max es mayor que max2 y max3, max es el mayor
		if (max > max2 && max > max3) {
			System.out.println("La edad maxima de todos turnos es: " + max);
		} else {
			// Si max2 es mayor que max y max3, max2 es el mayor
			if (max2 > max && max2 > max3) {
				System.out.println("La edad maxima de todos turnos es: " + max2);
				// Si false, max3 es el mayor
			} else {
				System.out.println("La edad maxima de todos turnos es: " + max3);
			}
		}

		// Calcular el min de todo los turnos.
		if (min < min2 && min < min3) {
			System.out.println("La edad minima de todos turnos es " + min);
		} else {
			if (min2 < min && min2 < min3) {
				System.out.println("La edad minima de todos turnos es " + min2);
			} else {
				System.out.println("La edad minima de todos turnos es " + min3);
			}
		}
		// calcular el promedio mas alto de los tres turnos
		if (pro1 < pro2 && pro1 < pro3) {
			System.out.print("El turno mañana tiene un promedio menor de edades.");
		} else {
			if (pro2 < pro3) {
				System.out.print("El turno tarde tiene un promedio menor de edades.");
			} else {
				System.out.print("El turno noche tiene un promedio menor de edades.");
			}
		}

	}

}
