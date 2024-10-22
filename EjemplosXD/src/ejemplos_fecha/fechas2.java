package ejemplos_fecha;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class fechas2 {

	public static void main(String[] args) {
		
		LocalDate aora=LocalDate.now();
		LocalDate cumple=LocalDate.of(2004, 2, 13);
		
		/*aora.format(DateFormatter.ISO_LOCAL_DATE);*/
		/*cumple.format(TimeFormatter.ISO_LOCLA_TIME);*/
		
		System.out.println("Son las "+LocalTime.now()+" y estamos a "+LocalDate.now()+".");

		System.out.println("Tengo:"+cumple.until(aora, ChronoUnit.YEARS)+" años.");
	}

}
