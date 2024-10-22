/*
 * Autor: karim zinnatullin
 */
package D3;

public class principal {

	public static void main(String[] args) {
		System.out.println("Intentando instanciar los rectangulos del enunciado...");
		Rectangulo rectangulo1 = new Rectangulo();
		Rectangulo rectangulo2 = new Rectangulo();

		try {
			rectangulo1.setPunto1(0, 0);
			rectangulo1.setPunto2(5, 5);
		} catch (IllegalArgumentException ex) {
			System.err.printf("Error: %s \n", ex.getMessage());
		}
		try {
			rectangulo2.setPunto1(7, 9);
			rectangulo2.setPunto2(2, 3);
		} catch (IllegalArgumentException ex) {
			System.err.printf("Error: %s \n", ex.getMessage());
		}
		System.out.println("Invirtiendo las coordenadas del rectangulo2 para poder instanciarlo...");
		rectangulo2.setPunto2(7, 9);
		rectangulo2.setPunto1(2, 3);

		System.out.printf("Coordenadas de rectángulo 1: (%d,%d) , (%d,%d)", rectangulo1.getX1(), rectangulo1.getY1(),
				rectangulo1.getX2(), rectangulo1.getY2());
		int area1 = (rectangulo1.getX2() - rectangulo1.getX1()) * (rectangulo1.getY2() - rectangulo1.getY1());
		int perimetro1 = 2 * (rectangulo1.getX2() - rectangulo1.getX1())
				+ 2 * (rectangulo1.getY2() - rectangulo1.getY1());
		System.out.printf("\nÁrea del rectángulo 1: %d unidades al cuarado", area1);
		System.out.printf("\nPerímetro del rectángulo 1: %d", perimetro1);

		System.out.println("\n---------------------------------------------");

		System.out.printf("Coordenadas de rectángulo 2: (%d,%d) , (%d,%d)", rectangulo2.getX1(), rectangulo2.getY1(),
				rectangulo2.getX2(), rectangulo2.getY2());
		int area2 = (rectangulo2.getX2() - rectangulo2.getX1()) * (rectangulo2.getY2() - rectangulo2.getY1());
		int perimetro2 = 2 * (rectangulo2.getX2() - rectangulo2.getX1())
				+ 2 * (rectangulo2.getY2() - rectangulo2.getY1());
		System.out.printf("\nÁrea del rectángulo 1: %d unidades al cuarado", area2);
		System.out.printf("\nPerímetro del rectángulo 1: %d", perimetro2);

		System.out.println("\n---------------------------------------------");
		System.out.println("MODIFICANDO DATOS...");
		System.out.println("---------------------------------------------");

		try {
			rectangulo1.setPunto1((rectangulo1.getX1() * 2), (rectangulo1.getY1() * 2));
			rectangulo1.setPunto2(17, 33);
			rectangulo1.setPunto1((rectangulo2.getX1() - 1), 0);
			rectangulo2.setPunto2(800, (rectangulo2.getY2() + 50));
		} catch (IllegalArgumentException ex) {
			System.err.printf("Error: %s\n", ex.getMessage());
		}

		System.out.println("Mostrando datos después de las modificaciones:");
		System.out.println();

		System.out.printf("Coordenadas de rectángulo 1: (%d,%d) , (%d,%d)", rectangulo1.getX1(), rectangulo1.getY1(),
				rectangulo1.getX2(), rectangulo1.getY2());
		area1 = (rectangulo1.getX2() - rectangulo1.getX1()) * (rectangulo1.getY2() - rectangulo1.getY1());
		perimetro1 = 2 * (rectangulo1.getX2() - rectangulo1.getX1()) + 2 * (rectangulo1.getY2() - rectangulo1.getY1());
		System.out.printf("\nÁrea del rectángulo 1: %d unidades al cuarado", area1);
		System.out.printf("\nPerímetro del rectángulo 1: %d", perimetro1);

		System.out.println("\n---------------------------------------------");

		System.out.printf("Coordenadas de rectángulo 2: (%d,%d) , (%d,%d)", rectangulo2.getX1(), rectangulo2.getY1(),
				rectangulo2.getX2(), rectangulo2.getY2());

		area2 = (rectangulo2.getX2() - rectangulo2.getX1()) * (rectangulo2.getY2() - rectangulo2.getY1());
		perimetro2 = 2 * (rectangulo2.getX2() - rectangulo2.getX1()) + 2 * (rectangulo2.getY2() - rectangulo2.getY1());
		System.out.printf("\nÁrea del rectángulo 1: %d unidades al cuarado", area1);
		System.out.printf("\nPerímetro del rectángulo 1: %d\n", perimetro1);

		System.out.println("");
		System.out.println("------------------------");
		System.out.println("");
		System.out.println("Probando metodos nuevos:");
		System.out.println("intentando poner las coordeanadas(5,10),(17,45)");
		try {
			rectangulo1.setAll(5, 10, 17, 45);
		} catch (IllegalArgumentException ex) {
			System.err.printf("Error: %s", ex.getMessage());
		}
		rectangulo1.imprimir();
		System.out.printf("Perimetro del rectangulo 1: %d unidades\n", rectangulo1.getPerimetro());
		System.out.printf("Area del rectangulo1 : %d unidades al cuadrado\n", rectangulo1.getArea());
	}

}
