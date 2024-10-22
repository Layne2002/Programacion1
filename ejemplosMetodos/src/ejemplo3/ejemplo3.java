package ejemplo3;

import java.util.Scanner;

public class ejemplo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el primer número");
		double num1 = input.nextDouble();
		System.out.println("Dime el segundo número");
		double num2 = input.nextDouble();
		input.nextLine();
		input.close();
		if (par(num1)) {
			System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
		} else {
			System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
		}

	}

	public static boolean par(double a) {
		if (a % 2 == 0)
			return true;
		else
			return false;
	}

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}

}
