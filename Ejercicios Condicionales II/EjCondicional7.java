package EjCondicional2;

import java.util.Scanner;

public class EjCondicional7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// Declaracion de variables
		int calibre, metros;
		float cuotacontratacion = 0f, cuotaservicio = 0f, cuotaconsumo = 0f;
		String uso;

		// leemos por teclado con scanner
		System.out.print("Introduzca el uso destinado del agua(domestico,industrial,centros,bonificados): ");
		uso = teclado.next();

		System.out.print("Introduzca el calibre(20,25,30,40,50,65): ");
		calibre = teclado.nextInt();

		System.out.print("Introduzca los metros cubicos: ");
		metros = teclado.nextInt();

		// Condicionales cuota de contratacion
		// Si el uso es domestico hara un switch y si no hara otro.

		if (uso.toLowerCase().equals("domestico")) {
			switch (calibre) {
			case 20:
				cuotacontratacion = 67.75f;
				break;
			case 25:
				cuotacontratacion = 85.65f;
				break;
			case 30:
				cuotacontratacion = 103.95f;
				break;
			case 40:
				cuotacontratacion = 140.16f;
				break;
			case 50:
				cuotacontratacion = 179.83f;
				break;
			case 65:
				cuotacontratacion = 233.92f;
				break;
			}
		} else {
			if (uso.toLowerCase().equals("industrial")) {
				switch (calibre) {
				case 20:
					cuotacontratacion = 90.52f;
					break;
				case 25:
					cuotacontratacion = 108.62f;
					break;
				case 30:
					cuotacontratacion = 126.73f;
					break;
				case 40:
					cuotacontratacion = 162.93f;
					break;
				case 50:
					cuotacontratacion = 199.14f;
					break;
				case 65:
					cuotacontratacion = 253.45f;
					break;

				}
			} else {
				if (uso.toLowerCase().equals("centros")) {
					switch (calibre) {
					case 20:
						cuotacontratacion = 67.75f;
						break;
					case 25:
						cuotacontratacion = 85.86f;
						break;
					case 30:
						cuotacontratacion = 103.95f;
						break;
					case 40:
						cuotacontratacion = 140.16f;
						break;
					case 50:
						cuotacontratacion = 179.83f;
						break;
					case 65:
						cuotacontratacion = 233.92f;
						break;

					}
				} else {
					switch (calibre) {
					case 20:
						cuotacontratacion = 67.75f;
						break;
					case 25:
						cuotacontratacion = 85.86f;
						break;
					case 30:
						cuotacontratacion = 103.95f;
						break;
					case 40:
						cuotacontratacion = 140.16f;
						break;
					case 50:
						cuotacontratacion = 179.83f;
						break;
					case 65:
						cuotacontratacion = 233.92f;
						break;
					}
				}

			}
		}

		// Condicionales Cuota de Servicio
		// Si el calibre 20 es 6.94, si el calibre 25 es 10.85...
		switch (calibre) {
		case 20:
			cuotaservicio = 6.94f;
			break;
		case 25:
			cuotaservicio = 10.85f;
			break;
		case 30:
			cuotaservicio = 15.63f;
			break;
		case 40:
			cuotaservicio = 27.79f;
			break;
		case 50:
			cuotaservicio = 43.42f;
			break;
		case 65:
			cuotaservicio = 73.24f;
			break;
		}

		// Condicionales Cuota de Consumo
		// Su el metros el mayor o igual que 10 , hay una operacion y si no otra..
		if (metros <= 10) {
			cuotaconsumo = metros * 0.29f;
		} else {
			if (metros >= 11 && metros <= 18) {
				cuotaconsumo = metros * 0.29f;
			} else {
				cuotaconsumo = metros * 0.58f;
			}
		}

		System.out.println("Usted debera abonar:");
		System.out.println("Cuota de consumo: " + cuotaconsumo + "€");
		System.out.println("Cuota de uso: " + cuotaservicio + "€");
		System.out.println("Cuota de uso: " + cuotacontratacion + "€");
		System.out.println("En total debera abonar: " + (cuotaservicio + cuotaconsumo + cuotacontratacion) + "€");

	}

}
