package EjeProSec;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, num4, X,Y;

		
		System.out.print("Escriba el 1ª numero: ");
		num1 = teclado.nextInt();
		
		System.out.print("Escriba el 2ª numero: ");
		num2 = teclado.nextInt();
		
		System.out.print("Escriba el 1ª numero: ");
		num3 = teclado.nextInt();
		
		System.out.print("Escriba el 2ª numero: ");
		num4 = teclado.nextInt();
		
		//numero maximo
	      if(num1 > num2 && num1 > num3 && num1 > num4){
	            X=num1;
	        }else{
	            if(num2 > num1 && num2 > num3 && num2 > num4){
	                X=num2;
	            }else{
	                if(num3 > num1 && num3 > num2 && num3 > num4){
	                    X=num3;
	                }else
	                    X=num4;
	            }
	        }
	      
	      //numero minimo
	        if(num1 < num2 && num1 < num3 && num1 < num4){
	            Y=num1;
	        }else{
	            if(num2 < num1 && num2 < num3 && num2 < num4){
	                Y=num2;
	            }else{
	                if(num3 < num1 && num3 < num2 && num3 < num4){
	                    Y=num3;
	                }else
	                    Y=num4;
	            }
	        }
	     
		System.out.println("La suma de los dos primero numero es: " + (num1 + num2));
		
		System.out.println("La resta de los dos primero numero es: " + (num1 - num2));
		
		System.out.println("La división de los dos primero numero es: " + ((float)num1 / num2));
		
		System.out.println("La multiplicación de los dos primero numero es: " + (num1 * num2));
		
		System.out.println("La media de los cuatro numero es: " + ((float) num1 + num2 + num3 + num4)/4);
		
	    System.out.println("El numero mayor es: " + X);
	    
	    System.out.println("El numero menor es: " + Y);
	    
		
		
	}

}
