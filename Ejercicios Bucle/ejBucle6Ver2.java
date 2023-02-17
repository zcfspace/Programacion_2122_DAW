package ejBucle2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ejBucle6Ver2 {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int palMayus = 0, pal = 0, palMinus = 0;
		String frase, palMaxLog;
		String linPal[];
		char c;

		BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\zheng\\eclipse-workspace\\Programacion2021-2022\\bin\\ejBucle2\\fichero6.txt"));

		frase = br.readLine();

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

		linPal = frase.split(" ");

		palMaxLog = linPal[0];

		for (int i = 1; i < linPal.length; i++) {
			String palActual = linPal[i];
			if (palActual.length() > palMaxLog.length()) {
				palMaxLog = palActual;
			}
		}

		System.out.println("Total de palabras: " + pal);
		System.out.println("La palabra mas larga es " + palMaxLog + " con " + palMaxLog.length() + " carácteres.");
		System.out.println("Total de palabras que empieze por mayuscula: " + palMayus);
		System.out.println("Total de palabras que empieze por minuscula: " + palMinus);

		teclado.close();
	}

}
