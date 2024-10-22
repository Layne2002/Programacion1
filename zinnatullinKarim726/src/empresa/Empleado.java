// Autor:karim Zinnatullin
package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	public final String DNI;
	private String nombre, telefono, direccion;
	private int sueldo, edad;
	private String empresaPertenece;
	private static List<String> DNIs = new ArrayList<>();
	private static List<Empleado> Empleados = new ArrayList<>();

	public Empleado(String dni, String nombre, String direccion, String telefono, int sueldo, int edad) {
		if (DNIs.contains(dni)) {
			throw new IllegalArgumentException("El DNI introducido ya pertenece a otro empleado");
		} else if (comprobarDni(dni) == false) {
			throw new IllegalArgumentException("El formato del DNI introducido es incorrecto!");
		} else if (edad < 16) {
			throw new IllegalArgumentException("La edad no puede ser menor a la edad minima legal, ni negativa");
		}
		this.DNI = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		DNIs.add(dni);
		Empleados.add(this);
	}

	public Empleado(String dni, String nombre, int sueldo) {
		if (DNIs.contains(dni)) {
			throw new IllegalArgumentException("El DNI introducido ya pertenece a otro empleado");
		} else if (comprobarDni(dni) == false) {
			throw new IllegalArgumentException("El formato del DNI introducido es incorrecto!");
		}
		this.DNI = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.edad = 30;
		this.telefono = "Sin telefono";
		this.direccion = "Sin dirección";
	}
	
	public String getEmpresaPertenece() {
		return this.empresaPertenece;
	}
	public void setEmpresaPertenece(Empresa x){
		this.empresaPertenece =x.getNombreEmpresa();
	}
	
	public static String muestraEmpleado(String dni) {
		String cadena = "No existe tal empleado";
		for (Empleado empleado : Empleados) {
			if (empleado.getDni().equals(dni)) {
				cadena = empleado.toString();
			}
		}
		return cadena;
	}

	public int getSueldoAnualBruto() {
	return this.sueldo * 12;	
	}
	public int calcularSueldoAnualNeto() {
		int sueldo = this.sueldo * 12;
		if (sueldo < 12000)
			return (int) (sueldo * 0.8);
		else if (sueldo < 25000)
			return (int) (sueldo * 0.7);
		else
			return (int) (sueldo * 0.6);
	}

	public int getSueldoNeto() {
		if (sueldo < 12000)
			return (int) (sueldo * 0.8);
		else if (sueldo < 25000)
			return (int) (sueldo * 0.7);
		else
			return (int) (sueldo * 0.6);
	}
	
	private boolean comprobarDni(String dni) {
		return dni.matches("^[0-9]{8}[A-Z]{1}$");
	}

	public String getDni() {
		return DNI;
	}

	public int getSueldo() {
		return sueldo;
	}


	public static Empleado getEmpleado(String dni) {
		if(!DNIs.contains(dni)) {
			throw new IllegalArgumentException("No existe un empleado con ese DNI");
		}
		Empleado x = null;
		for(Empleado empleado : Empleados) {
			if(empleado.getDni().equals(dni)) {
				x =empleado;
			}
		}
		return x;
	}

	@Override
	public String toString() {
		return "Empleado: DNI= " + DNI + ", nombre= " + nombre + ", telefono= " + telefono + ", direccion= " + direccion
				+ ", sueldo= " + sueldo  +", edad= " + edad+"\n";
	}

}
