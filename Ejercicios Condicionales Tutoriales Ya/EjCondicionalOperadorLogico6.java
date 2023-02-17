package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leemos por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaración
        float sueldo;
        int antiguedad;
        
        //Introducción de valores
        System.out.print("Ingrese sueldo del empleado:");
        sueldo=teclado.nextFloat();
        
        System.out.print("Ingrese su antiguedad en años:");
        antiguedad=teclado.nextInt();
        
        //Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, le aumentamos un 20%
        if (sueldo<500 && antiguedad>=10) {
        	//operación de calculo de 20%
            float aumento=sueldo * 0.20f;
            //Lectura por consola 
            System.out.print("Sueldo a pagar:" );
            System.out.print((float)sueldo+aumento);
        } else {
        	//Si lo de arriba no cumple, hacemos esto.
        	//no hace falta comprobar la antigüedad porque ya se supone que es menor que 100 
            if (sueldo<500) {
            	//operación de calculo de 5%
                float aumento=sueldo * 0.05f;
                //Lectura por consola 
                System.out.print("Sueldo a pagar:");
                System.out.print((float)sueldo+aumento);            
            } else {
            	//si todo es false, mostramos el sueldo original.
            	System.out.print("Sueldo a pagar:" + sueldo);
            }
        }
		
		
		
	}

}
