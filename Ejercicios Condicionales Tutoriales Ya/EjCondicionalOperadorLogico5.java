package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leemos por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaración
        int x,y;
        
        //Introducción de valores
        System.out.print("Ingrese coordenada x:");
        x=teclado.nextInt();
        
        System.out.print("Ingrese coordenada y:");
        y=teclado.nextInt();
        
        //Si x e y es mayor que 0, se encuentra en el primer cuadrante.
        //Si es false, hacemos otro if, en el que si x es menor que 0 e y mayor que 0, se encuentra en el 2 cuadrante
        //Si es false, hacemos otro if, en el que si x e y es menor que 0, se encuentra en el trecer cuadrante.
        //Y por ultimo si es false, se encuentra en el 4º cuadrante.
        if (x>0 && y>0) {
        	System.out.print("Se encuentra en el primer cuadrante");
        } else {
            if (x<0 && y>0) {
                System.out.print("Se encuentra en el segundo cuadrante");
            } else {
                if (x<0 && y<0) {
                    System.out.print("Se encuentra en el tercer cuadrante");
                }
            	else {
                    System.out.print("Se encuentra en el cuarto cuadrante");
            	}
            }
        }
		
		
		
	}

}
