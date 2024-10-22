/*Objetivo: Crear programa que rrealize varios pasos
 * Autor: Karim Zinnatullin
 * Fecha: 28/09/2023
 */
package ejercicio3;

public class ejercicio3 {

public static void main(String[] args) {
	// Crea dos variables de tipo int, num1 y num2, inicializa ambas variables a 1
	int num1 = 1;
	int num2 = 1;

	//Crea dos variables de tipo char, car1 y car2, asígnales cualquier valor
	char car1 = 'X';
	char car2 = 'D';
	
	//Crea dos variables de tipo String cargo y nombre, inicializa ambas con tus datos. 
	String cargo = "Profesor";
	String nombre = "Zinnatullin";
	
	//Muestra por pantalla el valor de las variables num1 y num2 con un texto que lo acompañe
	System.out.println("El valor de la variable num1 es " + num1 + " y el de num2 es " + num2);
	
	//Asigna el valor 15 a la variable num1. Asigna el valor 20 a la variable num2. Vuelve a 
	//mostrar el valor de dichas variables
	num1 = 15;
	num2 = 20;
	
	System.out.println("Después de la reasignación, el valor de num1 es: " + num1 + "\nY el de num2 es " + num2);
	
	//Muestra por consola el valor de las variables car1 y car2 con un texto que lo acompañe.
	System.out.println("El valor de car1 es: " + car1 + "\nY el de car2 es: " + car2);
	
	//Muestra por pantalla el siguiente mensaje, haciendo uso de las variables nombre y cargo
	
	System.out.println("Bienvenido, " + cargo + " " + nombre + ".");
	
	}

}
