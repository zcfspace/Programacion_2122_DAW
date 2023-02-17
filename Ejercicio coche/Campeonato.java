package coche;

public class Campeonato {

	public static final int MAX_PILOTOS = 4;
	public static final int NUM_CIRCUITO = 4;
	public static final double PRESION_MAXIMA = 100;
	public static final int PESO_MINIMO = 1000;
	public static final int POTENCIA_MAXIMA = 1000;

	private String categoria;
	private String nombre;

	public Circuito listaCircuito[];
	public Piloto listaPiloto[];

	public Campeonato(String categoria, String nombre, Circuito[] listaCircuito, Piloto[] listaPiloto) {
		super();
		this.categoria = categoria;
		this.nombre = nombre;
		this.listaCircuito = listaCircuito;
		this.listaPiloto = listaPiloto;

	}

	// Cramos constructor vacio
	public Campeonato() {
		super();
		categoria = "";
		nombre = "";

		// Inicializamos el tamaño del array

		listaCircuito = new Circuito[Campeonato.NUM_CIRCUITO];
		for (int i = 0; i < listaCircuito.length; i++) {
			listaCircuito[i] = new Circuito();
		}

		listaPiloto = new Piloto[Campeonato.MAX_PILOTOS];
		for (int i = 0; i < listaPiloto.length; i++) {
			listaPiloto[i] = new Piloto();
		}

	}

	/**
	 * Devolve el circuito de mayor longitud.
	 * 
	 * @return
	 */
	public Circuito circuitoMasLargo() {

		long longitudMax = Integer.MIN_VALUE;
		Circuito circuitoMax = new Circuito();

		for (int i = 0; i < listaCircuito.length; i++) {
			if (listaCircuito[i].getLongitud() > longitudMax) {
				// Si la longitud del circuito que comprobamos en el array
				// Es la mayor hasta ahora
				// Actualizamos la longitud maxima y guardamos el circuito
				longitudMax = listaCircuito[i].getLongitud();
				circuitoMax = listaCircuito[i];
			}
		}
		// Devolvemos el circuito con logitud mayor
		return circuitoMax;
	}

	/**
	 * Recorre el array de pilotos y mostrará el nombre de los pilotos de la
	 * escudería
	 * 
	 * @param nombreEscueria
	 */
	void mostrarEscuderia(String nombreEscueria) {

		String aBuscar = nombreEscueria;

		System.out.println(nombreEscueria + ": ");

		for (int i = 0; i < listaPiloto.length; i++) {

			if (listaPiloto[i].getEscuderia().equalsIgnoreCase(aBuscar)) {
				System.out.println(listaPiloto[i].getNombre());
			}
		}
	}

	/**
	 * void ComprobarCoches() comprobará que todos los coches cumplen las medidas de
	 * potencia, peso y presiones normativa
	 * 
	 * El campeonato tendra las constantes PRESION_MAXIMA, PESO_MINIMO Y
	 * POTENCIA_MAXIMA, las potendias, pesos y presiones de todas las ruedas de los
	 * coches no podrán variar un 5% por encima ni un 10% por debajo de estas
	 * medidas.
	 * 
	 * La función mostrará la lista de pilotos y un ok si todo ha ido bien, si ha
	 * fallado en algo tendrá que especificar el que, por ejemplo Kimi raikonen ok
	 * Fernando alonso Peso inferior al estipulado Louis Hamilton Rueda delantera
	 * derecha presion mayor a la estipulada Carlos Sainz ok
	 * 
	 */
	public void ComprobarCoches() {

		// Hacemos un bucle donde si todo cumple la medida, mostramos que todo ha hido
		// bien. Lo contrario, se mostrará por pantalla el fallo

		for (int i = 0; i < listaPiloto.length; i++) {

			int okeyRueda = 0;
			int okeyPeso = 0;
			int okeyPotencia = 0;

			for (int j = 0; j < listaPiloto[i].getCocheAsignado().getRuedaInstalada().length; j++) {

				if (listaPiloto[i].getCocheAsignado().getRuedaInstalada()[j].getPresion() > (PRESION_MAXIMA * 1.05)) {
					System.out.println(listaPiloto[i].getNombre() + " Rueda " + j + " presión mayor a la estipulada.");
				} else {
					if (listaPiloto[i].getCocheAsignado().getRuedaInstalada()[j]
							.getPresion() < (PRESION_MAXIMA * 0.90)) {
						System.out.println(
								listaPiloto[i].getNombre() + " Rueda " + j + " presión menor a la estipulada.");
					} else {
						okeyRueda++;
					}
				}
			}

			if (listaPiloto[i].getCocheAsignado().getPeso() > (PESO_MINIMO * 1.05)) {
				System.out.println(listaPiloto[i].getNombre() + " Peso superior al estipulado.");
			} else {
				if (listaPiloto[i].getCocheAsignado().getPeso() < (PESO_MINIMO * 0.90)) {
					System.out.println(listaPiloto[i].getNombre() + " Peso inferior al estipulado.");
				} else {
					okeyPeso = 1;
				}
			}

			if (listaPiloto[i].getCocheAsignado().getPotencia() > (POTENCIA_MAXIMA * 1.05)) {
				System.out.println(listaPiloto[i].getNombre() + " Potencia superior al estipulado.");
			} else {
				if (listaPiloto[i].getCocheAsignado().getPotencia() < (POTENCIA_MAXIMA * 0.90)) {
					System.out.println(listaPiloto[i].getNombre() + " Potencia inferior al estipulado.");
				} else {
					okeyPotencia = 1;
				}
			}

			if (okeyPeso == 1 && okeyPotencia == 1 && okeyRueda == 4) {
				System.out.println(listaPiloto[i].getNombre() + " ok");
			}

		}

	}

}
