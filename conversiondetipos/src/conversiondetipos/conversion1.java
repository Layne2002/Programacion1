/*Objetivo: probar las conversiones de tipos
 * Autor: Karim Zinnatullin
 * Fecha: 2/10/2023
 */
package conversiondetipos;

public class conversion1 {

	public static void main(String[] args) {
		//declaramos e inicializamos las variables
		int e1 = 13;
		int e2 = 72;
		double d1 = 13.69;
		double d2 = 69.13;
		
		System.out.println("El valor inicial de las variables e1, e2, d1 y d2 son "+e1+", "+e2+", "+d1+" y "+d2+".");
		System.out.println("La suma de e1 y e1 es " + (e1+e2));
		System.out.println("La resta de e1 - e2 es " + (e1-e2));
		System.out.println("El producto de e1 y e2 es " + (e1*e2));
		System.out.println("El cociente de e1 y e2 es " + (e1/e2));
		System.out.println("El resto de la division anterior es " + (e1%e2));
		System.out.println("La suma de d1 y d2 es " + (d1+d2));
		System.out.println("La resta de d1 y d2 es " + (d1-d2));
		System.out.println("El producto de d1 y d2 es " + (d1*d2));
		System.out.println("La division de d1 y d2 es " + (d1/d2));
		System.out.println("El resto de la division anterior es "+(d1%d2));
		System.out.println("El doble de e1 es "+(e1*2)+ ", el de e2 es "+(e2*2)+ ", el de d1 es "+(d1*2)+", y el de d2 es "+(d2*2));
		System.out.println("La suma de todas las variables es "+ (e1+e2+d1+d2));
		System.out.println("El producto d etodas las variables es "+(e1*e2*d1*d2));
		
	}

}
