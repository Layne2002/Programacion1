package ejemplosFor;

import java.util.Scanner;

public class ejemploFor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Inserta el numero del 1 al 10 que quieres la tabla de multiplicar");
		int calc=teclado.nextInt();
		
		if ( calc >= 1 && calc <= 10) {
			for (int i = 1; i <=10; i++) {
				System.out.println((calc * i));
			}
		}
		else {
			System.out.println("El número "+ calc +" no es un numero de la tabla de multiplicar");
		}
		
		System.out.println();
		
		for (int i =1;i<=10;i++) {
			System.out.println("Hola" + i);
		}
		
		System.out.println();
		/*variable contador nº de veces que se va a ejecutar sumamos 1 al contador i*/
		for (int i =(-1); i>=(-10); i--) {
			System.out.println("Hola" + i);
		}
		
		int numero=1;
		while ( numero<=10 ) {
			System.out.println();
			System.out.println("Hola" + (numero ++));
			
		}
		
		
		System.out.println("Inserta el numero del inicio");
		int numero2=teclado.nextInt();
		
		System.out.println("Inserta el numero del fin");
		int fin=teclado.nextInt();
		
		if (numero2 <= 100 && numero >=0) {
		do {
		System.out.println((numero2 ++));
		
		}while (numero2 <= fin) ;
		}
		else {
			System.out.println("El numero insertado no es valido");
		}
		
		
	}
}
