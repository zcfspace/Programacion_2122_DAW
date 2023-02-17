package Ejecondicional;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner teclado=new Scanner(System.in);
    	int inicio, fin;
    	String cadena, subcadena;
    	
    	//Declarar el texto

		System.out.print("Ingrese un texto: ");
		cadena = teclado.nextLine();
		System.out.println("Longitud de la cadena es: " + cadena.length());
		
		
		System.out.print("Ingrese el inicio: ");
		inicio = teclado.nextInt();
		
		System.out.print("Ingrese el fin: ");
		fin = teclado.nextInt();
		
		String SubCadena = cadena.substring(inicio - 1, fin);
		System.out.println(SubCadena);
		
	}

}
