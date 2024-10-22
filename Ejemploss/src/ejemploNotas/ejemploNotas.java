package ejemploNotas;

import java.util.Scanner;

public class ejemploNotas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce la cantidad de alumnos:");
		int N = input.nextInt();
		input.nextLine();
		double[][] notas = new double[N][4];
		String[] asignaturas = new String[4];
		String[] nombres = new String[N];

		for (int i = 0; i < 4; i++) {
			System.out.println("introduce el nombre de la asignatura " + (i + 1));
			asignaturas[i] = input.nextLine();
		}
		System.out.println("");

		for (int i = 0; i < N; i++) {
			System.out.println("Introduce el nombre del alumno numero " + (i + 1));
			nombres[i] = input.nextLine();
			input.nextLine();
			for (int j = 0; j < 4; j++) {
				System.out.println("Introduce la nota de " + asignaturas[j] + " de " + nombres[i]);
				notas[i][j] = input.nextDouble();
			}
			input.nextLine();
			System.out.println("");
		}
		String fila = new String("Nombre");
		for (int i = 0; i < 4; i++) {
			fila = fila.concat(" | " + asignaturas[i]);
		}
		System.out.println(fila);
		System.out.println("---------------------------------------------");
		for (int i = 0; i < N; i++) {
			fila = (nombres[i]);
			for (int j = 0; j < 4; j++) {
				fila = fila.concat("  |  " + notas[i][j]);
			}
			System.out.println(fila+" |");
		}
		double media,suma;
		
		for(int i = 0;i<4;i++) {
			suma = 0;
			for(int j=0;j<N;j++) {
				suma +=notas[j][i];
			}
			media = suma/N;
			System.out.println("Nota media de "+asignaturas[i]+": "+media);
		}
		
		System.out.println("Alumnos con las notas más altas en cada asignatura:");
		
		
	}

}
