/*
 * Objetivo: Dado
 * Autor: Karim Zinnatullin
 * Fecha: 21/12/2023
 */
package ejercicio2;

import libtarea3.Dado;

public class ejercicio2 {

	public static void main(String[] args) {
		System.out.println("1. CONSULTA INICIAL DE VALORES INICIALES");
		System.out.println("----------------------------------------");
		System.out.printf("Número de dados creados hasta el momento: %d", Dado.getNumeroDadosCreados());
		System.out.println("");
		System.out.printf("Número de lanzamientos realizados hasta el momento: %d", Dado.getNumeroLanzamientosGlobal());
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 1: %d", Dado.getNumeroVecesCaraGlobal(1));
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 2: %d", Dado.getNumeroVecesCaraGlobal(2));
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 3: %d", Dado.getNumeroVecesCaraGlobal(3));
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 4: %d", Dado.getNumeroVecesCaraGlobal(4));
		System.out.println("");

		System.out.println("2. CREACIÓN Y LANZAMIENTO DE DADOS");
		System.out.println("----------------------------------");
		for (int i = 1; i <= 10; i++) {
			int caras = (int) (Math.random() * 9);
			try {
				System.out.print("Intento " + i + " de crear un dado...");
				Dado dado = new Dado(caras);
				System.out.printf("Correcto. Número de caras: %d", dado.getNumeroCaras());
				System.out.println();
				System.out.printf("Realizando %d tiradas...", dado.getNumeroCaras());
				for (int j = 0; j < dado.getNumeroCaras(); j++) {
					dado.lanzar();
				}
				System.out.println();
				System.out.printf("Resultados: %s", dado.getSerieHistoricaLanzamientos());
				System.out.println();
				System.out.printf("Suma total de los resultados: %d", dado.getSumaPuntuacionHistorica());
				System.out.println();
				System.out.println();
			} catch (IllegalArgumentException ex) {
				System.err.printf("Error. Número de caras no válido: %d \n", caras);

			}
		}
		System.out.println();
		System.out.println("3. ANÁLISIS FINAL DE DATOS");
		System.out.println("--------------------------");
		System.out.printf("Número de dados creados hasta el momento: %d", Dado.getNumeroDadosCreados());
		System.out.println("");
		System.out.printf("Número de lanzamientos realizados hasta el momento: %d", Dado.getNumeroLanzamientosGlobal());
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 1: %d", Dado.getNumeroVecesCaraGlobal(1));
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 2: %d", Dado.getNumeroVecesCaraGlobal(2));
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 3: %d", Dado.getNumeroVecesCaraGlobal(3));
		System.out.println("");
		System.out.printf("Número de veces que ha salido la cara 4: %d", Dado.getNumeroVecesCaraGlobal(4));

	}

}
