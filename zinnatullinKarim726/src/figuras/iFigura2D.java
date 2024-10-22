// Autor: karim Zinnatullin
package figuras;

public interface iFigura2D {
	double perimetro();

	double area();

	void escalar(double escala) throws IllegalArgumentException;

	void imprimir();
}
