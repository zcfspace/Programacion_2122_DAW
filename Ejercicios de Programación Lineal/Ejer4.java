package Ejecondicional;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner teclado=new Scanner(System.in);

    	//Declarar el texto
    	String	texto;
		System.out.print("Ingrese un texto: ");
		texto = teclado.nextLine();
		
		//Pasar a mayuscula
		System.out.println(texto.toUpperCase());
		
		//Longitud de cadena
		System.out.println("Longitud de la cadena es: " + texto.length()); 
				
	}

}
