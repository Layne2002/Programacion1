/*Calcularemos el numero factorial que es el numero x por sus anteriores*/

package calcularFactorialDeUnNumero;

import java.util.Scanner;

public class actividad {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta el número que desea sacarle el factoraial");
		int fact=teclado.nextInt();
		long resultado=fact;
		
			
		if (fact == 0) {
			resultado=1;
			}
		else {
			for (int i=1;i<fact;i++) {
				resultado=resultado*i;
				System.out.println(resultado);
			}
		}
			
		//Forma correcta de hacerlo
		int contador=1;
		resultado=fact;
		do {
			resultado=resultado*contador;
			System.out.println(resultado);
			contador++;
		}while (contador != fact);
		
		
		System.out.println("El factoraial del numero es "+resultado+" .");
	}

}
