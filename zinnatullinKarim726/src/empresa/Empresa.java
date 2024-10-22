// Autor:karim Zinnatullin
package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private final String NOMBRE, CIF;
	private String telefono, direccion;
	private List<Empleado> EmpleadosContrato = new ArrayList<>();
	private static List<String> NombresEmpresa = new ArrayList<>();
	private static List<String> CIFs = new ArrayList<>();
	private static List<Empresa> Empresas = new ArrayList<>();

	public Empresa(String nombre, String cif, String telefono, String direccion) {
		if (CIFs.contains(cif)) {
			throw new IllegalArgumentException("El DNI introducido ya pertenece a otro empleado");
		} else if (comprobarCif(cif) == false) {
			throw new IllegalArgumentException("El formato del DNI introducido es incorrecto!");
		}
		this.NOMBRE = nombre;
		this.CIF = cif;
		this.telefono = telefono;
		this.direccion = direccion;
		NombresEmpresa.add(nombre);
		CIFs.add(cif);
		Empresas.add(this);
	}

	public void anyadirEmpleado(Empleado empleado) {
		this.EmpleadosContrato.add(empleado);
		empleado.setEmpresaPertenece(this);
	}

	public void eliminarEmpleado(Empleado empleado) {
		this.EmpleadosContrato.remove(empleado);
	}

	public String mostrarEmpleados() {
		String cadena = "";
		for (Empleado empleado : this.EmpleadosContrato) {
			cadena = cadena + empleado.toString();
		}
		return cadena;
	}

	public String mostrarInfoEmpleados() {
		String cadena = "";
		for (Empleado empleado : this.EmpleadosContrato) {
			cadena = cadena + "DNI: " + empleado.getDni() + ", Sueldo bruto= " + empleado.getSueldo()
					+ ", Sueldo neto= " + empleado.getSueldoNeto() + "\n";
		}
		return cadena;
	}

	public int sumaSueldosBrutos(Empresa x) {
		int suma = 0;
		for (Empleado empleado : this.EmpleadosContrato) {
			if (x.NOMBRE.equalsIgnoreCase(empleado.getEmpresaPertenece()))
				suma = suma + empleado.getSueldoAnualBruto();
		}
		return suma;
	}
	public int sumaSueldosNetos(Empresa x) {
		int suma = 0;
		for (Empleado empleado : this.EmpleadosContrato) {
			if (x.NOMBRE.equalsIgnoreCase(empleado.getEmpresaPertenece()))
				suma = suma + empleado.calcularSueldoAnualNeto();
		}
		return suma;
	}

	public String getCif() {
		return this.CIF;
	}
	public String getNombreEmpresa() {
		return this.NOMBRE;
	}

	public static Empresa getEmpresa(String cif) {
		if (!CIFs.contains(cif)) {
			throw new IllegalArgumentException("No existe una empresa con ese CIF");
		}
		Empresa x = null;
		for (Empresa empresa : Empresas) {
			if (empresa.getCif().equals(cif)) {
				x = empresa;
			}
		}
		return x;
	}

	private boolean comprobarCif(String cif) {
		return cif.matches("^[A-Z]{1}[0-9]{8}$");
	}

	@Override
	public String toString() {
		return "Empresa: NOMBRE= " + NOMBRE + ", CIF= " + CIF + ", telefono= " + telefono + ", direccion= " + direccion
				+ ", Empleados: \n" + this.mostrarInfoEmpleados();
	}
}
