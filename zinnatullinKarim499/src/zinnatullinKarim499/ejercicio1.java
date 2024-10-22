/*
 * Objetivo: Hacer un programa meteorologico
 * Autor: Karim Zinnatullin
 * Fecha: 15/12/2023
 */
package zinnatullinKarim499;

public class ejercicio1 {

	public static void main(String[] args) {
		int[][] lluvia = { { 26, 29, 26 }, { 19, 2, 24 }, { 21, 8, 1 }, { 11, 5, 24 }, { 9, 2, 12 }, { 7, 20, 19 },
				{ 29, 12, 28 }, { 11, 10, 20 }, { 7, 11, 5 }, { 21, 13, 29 }, { 26, 16, 10 }, { 7, 10, 18 },
				{ 28, 4, 28 }, { 29, 14, 7 }, { 14, 23, 13 }, { 11, 29, 2 }, { 20, 13, 27 }, { 25, 21, 11 },
				{ 1, 3, 19 }, { 29, 21, 15 }, { 15, 15, 20 }, { 24, 21, 21 }, { 25, 12, 25 }, { 8, 4, 8 },
				{ 26, 10, 21 }, { 26, 2, 7 }, { 30, 29, 23 }, { 15, 20, 20 }, { 5, 27, 0 }, { 8, 28, 24 } };
		String[] meses = { "Septiembre", "Octubre", "Noviembre" };

		System.out.println("Para " + meses[0] + ", el dia que más llovió fue el dia " + maxLluvia(lluvia, 0));
		System.out.println("Para " + meses[1] + ", el dia que más llovió fue el dia " + maxLluvia(lluvia, 1));
		System.out.println("Para " + meses[2] + ", el dia que más llovió fue el dia " + maxLluvia(lluvia, 2));
		System.out.println("----------------------------------------------------");
		System.out.println("El mes menos llovioso fue " + meses[mesMenosLluvioso(lluvia)]);
		System.out.println("El dia que menos llovió solo hubo " + minLluvia(lluvia, mesMenosLluvioso(lluvia))
				+ " litro(s) de agua.");
		System.out.println("----------------------------------------------------");
		System.out.println("La media de litros entre los 3 meses fue de " + mediaTotal(lluvia) + " litros,");
		mesesEncimaMedia(lluvia, meses);

	}

	public static int maxLluvia(int[][] lluvia, int a) { // Funcion para calcular el día que más llovió del mes
															// requerido
		int max = lluvia[0][a];
		int dia = 0;
		for (int i = 1; i < 30; i++) { // recorremos todo el array comprobando por el valor maximo
			if (lluvia[i][a] > max) {
				max = lluvia[i][a];
				dia = i;
			}
		}
		return dia + 1; // se suma 1 al valor que devuelve por como funcionan los array, ya que empiezan
						// a contar en el 0
	}

	public static int minLluvia(int[][] lluvia, int a) { // Lo mismo que la funcion de arriba pero para el minimo
		int min = lluvia[a][0];

		for (int i = 1; i < 30; i++) {
			if (lluvia[i][a] < min) {
				min = lluvia[i][a];

			}
		}
		return min;
	}

	public static int mesMenosLluvioso(int[][] lluvia) { // Funcion para saber que més tuvo más cantidad de lluvia
															// vertida
		double media0 = mediaMes(lluvia, 0);
		double media1 = mediaMes(lluvia, 1);
		double media2 = mediaMes(lluvia, 2);

		double mediaMinima = minimo(minimo(media0, media1), media2); // sacamos el minimo entre las 3 medias
		if (mediaMinima == media0)
			return 0;
		else if (mediaMinima == media1)
			return 1;
		else
			return 2;
	}

	public static double mediaMes(int[][] lluvia, int mes) {
		int sumatorio = 0;
		for (int i = 1; i < 30; i++) {
			sumatorio += lluvia[i][mes];
		}
		double media = (double) sumatorio / 30;
		return media;
	}

	public static double mediaTotal(int[][] lluvia) { // Funcion para sacar la media total de los 3 meses
		double sumatorio = 0;
		for (int mes = 0; mes < 3; mes++) {
			for (int dia = 0; dia < 30; dia++) {
				sumatorio += lluvia[dia][mes];
			}
		}
		return sumatorio / 90;
	}

	public static double minimo(double a, double b) { // simple función para sacar el mínimo entre dos números
		if (a > b)
			return a;
		else
			return b;
	}

	public static void mesesEncimaMedia(int[][] lluvia, String[] meses) { // Funcion para sacar en pantalla
		for (int i = 0; i < 3; i++) { // Aquellos meses que están por encima de la media total
			if (mediaMes(lluvia, i) > mediaTotal(lluvia)) {
				System.out.println("En " + meses[i] + " se virtió más litros que la media, siendo "
						+ mediaMes(lluvia, i) + " litros.");
			}
		}
	}
}
