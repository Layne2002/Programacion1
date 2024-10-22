package Ej1;

import libtarea3.CuentaBancaria;
import java.util.Random;
import java.time.LocalDate;

public class Ejercicio01 {
	// APARTADO 1
	public static double saldoAleatorio() {
		Random random = new Random();
		return random.nextDouble(201) - 100;
	}

	public static void main(String[] args) {
		// APARTADO 2
		CuentaBancaria cuenta1;
		CuentaBancaria cuenta2;
		CuentaBancaria cuenta3;
		CuentaBancaria cuenta4;
		CuentaBancaria cuenta5;

		// APARTADO 3
		System.out.println("Inteantando crear cuenta con saldo inicial aleatorio, fecha actualy y limite de 50...");
		try {
			double saldo1 = saldoAleatorio();
			LocalDate fecha1 = LocalDate.now();
			double limite1 = 50;
			cuenta1 = new CuentaBancaria(saldo1, fecha1, limite1);
			System.out.printf("%s\n", cuenta1.toString());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 4
		System.out.println("\nIntentando crear una cuenta con fecha 1/1/1700...");

		try {
			double saldo2 = 50;
			LocalDate fecha2 = LocalDate.of(1700, 1, 1);
			cuenta2 = new CuentaBancaria(saldo2, fecha2);
			System.out.printf("%sº", cuenta2.toString());
		} catch (IllegalArgumentException ex) {
			cuenta2 = new CuentaBancaria();
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 5
		cuenta3 = new CuentaBancaria();
		System.out.printf("\nCuenta 3: %s\n", cuenta3.toString());

		// APARTADO 6
		System.out.println();
		System.out.println("Intentando ingresar un valor aleatorio en la cuenta 1...");
		cuenta1 = new CuentaBancaria(); // Este objeto lo creo porque en el apartado 3 salta el try-catch
		try {
			cuenta1.ingresar(saldoAleatorio());
			System.out.printf("%s\n", cuenta1.toString());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 7
		System.out.println();
		System.out.println("Intentando ingresar un valor aleatorio en la cuenta 3...");

		try {
			cuenta3.ingresar(saldoAleatorio());
			System.out.printf("%s\n", cuenta3.toString());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 8
		cuenta4 = cuenta3;

		// APARTADO 9
		System.out.println();
		System.out.println("Intentando embargar el 50% de la cuenta 4...");
		try {
			cuenta4.embargar(50);
			System.out.printf("%s\n", cuenta4.toString());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 10
		System.out.println();
		System.out.println("Intentando copiar los datos de la cuenta 4 a la cuenta 5...");
		try {
			cuenta5 = new CuentaBancaria(cuenta4.getSaldo(), cuenta4.getFechaCreacion(),
					cuenta4.getLimiteDescubierto());
			System.out.printf("%s\n", cuenta5.toString());
		} catch (IllegalArgumentException ex) {
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 11
		System.out.println();
		System.out.println("Intentando extraer un valor aleatorio de la cuenta 5...");
		try {
			cuenta5 = new CuentaBancaria(cuenta4.getSaldo(), cuenta4.getFechaCreacion(),
					cuenta4.getLimiteDescubierto());
			cuenta5.extraer(saldoAleatorio());
			System.out.printf("%s\n", cuenta1.toString());
		} catch (IllegalArgumentException ex) {
			cuenta5 = new CuentaBancaria();
			System.err.printf("%s\n", ex.getMessage());
		} catch (IllegalStateException ex) {
			cuenta5 = new CuentaBancaria();
			System.err.printf("%s\n", ex.getMessage());
		}

		// APARTADO 12
		System.out.println();
		System.out.println("Mostrando información de todas las cuentas:");
		System.out.printf("%s\n", cuenta1.toString());
		System.out.printf("%s\n", cuenta2.toString());
		System.out.printf("%s\n", cuenta3.toString());
		System.out.printf("%s\n", cuenta4.toString());
		System.out.printf("%s\n", cuenta5.toString());

		// APARTADO 13
		System.out.println();
		System.out.printf("Saldo Global: %s\n", CuentaBancaria.getSaldoGlobal());
		System.out.printf("Número de cuentas embargadas: %s\n", CuentaBancaria.getNumCuentasEmbargadas());

	}

}
