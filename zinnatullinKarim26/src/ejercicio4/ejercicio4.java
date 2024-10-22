/*
 * objetivo: calcular los gastos medios semanales y premiar
 * Autor: Karim Zinnatullin
 * Fecha: 6/10/2023
 */
package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// creamos las variables
		int sem1, sem2, sem3, sem4;
		String nombre, apellidos;
		Scanner sc = new Scanner(System.in);
		
		//pedimos datos al cliente
		System.out.println("Introduce el nombre del cleinte: ");
		nombre = sc.nextLine();
		System.out.println("Introduce los apellidos del cliente: ");
		apellidos = sc.nextLine();
		
		sc.nextLine();
		
		//pedimos el dinero gastado por semana
		System.out.println("Cuanto dinero se ha gastado en la primera semana del mes?");
		sem1 = sc.nextInt();
		System.out.println("Cuanto dinero se ha gastado en la segunda semana?");
		sem2 = sc.nextInt();
		System.out.println("Cuanto dinero se ha gastado en la tercera semana?");
		sem3 = sc.nextInt();
		System.out.println("Cuanto dinero se ha gastado en la cuarta semana?");
		sem4 = sc.nextInt();
		
		//calcular el gasto total y promedio
		int total = sem1+sem2+sem3+sem4;
		int promedio = total/4;
		
		//mostramos la información en pantalla
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe Gastado semana 1: " + sem1);
		System.out.println("Importe Gastado semana 2:" + sem2);
		System.out.println("Importe Gastado semana 3: " + sem3);
		System.out.println("Importe Gastado semana 4: " + sem4);
		
		System.out.println("Importe medio: " + promedio);
		
		if(total>=300) {
			System.out.println("Felicidades! Ha comprado más de 300 euros y ha conseguido un vale para 50 euros en nuestra tienda! \r\n"
					+ "Canjéelo en la caja!");
		} else {
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}

	}

}
