package EjeProSec;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        
        double n ;
         
        System.out.print("Ingresa el valor de cantidad de euros: ");
        n = sc.nextDouble();
        
        //condicion para que el numero maximo sea 4500
        if(n<4500) {	  
        
        System.out.println((int)n/100+" billete de 100€");
        System.out.println((int)n%100/50+" billete de 50€");
        System.out.println((int)n%100%50/20+" billete de 20€");
        System.out.println((int)n%100%50%20/10+" billete de 10€");
        System.out.println((int)n%100%50%20%10/5+" billete de 5€");
        System.out.println((int)n%100%50%20%10%5/1+" moneda de 1€");
        double a =n%10%5%1;
        System.out.println((int)(a/0.5)+" moneda de 0,50€");
 
        }else{
	    	System.out.println("Error, Introduzca un numero inferior a 4500");
	    } 
		
		
	}

}
