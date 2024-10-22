package Ej2;

public class Ejercicio02 {

	public static void main(String[] args) {

		int horas[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
				24 };

		double costeHora[] = new double[] { 0.02582931041, 0.012181389525, 0.011247566145, 0.010486063575,
				0.00997773719, 0.009248959062, 0.010171342226, 0.009439587187, 0.018865804935, 0.036569106603,
				0.026047702278, 0.060741309104, 0.099512385434, 0.065842891572, 0.077146071, 0.01941883078,
				0.021159517029, 0.034201384569, 0.07392343817, 0.045787041906, 0.05427833547, 0.07487213628,
				0.034118578676, 0.027883863476 };

		double precio[] = new double[] { 0.176913085, 0.162418527, 0.163008205, 0.161324055, 0.160931245, 0.156762018,
				0.151811078, 0.140889361, 0.133800035, 0.125667033, 0.108986202, 0.092593459, 0.085345099, 0.083556969,
				0.077146071, 0.08592403, 0.105271229, 0.115156177, 0.125293963, 0.144438618, 0.15376299, 0.148261656,
				0.131731964, 0.114278129 };

		System.out.printf("El precio por el día completo han sido %.2f€\n", precioDiaCompleto(costeHora));
		System.out.printf("La hora con más PRECIO ha sido la hora %d\n", horaMasPrecio(horas, precio));
		System.out.printf("La hora con más COSTE ha sido la hora %d\n", horaMasCoste(horas, costeHora));
	}

	public static double precioDiaCompleto(double[] costeHora) {
		double resultado = 0;
		for (int i = 0; i < 24; i++) {	// bucle que va sumando el coste de cada día
			resultado = resultado + costeHora[i];
		}
		return resultado;
	}

	public static int horaMasPrecio(int[] horas, double[] precio) {

		double max = precio[0];
		int resultado = 0;
		for (int i = 1; i < 24; i++) {	// bucle que encuentra el máximo y guarda la posición del array
			if (precio[i] > max) {
				max = precio[i];
				resultado = i;
			}
		}
		return horas[resultado];
	}

	public static int horaMasCoste(int[] horas, double[] costeHora) {
		double max = costeHora[0];
		int resultado = 0;
		for (int i = 1; i < 24; i++) {	// bucle que encuentra el máximo y guarda la posición del array
			if (costeHora[i] > max) {
				max = costeHora[i];
				resultado = i;
			}
		}
		return horas[resultado];

	}
}
