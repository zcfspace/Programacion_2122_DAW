package Ejecondicional;

import java.util.Scanner;

public class EjercicioTut4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarar datos
    	Scanner teclado=new Scanner(System.in);
    	int cantidad;
    	float precio, importe;
    	
    	System.out.print("Ingrese la cantidad de artículos a llevar:");
    	cantidad=teclado.nextInt();
    	
    	System.out.print("Ingrese el valor unitario del producto:");
    	precio=teclado.nextFloat();
    	
    	//calculo
    	importe=precio * cantidad;
    	
    	System.out.print("El importe total a pagar es:" + importe);
	}

}
