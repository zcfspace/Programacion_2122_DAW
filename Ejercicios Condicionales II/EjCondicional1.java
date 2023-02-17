package EjCondicional2;

import java.util.Scanner;

public class EjCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para leer por teclado con scanner
		Scanner teclado = new Scanner(System.in);
		
		//Declaración variable
		int horas, minutos, segundos = 0;

		// introduccion de valor
		System.out.print("Ingrese la hora:");
		horas = teclado.nextInt();

		System.out.print("Ingrese el minuto:");
		minutos = teclado.nextInt();

		System.out.print("Ingrese el segundo:");
		segundos = teclado.nextInt();
		
		//Suma de 1 segundo y 1 minuto.
		minutos += 1;
		segundos += 1;
		
		//Si son igual o mayor que 60, hace hace la división y le suma 1 al minuto.
		if (segundos >= 60) {
			segundos %=60;
			minutos += 1;
		} 
		
		//Si son igual o mayor que 60, hace hace la división y le suma 1 a la hora.
		if (minutos >= 60) {
			minutos %=60;
			horas += 1;
		} 
		
		//Si son igual o mayor que 24, hace hace la división.
		if (horas >= 24) {
			horas %=24;
		} 
				
		System.out.println("Después de 1 minuto y 1 segundo son las " + horas + ":" + minutos + ":" + segundos);
		
		
		
	}

}
