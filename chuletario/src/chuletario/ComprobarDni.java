package chuletario;



public class ComprobarDni {
	private boolean formatoDni(String dni) {
		return dni.matches("^[0-9]{8}[A-Z]{1}$");
	}
	
	private boolean comprobarDni(String identificador) {
		boolean existe = false;
		for (Servicio x : Servicios) {
			if (x.getId().equalsIgnoreCase(identificador)) {
				existe = true;
			}
		}
		return existe;
	}
}
