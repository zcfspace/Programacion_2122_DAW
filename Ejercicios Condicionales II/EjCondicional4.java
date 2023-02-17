package EjCondicional2;

import java.util.Scanner;

public class EjCondicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leemos por teclado con scanner
		Scanner teclado = new Scanner(System.in);

		// Declaración
		int num1, num2, num3 = 0;
		String preferencia ="";

		// Introducción de valores
		System.out.print("Ingrese primer valor:");
		num1 = teclado.nextInt();

		System.out.print("Ingrese segundo valor:");
		num2 = teclado.nextInt();

		System.out.print("Ingrese tercer valor:");
		num3 = teclado.nextInt();

		System.out.print("Ingrese su preferencia (Ascendente o descendente): ");
		preferencia = teclado.next();
		
		//Transforma el texto a minuscula, y comprueba la condicion. Si el true, hace las comprobaciones
		//para sacer los numeros en orden descendente.
		//Y si no, comprobamos si el ascendente.	
		
		if (preferencia.toLowerCase().equals("descendente")) {
			if (num1 > num2 && num2 > num3)
				System.out.println(num1 + ", " + num2 + ", " + num3);
			else {
				if (num1 > num3 && num3 > num2)
					System.out.println(num1 + ", " + num3 + ", " + num2);
				else {
					if (num2 > num1 && num1 > num3)
						System.out.println(num2 + ", " + num1 + ", " + num3);
					else {
						if (num2 > num3 && num3 > num1)
							System.out.println(num2 + ", " + num3 + ", " + num1);
						else {
							if (num3 > num1 && num1 > num2)
								System.out.println(num3 + ", " + num1 + ", " + num2);
							else {
								if (num3 > num2 && num2 > num1)
									System.out.println(num3 + ", " + num2 + ", " + num1);
							}
						}
					}
				}
			}
		} else {
			if (preferencia.toLowerCase().equals("ascendente")) {
				if (num1 < num2 && num2 < num3)
					System.out.println(num1 + ", " + num2 + ", " + num3);
				else {
					if (num1 < num3 && num3 < num2)
						System.out.println(num1 + ", " + num3 + ", " + num2);
					else {
						if (num2 < num1 && num1 < num3)
							System.out.println(num2 + ", " + num1 + ", " + num3);
						else {
							if (num2 < num3 && num3 < num1)
								System.out.println(num2 + ", " + num3 + ", " + num1);
							else {
								if (num3 < num1 && num1 < num2)
									System.out.println(num3 + ", " + num1 + ", " + num2);
								else {
									if (num3 < num2 && num2 < num1)
										System.out.println(num3 + ", " + num2 + ", " + num1);
								}
							}
						}
					}
				}
			}
		}

		
	}
}
