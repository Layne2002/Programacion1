package mobiliario;

public class Almacenaje extends Mueble implements Personalizable {
	private double anchura;
	private double altura;
	public final int MAX_MODULOS_ANYADIR;
	private Modulo[] modulos;
	protected int numModulosAnyadidos;

	public static final int MIN_MODULOS = 1;
	public static final int MAX_MODULOS = 20;

	public Almacenaje(double precio, String descripcion, double anchura, double altura, int MAX_MODULOS_ANYADIR) {
		super(precio, descripcion);
		if (MAX_MODULOS_ANYADIR < MAX_MODULOS || MAX_MODULOS_ANYADIR > MIN_MODULOS) {
			throw new IllegalArgumentException(
					"ERROR: No se puede crear el mueble de Almacenaje. El número de módulos no está en el rango permitido: "
							+ MAX_MODULOS_ANYADIR);
		} else {
			this.anchura = anchura;
			this.altura = altura;
			this.MAX_MODULOS_ANYADIR = MAX_MODULOS_ANYADIR;
			this.modulos = new Modulo[MAX_MODULOS_ANYADIR];
			this.modulos[0] = Modulo.BALDA;
			this.numModulosAnyadidos = 1;
		}
	}

	public double getAnchura() {
		return anchura;
	}

	public double getAltura() {
		return altura;
	}

	public int getNumModulos() {
		return MAX_MODULOS_ANYADIR;
	}

	public int getModulosAnyadidos() {
		return numModulosAnyadidos;
	}

	public String toString() {
		String cadena = String.format("T%s Anchura: .2f Altura: .2f Módulos máximos: %d Módulos añadidos: %d",
				super.toString(), this.anchura, this.altura, this.MAX_MODULOS_ANYADIR, this.numModulosAnyadidos);
		return cadena;
	}

	public String obtenerModulos() {
		return modulos.toString();
	}

	public void anyadirModulo(Modulo modulo) {
		if (modulo == null) {
			throw new NullPointerException("Error: el módulo a añadir no puede ser nulo");
		} else if (this.numModulosAnyadidos == this.MAX_MODULOS_ANYADIR) {
			throw new IllegalStateException(
					"Error: no se puede añadir el módulo XXX. El número de módulos no puede superar el máximo permitido: "
							+ this.MAX_MODULOS_ANYADIR);
		} else {
			this.numModulosAnyadidos++;
			this.modulos[this.numModulosAnyadidos] = modulo;
		}
	}

	public Modulo extraerModulo() {
		if (this.numModulosAnyadidos == MIN_MODULOS) {
			throw new IllegalStateException(
					"Error: no se puede quitar el módulo. El número de módulos no puede ser inferior a " + MIN_MODULOS);
		} else {
			Modulo x = this.modulos[this.numModulosAnyadidos];
			this.modulos[this.numModulosAnyadidos] = null;
			this.numModulosAnyadidos--;
			return x;
		}
	}
}
