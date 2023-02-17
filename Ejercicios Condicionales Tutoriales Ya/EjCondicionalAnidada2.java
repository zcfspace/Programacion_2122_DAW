package tema2;

import java.util.Scanner;

public class EjCondicionalAnidada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para leer por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //declaracion
        int num;
        
        //Introduccion de valor
        System.out.print("Ingrese un valor:");
        num=teclado.nextInt();
        
        //Si el num es 0, mostrara por consola "Se ingresó el cero".
        //Si es false, hacemos otro if que si el num es mayor que 0, el valor es positivo 
        // y si no es negativo.
        if (num==0) {
        	System.out.print("Se ingresó el cero");
        } else {
	    if (num>0) {
	        System.out.print("Se ingresó un valor positivo");
	    } else {
	        System.out.print("Se ingresó un valor negativo");
	    }
	}
		
		
	
	}

}
