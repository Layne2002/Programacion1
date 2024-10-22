package zinnatullinKarim1238;

import java.time.LocalDate;


/*Si el socio practica baloncesto, se guardará la siguiente información: posición que 
ocupa (base, escolta, alero, pivot) y su participación en cada partido: fecha, minutos 
jugados, puntos, asistencias y tapones.*/
public class PartidoBaloncesto extends Participacion {
	public enum Posicion {
		BASE, ESCOLTA, ALERO, PIVOT
	}

	private Posicion posicion;
	private int puntos, asistencias, tapones;

	public PartidoBaloncesto(int idSocio, LocalDate fecha, int minutos, int puntos, int asistencias, int tapones,Posicion posicion) {
		super(idSocio, fecha, minutos);
		this.puntos = puntos;
		this.asistencias = asistencias;
		this.tapones = tapones;
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "PartidoBaloncesto: " + super.toString() + ", puntos= " + puntos + ", asistencias= " + asistencias
				+ ", tapones= " + tapones+", Posicion= "+posicion;
	}

}
