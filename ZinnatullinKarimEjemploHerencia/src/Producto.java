import java.time.LocalDate;

public class Producto {
	protected final int codigo;
	protected String nombre;
	protected LocalDate fechaCaducidad;
	protected int lote;

	private int contador = 1;

	public Producto() {
		this.codigo = contador;
		contador++;
		nombre = "Producto";
		if (LocalDate.now().getMonthValue() != 12) {
			if (LocalDate.now().getDayOfMonth() >= 14) {
				fechaCaducidad = LocalDate.of(LocalDate.now().getYear(), (LocalDate.now().getMonthValue()),
						(LocalDate.now().getDayOfMonth() + 14));
			} else {
				fechaCaducidad = LocalDate.of(LocalDate.now().getYear(), (LocalDate.now().getMonthValue() + 1), 1);
			}
		} else {
			fechaCaducidad = LocalDate.of((LocalDate.now().getYear() + 1), 1, 14);
		}
	}
}
