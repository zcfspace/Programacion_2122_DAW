package EjeProSec;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int	a�oact, edad, a�odeter, a�onac ;
		
		System.out.print("Introduce el a�o actual:");
		a�oact = teclado.nextInt();
		
		System.out.print("Introduce tu edad:");
		edad = teclado.nextInt();
		
		System.out.print("Ingrese el a�o determinada: ");
		a�odeter = teclado.nextInt();
		
		//calculo de nacimiento 
		System.out.println("Tu a�o de nacimiento es:" + (a�onac = a�oact - edad));
		
		//calculo de a�o
		System.out.println("En el a�o " + a�odeter + " tendr�s" +  (a�odeter - a�onac)) ;
		
		
		
	}

}
