package Ej1;

public class principalLinea {

	public static void main(String[] args) {
		Linea linea1 = new Linea();
		Punto punto1 = new Punto(1, 1);
		Punto punto2 = new Punto(12, 8);
		Linea linea2 = new Linea(punto1, punto2);

		System.out.printf("Linea 1: %s\n", linea1.toString());

		System.out.printf("Linea 2: %s\n", linea2.toString());

		System.out.println("Moviendo la linea 1 2.5 ud a la izquierda y 1 ud arriba");
		linea1.mueveIzquierda(2.5);
		linea1.mueveArriba(1);
		System.out.println("Moviendo la linea 2  4 ud abajo y 0.5 a la derecha");
		linea2.mueveAbajo(4);
		linea2.mueveDerecha(0.5);

		System.out.println("Escribiendo las lineas de nuevo:");
		System.out.printf("Linea 1: %s\n", linea1.toString());

		System.out.printf("Linea 2: %s\n", linea2.toString());

		System.out.println("Asignando coordenadas (25,80) , (40,100) a la linea 1");
		linea1.setPuntoAB(25, 80, 40, 100);
		System.out.printf("Linea 1: %s\n", linea1.toString());
		
		
		

	}

}
