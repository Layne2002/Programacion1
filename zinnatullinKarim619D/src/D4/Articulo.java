package D4;

public class Articulo {
	private String nombre;
	private double precio;
	private double IVA = 21;
	private int cuantosQuedan;

	public void setNombre(String nombre) {
		if (nombre == null) {
			throw new IllegalArgumentException("alguno de los parámetros de entrada es null");
		} else {
			this.nombre = nombre;
		}
	}

	public void setPrecio(double precio) {
		if (precio < 0) {
			throw new IllegalArgumentException("El precio no puede ser negativo");
		} else {
			this.precio = precio;
		}
	}

	public void setCuantosQuedan(int quedan) {
		if (cuantosQuedan >= 1000) {
			throw new IllegalArgumentException("No hay espacio para 1000 articulos de un tipo");
		} else
			this.cuantosQuedan = quedan;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public double getIVA() {
		return this.IVA;
	}

	public int getCuantosQuedan() {
		return this.cuantosQuedan;
	}

	public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
		if (nombre == null) {
			throw new IllegalArgumentException("alguno de los parámetros de entrada es null");
		} else if (nombre.isEmpty() || precio < 0) {
			throw new IllegalArgumentException("El nombre del artículo está vacío");
		} else if (precio < 0) {
			throw new IllegalArgumentException("El precio no puede ser negativo");
		} else if (iva < 0) {
			throw new IllegalArgumentException("Iva negativo");
		} else if (cuantosQuedan >= 1000) {
			throw new IllegalArgumentException("No hay espacio para 1000 articulos de un tipo");
		} else {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public double getPVP() {
		return (this.precio * ((this.IVA / 100) + 1));
	}

	public double getPVPDescuento(double descuento) {
		return this.getPVP() * ((100 - descuento) / 100);
	}

	public void imprimir() {
		System.out.printf("%S - Precio: %.2f€ - PVP: %.2f€ - Quedan: %d unidades\n", this.nombre, this.precio,
				this.getPVP(), this.cuantosQuedan);
	}

	public boolean vender(int x) {
		if ((this.cuantosQuedan - x) < 0)
			return false;
		else {
			this.cuantosQuedan = this.cuantosQuedan - x;
			return true;
		}
	}

	public boolean almacenar(int x) {
		if ((this.cuantosQuedan + x) > 1000)
			return false;
		else {
			this.cuantosQuedan = this.cuantosQuedan + x;
			return true;
		}
	}

}
