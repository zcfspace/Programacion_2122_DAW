package tema2;

import java.util.Scanner;

public class EjCondicionalSimple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lectura por teclado con scanner
    	Scanner teclado=new Scanner(System.in);
    	
    	//declaraciones
    	int nota1,nota2,nota3;
    	int promedio;
    	
    	//leemos por teclado
    	System.out.print("Ingrese primer nota:");
    	nota1=teclado.nextInt();
    	
    	System.out.print("Ingrese segunda nota:");
    	nota2=teclado.nextInt();
    	
    	System.out.print("Ingrese tercer nota:");
    	nota3=teclado.nextInt();
        
    	//Operación
        promedio=(nota1 + nota2 + nota3) / 3;
        
        //si la nota promedio es mayor o igual que 7, muestra "Promocionado" por consola.
    	if (promedio>=7) {
    	    System.out.print("Promocionado");
    	}
			
		
	}

}
