package tema2;

import java.util.Scanner;

public class EjCondicionalAnidada4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para leer por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //declaración
        int totalPreguntas,totalCorrectas, porcentaje;
        
        //introduccion de valor
        System.out.print("Ingrese la cantidad total de preguntas del examen:");
        totalPreguntas=teclado.nextInt();
        
        System.out.print("Ingrese la cantidad total de preguntas contestadas correctamente:");
        totalCorrectas=teclado.nextInt();
        
        //calculo de porcentaje
        porcentaje=totalCorrectas * 100 / totalPreguntas;
        
        //Si es mas de 90% es nivel maximo
        //Si eso es false, comprobamos otro if donde si el mas de 75% es nivel medio.
        //Y es false, comprobamos otro if donde si el mas de 50% es nivel medio.
        //Y si no, fuera de nivel.
        
        if (porcentaje>=90) {
            System.out.print("Nivel máximo");
        } else {
            if (porcentaje>=75) {
                System.out.print("Nivel medio");
            } else {
                if (porcentaje>=50) {
                    System.out.print("Nivel regular");
                } else {
                    System.out.print("Fuera de nivel");
                }
            }
        }					
		
	}

}
