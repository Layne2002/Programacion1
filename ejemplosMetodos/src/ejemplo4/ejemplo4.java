package ejemplo4;

import java.util.Scanner;

public class ejemplo4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el primer número");
		double num1 = input.nextDouble();
		System.out.println("Dime el segundo número");
		double num2 = input.nextDouble();
		input.nextLine();
		System.out.println("Que quieres que haga con los dos números? (+, -, *, /, %)");

		char respuesta = input.nextLine().charAt(0);
		input.close();

		

		if (operacionValida(respuesta)) {
			double resultado = calculo(num1, num2, respuesta);
			System.out.println("Resultado: " + resultado);
		} else {
			System.out.println("Operacion no válida");
		}

	}

	// metodo validar operacion

	public static boolean operacionValida(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
			return true;
		} else {
			return false;
		}
	}

	public static double calculo(double a, double b, char c) {

		switch (c) {
		case '+': {
			return a + b;

		}
		case '-': {
			return a - b;

		}
		case '*': {
			return a * b;

		}
		case '/': {
			return a / b;

		}
		case '%': {
			return a % b;

		}
		default:
			return -494949.49494949;
		}

	}

}
