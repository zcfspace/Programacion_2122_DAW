package tema2;

import java.util.Scanner;

public class EjCondicionalAnidada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Para leer por teclado con scanner
        Scanner teclado=new Scanner(System.in);
        
        //declaración
        int num1,num2,num3;
        
    	//introduccion de valor
        System.out.print("Ingrese primer valor:");
        num1=teclado.nextInt();
        
        System.out.print("Ingrese segunda valor:");
        num2=teclado.nextInt();
        
        System.out.print("Ingrese tercer valor:");
        num3=teclado.nextInt();
        
        // si el numero num1 es mayor que num2, comprueba si es mayor que num3. Si es true, el num1 es el mayor
        // si no muestra por consola num3
        if (num1>num2) {
            if (num1>num3) {
                System.out.print(num1);
            } else {
                System.out.println(num3);
            }
        } else {
        // si el num2 es mayor que num3, muestra num2, si no, muestra num3
            if (num2>num3) {
                System.out.print(num2);
            } else {
                System.out.print(num3);
            }
        }
		
		
		
		
		
	}

}
