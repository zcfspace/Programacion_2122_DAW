package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leemos por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaración 
        int num1,num2,num3;
        
        //Introducción de valores
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        
        //Si el num1, num2, mum3 son mener que 10, la condición es cierta 
        if (num1<10 && num2<10 && num3<10) {
            System.out.print("Todos los números son menores a diez");
        }
		

	}

}
