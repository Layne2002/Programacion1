// Autor: karim Zinnatullin
package figuras;

public class Circulo implements iFigura2D {
	private double rad;

	public Circulo(double rad) {
		if (rad <= 0) {
			throw new IllegalArgumentException("El radio no puede ser negativo o 0");
		}
		this.rad = rad;
	}

	public double getRad() {
		return this.rad;
	}

	public double area() {
		return Math.PI * rad * rad;
	}

	public double perimetro() {
		return 2 * Math.PI * rad;
	}

	public void escalar(double escala) {
		if (escala <= 0)
			throw new IllegalArgumentException("La escala no puede ser negativa o 0");
		this.rad *= escala;
	}

	public void imprimir() {
		System.out.println("Circulo: rad= " + rad + ", area= " + area() + ", perimetro= " + perimetro());
	}
}
