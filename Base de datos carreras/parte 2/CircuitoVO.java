package baseDatosCarrera;

public class CircuitoVO {

	private String idcircuitos;
	private String nombre;
	private String ciudad;
	private String pais;
	private int longitud;
	private int recordVuelta;
	private int numCurvas;

	public CircuitoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CircuitoVO(String idcircuitos, String nombre, String ciudad, String pais, int longitud, int recordVuelta,
			int numCurvas) {
		super();
		this.idcircuitos = idcircuitos;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.longitud = longitud;
		this.recordVuelta = recordVuelta;
		this.numCurvas = numCurvas;
	}

	public String getIdcircuitos() {
		return idcircuitos;
	}

	public void setIdcircuitos(String idcircuitos) {
		this.idcircuitos = idcircuitos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getRecordVuelta() {
		return recordVuelta;
	}

	public void setRecordVuelta(int recordVuelta) {
		this.recordVuelta = recordVuelta;
	}

	public int getNumCurvas() {
		return numCurvas;
	}

	public void setNumCurvas(int numCurvas) {
		this.numCurvas = numCurvas;
	}

}
