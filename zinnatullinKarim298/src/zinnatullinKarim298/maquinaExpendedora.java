/*
 * Objetivo: Crear un menu para una máquina expendedora
 * Autor: Karim Zinnatullin
 * Fecha: 07/11/2023
 */
package zinnatullinKarim298;

import java.util.Scanner;

public class maquinaExpendedora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte opcion, contador;
		double dinero, cambio, precio = 0;
		boolean pagado = false, // Bandera que utilizaremos para salir del bucle del pago
				terminarPrograma = false; // bandera que utilizaremos para terminar el programa
		String producto = "Producto"; // Asignaremos el nombre del producto aqui

		System.out.println("Bienvenido a la máquina expendedora de bebidas!");
		do {
			System.out.println("---------------------------------");
			System.out.println("Selecciona una bebida:\n1. COCACOLA - 1.50 Euros"
					+ "\n2. PEPSI - 1.50 Euros\n3. AGUA - 1.00 Euro\n4. ZUMO de naranja - 2.00 Euros\n0. salir");
			contador = 1;
			opcion = input.nextByte();

			switch (opcion) { // hacemos un switch con un caso para cada bebida
			case 1: {
				System.out.println("Has seleccionado una COCACOLA. El precio es de 1.50 Euros.");
				producto = "COCACOLA";
				precio = 1.50; // asignamos el precio a su variable correspondiente
				break;
			}
			case 2: {
				System.out.println("Has seleccionado una MIERDA DE PERRO XDDDDDDD VAYA PARGEUALA. Precio es de 1.50 Euros.");
				producto = "PEPSI";
				precio = 1.50;
				break;
			}
			case 3: {
				System.out.println("Has seleccionado un AGUA. Precio es de 1.00 Euros.");
				producto = "AGUA";
				precio = 1.00;
				break;
			}
			case 4: {
				System.out.println("Has seleccionado un ZUMO. Precio es de 2.00 Euros.");
				producto = "ZUMO";
				precio = 2.00;
				break;
			}
			case 0: {
				terminarPrograma = true;
			}
			
			}
			if (!producto.equals("Producto")) { // con esta condicion de if nos aseguramos de que
													// solo entre en el bucle si hay una bebida seleccionada
				do {
					System.out.println("Introduce la cantidad de dinero en euros:");
					dinero = input.nextDouble();
					if (dinero >= precio) { // condicion: si el dinero es suficiente
						cambio = dinero - precio; // calculamos el cambio
						System.out.println("Su cambio es de " + cambio + " euros");
						System.out.println("Disfrute de su " + producto + "!");
						pagado = true; // para salir del bucle de pago

					} else {
						System.out.println("Dinero insuficiente, su dinero será devuelto. Le quedan " + (3 - contador)
								+ " intentos.");
					}
					contador++;
					terminarPrograma = true; // para salir del bucle entero, lo ponemos dentro del bucle de pago, ya que
												// si el usuario llega hasta él, el programa terminará si o si

				} while (contador <= 3 && pagado == false); // el bucle seguirá ejecutandose hasta que el contador de intentos
															// llegue a 3, o que el pago haya sido realizado con éxito
			}
		} while (terminarPrograma == false);
		System.out.println("-----------------------------------------------------");
		System.out.println("Gracias por usar la máquina expendedora. Hasta luego!");
		input.close();

	}

}
