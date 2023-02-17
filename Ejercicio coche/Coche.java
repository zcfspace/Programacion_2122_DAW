package coche;

import java.util.Arrays;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Coche {

	// Constante estatica
	public static final String AZUL = "azul";
	public static final String VERDE = "verde";
	public static final String AMARILLO = "amarillo";
	public static final String NEGRO = "negro";
	public static final String BLANCO = "blanco";

	public static int DELANTERA_DERECHA = 0;
	public static int DELANTERA_IZQUIERDA = 1;
	public static int TRASERA_DERECHA = 2;
	public static int TRASERA_IZQUIERDA = 3;
	public static final int NUM_RUEDA = 4;

	// Atributos
	private int potencia, peso, velocidad;
	private String nombre, modelo, marca;
	private String color = "";
	public Rueda ruedaInstalada[];
	public Suspension suspensionInstalada[];

	public Coche(int potencia, int peso, int velocidad, String nombre, String modelo, String marca, String color,
			Rueda[] ruedaInstalada, Suspension[] suspensionInstalada) {
		super();
		this.potencia = potencia;
		this.peso = peso;
		this.velocidad = velocidad;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.ruedaInstalada = ruedaInstalada;
		this.suspensionInstalada = suspensionInstalada;
	}

	// Creamos un contructor vacio
	public Coche() {
		super();
		potencia = 0;
		peso = 0;
		velocidad = 0;
		nombre = "";
		modelo = "";
		marca = "";

		// Inciamos el array
		ruedaInstalada = new Rueda[Coche.NUM_RUEDA];

		for (int i = 0; i < ruedaInstalada.length; i++) {
			ruedaInstalada[i] = new Rueda();
		}

		suspensionInstalada = new Suspension[Coche.NUM_RUEDA];

		for (int i = 0; i < suspensionInstalada.length; i++) {
			suspensionInstalada[i] = new Suspension();
		}

		// Iniciamos Log
		Logger logFich = (Logger) LoggerFactory.getLogger("LogCoche");
		logFich.info("Se ha creado un nuevo coche: " + toString());

	}

	public Rueda[] getRuedaInstalada() {
		return ruedaInstalada;
	}

	public void setRuedaInstalada(Rueda[] ruedaInstalada) {
		this.ruedaInstalada = ruedaInstalada;
	}

	public Suspension[] getSuspensionInstalada() {
		return suspensionInstalada;
	}

	public void setSuspensionInstalada(Suspension[] suspensionInstalada) {
		this.suspensionInstalada = suspensionInstalada;
	}

	// Metodo get
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	// Método get get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * 
	 * @param porcentaje
	 * @return
	 */
	public boolean acelerar(int porcentaje) {
		int velocidad = this.getVelocidad();
		int total = (velocidad * porcentaje) / 100;
		this.setVelocidad(velocidad + total);
		return true;
	}

	/**
	 * Metodo para pintar el color del coche
	 * 
	 * @param color
	 */
	public void pintar(String color) {

		switch (color) {
		case "azul":
			color = this.AZUL;
			break;
		case "verde":
			color = this.VERDE;
			break;
		case "amarillo":
			color = this.AMARILLO;
			break;
		case "negro":
			color = this.NEGRO;
			break;
		case "blanco":
			color = this.BLANCO;
			break;
		}

		nombre = nombre + " " + color;
	}

	/**
	 * cambiara la rueda en la posición introducida, devolverá true si ha ido bien y
	 * false si la posición no existe o la rueda no tiene los campos correctos.
	 * 
	 * @param posicion
	 * @param rueda
	 * @returncambiara la rueda en la posición introducida, devolverá true si ha ido
	 *                 bien y false si la posición no existe o la rueda no tiene los
	 *                 campos correctos.
	 */
	boolean cambiarRueda(int posicion, Rueda rueda) {

		if (posicion >= 0 && posicion <= 3) {
			ruedaInstalada[posicion] = rueda;
			return true;

		} else {
			return false;
		}

	}

	/**
	 * 
	 * @param posicion
	 * @param suspension
	 * @return igual que cambiar rueda pero con suspensión.
	 */
	boolean cambiarSuspension(int posicion, Suspension suspension) {

		if (posicion >= 0 && posicion <= 3) {
			suspensionInstalada[posicion] = suspension;
			return true;

		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param posicion
	 * @param presion
	 * @return incrementa o disminuye en la cantidad introducida la presión de la
	 *         rueda del coche que está en la posición introducida, devolverá true
	 *         si va todo bien false si la posición no es correcta o la presión es
	 *         mayor de 100 o inferior a 0
	 */
	boolean ajustarPresion(int posicion, int presion) {

		if (presion < 100 || presion > 0 || posicion != 0 || posicion != 1 || posicion != 2 || posicion != 3) {
			return false;
		} else {
			ruedaInstalada[posicion].setPresion(presion + ruedaInstalada[posicion].getPresion());

			return true;
		}

	}

	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", peso=" + peso + ", velocidad=" + velocidad + ", nombre=" + nombre
				+ ", modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", ruedaInstalada="
				+ Arrays.toString(ruedaInstalada) + ", suspensionInstalada=" + Arrays.toString(suspensionInstalada)
				+ "]";
	}

}