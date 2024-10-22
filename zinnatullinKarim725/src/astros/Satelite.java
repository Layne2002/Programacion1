// Autor: Karim Zinnatullin
package astros;

import java.util.ArrayList;
import java.util.List;

public class Satelite extends Astro {
	public enum Orbita {
		CIRCULAR, ELIPTICA, PARABOLICA, HIPERBOLICA
	};

	private double distanciaPlaneta1;
	private int distanciaPlaneta2;
	private Orbita orbita;
	private String pertenecePlaneta;

	static List<Satelite> Satelites = new ArrayList<>();

	public Satelite(String nombreSatelite, double masa1, int masa2, double diametro1, int diametro2,
			int periodoRotacion, int periodoTraslacion, double distancia1, int distancia2, double gravedad,
			double distanciaPlaneta1, int distanciaPlaneta2, Orbita orbita, String pertenecePlaneta) {
		super(nombreSatelite, masa1, masa2, diametro1, diametro2, periodoRotacion, periodoTraslacion, distancia1,
				distancia2, gravedad);
		if (distanciaPlaneta1 <= 0) {
			throw new IllegalArgumentException("La distancia al planeta no puede ser negativa");
		}
		this.distanciaPlaneta1 = distanciaPlaneta1;
		this.distanciaPlaneta2 = distanciaPlaneta2;
		this.orbita = orbita;
		this.pertenecePlaneta = pertenecePlaneta;
		Satelites.add(this);
		Astros.add(this);
	}

	public String getNombrePertenecePlaneta() {
		return this.pertenecePlaneta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String muestra() {
		if (this.distanciaPlaneta2 != 0) {
			return super.muestra() + " DistanciaAlPlaneta= " + distanciaPlaneta1 + "x10^" + distanciaPlaneta2
					+ " km , órbita= " + orbita + ", Planeta al que pertenece= " + pertenecePlaneta;
		} else {
			return super.muestra() + " DistanciaAlPlaneta= " + distanciaPlaneta1 + " km , órbita= " + orbita
					+ ", Planeta al que pertenece= " + pertenecePlaneta;
		}
	}

	public static String getNombreSatelites() {
		String nombres = "";
		for (Satelite nombre : Satelites) {
			nombres = nombres + String.format(" " + nombre.getNombre());
		}
		nombres = nombres + "\n";
		return nombres;
	}

	public Orbita checkOrbita(int x) {
		if (x == 1) {
			return Orbita.CIRCULAR;
		} else if (x == 2) {
			return Orbita.ELIPTICA;
		} else if (x == 3) {
			return Orbita.PARABOLICA;
		} else {
			return Orbita.HIPERBOLICA;
		}
	}
}
