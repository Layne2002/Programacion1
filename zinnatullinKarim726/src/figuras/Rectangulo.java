// Autor: karim Zinnatullin
package figuras;

public class Rectangulo implements iFigura2D {
	private double ancho, alto;
	private final double MIN_LONGITUD = 0;

	public Rectangulo(double ancho, double alto) {
		if (ancho <= MIN_LONGITUD || alto <= MIN_LONGITUD)
			throw new IllegalArgumentException("El alto y el ancho no pueden ser menores o iguales que 0");
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getAlto() {
		return this.alto;
	}

	public double getAncho() {
		return this.ancho;
	}

	public double perimetro() {
		return this.ancho * 2 + this.alto * 2;
	}

	public double area() {
		return this.ancho * this.alto;
	}

	public void escalar(double escala) {
		if (escala <= 0) {
			throw new IllegalArgumentException("La escala no peude ser menor o igual que 0");
		}
		this.alto *= escala;
		this.ancho *= escala;
	}

	@Override
	public void imprimir() {
		System.out.println("Rectangulo: ancho= " + ancho + ", alto= " + alto + "  perimetro= " + perimetro()
				+ ", area= " + area());
	}

}
