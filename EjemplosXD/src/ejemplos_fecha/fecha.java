package ejemplos_fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class fecha {	
	
	public static void main(String[] args) {
		LocalDate hoy= LocalDate.now();
		
		System.out.println(hoy);
		
		int anoHoy=hoy.getYear();
		
		LocalDate fechaFinal=LocalDate.of(anoHoy, 12, 31);
		
		System.out.println(hoy.until(fechaFinal, ChronoUnit.DAYS));
		
		
		LocalDateTime horaHoy= LocalDateTime.now();		
		
		int horaAno=horaHoy.getYear();
		
		LocalDateTime horaFinal=LocalDateTime.of(horaAno+1, 01, 1,0,0);
		
		System.out.println(horaHoy.until(horaFinal, ChronoUnit.HOURS));
	}

}
