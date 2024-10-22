// Autor: karim Zinnatullin
package figuras;

public class Cuadrado implements iFigura2D {
	private double lado;

	private final double MIN_LADO = 0;

	public Cuadrado(int lado) {
		if (lado <= MIN_LADO) {
			throw new IllegalArgumentException("Los lados no puedes ser 0 o menos");
		}
		this.lado = lado;
	}

	public double perimetro() {
		return this.lado * 4;
	}

	public double area() {
		return this.lado * lado;
	}

	public void escalar(double escala) {
		if (escala <= 0)
			throw new IllegalArgumentException("La escala debe ser mayor que 0");

		this.lado = this.lado * escala;
	}

	public void imprimir() {
		System.out.println("Cuadrado: Lado= " + lado + ", perímetro= " + this.perimetro() + ", área= " + this.area());
	}
}
