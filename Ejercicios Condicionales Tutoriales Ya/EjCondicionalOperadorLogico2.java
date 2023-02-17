package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lectura por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaración de valor
        int num1,num2,num3;
        
        //introducción de valores
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        
        //si el los tres numeros son iguales, sumamos el num1 con num2
        //Y multiplicamos el resultado por num3
        if (num1==num2 && num1==num3) {
        	//Declaración de variable local 
            int suma=num1 + num2;
            System.out.println("La suma del primero y segundo:" + suma);
            
            //Declaración de variable local 
            int producto=suma * num3;
            System.out.println("La suma del primero y segundo multiplicado por el tercero:" + producto);
            
        }
		
		
		
		
	}

}
