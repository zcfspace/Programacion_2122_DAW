package Ejecondicional;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	Scanner teclado=new Scanner(System.in);
    	int sueldo, pagas, porirpf, irpf, beneficio ;
		float porcentaje;
    	
		System.out.print("Ingrese su sueldo mensual: ");
		sueldo=teclado.nextInt();
		
		System.out.print("Ingrese su numeros de paga: ");
		pagas=teclado.nextInt();
		
		System.out.print("Ingrese su porcentaje de irpf: ");
		porirpf=teclado.nextInt();
		
		//irpf que paga al a�o
		irpf =  (porirpf * (sueldo/100)) * pagas ;
		
		System.out.println("Cada a�o pagas por el irpf: " + irpf);
		
		//Beneficio al a�o
		beneficio = ((100 - porirpf) * (sueldo/100)) * pagas ;
		porcentaje = (float) (beneficio * 100) / (sueldo * pagas);
		
		System.out.println("Cada a�o ganas: " + beneficio + ", que seria un " + porcentaje + "% de su sueldo");
		
		
	}

}
