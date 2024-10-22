package chuletario;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class diferenciaFechas {

	public int diferenciaDeFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        int diasDiferencia = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        return diasDiferencia;
	}
	
	
	

}
