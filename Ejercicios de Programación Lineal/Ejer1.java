package Ejecondicional;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner teclado=new Scanner(System.in);
    	int radio;
		float volumen;
    	
		System.out.print("Ingrese el radio de la esfera: ");
		radio=teclado.nextInt();
		 
		//calculo de volumen
		volumen = (float) ((4.0/3)* Math.PI * Math.pow(radio, 3));
		
		System.out.print("El volumen de la esfera es : " + volumen);
		
    	
    	
	}

}
