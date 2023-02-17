package Ejecondicional;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner teclado=new Scanner(System.in);
    	int radio, altura, volumen ;
    	
		System.out.print("Ingrese el radio: ");
		radio=teclado.nextInt();
		
		System.out.print("Ingrese la altura: ");
		altura=teclado.nextInt();
		
		//calculo de volumen
		volumen = (int) Math.PI * radio * radio * altura;
		
		System.out.print("El volumen del cilindro es : " + volumen);
		
		
	}

}
