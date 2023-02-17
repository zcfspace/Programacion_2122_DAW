package tema4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import coche.Coche;

public class ejerFich1 {

	public static final String RUTA = "c:\\logs\\";
	public static final int ERROR_FICHERO = 1;
	public static final int ERROR_ESCRITURA = 2;
	public Coche listaCoches[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String ficheroDestino = "";

		// Creamos un nuevo array de coche
		Coche listaCoches[] = new Coche[10];

		// Creamos un array de 10 coche aleatorios
		for (int i = 0; i < 10; i++) {
			int potencia = (int) (Math.random() * 1000);
			int peso = (int) (Math.random() * 4000);
			int velocidad = (int) (Math.random() * 400);
			listaCoches[i] = new Coche(potencia, peso, velocidad, "toyota", "rv4", "toyota", "porlar white");
		}

		System.out.print("Introduce el fichero de destino: ");
		ficheroDestino = teclado.next();

		System.out.println(guardarCoches(listaCoches, ficheroDestino));

		teclado.close();
	}

	static int guardarCoches(Coche listaCoches[], String ficheroDestino) {

		try {
			// Creamos el fichero con FileWriter y utilizamos PrintWriter
			// Para escribir en el

			FileWriter fw = new FileWriter(RUTA + ficheroDestino + ".txt", false);
			PrintWriter pw = new PrintWriter(fw);

			// Recorremos el array y escribimos el libro en el fichero
			for (int i = 0; i < listaCoches.length; i++) {
				// Si el coche i de la lista esta vacia, devolvemos error de escritura

				String linea = listaCoches[i].toString();
				pw.println(linea);
			}

			// Cerramos los manejadores de ficheros
			fw.close();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(ERROR_FICHERO + " no se encuentra el fichero");

		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println(ERROR_ESCRITURA + " no se pudo escribir en el fichero");
		}
		return 0;

	}

}
