package baseDatosCarrera;

public class CarreraVO {

	private String idCarreras;
	private int numVueltas;
	private double vueltaRapida;
	private int numAccidentes;
	private String fecha;
	private String circuitosIdCircuitos;
	private String campeonatoIdCampeonato;

	public CarreraVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarreraVO(String idCarreras, int numVueltas, double vueltaRapida, int numAccidentes, String fecha,
			String circuitosIdCircuitos, String campeonatoIdCampeonato) {
		super();
		this.idCarreras = idCarreras;
		this.numVueltas = numVueltas;
		this.vueltaRapida = vueltaRapida;
		this.numAccidentes = numAccidentes;
		this.fecha = fecha;
		this.circuitosIdCircuitos = circuitosIdCircuitos;
		this.campeonatoIdCampeonato = campeonatoIdCampeonato;
	}

	public String getIdCarreras() {
		return idCarreras;
	}

	public void setIdCarreras(String idCarreras) {
		this.idCarreras = idCarreras;
	}

	public int getNumVueltas() {
		return numVueltas;
	}

	public void setNumVueltas(int numVueltas) {
		this.numVueltas = numVueltas;
	}

	public double getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(double vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	public int getNumAccidentes() {
		return numAccidentes;
	}

	public void setNumAccidentes(int numAccidentes) {
		this.numAccidentes = numAccidentes;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCircuitosIdCircuitos() {
		return circuitosIdCircuitos;
	}

	public void setCircuitosIdCircuitos(String circuitosIdCircuitos) {
		this.circuitosIdCircuitos = circuitosIdCircuitos;
	}

	public String getCampeonatoIdCampeonato() {
		return campeonatoIdCampeonato;
	}

	public void setCampeonatoIdCampeonato(String campeonatoIdCampeonato) {
		this.campeonatoIdCampeonato = campeonatoIdCampeonato;
	}

}
