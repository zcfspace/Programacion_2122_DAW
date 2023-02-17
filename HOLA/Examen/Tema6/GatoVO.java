package org.openjfx.hellofx;

public class GatoVO {

	private String id;
	private String nombre;
	private String duenio;
	private int edad;
	private int peso;
	private String tamano;
	private String salud;
	private String raza;

	public GatoVO(String id, String nombre, String duenio, int edad, int peso, String tamano, String salud,
			String raza) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duenio = duenio;
		this.edad = edad;
		this.peso = peso;
		this.tamano = tamano;
		this.salud = salud;
		this.raza = raza;
	}

	public GatoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getSalud() {
		return salud;
	}

	public void setSalud(String salud) {
		this.salud = salud;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

}
