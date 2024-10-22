package zinnatullinKarimT2;

import java.util.Random;
import libtarea3.Teatro;

public class PrincipalTeatro {
	// APARTADO 1
	public static int generarAleatorio() { // metodo que crea un número alteario entre 0 y 1500 multiplo de 100
		int x;
		do {
			Random random = new Random();
			x = random.nextInt(1500);
		} while (x % 100 != 0);
		return x;
	}

	public static void main(String[] args) {

		// APARTADO 2
		System.out.println("APARTADO 2:");
		System.out.println("Creando un teatro, teatro1, por defecto...\n"); // añado \n para que los mensajse de cada
																			// apartado
		Teatro teatro1 = new Teatro(); // queden más separados y esté más legible
		System.out.println("Mostrando la información del teatro:");
		System.out.printf("%s\n\n", teatro1.toString());

		// APARTADO 3
		System.out.println("APARTADO 3:");
		try {
			System.out.println("Intentando comprar 100 entradas en el teatro1...");
			teatro1.comprarEntradas(100);
		} catch (Exception ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		System.out.println("Mostrando la información del teatro:");
		System.out.printf("%s\n\n", teatro1.toString());

		// APARTADO 4
		System.out.println("APARTADO 4:");
		try {
			System.out.println("Asignando la obra 'La verbana de paloma'...");
			teatro1.asignarObra("La verbana de paloma");
			System.out.println("Obra asignada! Mostrando la información del teatro:");
			System.out.printf("%s\n\n", teatro1.toString());
		} catch (Exception ex) {
			System.err.printf("%s\n\n", ex.getMessage());
		}

		// APARTADO 5
		System.out.println("APARTADO 5:");
		try {
			System.out.println("Comprando un número aleatorio de entradas...'");
			teatro1.comprarEntradas(generarAleatorio());
		} catch (Exception ex) {
			teatro1.comprarEntradas(teatro1.getAforo());
			System.err.printf("%s Se compraron %d entradas\n", ex.getMessage(), teatro1.getEntradasVendidas());
		}
		System.out.println("Mostrando la información del teatro:");
		System.out.printf("%s\n\n", teatro1.toString());

		// APARTADO 6
		System.out.println("APARTADO 6:"); // Inicializo la variable para evitar errores del entorno de desarrollo
		Teatro teatro2 = new Teatro();
		try {
			System.out.println("Creando el teatro Cervantes y asignando un aforo de 500...");
			teatro2 = new Teatro("Cervantes", 500);
			System.out.println("Teatro 'Cervantes' creado con éxito! Mostrando la información del teatro:");
			System.out.printf("%s\n\n", teatro2.toString());
		} catch (Exception ex) {
			System.err.printf("%s\n\n", ex.getMessage());
		}

		// APARTADO 7
		System.out.println("APARTADO 7:");
		try {
			System.out.println("Traspasando la obra el teatro1 al teatro Cervantes...");
			teatro2.asignarObra(teatro1.getObra());
			System.out.println("Exitoso! Mostrando la información del teatro:");
			System.out.printf("%s\n\n", teatro2.toString());
		} catch (Exception ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 8
		System.out.println("APARTADO 8:");
		try {
			System.out.println("Comprando un número aleatorio de entradas en el teatro Cervantes...");
			teatro2.comprarEntradas(generarAleatorio());
		} catch (Exception ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		System.out.println("Mostrando la información del teatro:");
		System.out.printf("%s\n\n", teatro2.toString());

		// APARTADO 9
		System.out.println("APARTADO 9:");
		try {
			System.out.println("Devolviendo un número aleatorio de entradas en el teatro Cervantes...");
			teatro2.devolverEntradas(generarAleatorio());
		} catch (Exception ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		System.out.println("Mostrando la información del teatro:");
		System.out.printf("%s\n\n", teatro2.toString());

		// APARTADO 10
		System.out.println("APARTADO 10:");
		Teatro teatro3; // Inicializo la variable para evitar errores del entorno de desarrollo
		try {
			System.out.println("Clonando el teatro Cervantes al teatro Soho Málaga");
			teatro3 = new Teatro("Soho Málaga", teatro2.getAforo());
			teatro3.asignarObra(teatro2.getObra());
			try {												// este try catch es por si en el teatro Cervantes no se vendieron entradas
			teatro3.comprarEntradas(teatro2.getEntradasVendidas());
			}catch(Exception ex) {}
			System.out.println("Mostrando la información del teatro:");
			System.out.printf("%s\n\n", teatro3.toString());
		} catch (Exception ex) {
			System.err.printf("%s\n", ex.getMessage());
		}
		
		
		// APARTADO 11
		System.out.println("APARTADO 11");
		System.out.println("Mostrando infromación de todos los teatros...");
		// APARTADO 11.1
		System.out.printf("Número de teatros creados: %d\n",Teatro.getTeatrosTotales());
		// devuelve 4 porque he tenido que inicializar uno por defecto.
		// APARTADO 11.2
		System.out.printf("Número de obras que se están representando: %d\n",Teatro.getObrasActivas());
		// APARTADO 11.3
		System.out.printf("Número de entradas vendidas en todos los teatros: %d\n",Teatro.getEntradasVendidasTotales());
				
		
	}

}
