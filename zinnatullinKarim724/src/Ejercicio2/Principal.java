package Ejercicio2;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Creando dos punteros de tipo coche...");
		Coche coche1, coche2;
		System.out.println("Creando un objeto coche con valores validos...");
		coche1 = new Coche();
		try {
			coche1.setMatricula("1234ABC");
			coche1.setPropietario("Alberto");
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n",ex.getMessage());
		}
		System.out.printf("%s\n",coche1.toString());
		System.out.println("Creando un objeto coche con parametros invalidos...\n");
		
		try {
			coche2 = new Coche(-111, -1000);
		} catch (IllegalArgumentException ex) {
			System.err.printf("\n%s\n",ex.getMessage());
		}
		System.out.println("Creando el coche2 con parametros válidos y intentando asignar valores inválidos...");
		coche2 = new Coche();
		try {
			coche2.setMatricula("12345AAAAA");
		}catch(IllegalArgumentException ex) {
			System.err.printf("%s\n",ex.getMessage());
		}
		try {
			coche2.setPropietario(null);
		}catch(Exception ex) {
			System.err.printf("%s\n",ex.getMessage());
		}
		System.out.printf("%s\n",coche2.toString());
		
	}

}
