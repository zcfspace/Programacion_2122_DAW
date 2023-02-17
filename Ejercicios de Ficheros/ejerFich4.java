package tema4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ejerFich4 {

	public static final int OK = 0;
	public static final int FICHERO_NO_ENCONTRADO = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// iniciamos teclado
		Scanner teclado = new Scanner(System.in);

		// Declaramos las variables
		String directorio = "";
		String nombreModificado = "";
		String extension = "";
		String rutaDirectorio = "";
		int size = 0;
		int dias = 0;

		// Leemos por consola

		System.out.print("Introduce la ruta de directorio (ej: c:\\logs\\hola): ");
		rutaDirectorio = teclado.next();

		System.out.print("Introduce el directorio a leer: ");
		directorio = teclado.next();

		System.out.print("Introduce el nombre que deseas modificar: ");
		nombreModificado = teclado.next();

		System.out.print("Introduce el extension de desea borrar: ");
		extension = teclado.next();

		System.out.print("Introduce el tamano maximo (en byte): ");
		size = teclado.nextInt();

		System.out.print("Introduce el dia: ");
		dias = teclado.nextInt();

		// Mostramos por consola

		System.out.println("\nOK = 0, FICHERO_NO_ENCONTRADO = 1");

		System.out.println("\nEl directorio esta vacio?");
		System.out.println(directorioVacio(rutaDirectorio));

		System.out.println("\nFichero borrados por ser de extension " + extension + ": ");
		System.out.println(borrarFicheros(directorio, extension));

		System.out.println("\nFichero borrados por ecceso de tamaño:");
		System.out.println(borrarFicherosSize(directorio, size));

		System.out.println("\nFicheros que se creo antes del dia " + dias + ": ");
		System.out.println(mostrarFicherosRecientes(directorio, dias));

		System.out.println("\nArchivos modificados: ");
		System.out.println(modificarNombres(directorio, nombreModificado));

		// cerramos teclado
		teclado.close();
	}

	/**
	 * Funcion para comprobar el directorio
	 * 
	 * @param rutaDirectorio
	 * @return si hay archivos devuelve true y si no hay devuelve false
	 */
	static boolean directorioVacio(String rutaDirectorio) {

		// Ruta del directorio
		File carpeta = new File(rutaDirectorio);

		// Listamos los archivos de la carpeta
		File[] archivos = carpeta.listFiles();

		// Si no hay archivo en la carpeta, devolvemos error
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay arhivos en el directorio");
			return true;
		}

		return false;

	}

	// Borrara todos los ficheros con la extension introducida, por ejemplo. si
	// extensión es bat, borrara todos los ficheros .bat
	/**
	 * Funcion que borra los los fichero de la extension indicada en el direcotio
	 * indicado
	 * 
	 * @param directorio
	 * @param extension
	 * @return
	 */
	static int borrarFicheros(String directorio, String extension) {

		// Ruta del archivo
		File carpeta = new File("c:\\logs\\" + directorio);
		// Listamos los archivos de la carpeta
		File[] archivos = carpeta.listFiles();

		// Si no hay archivo en la carpeta, devolvemos error
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay arhivos en el directorio");
			return FICHERO_NO_ENCONTRADO;
		} else {
			for (int i = 0; i < archivos.length; i++) {

				File archivo = archivos[i];
				// Si el nombre del archivo acaba con la extension indicada, se borrara
				if (archivo.getName().endsWith('.' + extension)) {
					System.out.println(archivo.getName());
					archivo.delete();
				}
			}
		}
		return OK;
	}

	// El módulo borrará los ficheros cuyo tamaño en bytes sea mayor a el
	// introducido en size
	/**
	 * Funcion que elimina los archivos del directorio que eccedan el tamano
	 * indicado
	 * 
	 * @param directorio
	 * @param size
	 * @return
	 */
	static int borrarFicherosSize(String directorio, int size) {

		// Ruta del archivo
		File carpeta = new File("c:\\logs\\" + directorio);
		// Listamos los archivos de la carpeta
		File[] archivos = carpeta.listFiles();

		// Si no hay archivo en la carpeta, devolvemos error
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay arhivos en el directorio");
			return FICHERO_NO_ENCONTRADO;
		} else {
			for (int i = 0; i < archivos.length; i++) {

				File archivo = archivos[i];
				// Calculamos el tamano del archivo en byte
				long tamFil = archivo.length();

				// Si el tamano es mayor que el tamano tope,se borra el archivo
				if (tamFil > size) {
					System.out
							.println("Se borró el archivo " + archivo.getName() + " porque tiene " + tamFil + "bytes");
					archivo.delete();
				}
			}
		}
		return OK;
	}

	// Hara un listado de los ficheros cuya fecha de ultima modificacion sea más
	// moderna que hace los días introducidos por parámetro. Para gestionar la
	// fechas mirar el siguiente enlace
	/**
	 * Funcion que muestra todos los archivos que hay en el directorio indicado por
	 * dias
	 * 
	 * @param directorio
	 * @param dias
	 * @return
	 */
	static int mostrarFicherosRecientes(String directorio, int dias) {

		// Ruta del archivo
		File carpeta = new File("c:\\logs\\" + directorio);
		// Listamos los archivos de la carpeta
		File[] archivos = carpeta.listFiles();

		// Si no hay archivo en la carpeta, devolvemos error
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay arhivos en el directorio");
			return FICHERO_NO_ENCONTRADO;
		} else {
			for (int i = 0; i < archivos.length; i++) {

				File archivo = archivos[i];

				// MM/dd/yyyy HH:mm:ss. Solo queremos el dia, asi que solo ponemos dd
				SimpleDateFormat diaForm = new SimpleDateFormat("dd");

				// Si el archivos es modificado despues del dia indicada, se borrará
				if (dias > Integer.parseInt(diaForm.format(archivo.lastModified()))) {
					System.out.println(archivo.getName());
				}
			}
		}
		return OK;
	}

	// Renombrara los nombres de todos los ficheros (sólo los ficheros) del
	// directorio que se pasa por parametro, poniendoles el nombre modificado y un
	// contador. por ejemplo, si nombreModificado fuera “fichero”, se renombrarían
	// fichero1 fichero2 fichero3… etc
	// Devolverá un error si ha saltado surgido alguna excepción.

	/**
	 * funcion que renombra los ficheros del directorio indicado
	 * 
	 * @param directorio
	 * @param nombreModificado
	 * @return
	 */
	static int modificarNombres(String directorio, String nombreModificado) {

		// Ruta del archivo
		File carpeta = new File("c:\\logs\\" + directorio);
		// Listamos los archivos de la carpeta
		File[] archivos = carpeta.listFiles();

		// Si no hay archivo en la carpeta, devolvemos error
		if (archivos == null || archivos.length == 0) {
			System.out.println("No hay arhivos en el directorio");
			return FICHERO_NO_ENCONTRADO;
		} else {
			// Hacemos un bucle que recorra el array de archivos
			for (int i = 0; i < archivos.length; i++) {

				File archivo = archivos[i];
				// Creamos archivo con el nuevo nombre
				File newFile = new File("c:\\logs\\" + directorio + "\\" + nombreModificado + (i + 1));

				// mostramos por consola y renombramos el archivo
				System.out.println("Fichero " + archivo.getName() + " se cambio de nombre a " + newFile.getName());
				archivo.renameTo(newFile);

			}
		}
		return OK;
	}

}
