package chatgpt;

import java.util.Scanner;

public class chatgpt {
    public static void main(String[] args) {
        // Paso 2: Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Paso 3: Pedir al usuario que ingrese dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Paso 4: Calcular el cuadrado de la diferencia dividido entre dos
        int diferencia = num1 - num2;
        double resultado = Math.pow(diferencia, 2) / 2.0;

        // Paso 5: Mostrar el resultado en la pantalla con decimales
        System.out.printf("El cuadrado de la diferencia dividido entre dos es: %.2f", resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
