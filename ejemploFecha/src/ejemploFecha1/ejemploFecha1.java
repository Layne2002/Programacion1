package ejemploFecha1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class ejemploFecha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// son las xx horas y xx minutos del xx de diciembre de xxxx
		// mostrar meses dias horas transcurridos desde nuestro nacimiento 
		// metodo localdate anti
		LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(fecha, hora);
        String[]meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
        		"Octubre","Noviembre","Diciembre"};
       
        
        // int mesActual=(fecha.getMonth())
		System.out.println("Son las "+hora.getHour()+" y "+hora.getMinute()+" del "+fecha.getDayOfMonth()+" de "+meses[fecha.getMonthValue()-1]+""
				+ " de "+fecha.getYear());
		
	}

}
