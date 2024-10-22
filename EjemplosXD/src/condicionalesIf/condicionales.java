package condicionalesIf;
import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {
		int edad=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta tu edad porfavor:");
		edad=teclado.nextInt();
		
		if (edad == 21) {
			System.out.println("!!!Genial Puedes Ir A La Carcel De Adultos¡¡¡");
		}
		else if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}
		
		else {
			System.out.println("Vete niño");
		}
		System.out.println("Hola");
		
		System.out.println("Dame un numero porfavor:");
		double numero=teclado.nextDouble();
	    
		if (numero % 2 == 0 && numero > 100) {
			System.out.println("El número " + numero + " es para y mayor de 100.");
		}
		else if (numero %2 == 0) {
			System.out.println("El número " + numero + " solo es par.");
		}
		else {
			System.out.println("El número " + numero + " no es par.");
		}
	}

}
