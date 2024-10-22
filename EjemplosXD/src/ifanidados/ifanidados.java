/**
 * 
    "día laborable", si el contenido es lunes, martes, miércoles, jueves o viernes;
    "fin de semana", si el contenido es sábado o domingo;
    "día no válido", en cualquier otro caso.

 */

package ifanidados;

import java.util.Scanner;

public class ifanidados {

	public static void main(String[] args) {
	int dia;
	
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Insterta día de la semana: ");
		dia= teclado.nextInt();
		
		//En esta parte compribamos si es dia electivo
		if (dia >=1 && dia <=5) {
			System.out.println("Estas en semana electiva");
		}
		
		//En este vemos si es finde semana
		else if (dia >5 && dia <=7) {
			System.out.println("Estas en fin de semana es decir dias no lectivos");
		}
		
		//Y aqui damos error por parametro incorrecto
		else {
			System.out.println("Parametro " + dia + " incorrecto.");
		}
		
		
		//Haremos lo mismo pero con swich
		switch (dia){
		case 1: case 2: case 3: case 4: case 5:{
			System.out.println("Estas en semana electiva");
			break;
		}
		case 6: case 7:{
			System.out.println("Estas en fin de semana es decir dias no lectivos");
			break;
		}
		default :{
			System.out.println("Parametro " + dia + " incorrecto.");
		}
		}

	}
}
