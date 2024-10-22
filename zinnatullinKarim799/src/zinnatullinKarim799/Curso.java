/*
 * Autor: Karim Zinnatullin
 */
package zinnatullinKarim799;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	private final int ID;
	private String nombre,descripcion;
	private double precio;
	private int maxAlumnos;
	private int contador;
	private static Set<String> Cursos = new HashSet<>();
	
	public Curso(String nombre,String descripcion,int numMax,double precio) {
		if (Cursos.contains(nombre)) {
			throw new IllegalArgumentException("El curso  " + nombre + " ya estiste");
		} else {
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.ID = contador;
			this.precio = precio;
			this.maxAlumnos = numMax;
			this.contador = 0;
		}
	}
	
	public void matricularSocio(String dni,String nombre) {
		if (Socio.DNIs.contains(dni)) {
			if(Cursos.contains(nombre)) {
				if(this.contador <this.maxAlumnos) {
					this.contador++;
					
				}else {
					new IllegalArgumentException("El maximo de alumnos para este curso es "+this.maxAlumnos);
				}
			}else {
				new IllegalArgumentException("No existe ningun curso llamado "+nombre);
			}
		}else {
			new IllegalArgumentException("El DNI  " + dni + " no pertenece aningun socio existente");
		}
	}
	
	public String getNombreCurso() {
		return this.nombre;
	}
	public double getPrecio() {
		return this.precio;
	}
}
