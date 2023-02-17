package baseDatosCarrera;

public class RuedaVO {

	private String idRuedas;
	private String marca;
	private String modelo;
	private int dimensiones;
	private int peso;
	private String componente;
	private String estado;
	private String cocheIdCoche;
	private String fecha;
	private int sesion = 0;

	public RuedaVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RuedaVO(String idRuedas, String marca, String modelo, int dimensiones, int peso, String componente,
			String estado, String cocheIdCoche, String fecha, int sesion) {
		super();
		this.idRuedas = idRuedas;
		this.marca = marca;
		this.modelo = modelo;
		this.dimensiones = dimensiones;
		this.peso = peso;
		this.componente = componente;
		this.estado = estado;
		this.cocheIdCoche = cocheIdCoche;
		this.fecha = fecha;
		this.sesion = sesion;
	}

	public String getIdRuedas() {
		return idRuedas;
	}

	public void setIdRuedas(String idRuedas) {
		this.idRuedas = idRuedas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(int dimensiones) {
		this.dimensiones = dimensiones;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getComponente() {
		return componente;
	}

	public void setComponente(String componente) {
		this.componente = componente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCocheIdCoche() {
		return cocheIdCoche;
	}

	public void setCocheIdCoche(String cocheIdCoche) {
		this.cocheIdCoche = cocheIdCoche;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getSesion() {
		return sesion;
	}

	public void setSesion(int sesion) {
		this.sesion = sesion;
	}

}
