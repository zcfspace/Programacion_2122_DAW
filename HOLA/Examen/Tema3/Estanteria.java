package examen3;

public class Estanteria {

	private int codigo;
	private int bloque;
	private String categoria;
	public Libros listaLibro[];

	public static final int AVENTURAS = 0;
	public static final int THRILLER = 1;
	public static final int EDUCATIVOS = 2;
	public static final int AUTOAYUDA = 3;
	public static final int DEPORTES = 4;

	public static final int MAX_LIBRO = 7;

	public Estanteria(int codigo, int bloque, String categoria, Libros[] listaLibro) {
		super();
		this.codigo = codigo;
		this.bloque = bloque;
		this.categoria = categoria;
		this.listaLibro = listaLibro;
	}

	public Estanteria() {
		this.codigo = codigo;
		this.bloque = bloque;
		this.categoria = categoria;

		// Inicializamos el tama�o del array

		listaLibro = new Libros[Estanteria.MAX_LIBRO];

		for (int i = 0; i < listaLibro.length; i++) {
			listaLibro[i] = new Libros();
		}
	}

	/**
	 * Recorre el array y devolver� el libro con a�o de publicaci�n m�s antiguo.
	 * 
	 * @return
	 */
	public Libros libroMasAntiguo() {

		int masAntiguo = Integer.MAX_VALUE;
		Libros libroMax = new Libros();

		for (int i = 0; i < listaLibro.length; i++) {
			if (listaLibro[i].getAnoPubl() < masAntiguo) {
				masAntiguo = listaLibro[i].getAnoPubl();
				libroMax = listaLibro[i];
			}
		}

		return libroMax;
	}

	/**
	 * Devolvera el n�mero de libros de la categor�a introducida que hay en la
	 * estanter�a.
	 * 
	 * @param categoria
	 * @return
	 */
	int librosDeCategoria(int categoria) {

		int cant = 0;

		for (int i = 0; i < listaLibro.length; i++) {
			if (listaLibro[i].getCategoria() == categoria) {
				cant++;
			}
		}

		return cant;
	}

}
