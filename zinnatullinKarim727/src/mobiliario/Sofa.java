package mobiliario;

public final class Sofa extends Asiento {
	public final String composicion;

	public Sofa(double precio, String descripcion, int numPlazas, String tapiceria, String color, String composicion) {
		super(precio, descripcion, numPlazas, tapiceria, color);
		this.composicion = composicion;
	}

	public String getComposicion() {
		return composicion;
	}

	public String toString() {
		return super.toString() + " Composición: " + this.composicion;
	}
}
