// Autor: Karim Zinnatullin
package ejercicioB2;

import java.util.ArrayList;

public class Alumno implements Comparable<Alumno> {
	private String nombre;
	private Double media;

	private ArrayList<Double> notas = new ArrayList<>();

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public void anyadirNota(double nota) {
		this.notas.add(nota);
	}

	public double getMedia() {
		return media;
	}

	public void calcularMedia() {
		double calculo = 0;
		for (Double x : this.notas) {
			calculo = calculo + x;
		}
		calculo = (double) calculo / this.notas.size();
		this.media = calculo;
	}

	@Override
	public int compareTo(Alumno x) {
		return this.media.compareTo(x.getMedia());
	}

	@Override
	public String toString() {
		return String.format("%s, media= %.2f", nombre, media);
	}

}
