// Autor: karim Zinnatullin
package figuras;

public class Triangulo implements iFigura2D{
	private double ancho, alto;
	private final double MIN_LONGITUD = 0;

	public Triangulo(double ancho, double alto) {
		if (ancho <= MIN_LONGITUD || alto <= MIN_LONGITUD)
			throw new IllegalArgumentException("El alto y el ancho no pueden ser menores o iguales que 0");
	}

	public double getAlto() {
		return this.alto;
	}

	public double getAncho() {
		return this.ancho;
	}

	public double perimetro() {
		double hipotenusa = Math.sqrt((ancho*ancho+alto*alto));
		return ancho + alto +hipotenusa;
	}

	public double area() {
		return (this.ancho * this.alto)/2;
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
		System.out.println("Triangulo: ancho= " + ancho + ", alto= " + alto + "  perimetro= " + perimetro() + ", area= " + area());
	}
}
