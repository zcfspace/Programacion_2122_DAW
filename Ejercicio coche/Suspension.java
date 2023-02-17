package coche;

public class Suspension {

	private int dureza, carga, compresion, posicion;
	private String marca;

	public Suspension(String marca, int dureza, int carga, int compresion, int posicion) {

		this.marca = marca;
		this.dureza = dureza;
		this.carga = carga;
		this.compresion = compresion;
		this.posicion = posicion;
	}

	public Suspension() {
		marca = " ";
		dureza = 0;
		carga = 0;
		compresion = 0;
		posicion = 0;
	}

	public Suspension(int dureza, int carga, int compresion, int posicion, String marca) {
		super();
		this.dureza = dureza;
		this.carga = carga;
		this.compresion = compresion;
		this.posicion = posicion;
		this.marca = marca;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getCompresion() {
		return compresion;
	}

	public void setCompresion(int compresion) {
		this.compresion = compresion;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Suspension [dureza=" + dureza + ", carga=" + carga + ", compresion=" + compresion + ", posicion="
				+ posicion + ", marca=" + marca + "]";
	}

}
