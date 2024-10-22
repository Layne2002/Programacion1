package ejemploRectangulo;

import java.awt.Point;
import java.awt.Rectangle;

public class ejemploRectangulo {

	public static void main(String[] args) {
		/*Rectangle rectangulo1 = new Rectangle();
		System.out.println(rectangulo1.toString());
		// Modificar x a 2 e y a 3
		rectangulo1.setLocation(2,3);
		System.out.println(rectangulo1.toString());
		rectangulo1.setSize(2, 3);
		System.out.println(rectangulo1.toString());
		if(rectangulo1.getHeight()<5) {
			rectangulo1.setSize((int)(rectangulo1.getWidth()),5);
		}
		System.out.println("Despues de comprobar");
		System.out.println(rectangulo1.toString());
		System.out.println("--------------------");
		Rectangle rectangulo2 = rectangulo1;
		for (int i =5;i<21;i=i+5) {
			rectangulo2.setLocation(i,(int)rectangulo2.getY());
			System.out.println(rectangulo2.toString());
		}
		System.out.println(rectangulo1.toString());
		*/
		
		Rectangle rectangulo1 = new Rectangle();
		System.out.println(rectangulo1.toString());
		Rectangle rectangulo2 = new Rectangle(3, 5);
		System.out.println(rectangulo2.toString());
		Rectangle rectangulo3 = new Rectangle(2, 2, 3, 5);
		System.out.println(rectangulo3.toString());
		Point punto = new Point(2,2);
		
		rectangulo1 = rectangulo2;
		
		Rectangle rectangulo4 = new Rectangle(punto);
		rectangulo4.setSize(2,5);
		System.out.println(rectangulo4.toString());
		
		if(rectangulo1.equals(rectangulo2)) {
			System.out.println("Los rectangulos 1 y 2 son iguales");
		}else {
			System.out.println("Los rectangulos 1 y 2 no son iguales");
		}
		 
	}

}
