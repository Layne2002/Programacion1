package ejemplo2;

import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el primer número");
		double num1 = input.nextDouble();
		System.out.println("Dime el segundo número");
		double num2 = input.nextDouble();
		input.nextLine();
		System.out.println("Que quieres que haga con lso dos números? (Suma/Resta/Multiplicacion/Division)");
		String respuesta = input.nextLine();
		input.close();
		System.out.println("Resultado: "+ calculo(num1,num2,respuesta));

	}

	
	
	
	public static double calculo(double a, double b, String operacion) {
		double resultado;
		switch (operacion) {
		case "suma","Suma","SUMA":{
			resultado = a + b;
			break;
		}
		case "resta","RESTA","Resta":{
			resultado =  a - b;
			break;
		}
		case "Multiplicacion","MULTIPLICACION","multiplicacion":{
			resultado = a * b;
			break;
		}
		case "division","Division","DIVISION":{
			resultado = a / b;
			break;
		}
		default:
			resultado = 0;
		}
		return resultado;
		
	}

}
