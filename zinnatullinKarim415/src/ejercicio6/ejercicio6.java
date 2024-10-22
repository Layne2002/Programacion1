/*
 * Objetivo:
 * Autor: Karim Zinnatullin
 * Fecha: 18/12/2023
 */
package ejercicio6;

public class ejercicio6 {

	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas,
			int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {

		if (proyectosTerminados == false) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los \r\n" + "proyectos acordados");
			return false;
		} else if ((salarioJefe + salarioEncargado + salarioOficinistas) > 20000) {
			System.out.println("No ha pasado la auditoría ya que el gasto en personal es de ... y \r\n"
					+ "excede el límite mensual de 20.000 euros");
			return false;
		} else if (presupuestoEmpresa > 100000) {
			System.out.println("\"No ha pasado la auditoría ya que el presupuesto \r\n"
					+ "asignado de .... excede el límite establecido de 100.000 euros");
			return false;
		} else {
			System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
			return true;
		}

	}

}
