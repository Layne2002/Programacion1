package Ej2;

public class principalCafetera {

	public static void main(String[] args) {
		// Una cafetera vacía que se llene con 250cc y que sirva tazas de café hasta que
		// se agote
		System.out.println("Creando cafetera1");
		Cafetera cafetera1 = new Cafetera();
		try {
			System.out.println("Intentando llenar cafetera con 250 cc");
			cafetera1.llenarCafetera(250);
		} catch (IllegalArgumentException ex) {
			System.err.printf(ex.getMessage());
		}
		int contador = 0;
		while (cafetera1.getCapacidadActual() > 0) {
			try {
				cafetera1.servirTaza(50);
				contador++;
			} catch (IllegalArgumentException ex) {
				System.err.printf(ex.getMessage());
			}
		}
		System.out.printf("Se han servido %d tazas.\n", contador);
		System.out.println("-----------------------");
		System.out.println("\nCreando cafetera2\n");
		Cafetera cafetera2 = new Cafetera(1000, 1000);
		System.out.printf("Sirviendo 50 tazas de café de 50cc...\n");
		for (int i = 1; i <= 50; i++) {
			try {
				if (cafetera2.getCapacidadActual() >= 50) {
					cafetera2.servirTaza(50);
					System.out.println("sirviendo taza " + i);
				} else {
					cafetera2.llenarCafetera(1000);
					i -= 1;
					System.out.println("Cafetera vacía. Llenando...");
				}
			} catch (IllegalArgumentException ex) {
				System.err.printf("%s\n", ex.getMessage());

			}
		}
	}

}
