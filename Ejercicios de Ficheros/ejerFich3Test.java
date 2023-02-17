package coche;

import java.io.IOException;

public class ejerFich3Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String rutaFichero = "c:\\logs\\ArrayTester.txt";

		Coche[] mostrarCoche = Coche.cargarCoches(rutaFichero);

		for (int i = 0; i < mostrarCoche.length; i++) {
			System.out.println(mostrarCoche[i].toString());
		}

	}

}
