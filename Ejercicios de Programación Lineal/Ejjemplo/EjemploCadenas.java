package tema1;

import java.util.Scanner;

public class EjemploCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definimos las variables
		String texto,palabra;
		int inicio,fin;
		
		Scanner teclado = new Scanner(System.in);
		
		//Leemos los datos por teclado
		System.out.print("Intrudce la primer cadena(String):");
		texto = teclado.nextLine();

		System.out.print("Intrudce la segunda cadena(String):");
		palabra = teclado.next();
		
		System.out.print("Intrudce la incio:");
		inicio = teclado.nextInt();
		
		System.out.print("Intrudce la fin:");
		fin = teclado.nextInt();
		
		//Probamos algunas funciones de cadenas 
		System.out.println("La Longitud de la primera cadena es:" + texto.length());
		
		System.out.println(texto.concat(" es la primera cadena"));
		
		System.out.println("El carater en la posición 4 es " + texto.charAt(3));
		
		System.out.println("El carater en la posición " + inicio + " es " + texto.charAt(inicio - 1));
		
		//Substring nos corta la cadena por las posiciones que le indicamos 
		String subCadena = texto.substring(inicio, fin);
		System.out.println("La subcadena es: " + subCadena);
		
		System.out.println("Es primer string es igual al segundo?" + texto.equals(palabra));
		
		System.out.println("Posición de la 2 cadena en la 1: " + texto.indexOf(palabra));
		
		
				
		
	}

}
