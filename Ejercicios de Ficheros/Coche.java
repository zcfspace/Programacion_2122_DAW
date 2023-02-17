package coche;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Coche {

	// Atributos
	private int potencia = 0, peso = 0, velocidad = 0;
	private String nombre = "", modelo = "", marca = "";
	private String color = "";

	public Coche(int potencia, int peso, int velocidad, String nombre, String modelo, String marca, String color) {
		super();
		this.potencia = potencia;
		this.peso = peso;
		this.velocidad = velocidad;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
	}

	public Coche() {
		// TODO Auto-generated constructor stub
	}

	// EJERICICIO 3 DE FICHERO

	static Coche[] cargarCoches(String rutaFichero) throws IOException {

		int i = 0;

		// Contamos las lineas del fichero
		try {
			FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr);

			// Leemos una linea
			String linea = br.readLine();
			i = 0;
			while (linea != null) {
				// Leemos la linea siguiente
				linea = br.readLine();
				i++;
			}
			// Cerramos los streams de lectura
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// En caso de que haya error de lectura o no exista el fichero, devolverá null.
			return null;

		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}

		// creamos el array con las lines que contiene el fichero
		Coche[] arrayCoche = new Coche[i];

		File abrirFich = new File(rutaFichero);

		Scanner inFile = new Scanner(abrirFich);

		// declaramos las variables
		int potencia;
		int peso;
		int velocidad;
		String nombre;
		String modelo;
		String marca;
		String color;

		// Miestra el archivo hay mas contenidos seguira haciendo el bucle
		while (inFile.hasNext()) {
			for (int x = 0; x < arrayCoche.length; x++) {

				StringTokenizer tokens = new StringTokenizer(inFile.nextLine(), ",");

				potencia = Integer.parseInt(tokens.nextToken());
				peso = Integer.parseInt(tokens.nextToken());
				velocidad = Integer.parseInt(tokens.nextToken());
				nombre = tokens.nextToken();
				modelo = tokens.nextToken();
				marca = tokens.nextToken();
				color = tokens.nextToken();
				// creamos un coche
				arrayCoche[x] = new Coche(potencia, peso, velocidad, nombre, modelo, marca, color);

			}

		}

		inFile.close();
		// devolvemos el array de coche
		return arrayCoche;
	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", peso=" + peso + ", velocidad=" + velocidad + ", nombre=" + nombre
				+ ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + "]";
	}

}
