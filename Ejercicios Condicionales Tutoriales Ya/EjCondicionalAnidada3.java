package tema2;

import java.util.Scanner;

public class EjCondicionalAnidada3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para leer por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaraci�n
        int num;
        
        //introduccion de valor
        System.out.print("Ingrese un valor de hasta tres d�gitos positivo:");
        num=teclado.nextInt();
        
        //Si el numero es menor que 10, tiene un digito.
        //Si es false, hacemos otro if, que si el numero es menor de 100 tiene dos digitos 
        //Si es flase, hacemos otro if, que si el numero es menor de 1000 tiene tres digitos 
        //Y si no, el mostramos el error.
        if (num<10) {
	    System.out.print("Tiene un d�gito");
        }
        else {
            if (num<100) {
                System.out.print("Tiene dos d�gitos");
            } else {
                if (num<1000) {
                    System.out.print("Tiene tres d�gitos");
                } else {
                    System.out.print("Error. Debe introducir un numero menor de 3 cifras");
                }
            }
        }
		
		
		
		
		
		
	}

}
