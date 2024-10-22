package notadeexamen;
import java.util.Scanner;
public class notadeexamen {

	public static void main(String[] args) {
		// creamos variables
		byte aciertos, fallos;
		Scanner teclado = new Scanner(System.in);
		
		//pedimos datos
		System.out.println("Introduce el número de aciertos:");
		aciertos =teclado.nextByte();
		System.out.println("Introduce el número de fallos:");
		fallos = teclado.nextByte();
		
		//comprobamos si hay datos erroneos
		if(aciertos+fallos>20) {
			System.out.println("!!!Datos erroneos!!!");
		} else {
			double nota;
			nota = aciertos*0.5-fallos*0.25;
			if(nota<5) 
				System.out.println("La nota es un " + nota + " (INSUFICIENTE)" );
			 else if(nota<6) 
					System.out.println("La nota es un " + nota + " (SUFICIENTE)" );
				 else if(nota<7) 
						System.out.println("La nota es un " + nota + " (BIEN)" );
					else if(nota<9) 
							System.out.println("La nota es un " + nota + " (NOTABLE)" );
						else 
							System.out.println("La nota es un " + nota + " (SOBRESALIENTE)" );
				}
		

	}

}
