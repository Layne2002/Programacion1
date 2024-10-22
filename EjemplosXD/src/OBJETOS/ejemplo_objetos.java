package OBJETOS;

import java.awt.Point;
import java.awt.Rectangle;

public class ejemplo_objetos {

	public static void main(String[] args) {
		
	Rectangle rectangulo=new Rectangle();
	
	//Imprimimos el rectangulo en texto
	System.out.println(rectangulo.toString());

	
	
	
	//En este hacemos uso de alto y largo para dibujar un rectangulo
	Rectangle rectangulo2=new Rectangle(3,5);
	System.out.println(rectangulo2.toString());

	
	
	//En este hacemos usos de x,y,altura y largo dibujar un rectangulo
	Rectangle rectangulo3=new Rectangle(2,2,3,5);
	System.out.println(rectangulo3.toString());

	
	
	
	//Declaroamos la clase punto pra tener un objeto punto, en este declaramos X y Y
	Point punto=new Point(2,2);
	
	
	
	
	//En este hacemos uso del objeto punto para dibujar un rectangulo.
	Rectangle rectanguloPunto=new Rectangle(punto);
	System.out.println(rectanguloPunto.toString());

	//Así se crea un puntero
	Rectangle rectangulo5= rectangulo2;
	System.out.println(rectangulo5.toString());

	//Hacemos que rectangulo3 apunte al 2 pero este perder su información.
	rectangulo3=rectangulo2;
	System.out.println(rectangulo3.toString());
	
	//Así se crea una copio de un objeto.
	Rectangle copRectangulo2=new Rectangle(rectangulo2);
	System.out.println(copRectangulo2.toString());
     
	
	if (rectangulo.equals(rectangulo3)){
		System.out.println(rectangulo+" es igual a "+rectangulo3);
	}
	else {
		System.out.println(rectangulo+" no es igual a "+rectangulo3);
	}
	
	rectangulo3=rectangulo;
	
	if (rectangulo.equals(rectangulo3)){
		System.out.println(rectangulo+" es igual a "+rectangulo3);
	}
	else {
		System.out.println(rectangulo+" no es igual a "+rectangulo3);
	}
	
	//Modificar la x y la y.
	rectangulo.setLocation(2, 3);
	System.out.println(rectangulo.toString());
	
	rectangulo2.setLocation(5, 6);
	System.out.println(rectangulo2.toString());
	
	rectangulo.setSize(4,8);
	
	if (rectangulo.getHeight()<5) {
		rectangulo.setSize((int)rectangulo.getWidth(),5);
		System.out.println(rectangulo.toString());
	}
	else {
		System.out.println(rectangulo.toString());
	}
	
	rectangulo2=rectangulo;
	for (int i=5;i<21;i=i+5) {
		rectangulo2.setLocation(i, (int)rectangulo2.getY());
		System.out.println(rectangulo2.toString());
	}
	System.out.println(rectangulo.toString());
	}

}
