package EjemplosFallos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		boolean control=true;
		
		int i=0;
		
		int array[]={1,2,3};
				
		while (control) {
			try {
				System.out.print("Inserta el numero:");
				i=teclado.nextInt();
				
				System.out.println(array[i]);
				control=false;
				
			}catch(ArrayIndexOutOfBoundsException exTamano) {
				System.err.println("ERRO HAS INSERTADO UN NUMERO MAYOR AL TAMÑO DEL INDICE");
			}catch(InputMismatchException exTexto) {
				System.err.println("ERRO DE TEXTO SOLO SE ADMITEN NÚMEROS ENTEROS");
				teclado.nextLine();
			}catch(Exception exGeneral) {
				System.err.println("ERRO");
			}
		}
	}

}
