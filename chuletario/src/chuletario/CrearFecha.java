package chuletario;

import java.time.LocalDate;
import java.util.Scanner;

public class CrearFecha {
	@SuppressWarnings("unused")
	private LocalDate crearFecha() {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el año: ");
		int anyo = input.nextInt();
		System.out.println("Dime el mes:");
		int mes = input.nextInt();
		System.out.println("Dime el dia");
		int dia = input.nextInt();
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		input.close();
		return fecha;
	}
}
