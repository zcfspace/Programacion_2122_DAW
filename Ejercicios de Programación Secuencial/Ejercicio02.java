package EjeProSec;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int	añoact, edad, añodeter, añonac ;
		
		System.out.print("Introduce el año actual:");
		añoact = teclado.nextInt();
		
		System.out.print("Introduce tu edad:");
		edad = teclado.nextInt();
		
		System.out.print("Ingrese el año determinada: ");
		añodeter = teclado.nextInt();
		
		//calculo de nacimiento 
		System.out.println("Tu año de nacimiento es:" + (añonac = añoact - edad));
		
		//calculo de año
		System.out.println("En el año " + añodeter + " tendrás" +  (añodeter - añonac)) ;
		
		
		
	}

}
