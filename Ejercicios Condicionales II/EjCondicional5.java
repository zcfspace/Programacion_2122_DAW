package EjCondicional2;

import java.util.Scanner;

public class EjCondicional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Para leer por teclado con scanner
		Scanner teclado = new Scanner(System.in);
		
		//Mostramos por pantalla 
		System.out.println("Juego piedra-papel-tijera");
		
		//Seleccion de maquina 
		int seleccionOrdenador = (int)(Math.random() * 3) + 1;
		System.out.println("La ordenador ya escogio...");
		
		System.out.print("Indique su seleccion (1=Piedra, 2=Papel, 3=Tijera): ");
		int seleccionUsuario = teclado.nextInt();
		
		//Mostramos por pantalla 
		System.out.println("USUARIO: " + seleccionUsuario);
		System.out.print("MAQUINA: ");
		
		
		// Si el numero aleatorio de la maquina es 1 sera Piedra, y depende el selección hacemos 
		// será un case. Por ejemplo Si elegimos 1, empatamos.
	
		switch ( seleccionOrdenador )
		{
			case 1:
				System.out.println("Piedra");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("EMPATE!"); break;
					case 2: System.out.println("ERES EL GANADOR!"); break;
					case 3: System.out.println("HAS PERDIDO!"); break;
				}
				break;

			case 2:
				System.out.println("Papel");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("HAS PERDIDO!"); break;
					case 2: System.out.println("EMPATE!"); break;
					case 3: System.out.println("ERES EL GANADOR!"); break;
				}
				break;

			case 3:
				System.out.println("Tijera");
				switch ( seleccionUsuario )
				{
					case 1: System.out.println("ERES EL GANADOR!"); break;
					case 2: System.out.println("HAS PERDIDO!"); break;
					case 3: System.out.println("EMPATE!"); break;
				}
				break;
		}
		
	}

}
