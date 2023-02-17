package coche;

public class Piloto {

	private String nombre;
	private int edad;
	private String campeonatos;
	private int dorsal;
	private String escuderia;
	private int sueldo;
	private Coche cocheAsignado;

	public Piloto(String nombre, int edad, String campeonatos, int dorsal, String escuderia, int sueldo,
			Coche cocheAsignado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.campeonatos = campeonatos;
		this.dorsal = dorsal;
		this.escuderia = escuderia;
		this.sueldo = sueldo;
		this.cocheAsignado = cocheAsignado;
	}

	public Piloto() {
		nombre = "";
		edad = 18;
		campeonatos = "";
		dorsal = 0;
		escuderia = "";
		sueldo = 0;
		cocheAsignado = new Coche();
	}

	public Coche getCocheAsignado() {
		return cocheAsignado;
	}

	public void setCocheAsignado(Coche cocheAsignado) {
		this.cocheAsignado = cocheAsignado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(String campeonatos) {
		this.campeonatos = campeonatos;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", edad=" + edad + ", campeonatos=" + campeonatos + ", cocheAsignado="
				+ cocheAsignado + ", dorsal=" + dorsal + ", escuderia=" + escuderia + ", sueldo=" + sueldo + "]";
	}

}
