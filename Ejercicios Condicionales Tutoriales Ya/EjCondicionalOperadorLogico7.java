package tema2;

import java.util.Scanner;

public class EjCondicionalOperadorLogico7 {

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
        
        System.out.print("Rango de valores:");
        
        //Operaci�n para sacar el numero menor 
        //Si num1 es menor que num2 y num3, mostrar� por consola num1.
        //Si no, har� otro if donde comprueba que si num2 es menor que num3, mostrar� num2.
        //Y si no, mostrar� num3, que sera el mas numero menor.
        if (num1<num2 && num1<num3) {
            System.out.print(num1);
        } else {
            if (num2<num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
        
        //Gui�n para separa los dos numeros 
        System.out.print(" - ");
        
        //Operaci�n para sacar el numero mayor
        //Si num1 es mayor que num2 y num3, mostrar� por consola num1.
        //Si no, har� otro if donde comprueba que si num2 es mayor que num3, mostrar� num2.
        //Y si no, mostrar� num3, que sera el mas numero mayor.
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
