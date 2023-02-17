package examen3;

public class Libros {

	private String nombre;
	private String autor;
	private int categoria;
	private String ejemplaresVendidos;
	private int numPag;
	private boolean prestado;
	private int diaPrestamo;
	private int anoPubl;
	private String isbn;

	public static final int AVENTURAS = 0;
	public static final int THRILLER = 1;
	public static final int EDUCATIVOS = 2;
	public static final int AUTOAYUDA = 3;
	public static final int DEPORTES = 4;

	/* Constructor con todos los atributos. */

	public Libros(String nombre, String autor, int categoria, String ejemplaresVendidos, int numPag, boolean prestado,
			int diaPrestamo, int anoPubl, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.categoria = categoria;
		this.ejemplaresVendidos = ejemplaresVendidos;
		this.numPag = numPag;
		this.prestado = prestado;
		this.diaPrestamo = diaPrestamo;
		this.anoPubl = anoPubl;
		this.isbn = isbn;
	}

	/* Constructor con nombre y usbn. */
	public Libros(String nombre, String isbn) {
		this.nombre = nombre;
		this.isbn = isbn;
	}

	/* Constructor vacio que inicializa las variables miembro */
	public Libros() {
		nombre = "";
		autor = "";
		categoria = 0;
		ejemplaresVendidos = "";
		numPag = 0;
		prestado = false;
		diaPrestamo = 0;
		anoPubl = 0;
		isbn = "";
	}

	/**
	 * Las variables por defecto serán privadas y tendrán métodos get y set de
	 * acceso, excepto isbn, que solo tendrá get.
	 *
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getEjemplaresVendidos() {
		return ejemplaresVendidos;
	}

	public void setEjemplaresVendidos(String ejemplaresVendidos) {
		this.ejemplaresVendidos = ejemplaresVendidos;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getDiaPrestamo() {
		return diaPrestamo;
	}

	public void setDiaPrestamo(int diaPrestamo) {
		this.diaPrestamo = diaPrestamo;
	}

	public int getAnoPubl() {
		return anoPubl;
	}

	public void setAnoPubl(int anoPubl) {
		this.anoPubl = anoPubl;
	}

	public String getIsbn() {
		return isbn;
	}

	/**
	 * Si el libro está actualmente prestado devolverá false y no cambiará nada, si
	 * puede prestarse cambiará dichos campos y devolverá true.
	 * 
	 * @param dia
	 * @return
	 */
	public boolean prestar(int dia) {

		if (this.prestado == false) {
			this.diaPrestamo = dia;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Si el libro no está en prestamos devolverá false, y si lo está pondrá a 0 el
	 * día y cambiará prestado a false
	 * 
	 * @return
	 */
	public boolean devolver() {

		if (this.prestado == true) {
			return false;
		} else {
			this.diaPrestamo = 0;
			this.prestado = false;
			return true;
		}

	}

	@Override
	public String toString() {
		return "Libros [nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", ejemplaresVendidos="
				+ ejemplaresVendidos + ", numPag=" + numPag + ", prestado=" + prestado + ", diaPrestamo=" + diaPrestamo
				+ ", anoPubl=" + anoPubl + ", isbn=" + isbn + "]";
	}

}
