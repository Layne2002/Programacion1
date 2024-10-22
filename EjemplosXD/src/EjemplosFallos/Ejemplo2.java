package EjemplosFallos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		double numeros[]=new double[2];
		
		boolean control=false;
		
		do {
			try {
				System.out.print("Inserta el primer numero con el que deseas dividir:");
				numeros[0]=teclado.nextDouble();
				
				System.out.print("Inserta el segundo numero con el que deseas dividir:");
				numeros[1]=teclado.nextDouble();
				
				
				double resultado=(numeros[0]/numeros[1]);

				System.out.println(numeros[0]+"/"+numeros[1]+"="+resultado);
				control=true;		
			}
			catch (ArithmeticException ex){
				System.err.println("ERROR Devisor=0");
			}
			catch (InputMismatchException ex) {
				System.err.println("ERROR CARACTER INVALIDO"+ex);
				teclado.nextLine();
			}
			catch(Exception ex){
				System.err.println("ERROR");
				teclado.nextLine();
			}
		}while (!control);
	}

}
