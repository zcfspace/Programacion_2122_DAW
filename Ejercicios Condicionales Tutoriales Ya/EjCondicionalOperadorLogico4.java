package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leemos por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //Declaraci�n
        int num1,num2,num3;
        
        //Introducci�n de valores
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        
        System.out.print("Ingrese segundo valor:");
        num2=teclado.nextInt();
        
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        
        //Si algunos de los numeros es menor que 10, la condicion es cierta. 
        if (num1<10 || num2<10 || num3<10) {
            System.out.print("Alguno de los n�meros es menor a diez");
        }
		
	}

}
