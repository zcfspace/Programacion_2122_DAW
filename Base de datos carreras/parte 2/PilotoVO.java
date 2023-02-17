package baseDatosCarrera;

public class PilotoVO {

	private String idPiloto;
	private String dni;
	private String nombre;
	private int edad;
	private String sexo;
	private String direccion;
	private String cocheIdCoche;
	private CocheVO coche = new CocheVO();

	public PilotoVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PilotoVO(String idPiloto, String dni, String nombre, int edad, String sexo, String direccion,
			String cocheIdCoche) {
		super();
		this.idPiloto = idPiloto;
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.cocheIdCoche = cocheIdCoche;
	}

	public String getIdPiloto() {
		return idPiloto;
	}

	public void setIdPiloto(String idPiloto) {
		this.idPiloto = idPiloto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCocheIdCoche() {
		return cocheIdCoche;
	}

	public void setCocheIdCoche(String cocheIdCoche) {
		this.cocheIdCoche = cocheIdCoche;
	}

}
