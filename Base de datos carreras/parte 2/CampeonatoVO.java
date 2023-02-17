package baseDatosCarrera;

public class CampeonatoVO {

	private String idCampeonato;
	private String nombre;
	private int anio;
	private int numPilotos;
	private int numCircuitos;
	private String pilotoGanador;

	public CampeonatoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CampeonatoVO(String idCampeonato, String nombre, int anio, int numPilotos, int numCircuitos,
			String pilotoGanador) {
		super();
		this.idCampeonato = idCampeonato;
		this.nombre = nombre;
		this.anio = anio;
		this.numPilotos = numPilotos;
		this.numCircuitos = numCircuitos;
		this.pilotoGanador = pilotoGanador;
	}

	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getNumPilotos() {
		return numPilotos;
	}

	public void setNumPilotos(int numPilotos) {
		this.numPilotos = numPilotos;
	}

	public int getNumCircuitos() {
		return numCircuitos;
	}

	public void setNumCircuitos(int numCircuitos) {
		this.numCircuitos = numCircuitos;
	}

	public String getPilotoGanador() {
		return pilotoGanador;
	}

	public void setPilotoGanador(String pilotoGanador) {
		this.pilotoGanador = pilotoGanador;
	}

}
