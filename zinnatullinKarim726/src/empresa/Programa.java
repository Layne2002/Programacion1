// Autor:karim Zinnatullin
package empresa;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean salir = false;
		
		Empleado empleado1 = new Empleado("12345678A","Benito Pepito Pepote",1300);
		Empleado empleado2 = new Empleado("12345678B","Alberto Albororote",1370);
		Empleado empleado3 = new Empleado("12345678C","Juan Juanito",1250);
		Empleado empleado4 = new Empleado("12345678D","Emilio Delgado",4250);
		Empleado empleado5 = new Empleado("12345678E","Juan Cuesta",5250);
		
		
		Empresa empresa1 = new Empresa("Jazztel","H12345678","777777777","C/ Azafrán 4");
		Empresa empresa2 = new Empresa("Orange","C12345678","444444444","C/ Azafrán 3");
		Empresa empresa3 = new Empresa("Movistar","L12345678","222222222","C/ Azafrán 2");
		
		empresa1.anyadirEmpleado(empleado1);
		empresa2.anyadirEmpleado(empleado2);
		empresa3.anyadirEmpleado(empleado3);
		empresa3.anyadirEmpleado(empleado4);
		empresa3.anyadirEmpleado(empleado5);

		do {
			System.out.println("Elije una opcion: " + "\n1-Crear un empleado nuevo"
					+ "\n2.-Mostrar informacion de un empleado por su DNI" + "\n3.-Crear una empresa nueva"
					+ "\n4.-Añadir un empleado a una empresa"
					+ "\n5.-Borrar un empleado de una empresa"
					+ "\n6.-Mostrar la informacion de todos los empleados de una empresa"
					+ "\n7.-Mostrar el DNI y los sueldos de los empleados de una empresa"
					+ "\n8.-Calcular la suma total de sueldos brutos anuales de una empresa"
					+ "\n9.-Calcular la suma de sueldos netos de una empresa" + "\n0.- Salir");
			int opcion = input.nextInt();
			input.nextLine();
			switch (opcion) {
			case 1: {
				/*
				 * String dni, String nombre, String direccion, String telefono, int sueldo, int
				 * edad
				 */
				System.out.println("Dime el DNI del empleado:");
				String dni = input.nextLine();
				System.out.println("Dime su nombre:");
				String nombre = input.nextLine();
				input.nextLine();
				System.out.println("Dime su sueldo bruto:");
				int sueldo = input.nextInt();
				System.out.println("Dime su edad:");
				int edad = input.nextInt();
				input.nextLine();
				System.out.println("Dime su direccion:");
				String direccion = input.nextLine();
				System.out.println("Dime su telefono:");
				String telefono = input.nextLine();
				try {
					new Empleado(dni, nombre, direccion, telefono, sueldo, edad);
					System.out.println("Empleado creado con éxito!");
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 2: {
				System.out.println("Dime el DNI del empleado:");
				String dni = input.nextLine();
				System.out.printf("%s\n", Empleado.muestraEmpleado(dni));
				break;
			}
			case 3: {
				/* String nombre, String cif,String telefono,String direccion */
				System.out.println("Dime el nombre de la empresa:");
				String nombre = input.nextLine();
				System.out.println("Dime el CIF de la empresa:");
				String cif = input.nextLine();
				System.out.println("Dime el telefono de la empresa:");
				String telefono=input.nextLine();
				System.out.println("Dime su dirección:");
				String direccion = input.nextLine();
				try {
					new Empresa(nombre,cif,telefono,direccion);
					System.out.println("Empresa creada con éxito!");
				} catch (IllegalArgumentException ex) {
					System.out.printf("%s\n", ex.getMessage());
				}
				break;
			}
			case 4: {
				System.out.println("Dime el DNI del empleado que quieres contratar:");
				String dni = input.nextLine();
				System.out.println("Dime el CIF de la empresa a la que quieres meter:");
				String cif = input.nextLine();
				try {
					Empresa empresa = Empresa.getEmpresa(cif);
					empresa.anyadirEmpleado(Empleado.getEmpleado(dni));
					System.out.println("Se agregó al empleado con éxito!");
				}catch(IllegalArgumentException ex) {
					System.out.printf("%s\n",ex.getMessage());
				}
				break;
			}
			case 5: {
				System.out.println("Dime el DNI del empleado que quieres borrar:");
				String dni = input.nextLine();
				System.out.println("Dime el CIF de la empresa de la que lo quieres borrar:");
				String cif = input.nextLine();
				try {
					Empresa empresa = Empresa.getEmpresa(cif);
					empresa.eliminarEmpleado(Empleado.getEmpleado(dni));
					System.out.println("Se eliminó al empleado con éxito!");
				}catch(IllegalArgumentException ex) {
					System.out.printf("%s\n",ex.getMessage());
				}
				break;
			}
			case 6: {
				System.out.println("Dime el CIF de la empresa:");
				String cif = input.nextLine();
				try {
					Empresa empresa = Empresa.getEmpresa(cif);
					System.out.printf("%s\n",empresa.mostrarEmpleados());
				}catch(IllegalArgumentException ex) {
					System.out.printf("%s\n",ex.getMessage());
				}
				break;
			}
			case 7:{
				System.out.println("Dime el CIF de la empresa :");
				String cif = input.nextLine();
				try {
					Empresa empresa = Empresa.getEmpresa(cif);
					System.out.printf("%s\n",empresa.mostrarInfoEmpleados());
				}catch(IllegalArgumentException ex) {
					System.out.printf("%s\n",ex.getMessage());
				}
				break;
			}
			case 8:{
				System.out.println("Dime el cif de la empresa:");
				String cif = input.nextLine();
				try {
					Empresa empresa = Empresa.getEmpresa(cif);
					System.out.printf("La suma de sueldos brutos de esa empresa es: %s\n",empresa.sumaSueldosBrutos(empresa));
				}catch(IllegalArgumentException ex) {
					System.out.printf("%s\n",ex.getMessage());
				}
				break;
			}
			case 9:{
				System.out.println("Dime el cif de la empresa:");
				String cif = input.nextLine();
				try {
					Empresa empresa = Empresa.getEmpresa(cif);
					System.out.printf("La suma de sueldos netos de esa empresa es: %s\n",empresa.sumaSueldosNetos(empresa));
				}catch(IllegalArgumentException ex) {
					System.out.printf("%s\n",ex.getMessage());
				}
				break;
			}
			case 0: {
				salir = true;
				break;
			}
			default: {
				System.out.println("Elige una opción correcta!");
				break;
			}
			}
			System.out.println("\nDale a enter para continuar");
			input.nextLine();
		} while (salir == false);
		input.close();

	}

}
