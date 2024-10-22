package dowhiletabla;

import java.util.Scanner;

public class dowhiletabla {

	public static void main(String[] args) {
		// creamos variables
		int inicio, fin;
		Scanner sc = new Scanner(System.in);
		// pedimos numeros
		System.out.println("dime el númo de inicio");
		inicio = sc.nextInt();
		System.out.println("Dime el número del fin");
		fin = sc.nextInt();
		sc.close();
		// creamos bucle
		do {
			System.out.println(inicio);
			inicio++;
		} while (inicio <= fin);
	}

}
