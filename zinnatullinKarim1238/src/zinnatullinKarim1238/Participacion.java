package zinnatullinKarim1238;

import java.time.LocalDate;

public abstract class Participacion {
	private final int ID_SOCIO;
	private LocalDate fecha;
	private int minutos;

	public Participacion(int idSocio, LocalDate fecha, int minutos) {
		this.ID_SOCIO = idSocio;
		this.fecha = fecha;
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return "Fecha= " + fecha + ", minutos= " + minutos;
	}

}
