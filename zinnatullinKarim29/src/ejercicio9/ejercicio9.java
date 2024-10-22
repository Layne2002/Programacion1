/*
 * Objetivo Escribe un programa Java que calcula y escribe la suma y el producto de los 10 primeros
números naturales
 * Autor: Karim Zinnatullin
 * Fecha:23/10/2023
 */
package ejercicio9;

public class ejercicio9 {

	public static void main(String[] args) {

		int suma, producto;
		suma = 0;
		producto = 1;
		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			producto = producto * i;
		}
		System.out.println("suma de los diez primeros numeros naturales: " + suma);
		System.out.println("Producto de los diez primeros números naturales: " + producto);
	}

}
