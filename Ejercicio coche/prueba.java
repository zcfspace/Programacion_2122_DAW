package coche;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Rueda ruedaIzqDelCoche1 = new Rueda(20, 20, 20, "Hola", "Hola", "Hola", 2);
		Rueda ruedaIzqDelCoche2 = new Rueda();
		Rueda ruedaIzqDelCoche3 = new Rueda();
		Rueda ruedaIzqDelCoche4 = new Rueda();

		Rueda ruedaIzqTrasCoche1 = new Rueda();
		Rueda ruedaIzqTrasCoche2 = new Rueda();
		Rueda ruedaIzqTrasCoche3 = new Rueda();
		Rueda ruedaIzqTrasCoche4 = new Rueda();

		Rueda ruedaDerDelCoche1 = new Rueda();
		Rueda ruedaDerDelCoche2 = new Rueda();
		Rueda ruedaDerDelCoche3 = new Rueda();
		Rueda ruedaDerDelCoche4 = new Rueda();

		Rueda ruedaDerTrasCoche1 = new Rueda();
		Rueda ruedaDerTrasCoche2 = new Rueda();
		Rueda ruedaDerTrasCoche3 = new Rueda();
		Rueda ruedaDerTrasCoche4 = new Rueda();

		Suspension suspensionIzqDelCoche1 = new Suspension(20, 20, 20, 0, "Hola");
		Suspension suspensionIzqDelCoche2 = new Suspension();
		Suspension suspensionIzqDelCoche3 = new Suspension();
		Suspension suspensionIzqDelCoche4 = new Suspension();

		Suspension suspensionIzqTrasCoche1 = new Suspension();
		Suspension suspensionIzqTrasCoche2 = new Suspension();
		Suspension suspensionIzqTrasCoche3 = new Suspension();
		Suspension suspensionIzqTrasCoche4 = new Suspension();

		Suspension suspensionDerDelCoche1 = new Suspension();
		Suspension suspensionDerDelCoche2 = new Suspension();
		Suspension suspensionDerDelCoche3 = new Suspension();
		Suspension suspensionDerDelCoche4 = new Suspension();

		Suspension suspensionDerTrasCoche1 = new Suspension();
		Suspension suspensionDerTrasCoche2 = new Suspension();
		Suspension suspensionDerTrasCoche3 = new Suspension();
		Suspension suspensionDerTrasCoche4 = new Suspension();

		// Creamos un objeto denominado cohe de la clase coche1
		Coche coche1 = new Coche();
		coche1.setMarca("Toyota");
		coche1.setNombre("toyota1");
		coche1.setModelo("modelo1");
		coche1.setPeso(1500);
		coche1.setPotencia(1000);
		coche1.setVelocidad(200);
		Coche coche2 = new Coche();
		Coche coche3 = new Coche();
		Coche coche4 = new Coche();

		coche1.ruedaInstalada[Coche.DELANTERA_DERECHA] = ruedaDerDelCoche1;
		coche1.ruedaInstalada[Coche.DELANTERA_IZQUIERDA] = ruedaIzqDelCoche1;
		coche1.ruedaInstalada[Coche.TRASERA_DERECHA] = ruedaDerTrasCoche1;
		coche1.ruedaInstalada[Coche.TRASERA_IZQUIERDA] = ruedaIzqTrasCoche1;

		coche2.ruedaInstalada[Coche.DELANTERA_DERECHA] = ruedaDerDelCoche2;
		coche2.ruedaInstalada[Coche.DELANTERA_IZQUIERDA] = ruedaIzqDelCoche2;
		coche2.ruedaInstalada[Coche.TRASERA_DERECHA] = ruedaDerTrasCoche2;
		coche2.ruedaInstalada[Coche.TRASERA_IZQUIERDA] = ruedaIzqTrasCoche2;

		coche3.ruedaInstalada[Coche.DELANTERA_DERECHA] = ruedaDerDelCoche3;
		coche3.ruedaInstalada[Coche.DELANTERA_IZQUIERDA] = ruedaIzqDelCoche3;
		coche3.ruedaInstalada[Coche.TRASERA_DERECHA] = ruedaDerTrasCoche3;
		coche3.ruedaInstalada[Coche.TRASERA_IZQUIERDA] = ruedaIzqTrasCoche3;

		coche4.ruedaInstalada[Coche.DELANTERA_DERECHA] = ruedaDerDelCoche4;
		coche4.ruedaInstalada[Coche.DELANTERA_IZQUIERDA] = ruedaIzqDelCoche4;
		coche4.ruedaInstalada[Coche.TRASERA_DERECHA] = ruedaDerTrasCoche4;
		coche4.ruedaInstalada[Coche.TRASERA_IZQUIERDA] = ruedaIzqTrasCoche4;

		coche1.suspensionInstalada[Coche.DELANTERA_DERECHA] = suspensionDerDelCoche1;
		coche1.suspensionInstalada[Coche.DELANTERA_IZQUIERDA] = suspensionIzqDelCoche1;
		coche1.suspensionInstalada[Coche.TRASERA_DERECHA] = suspensionDerTrasCoche1;
		coche1.suspensionInstalada[Coche.TRASERA_IZQUIERDA] = suspensionIzqTrasCoche1;

		coche2.suspensionInstalada[Coche.DELANTERA_DERECHA] = suspensionDerDelCoche2;
		coche2.suspensionInstalada[Coche.DELANTERA_IZQUIERDA] = suspensionIzqDelCoche2;
		coche2.suspensionInstalada[Coche.TRASERA_DERECHA] = suspensionDerTrasCoche2;
		coche2.suspensionInstalada[Coche.TRASERA_IZQUIERDA] = suspensionIzqTrasCoche2;

		coche3.suspensionInstalada[Coche.DELANTERA_DERECHA] = suspensionDerDelCoche3;
		coche3.suspensionInstalada[Coche.DELANTERA_IZQUIERDA] = suspensionIzqDelCoche3;
		coche3.suspensionInstalada[Coche.TRASERA_DERECHA] = suspensionDerTrasCoche3;
		coche3.suspensionInstalada[Coche.TRASERA_IZQUIERDA] = suspensionIzqTrasCoche3;

		coche4.suspensionInstalada[Coche.DELANTERA_DERECHA] = suspensionDerDelCoche4;
		coche4.suspensionInstalada[Coche.DELANTERA_IZQUIERDA] = suspensionIzqDelCoche4;
		coche4.suspensionInstalada[Coche.TRASERA_DERECHA] = suspensionDerTrasCoche4;
		coche4.suspensionInstalada[Coche.TRASERA_IZQUIERDA] = suspensionIzqTrasCoche4;

		Circuito circuito1 = new Circuito("circuito1", "espana", "madrid", 5000, 200, "pepe");
		Circuito circuito2 = new Circuito("circuito2", "espana", "madrid", 4000, 200, "carlos");
		Circuito circuito3 = new Circuito("circuito3", "espana", "madrid", 1000, 200, "sergio");
		Circuito circuito4 = new Circuito("circuito4", "espana", "madrid", 2000, 200, "pablo");

		Piloto piloto1 = new Piloto("pepe", 20, "campeonato1", 1, "Maserati", 20000000, coche1);
		Piloto piloto2 = new Piloto("carlos", 25, "campeonato2", 1, "Ferrari", 20000000, coche2);
		Piloto piloto3 = new Piloto("sergio", 20, "campeonato3", 1, "Toyota", 20000000, coche3);
		Piloto piloto4 = new Piloto("pablo", 40, "campeonato4", 1, "Maserati", 20000000, coche4);

		Campeonato f2021 = new Campeonato();

		f2021.listaCircuito[0] = circuito1;
		f2021.listaCircuito[1] = circuito2;
		f2021.listaCircuito[2] = circuito3;
		f2021.listaCircuito[3] = circuito4;

		f2021.listaPiloto[0] = piloto1;
		f2021.listaPiloto[1] = piloto2;
		f2021.listaPiloto[2] = piloto3;
		f2021.listaPiloto[3] = piloto4;

		/* Comprobaciones */

		int posicion = 0;
		int presion = 0;

		coche1.pintar("rojo");
		coche2.pintar("azul");
		coche2.pintar("rojo");
		coche2.pintar("amarillo");
		coche2.pintar("rojo2");

		System.out.print("Introduce la posicion (0,1,2,3):");
		posicion = teclado.nextInt();

		/*
		 * Boolean cambiarRueda(int posicion, Rueda rueda) que cambiara la rueda en la
		 * posición introducida, devolverá true si ha ido bien y false si la posición no
		 * existe o la rueda no tiene los campos correctos.
		 */
		if (coche1.cambiarRueda(posicion, ruedaDerDelCoche1) == true) {
			System.out.println("Se cambio la rueda correctamente");
		} else {
			System.out.println("La posición no existe o la rueda no tiene los campos correctos");
		}

		/*
		 * int cambiarSuspension(int posición, Suspensión suspension) igual que cambiar
		 * rueda pero con suspensión.
		 */

		if (coche1.cambiarSuspension(posicion, suspensionIzqDelCoche1) == true) {
			System.out.println("Se cambio la suspension correctamente");
		} else {
			System.out.println("La posición no existe o la suspension no tiene los campos correctos");
		}

		/*
		 * int ajustarPresion(int posicion, int presion) incrementa o disminuye en la
		 * cantidad introducida la presión de la rueda del coche que está en la posición
		 * introducida, devolverá true si va todo bien false si la posición no es
		 * correcta o la presión es mayor de 100 o inferior a 0.
		 */

		System.out.print("Introduce el presion que desear aumentar o disminuir:");
		presion = teclado.nextInt();

		if (coche1.ajustarPresion(posicion, presion) == true) {
			System.out.println("Se ha cambiado la presion correctamente");
		} else {
			System.out.println("La posición introducida no es correcta o la presión es mayor de 100 o inferior a 0");
		}

		// Circuito circuitoMasLargo() Devolverá el circuito de mayor longitud.
		System.out.println("EL circuito más largo es:" + f2021.circuitoMasLargo().toString());

		// void mostrarEscuderia(String nombreEscueria) recorre el array de piloto
		f2021.mostrarEscuderia("Ferrari");

		// void ComprobarCoches() comprobará que todos los coches cumplen las medidas de
		// potencia, peso y presiones normativa
		f2021.ComprobarCoches();

		/* Pintar color */
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(coche3);
		System.out.println(coche4);

	}

}
