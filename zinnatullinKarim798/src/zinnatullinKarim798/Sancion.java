// Autor: karim Zinnatullin
package zinnatullinKarim798;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Sancion {
	public enum tipo {
		APARCAMIENTO, VELOCIDAD, ALCOHOLEMIA
	}

	private String lugar;
	private final String MATRICULA;
	private LocalDate fechaHora;
	private tipo tipo;
	private double importe;
	private boolean grua;
	private int velocidadSobrepasada;
	private double decimasAcohol;

	private static List<Sancion> Sanciones = new ArrayList<>();
	private static List<String> Matriculas = new ArrayList<>();

	public Sancion(String matricula, String lugar, LocalDate fechaHora, tipo tipo, boolean grua,
			int velocidadSobrepasada, double alcohol) {
		this.MATRICULA = matricula;
		this.lugar = lugar;
		this.fechaHora = fechaHora;
		this.tipo = tipo;
		if (tipo == tipo.APARCAMIENTO)
			this.grua = grua;
		if (tipo == tipo.VELOCIDAD)
			this.velocidadSobrepasada = velocidadSobrepasada;
		if (tipo == tipo.ALCOHOLEMIA)
			this.decimasAcohol = alcohol;

		this.importe = calcularImporte();

		Sanciones.add(this);
		Matriculas.add(matricula);
	}
	private String getMatricula() {
		return this.MATRICULA;
	}
	
	public static String mostrarSanciones() {
		String cadena="";
		for (Sancion sancion : Sanciones) {
			
				cadena=cadena+String.format("\n"+sancion.toString());
			
			
		}
		return cadena;
	}
	
	public static String mostrarSancionesMatricula(String matricula) {
		String cadena="";
		for (Sancion sancion : Sanciones) {
			if(matricula.equals(sancion.getMatricula())){
				cadena=cadena+String.format("\n"+sancion.toString());
				
			}
		}
		return cadena;
	}
	
	private double calcularImporte() {
		double calculo;
		if (this.tipo == tipo.APARCAMIENTO) {
			if (this.grua == true)
				calculo = 150;
			else
				calculo = 50;
		} else if (this.tipo == tipo.VELOCIDAD) {
			calculo = this.velocidadSobrepasada * 10;
		} else {
			calculo = (this.decimasAcohol * 50) + 100;
		}
		return calculo;
	}


	public String toString() {
		if (this.tipo == tipo.APARCAMIENTO) {
			if (this.grua == true) {
				return "Sancion [lugar=" + lugar + ", MATRICULA=" + MATRICULA + ", fechaHora=" + fechaHora + ", tipo="
						+ tipo + ", importe=" + importe + ", grua=SI]";
			} else {
				return "Sancion [lugar=" + lugar + ", MATRICULA=" + MATRICULA + ", fechaHora=" + fechaHora + ", tipo="
						+ tipo + ", importe=" + importe + ", grua=NO]";
			}
		} else if (this.tipo == tipo.VELOCIDAD) {
			return "Sancion [lugar=" + lugar + ", MATRICULA=" + MATRICULA + ", fechaHora=" + fechaHora + ", tipo="
					+ tipo + ", importe=" + importe + "velocidad sobrepasada=" + this.velocidadSobrepasada + " Km/h]";

		} else {
			return "Sancion [lugar=" + lugar + ", MATRICULA=" + MATRICULA + ", fechaHora=" + fechaHora + ", tipo="
					+ tipo + ", importe=" + importe + ", décimas de alcohol sobrepasadas=" + this.decimasAcohol + "]";
		}
	}

}
