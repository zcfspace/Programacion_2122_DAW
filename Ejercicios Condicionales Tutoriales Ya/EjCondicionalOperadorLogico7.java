package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico7 {

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
        
        System.out.print("Rango de valores:");
        
        //Operación para sacar el numero menor 
        //Si num1 es menor que num2 y num3, mostrará por consola num1.
        //Si no, hará otro if donde comprueba que si num2 es menor que num3, mostrará num2.
        //Y si no, mostrará num3, que sera el mas numero menor.
        if (num1<num2 && num1<num3) {
            System.out.print(num1);
        } else {
            if (num2<num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        
        //Guión para separa los dos numeros 
        System.out.print(" - ");
        
        //Operación para sacar el numero mayor
        //Si num1 es mayor que num2 y num3, mostrará por consola num1.
        //Si no, hará otro if donde comprueba que si num2 es mayor que num3, mostrará num2.
        //Y si no, mostrará num3, que sera el mas numero mayor.
        if (num1>num2 && num1>num3) {
            System.out.print(num1);
        } else {
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
		
		

        
	}

}
