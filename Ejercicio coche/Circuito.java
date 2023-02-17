package coche;

public class Circuito {

	private String nombre;
	private String pais;
	private String ciudad;
	private int longitud;
	private long tiempo;
	private String nombrePilotoVueltaRapida;

	public Circuito(String nombre, String pais, String ciudad, int longitud, long tiempo,
			String nombrePilotoVueltaRapida) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.ciudad = ciudad;
		this.longitud = longitud;
		this.tiempo = tiempo;
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

	public Circuito() {
		nombre = "";
		pais = "";
		ciudad = "";
		longitud = 0;
		tiempo = 0;
		nombrePilotoVueltaRapida = "";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public long getTiempo() {
		return tiempo;
	}

	public void setTiempo(long tiempo) {
		this.tiempo = tiempo;
	}

	public String getNombrePilotoVueltaRapida() {
		return nombrePilotoVueltaRapida;
	}

	public void setNombrePilotoVueltaRapida(String nombrePilotoVueltaRapida) {
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

	/**
	 * Actualizará el tiempo y el nombre del piloto que ha hecho la vuelta rápida en
	 * dicho circuito si la vuelta rápida introducida es más rápida que la que
	 * actualmente tiene el circuito.
	 * 
	 * @param NombrePiloto
	 * @param tiempo
	 */
	void vueltaRapida(String NombrePiloto, long tiempo) {

		if (this.tiempo > tiempo) {
			this.tiempo = tiempo;
			this.nombrePilotoVueltaRapida = NombrePiloto;

		}
	}

	@Override
	public String toString() {
		return "Circuito [nombre=" + nombre + ", pais=" + pais + ", ciudad=" + ciudad + ", longitud=" + longitud
				+ ", tiempo=" + tiempo + ", nombrePilotoVueltaRapida=" + nombrePilotoVueltaRapida + "]";
	}

}
