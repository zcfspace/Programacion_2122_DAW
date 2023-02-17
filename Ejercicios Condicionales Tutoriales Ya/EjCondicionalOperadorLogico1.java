package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para leer por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaraciones 
        int dia,mes,año;
        
    	//introduccion de valor
        System.out.print("Ingrese numero de día:");
        dia=teclado.nextInt();
        
        System.out.print("Ingrese numero de mes:");
        mes=teclado.nextInt();
        
        System.out.print("Ingrese numero de año:");
        año=teclado.nextInt();
        
        //Si el mes y el dia correponde al de navidad muestra el contenido por consola.
        if (mes==12 && dia==25) {
            System.out.print("La fecha ingresada corresponde a navidad.");
        }
				
		
	}

}
