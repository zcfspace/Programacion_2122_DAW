package ejBucle2;

import java.util.Scanner;

public class ejBucle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Lectura por teclado
		Scanner teclado = new Scanner(System.in);

		// Declaración de variables
		int palMayus = 0, pal = 0, palMinus = 0;
		String frase, palMaxLog;
		String linPal[];
		char c;

		System.out.println("Escribe una frase: ");
		frase = teclado.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			// c es el un nuevo caracter cada vez que haga el bucle, de esta forma podemos
			// comprobar la frase entera.
			c = frase.charAt(i);

			// Si eñ caracter anterior a él es espacio. Suma 1
			if ((i == 0 || Character.isWhitespace(frase.charAt(i - 1)))) {
				pal++;
				// Si la letra es mayuscula. Suma 1
				if (Character.isUpperCase(c)) {
					palMayus++;
				} else {
					// Si la letra es miniscula . Suma 1
					// palMinus
					if (Character.isLowerCase(c)) {
						palMinus++;
					}
				}
			}
		}

		// Separamos la flase
		linPal = frase.split(" ");

		palMaxLog = linPal[0];

		// Inicialización contador ; Condición ; incremento contador
		// Mientras que i es menor que cantidad de palabras , seguirá haciendo el bucle
		for (int i = 1; i < linPal.length; i++) {
			String palActual = linPal[i];
			// Si la cantidad de caracteres de palActual es mayor que la de palMaxLog
			// PalActual es PalMaxLog
			if (palActual.length() > palMaxLog.length()) {
				palMaxLog = palActual;
			}
		}

		// Mostramos por consola
		System.out.println("Total de palabras: " + pal);
		System.out.println("La palabra mas larga es " + palMaxLog + " con " + palMaxLog.length() + " carácteres.");
		System.out.println("Total de palabras que empieze por mayuscula: " + palMayus);
		System.out.println("Total de palabras que empieze por minuscula: " + palMinus);

		// Cierre de teclado
		teclado.close();

	}

}
