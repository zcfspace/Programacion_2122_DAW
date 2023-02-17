package tema2;

import java.util.Scanner;

public class EjCondicionalSimple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lectura por teclado con scanner
    	Scanner teclado=new Scanner(System.in);
    	
    	//declaracion 
    	int num;
    	
    	//leemos por teclado
    	System.out.print("Ingrese un valor entero de 1 o 2 dígitos:");
    	num=teclado.nextInt();
    	
    	//si el numero es menor que 10, muestra por consola "Tiene un dígito",
    	//si no, muestra "Tiene dos dígitos"
    	if (num<10) {
    	    System.out.print("Tiene un dígito");
    	} else {
    	    System.out.print("Tiene dos dígitos");
    	}
			
		
	}

}
