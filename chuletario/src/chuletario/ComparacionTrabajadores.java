package chuletario;

import java.util.Collections;

import ejercicio3.Trabajador;

public class ComparacionTrabajadores {
	
	// sobreescribimos el compareTo especificamente para este objeto para que lo
		// haga de la manera que nosotros queremos
	@Override
	public int compareTo(Trabajador otro) {
		
		//esto compara por sexo
		int comparacionSexo = this.sexo.compareTo(otro.sexo);

		if (comparacionSexo == 0) {		// esto ocurre solo si los sexos son iguales
			return this.estado.compareTo(otro.estado);
		} else {		// si no son iguales, termina la comparacion
			return comparacionSexo;
		}
	}


	private static void ordenar() {
		Collections.sort(Trabajadores);
	}

	public static void mostrarTrabajadores() {
		ordenar();
		for (Trabajador x : Trabajadores) {
			System.out.printf("%s\n", x.toString());
		}
	}
}
