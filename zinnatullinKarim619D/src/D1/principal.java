/*
 * Objetivo: Crea un programa con una clase llamada Punto 
 * Autor: Karim Zinnatullin
 */
package D1;

public class principal {

	public static void main(String[] args) {
		Punto punto1 = new Punto(5, 0);

		Punto punto2 = new Punto(10, 10);

		Punto punto3 = new Punto(-3, 7);

		System.out.printf("Coordenadas punto 1: x = %d , y = %d", punto1.getX(), punto1.getY());
		System.out.printf("\nCoordenadas punto 2: x = %d , y = %d", punto2.getX(), punto2.getY());
		System.out.printf("\nCoordenadas punto 3: x = %d , y = %d", punto3.getX(), punto3.getY());
		System.out.println("\nHaciendo operaciones...");
		System.out.println("-----------------------");

		punto1.setX(punto1.getX() + 4);
		punto1.setY(19);
		punto2.setX(punto2.getX() * 2 + 3);
		punto2.setY(punto2.getY() * 3);
		punto3.setX(punto3.getY());
		System.out.println("Después de las operaciones:");
		System.out.printf("Coordenadas punto 1: x = %d , y = %d", punto1.getX(), punto1.getY());
		System.out.printf("\nCoordenadas punto 2: x = %d , y = %d", punto2.getX(), punto2.getY());
		System.out.printf("\nCoordenadas punto 3: x = %d , y = %d\n", punto3.getX(), punto3.getY());
		
		
		punto1.setXY(5,7);
		punto2.setXY(10, 10);
		
		
		System.out.println("Coordenadas punto1: ");
		punto1.imprime();
		System.out.println("Coordenadas punto2: ");
		punto2.imprime();
		System.out.printf("Distancia entre punto1 y punto2: %d unidades",punto1.distancia(punto2));
	}

}
