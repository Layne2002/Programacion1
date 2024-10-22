package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		Humano humano1 = new Humano("Juan", "Cuesta");
		Ciudadano ciud1 = new Ciudadano("Karim", "Zinnatullin", "Y2443485T");
		Ciudadano ciud2 = new Ciudadano("David", "Ruiz", "12312312L");

		System.out.println("usando getNombreCompleto:");
		System.out.printf("Humano 1: %s\n", humano1.getNombreCompleto());
		System.out.printf("Ciudadano 1: %s\n", ciud1.getNombreCompleto());
		System.out.printf("Ciudadano 2: %s\n", ciud2.getNombreCompleto());

		System.out.println("----------------------------");
		System.out.println("Mostrando todos los datos de todos los humanos");
		System.out.println("----------------------------");
		System.out.printf("Humano 1: %s\n", humano1.getNombreCompleto());
		System.out.printf("Ciudadano 1: %s\n", ciud1.Identificacion());
		System.out.printf("Ciudadano 2: %s\n", ciud2.Identificacion());
	}

}
