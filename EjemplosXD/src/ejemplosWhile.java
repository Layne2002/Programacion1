import java.util.Scanner;

public class ejemplosWhile {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int suma=0, num=0, contador=0, contador2=0;
	
	
	do {
		System.out.println("Inserta un numero");
		num = teclado.nextInt();
		
		if (num < 0) {
			System.out.println("El número "+num+" no es positivo");
		}
		else {
			if (num %2!=0) {
				System.out.println("El número "+num+" no es par");
				contador+=num;
			}
			else if (num!=0){
				System.out.println("El número "+num+" es par");
				contador2+=num;
			}
		}
		
	}while (num !=0);
	
	System.out.println("La duma de los pares es "+contador2+" .");
	System.out.println("La duma de los impares es "+contador+" .");


	}

}
