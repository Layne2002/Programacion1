package mobiliario;

public abstract class Mueble {
	// Atributos del enunciado
	private final int Id;
	protected double precio;
	private final String DESCRIPCION;

	// atributos estaticos sontantes publicos
	public static final double MIN_PRECIO = 0.01;
	public static final double MAX_PRECIO = 10000;

	// Contador para el identificador
	private static int contador = 0; 

	protected Mueble(double precio, String descripcion) {
		if (precio < MIN_PRECIO || precio > MAX_PRECIO) {
			String cadena = String.format("El precio no está en el rango permitido: %.2f", precio);
			throw new IllegalArgumentException(cadena);
		} else {
			contador++;
			this.Id = contador;
			this.precio = precio;
			this.DESCRIPCION = descripcion;
		}

	}

	// GETTERS
	public int getId() {
		return Id;
	}

	public double getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return DESCRIPCION;
	}

	public String toString() {
		String cadena = String.format("Tipo: %s Id: %d Precio: %.2f Descripción: %s", this.getClass().getSimpleName(),
				this.Id, this.precio, this.DESCRIPCION);
		return cadena;
	}

}
