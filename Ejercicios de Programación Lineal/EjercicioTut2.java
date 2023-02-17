package Ejecondicional;

import java.util.Scanner;

public class EjercicioTut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner teclado=new Scanner(System.in);
    	int num1,num2,num3,num4,suma,producto;
    	
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	
    	System.out.print("Ingrese segundo valor:");
    	num2=teclado.nextInt();
    	
    	System.out.print("Ingrese tercer valor:");
    	num3=teclado.nextInt();
    	
    	System.out.print("Ingrese cuarto valor:");
    	num4=teclado.nextInt();
    	
    	//calculo
    	suma=num1 + num2;
    	producto=num3 * num4;
    	
    	System.out.println("La suma de los dos primero valores es: "+ suma);
    	System.out.println("El producto del tercer y cuarto valor es: " + producto);
	}

}
