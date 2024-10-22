package ejercicio1;
import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Dime una cadena de caractéres o una frase: ");
        String usuario = input.next();
        
        String[] palabra = usuario.split(" ");
        for(String palabras : palabra) {
        	System.out.println(palabras);
        }
	}
}
