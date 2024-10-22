// Autor: karim Zinnatullin
package figuras;

import java.util.ArrayList;
import java.util.List;

public class ProgramaFiguras {

	public static void main(String[] args) {
		// APARTADO 1
		List<iFigura2D> Figuras = new ArrayList<>();

		// APARTADO 2
		Figuras.add(new Cuadrado(4));
		Figuras.add(new Rectangulo(2, 6));
		Figuras.add(new Triangulo(3, 6));
		Figuras.add(new Circulo(5));

		// APARTADO 3
		System.out.println("Mostrando las figuras");
		for (iFigura2D x : Figuras) {
			x.imprimir();
		}
		System.out.println();
		// APARTADO 4
		System.out.println("Escalando las figuras a 2");
		for (iFigura2D x : Figuras) {
			x.escalar(2);
		}
		System.out.println();
		// APARTADO 5
		System.out.println("Mostrando las figuras");
		for (iFigura2D x : Figuras) {
			x.imprimir();
		}
		System.out.println();
		// APARTADO 6
		System.out.println("Escalando las figuras a 0.1");
		for (iFigura2D x : Figuras) {
			x.escalar(0.1);
		}
		System.out.println();
		// APARTADO 7
		System.out.println("Mostrando las figuras");
		for (iFigura2D x : Figuras) {
			x.imprimir();
		}
	}

}
