package ejFunc1;

import java.util.Scanner;

public class eje2Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Teclado
		Scanner teclado = new Scanner(System.in);

		// Declaracion de variables
		String tipFigura = "";

		System.out.print("Tipo de figura (Circulo, Cuadrado, Triangulo o Rectangulo): ");
		tipFigura = teclado.next();

		// Mostramos por consola
		System.out.print("El area de la figura es: " + calcularArea(tipFigura));

		teclado.close();
	}

	/**
	 * Funcion para calcular la area de la fiugura
	 * 
	 * @param tipFigura
	 * @return la area de la figura
	 */
	static double calcularArea(String tipFigura) {

		Scanner teclado = new Scanner(System.in);

		double resultado = 0;
		double radio = 0;
		double ladoX = 0;
		double ladoY = 0;
		double base = 0;
		double altura = 0;

		// En cada caso hace su funcion
		switch (tipFigura) {
		case "Circulo":

			System.out.println("Radio: ");
			radio = teclado.nextDouble();

			// Calculo de area de circulo
			// Si el radio es menor que 0, el resultado es -1

			if (radio < 0) {
				resultado = -1;
			} else
				resultado = Math.PI * Math.pow(radio, 2);

			break;
		case "Cuadrado":

			System.out.println("Lado X: ");
			ladoX = teclado.nextDouble();

			// Idem que el anterior, pero de cuadrado
			if (ladoX < 0) {
				resultado = -1;
			} else
				resultado = ladoX * ladoX;

			break;
		case "Triangulo":

			System.out.println("Altura: ");
			altura = teclado.nextDouble();

			System.out.println("Base: ");
			base = teclado.nextDouble();

			// Idem que el anterior, pero de Tringulo
			if (ladoY < 0 || ladoX < 0) {
				resultado = -1;
			} else
				resultado = (base * altura) / 2;

			break;

		// Por defecto rectángulo
		default:

			System.out.println("Lado X: ");
			ladoX = teclado.nextDouble();

			System.out.println("Lado Y: ");
			ladoY = teclado.nextDouble();

			if (altura < 0 || base < 0) {
				resultado = -1;
			} else
				resultado = ladoX * ladoY;
		}

		teclado.close();

		return resultado;

	}

}
