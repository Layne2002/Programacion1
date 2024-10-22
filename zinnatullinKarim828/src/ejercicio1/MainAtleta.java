// Autor: Karim Zinnatullin
package ejercicio1;

public class MainAtleta {

	public static void main(String[] args) {
		new Atleta("Alberto", 30, 198);
		new Atleta("Juan", 22, 149);
		new Atleta("Paco", 26, 168);
		new Atleta("Pablo", 15, 208);
		new Atleta("Frank", 18, 178);
		new Atleta("Don Quijote", 14, 156);
		new Atleta("Cristiano ", 40, 178);
		new Atleta("Leonel", 20, 128);
		new Atleta("Alex", 60, 198);
		new Atleta("Roberto", 10, 188);

		System.out.printf("Promedio de las edades: %.2f\n", Atleta.promedioEdad());
		System.out.printf("Promedio de las alturas: %.2f\n", Atleta.promedioAltura());
		System.out.println();
		System.out.printf("Atletas menores de edad: %d y mayores: %d", Atleta.menoresDeEdad(), Atleta.mayoresDeEdad());
		System.out.println();
		System.out.printf("Atletas que están por encima de la media de altura:\n%s", Atleta.masAltoQuePromedio());
	}

}
