package zinnatullinKarim1238;

import java.time.LocalDate;

/*Si el socio practica fútbol, se guardará la siguiente información: nombre del equipo 
del que forma parte y su participación en cada partido: fecha, minutos jugados, goles 
marcados y kilómetros recorridos.
*/
public class PartidoFutbol extends Participacion{
	private String equipo;
	private int goles;
	private double kmRecorridos;
	
	public PartidoFutbol(int idSocio,LocalDate fecha,int minutos,int goles,double km,String equipo) {
		super(idSocio,fecha,minutos);
		this.goles = goles;
		this.kmRecorridos = km;
		this.equipo = equipo;
	}
	
	

	@Override
	public String toString() {
		return "Partido de fútbol: "+ super.toString()+", goles= " + goles + ", kmRecorridos= " + kmRecorridos+", equipo= "+equipo;
	}

}
