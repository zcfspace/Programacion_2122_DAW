package Ejecondicional;

import java.util.Scanner;

public class EjercicioTut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner teclado=new Scanner(System.in);
		
		int lado,perimetro;
		
		System.out.print("Ingrese el lado del cuadrado:");
		lado=teclado.nextInt();
		
		//calculo de perimetro
		perimetro=lado * 4;
		System.out.print("El perímetro del cuadrado es:");
		
		System.out.print(perimetro);
	}

}
