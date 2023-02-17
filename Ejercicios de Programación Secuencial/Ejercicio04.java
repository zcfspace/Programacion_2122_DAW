package EjeProSec;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner teclado=new Scanner(System.in);
    	
    	String texto, nombre, telefono, edad;
		int finedad;
    	int fin, inicio;

		System.out.print("Ingrese su nombre, telefono, edad: ");
		texto = teclado.nextLine();
		
		System.out.print("Ingrese el inicio: ");
		inicio = teclado.nextInt();
		
		System.out.print("Ingrese el fin: ");
		fin = teclado.nextInt();
		
		String SubCadena = texto.substring(inicio - 1, fin);
		System.out.println(SubCadena);
		
		finedad = texto.length();
		
		//Mostramos la primera parte de cadena 
		System.out.println("Su nombre es: " + texto.substring(0, inicio - 1));
		
		//Mostramos la segunda parte de la cadena
		System.out.println("Su telefono es: " + SubCadena);
		
		//Mostramos la ultima parte de la cadena.
		System.out.println("Su edad es: " + texto.substring(fin, finedad));
		
	}

}
