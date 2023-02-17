package EjCondicional2;

import java.util.Scanner;

public class EjCondicional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Para leer por teclado con scanner
		Scanner teclado = new Scanner(System.in);
		
		//Declaración variable
		String cabello, ojo, nariz, boca = "";
		
		//Introducción de valor 
		System.out.print("introduce el tipo de cabello (rizado, liso, peinado):");
		cabello = teclado.next();

		System.out.print("introduce el tipo de ojo (cerrados, redondos, estrllados):");
		ojo = teclado.next();

		System.out.print("introduce el tipo de nariz (aplastado, respingona, agilen):");
		nariz = teclado.next();

		System.out.print("introduce el tipo de boca (normal, bigote, diente_salida):");
		boca = teclado.next();
		
		
		
		// Transforma a minuscula,y comprueba si es rizado 
		
		 
		if (cabello.toLowerCase().equals("rizado")) {
			System.out.print("@@@@@");
		} else {
			if (cabello.toLowerCase().equals("liso")) {
				System.out.print("VVVVV");
			} else {
				System.out.print("XXXXX");
			}
		}
		
		System.out.print(" - ");
		
		if (ojo.toLowerCase().equals("cerrados")) {
			System.out.print("-.-");
		} else {
			if (ojo.toLowerCase().equals("redondos")) {
				System.out.print("o-o");
			} else {
				System.out.print("* - *");
			}
		}
		
		System.out.print(" - ");
		
		if (nariz.toLowerCase().equals("aplastado")) {
			System.out.print("0");
		} else {
			if (nariz.toLowerCase().equals("respingona")) {
				System.out.print("C");
			} else {
				System.out.print("V");
			}
		}
		
		System.out.print(" - ");
		
		if (boca.toLowerCase().equals("normal")) {
			System.out.print("===");
		} else {
			if (boca.toLowerCase().equals("bigote")) {
				System.out.print("...");
			} else {
				System.out.print("www");
			}
		}
		
		
		
		
		

	}

}
