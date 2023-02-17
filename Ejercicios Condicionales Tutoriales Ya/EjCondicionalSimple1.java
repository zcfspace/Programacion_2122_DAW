package tema2;

import java.util.Scanner;

public class EjCondicionalSimple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para leer por teclado con scanner
    	Scanner teclado=new Scanner(System.in);
    	
    	//Declaración
    	int num1,num2;
    	
    	//introduccion de valor
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	
    	System.out.print("Ingrese segundo valor:");
    	num2=teclado.nextInt();
    	
    	//si el num2 es menor que num2, calculamos la diferencia de los dos numeros y la suma.
    	if (num1>num2) {
    	    //declaracion local 
    		int suma,diferencia;
    		//operacion 
    	    suma=num1 + num2;
    	    diferencia=num1 - num2;
    	    
    	    //salida por consola 
    	    System.out.println("La suma de los dos valores es:" + suma);
    	    
    	    System.out.println("La diferencia de los dos valores es:" + diferencia);
    	    
    	    //si no se cumbre lo de arriba, hace esto.
    	} else {
    		//declaracion local 
    		int producto;
			float division;
    		//operacion 
    	    producto=num1 * num2;
    	    division=(float)num1 / num2;
    	    
    	    //salida por consola
    	    System.out.println("El producto de los dos valores es:" + producto);
    	    
    	    System.out.println("La división de los dos valores es:" + division);
    	}
    	
	}

}
