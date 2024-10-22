package ejemploIf;
import java.util.Scanner;

public class ifejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Datos
		double acierto=0.5;
		double fallo=0.5;
		int preguntas=20;
		int contestado=0;
		int contestadob=0;
		int contestadom=0;
		double resultado=0;
		
		//Preparamos el scaner para que le pregunte al usuario.
				Scanner teclado = new Scanner(System.in);
				
		
		System.out.println("Cuantas preguntas has contestado bien:");
		contestadob = teclado.nextInt();
		System.out.println("Cuantas preguntas has contestado mal:");
		contestadom = teclado.nextInt();
		contestado = contestadob + contestadom;
		
		if (contestado == preguntas) {
		resultado= (contestadob * acierto) - (contestadom * fallo);
		
		System.out.println("Has sacado un: " +resultado);
		
		}
		else {
			System.out.println("ERROR");
		}
	}

}
