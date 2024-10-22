package Ej1;

public class Linea {

	Punto puntoA;
	Punto puntoB;

	public Linea() {
		this.puntoA = new Punto();
		this.puntoB = new Punto();
	}

	public Linea(Punto a, Punto b) {
		this.puntoA = a;
		this.puntoB = b;
	}

	public void mueveDerecha(double x) {
		double a = puntoA.getX() + x;
		this.puntoA.setX(a);
	}

	public void mueveIzquierda(double x) {
		double a = puntoA.getX() - x;
		this.puntoA.setX(a);
	}

	public void mueveArriba(double y) {
		double a = puntoA.getY() + y;
		this.puntoA.setY(a);
	}

	public void mueveAbajo(double y) {
		double a = puntoA.getY() - y;
		this.puntoA.setY(a);
	}



	
	public String toString() {
		return "[" + this.puntoA.toString() + " , " + this.puntoB.toString() + "]";
	}

	public void setPuntoA(double x1, double y1) {
		this.puntoA.setXY(x1, y1);
	}

	public void setPuntoB(double x2, double y2) {
		this.puntoB.setXY(x2, y2);
	}

	public void setPuntoAB(double x1, double y1, double x2, double y2) {
		this.puntoA.setXY(x1, y1);
		this.puntoB.setXY(x2, y2);
	}
}
