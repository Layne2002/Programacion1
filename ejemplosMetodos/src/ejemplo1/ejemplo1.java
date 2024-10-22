package ejemplo1;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el primer número");
		double num1 = input.nextDouble();
		System.out.println("Dime el segundo número");
		double num2 = input.nextDouble();
		input.nextLine();
		System.out.println("Que quieres que haga con lso dos números? (Suma/Resta)");
		String respuesta = input.nextLine();
		input.close();
		if (respuesta.equals("suma")) {
			System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
		} else {
			System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
		}

	}

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}
}
