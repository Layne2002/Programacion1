package D3;

public class Rectangulo {

	private int x1, y1, x2, y2;

	public Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 > x2 || y1 > y2) {
			throw new IllegalArgumentException("Una de las coordenadas está mal");
		} else {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	public Rectangulo() {
		this(0, 0, 0, 0);
	}

	public int getX1() {
		return x1;
	}

	public int getX2() {
		return x2;
	}

	public int getY1() {
		return y1;
	}

	public int getY2() {
		return y2;
	}

	public void setPunto1(int x1, int y1) {
		if (x1 > this.getX2() || y1 > this.getY2()) {
			throw new IllegalArgumentException("Las coordenadas del Punto1 no pueden ser mayores al Punto2");
		} else {
			this.x1 = x1;
			this.y1 = y1;
		}
	}

	public void setPunto2(int x2, int y2) {
		if (x2 < this.getX1() || y2 < this.getY1()) {
			throw new IllegalArgumentException("Las coordenadas del Punto1 no pueden ser mayores al Punto2");
		} else {
			this.x2 = x2;
			this.y2 = y2;
		}

	}

	public void imprimir() {
		System.out.printf("Punto 1: (%d,%d) - Punto 2: (%d,%d)\n", this.x1, this.y1, this.x2, this.y2);
	}

	public void setX1Y1(int x1, int y1) {
		if (x2 < this.getX1() || y2 < this.getY1()) {
			throw new IllegalArgumentException("Las coordenadas del Punto1 no pueden ser mayores al Punto2");
		} else {
			this.x1 = x1;
			this.y1 = y1;
		}
	}

	public void setX2Y2(int x2, int y2) {
		if (x2 < this.getX1() || y2 < this.getY1()) {
			throw new IllegalArgumentException("Las coordenadas del Punto1 no pueden ser mayores al Punto2");
		} else {
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	public void setAll(int x1, int y1, int x2, int y2) {
		if (x2 < this.getX1() || y2 < this.getY1()) {
			throw new IllegalArgumentException("Las coordenadas del Punto1 no pueden ser mayores al Punto2");
		} else {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	public int getPerimetro() {
		int perimetro;
		perimetro = 2 * (this.x2 - this.x1) + 2 * (this.y2 - this.y1);
		return perimetro;
	}

	public int getArea() {
		int area;
		area = (this.x2 - this.x1) * (this.y2 - this.y1);
		return area;
	}
}
