package ejWhileForTutorialYa;

public class ejWhileTut5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaración de variables
		int mult8 = 8;

		// Mientras que mult8 es menor o igual que 500, seguira haciendo el bucle
		while (mult8 <= 500) {
			System.out.print(mult8);
			System.out.print(" - ");

			// Cada vez que haga el bucle suma 8 al mult8, hasta llegar a 500
			mult8 += 8;
		}
	}

}
