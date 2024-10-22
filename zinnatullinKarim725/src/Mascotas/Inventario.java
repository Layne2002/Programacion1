// Autor: Karim Zinnatullin
package Mascotas;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	private static List<Mascota> Mascotas = new ArrayList<>();

	public static void agregarMascota(Mascota mascota) {
		Mascotas.add(mascota);
	}

	public static void eliminarMascota(Mascota mascota) {
		Mascotas.remove(mascota);
	}

	public static void vaciarInventario() {
		Mascotas.clear();
	}

	public static void mostrarMascotas() {
		if (Mascotas.isEmpty()) {
			System.out.println("El inventario está vacío!");
		} else {
			for (Mascota mascota : Mascotas) {
				System.out.println(mascota.getClass().getSimpleName() + " - " + mascota.getNombre());
			}
		}
	}

	public static void informacionMascota(String nombre) {
		for (Mascota mascota : Mascotas) {
			if (mascota.getNombre().equalsIgnoreCase(nombre)) {
				System.out.printf("%s\n", mascota.muestra());
			}
		}
	}

	public static Mascota obtenerMascota(String nombre) {
		Mascota resultado = null;
		for (Mascota mascota : Mascotas) {
			if (mascota.getNombre().equalsIgnoreCase(nombre)) {
				resultado = mascota;
			}
		}
		return resultado;
	}

	public static void datosTodasMascotas() {
		for (Mascota mascota : Mascotas) {
			System.out.print(mascota.muestra() + "\n");
		}
	}
}
