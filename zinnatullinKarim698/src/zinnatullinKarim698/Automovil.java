package zinnatullinKarim698;

public class Automovil {
	private String Codigo;
	private String modelo;
	private final int anoFabricacion;
	private int tipoMotor; // 1 - combustion, 2 - eléctrico
	private final int velocidadMaxima;
	private int velocidadActual;

	// valores por defecto
	private final int velocidadMaximaPorDefecto = 210;
	private final int anoFabricacionPorDefecto = 2000;

	// valores maximos permitidos
	private final int anoMin = 2000;
	private final int velocidadMax = 240;

	// contadores
	private static int cantidadAutomoviles = 0;
	private static int cantidadElectricos = 0;

	public Automovil() {
		this.anoFabricacion = anoFabricacionPorDefecto;
		this.velocidadMaxima = velocidadMaximaPorDefecto;
		cantidadAutomoviles++;
		this.Codigo = generarCodigo();
		this.tipoMotor = 1;
		this.velocidadActual = 0;
		this.modelo = "Ibiza";

	}

	public Automovil(int ano, int velocidadMaxima, int tipoMotor, String modelo) {
		if (ano < anoMin) {
			throw new IllegalArgumentException("El año de fabricación no puede ser anterior al 2000");
		} else if (velocidadMaxima > velocidadMax) {
			throw new IllegalArgumentException("la velocidad máxima no peude ser superior a 240");
		} else if (tipoMotor == 1 || tipoMotor == 2) {
			cantidadAutomoviles++;
			this.anoFabricacion = ano;
			this.modelo = modelo;
			this.velocidadMaxima = velocidadMaxima;
			this.tipoMotor = tipoMotor;
			this.Codigo = generarCodigo(ano);

			if (tipoMotor == 2) {
				cantidadElectricos++;
			}
		} else {
			throw new IllegalArgumentException("El tipo de motor debe ser 1 (combustion) o 2 (electrico)");
		}

	}

	public int getVelocidadActual() {
		return this.velocidadActual;
	}

	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}

	public int getTotalAutomoviles() {
		return cantidadAutomoviles;
	}

	public int getTotalElectricos() {
		return cantidadElectricos;
	}

	public String toString() {
		if (this.tipoMotor == 1) {
			return "Automovil [Codigo=" + Codigo + ", modelo=" + modelo + ", anoFabricacion=" + anoFabricacion
					+ ", tipoMotor= combustión, velocidadMaxima=" + velocidadMaxima + ", velocidadActual="
					+ velocidadActual + "]";
		} else {
			return "Automovil [Codigo=" + Codigo + ", modelo=" + modelo + ", anoFabricacion=" + anoFabricacion
					+ ", tipoMotor= eléctrico, velocidadMaxima=" + velocidadMaxima + ", velocidadActual="
					+ velocidadActual + "]";
		}
	}

	public void aumentarVelocidad(int x) {
		if (this.velocidadActual + x > this.velocidadMaxima) {
			this.velocidadActual = this.velocidadMaxima;
			throw new IllegalArgumentException(
					"La velocidad máxima se ha intentado superar, la velocidad actual ahora es " + this.velocidadActual
							+ " km/h");
		} else {
			this.velocidadActual += x;
		}
	}

	public void bajarVelocidad(int x) {
		if (this.velocidadActual - x < 0) {
			this.velocidadActual = 0;
			throw new IllegalArgumentException("La velocidad actual no puede ser negativa, ahora es 0 km/h");
		} else {
			this.velocidadActual -= x;
		}
	}

	private String generarCodigo() {
		String cad1 = String.valueOf(anoFabricacionPorDefecto) + "-";
		String cad2 = String.valueOf(cantidadAutomoviles);
		if (cad2.length() < 4) {
			int repeticiones = 4 - cad2.length();
			String espacios = "";
			for (int i = 0; i < repeticiones; i++) {
				espacios += " ";
			}
			espacios = espacios.replace(" ", "0");
			cad2 = espacios.concat(cad2);
		}
		String cadena = cad1.concat(cad2);
		return cadena;
	}

	private String generarCodigo(int ano) {
		String cad1 = String.valueOf(ano) + "-";
		String cad2 = String.valueOf(cantidadAutomoviles);
		if (cad2.length() < 4) {
			int repeticiones = 4 - cad2.length();
			String espacios = "";
			for (int i = 0; i < repeticiones; i++) {
				espacios += " ";
			}
			espacios = espacios.replace(" ", "0");
			cad2 = espacios.concat(cad2);
		}
		String cadena = cad1.concat(cad2);
		return cadena;
	}

}
