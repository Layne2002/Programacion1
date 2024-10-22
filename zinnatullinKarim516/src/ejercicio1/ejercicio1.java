/*
 * Objetivo: Programa sobre cuentas bancarias
 * Autor: Karim Zinnatullin
 * Fecha: 18/12/2023
 */
package ejercicio1;


import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Intentando crear una cuenta privada con fecha no valida.");

		try {
			LocalDate fechaCreacion = LocalDate.of(2027, 9, 1);
			CuentaBancaria cuentaPrivada = new CuentaBancaria(1000, fechaCreacion);
		} catch (IllegalArgumentException ex) {
			System.err.println(
					"Error. Parámetros de creación de la cuenta no válidos. Fecha de creación no válida: 1/9/2027");
		}
		System.out.println("");
		System.out.println("Intentando crear una cuenta privada con fecha no valida.");

		try {
			double saldoNegativo = -200;
			CuentaBancaria cuentaPrivada = new CuentaBancaria(saldoNegativo);
		} catch (IllegalArgumentException ex) {
			System.err.println("Error. Parámetros de creación de la cuenta no válidos. Saldo inicial: -200");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Creando cuenta privada con constructor de tres parámetros...");
		LocalDate fechaCreacion = LocalDate.of(2021, 6, 1);
		CuentaBancaria cuentaPrivada = new CuentaBancaria(1000, fechaCreacion, -200);
		System.out.printf("Cuenta privada creada: %s", cuentaPrivada.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("Creando cuenta conjunta con constrictor de dos parámetros...");
		CuentaBancaria cuentaConjunta = new CuentaBancaria(200, fechaCreacion);
		System.out.printf("Cuenta conjunta creada: %s", cuentaConjunta.toString());
		System.out.println("");
		System.out.println("");
		System.out.println("Creando cuenta con valores por omisión...");
		CuentaBancaria cuentaFamiliar = new CuentaBancaria();
		System.out.printf("Cuenta familiar creada: %s", cuentaFamiliar.toString());

		System.out.println("");
		System.out.println("Prueba de los parámetros getter...");
		System.out.println("----------------------------------");
		System.out.printf("Id de cuenta: %d", cuentaPrivada.getId());
		System.out.println("");
		System.out.printf("Fecha de creación: %s", cuentaPrivada.getFechaCreacion().toString());
		System.out.println("");
		System.out.printf("Límite de descubierto: %f", cuentaPrivada.getLimiteDescubierto());
		System.out.println("");
		System.out.printf("Está embargada: %b", cuentaPrivada.isEmbargada());
		System.out.println("");
		System.out.printf("Está en descubierto: %b", cuentaPrivada.isDescubierta());
		System.out.println("");
		System.out.printf("Número de días que lleva la cuenta abierta: %s", cuentaPrivada.getDiasCuenta());
		System.out.println("");
		System.out.println("----------------------------------");
		System.out.println("Operaciones con las cuentas.");
		System.out.println("Ingresamos 100 euros en la cuenta familiar...");
		cuentaFamiliar.ingresar(100);
		System.out.println("Extraemos 100 euros de la cuenta conjunta...");
		cuentaConjunta.extraer(100);
		System.out.println("Transferimos 1100 euros de la cuenta privada a la familiar...");
		cuentaPrivada.transferir(1100, cuentaFamiliar);
		System.out.println("");
		System.out.println("Estado final de las cuentas:");
		System.out.println("----------------------------");
		System.out.printf("Estado final de la cuenta privada: %s", cuentaPrivada.toString());
		System.out.println("");
		System.out.printf("Estado final de la cuenta conjunta: %s", cuentaConjunta.toString());
		System.out.println("");
		System.out.printf("Estado final de la cuenta familiar: %s", cuentaFamiliar.toString());
	}

}
