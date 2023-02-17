package coche;

public class Rueda {

	private int radio, presion, precio;
	private String marca, perfil, tipo;
	private double desgaste;

	public static int DELANTERA_DERECHA = 0;
	public static int DELANTERA_IZQUIERDA = 1;
	public static int TRASERA_DERECHA = 2;
	public static int TRASERA_IZQUIERDA = 3;

	public Rueda(int radio, int presion, int precio, String marca, String perfil, String tipo, double desgaste) {
		super();
		this.radio = radio;
		this.presion = presion;
		this.precio = precio;
		this.marca = marca;
		this.perfil = perfil;
		this.tipo = tipo;
		this.desgaste = desgaste;
	}

	public Rueda() {
		marca = "";
		radio = 0;
		perfil = "";
		tipo = "";
		desgaste = 0;
		presion = 0;
		precio = 0;

	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getPresion() {
		return presion;
	}

	public void setPresion(int presion) {
		this.presion = presion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(double desgaste) {
		this.desgaste = desgaste;
	}

	@Override
	public String toString() {
		return "Rueda [radio=" + radio + ", presion=" + presion + ", precio=" + precio + ", marca=" + marca
				+ ", perfil=" + perfil + ", tipo=" + tipo + ", desgaste=" + desgaste + "]";
	}

}
