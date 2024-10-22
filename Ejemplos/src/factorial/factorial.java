package factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// variablessssssssss
		
		long resultado, num, inicial;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número del que quieres un factorial (Máximo 40)");
		num = sc.nextByte();
		sc.close();
		inicial = num;
		resultado = 1;
		
		while (num >= 2) {
			resultado *= num * (num - 1);
			num -= 2;
		}

		System.out.println(inicial + "! = " + resultado);
	}

}
