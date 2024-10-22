/*Calcularemos el resto de un numero y diremos si es primo o no*/

package ejemplosFor;

import java.util.Scanner;

public class ejercicioPrimos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inserta el número que desea saver si es o no primo.");
		int num=teclado.nextInt();
		int contador=2;
		boolean primo = true;
		
		do {
			//Si encuentra un divisor no es un primo ya que el primo solo es divisible por 1 y el mismo
			if (num%contador==0 && num !=2) {
				primo=false;
			}
			//Esto contara y dividira todos los numero, en el caso de ser primo todos daran decimales
			contador ++;
			
		//Si primo es true no seguiremos dividiendo ya que sabemos que es primo
		}while(contador<num && primo==true);
		
		if (primo==true) {
		System.out.println("El numero "+num+ " es primo");
		}
		else {
			System.out.println("El numero "+num+" no es primo");
		}

	}

}
