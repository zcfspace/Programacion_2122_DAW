package ejWhileForTutorialYa;

public class ejWhileTut4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de varibale
		// Ponemos en x 1 porque se empiza contar desde 0
		// Y termino 11 porque empieza por 11
		int x = 1, termino = 11;

		// Mientras que x es menor o igual que 25, seguira haciendo el bucle
		while (x <= 25) {
			System.out.print(termino);
			System.out.print(" - ");

			// Cada vez que haga un bucle suma 1 al x
			x++;

			// Cada vez que haga el bucle suma 11 al termino, hasta llegar a 25 vecez
			termino += 11;
		}

	}

}
