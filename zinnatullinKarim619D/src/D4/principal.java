package D4;

public class principal {

	public static void main(String[] args) {
		Articulo articulo1 = new Articulo("Ordenador", 467.99, 21, 14);

		double pvp1 = articulo1.getPrecio() * ((articulo1.getIVA() / 100) + 1);
		System.out.printf("%s - Precio: %.2f€ - IVA: %.1f%% - PVP: %.2f€", articulo1.getNombre(), articulo1.getPrecio(),
				articulo1.getIVA(), pvp1);
		try {
			articulo1.setPrecio(1600.99);
		} catch (IllegalArgumentException ex) {
			System.err.printf("Error: %s\n", ex.getMessage());
		}
		pvp1 = articulo1.getPrecio() * ((articulo1.getIVA() / 100) + 1);
		System.out.printf("\n%s - Precio: %.2f€ - IVA: %.1f%% - PVP: %.2f€", articulo1.getNombre(),
				articulo1.getPrecio(), articulo1.getIVA(), pvp1);

		System.out.println("");
		System.out.println("Probando metodos nuevos:");
		articulo1.imprimir();

		if (articulo1.vender(4))
			System.out.println("Se han vendido 4 articulos");
		else
			System.out.println("No se han podido vender 4 artículos");
		if (articulo1.almacenar(999))
			System.out.println("Se han podido almacenar 999 articulos");
		else
			System.out.println("No se han podido almacenar 999 articulos");
		System.out.printf("Precio del articulo %S con descuento del 15%%: %.2f€\n", articulo1.getNombre(),
				articulo1.getPVPDescuento(15));
		articulo1.imprimir();

	}

}
