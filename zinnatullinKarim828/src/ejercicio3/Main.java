package ejercicio3;

import ejercicio3.Trabajador.Estado;
import ejercicio3.Trabajador.Sexo;

public class Main {

	public static void main(String[] args) {
		new Trabajador("Alberto",40,Sexo.HOMBRE,Estado.CASADO,2000);
		new Trabajador("Juan",29,Sexo.HOMBRE,Estado.SOLTERO,1000);
		new Trabajador("Paula",35,Sexo.MUJER,Estado.CASADO,3000);
		new Trabajador("Candela",20,Sexo.MUJER,Estado.SOLTERO,2200);
		new Trabajador("Jorge",63,Sexo.HOMBRE,Estado.DIVORCIADO,3500);
		new Trabajador("Angela",40,Sexo.MUJER,Estado.CASADO,5200);
		new Trabajador("Pedro",30,Sexo.HOMBRE,Estado.SOLTERO,3300);
		new Trabajador("Cristina",47,Sexo.MUJER,Estado.DIVORCIADO,2250);
		
		System.out.println("1: Mostrando todos los trabajadores ordenados por sexo y estado civil");
		Trabajador.mostrarTrabajadores();
		
		
		System.out.printf("\nla cantidad de trabajadores del sexo masculino es %d",Trabajador.cantidadHombres());
		System.out.printf("\nLa cantidad de trabajadoras casadas es %d",Trabajador.cantidadMujeresCasadas());
		System.out.printf("\nSuma de todos los sueldos: %d",Trabajador.sumaSueldos());
	}

}
