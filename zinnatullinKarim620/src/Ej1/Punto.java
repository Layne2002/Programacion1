package Ej1;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void imprime() {
		double x = this.x;
		double y = this.y;
		System.out.printf("(%d , %d)\n", x, y);
	}

	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void desplaza(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	public String toString() {
		return "(x = " + this.x + ", y = " + this.y + ")";
	}

	public double distancia(Punto p) {
		double distancia = 0;

		distancia = Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y));

		return distancia;

	}

}
