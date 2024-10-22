// Autor: Karim Zinnatullin
package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Atleta {
	private String nombre;
	private int edad, altura;
	private static List<Atleta> Atletas = new ArrayList<>();

	public Atleta(String nombre, int edad, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		Atletas.add(this);
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return this.edad;
	}

	public static double promedioEdad() {
		double calculo = 0;
		for (Atleta x : Atletas) {
			calculo = calculo + x.getEdad();
		}
		calculo = (double) calculo / Atletas.size();
		return calculo;
	}

	public int getAltura() {
		return this.altura;
	}

	public static double promedioAltura() {
		double calculo = 0;
		for (Atleta x : Atletas) {
			calculo =(double)calculo+ x.getAltura();
		}
		calculo = (double) calculo / Atletas.size();
		return calculo;
	}

	public static int menoresDeEdad() {
		int calculo = 0;
		for (Atleta x : Atletas) {
			if (x.getEdad() < 18) {
				calculo++;
			}
		}
		return calculo;
	}

	public static int mayoresDeEdad() {
		int calculo;
		calculo = Atletas.size() - menoresDeEdad();
		return calculo;
	}
	
	public static String masAltoQuePromedio() {
		String cadena= "";
		for(Atleta x : Atletas) {
			if(x.getAltura()>promedioAltura()) {
				cadena = cadena + x.getNombre()+"\n";
			}
		}
		return cadena;
	}
}
