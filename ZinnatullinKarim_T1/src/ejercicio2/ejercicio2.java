/*
 * Objetivo: leer dos vectores y crear uno tercero alternando datos de los dos primeros
 * Autor: Karim Zinnatullin
 * Fecha:01/12/2023
 */
package ejercicio2;
import java.lang.Math;
public class ejercicio2 {

	public static void main(String[] args) {
		// creamos las variables y los vectores
		final int LONGITUD = 99;
		int[] vectorA = new int[LONGITUD];
		int[] vectorB = new int[LONGITUD];
		int[] vectorC = new int[LONGITUD];
		
		
		//	 un bucle para asignar valores aleatorios a los vectores A y B
		for(int i=0;i<LONGITUD;i++) {
			vectorA[i]=(int)(Math.random()*10);
			vectorB[i]=(int)(Math.random()*10);
		}
		
		int contador=0;	// contador que usaremos para el bucle
		do {
			for(int k=0;k<3;k++) { 	//	los dos bucles for se realizarán 3 veces
			vectorC[contador]= vectorA[contador];	// asignará al vector C el valor de la misma posición de vector A
			contador++;								// se sumará 1 al contador
			}
			if(contador<=96) {	// este if se encesita debido a que los vectores son de longitud 99
								// asi que el contador que hemos creado llega a 99 en el bucle for anterior
								// por lo que el bucle for de m no debería de ejecutarse una vez llegados a ese punto
			for(int m=0;m<3;m++){
			vectorC[contador]= vectorB[contador];
			contador++;			
			}
			}
		}while(contador<99);
		
		//	mostramos lso varoes de cada vector usando bucles for
		System.out.println("Vector A: ");
		for(int i = 0;i<LONGITUD;i++) {
			System.out.print(vectorA[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("Vector B: ");
		for(int i = 0;i<LONGITUD;i++) {
			System.out.print(vectorB[i]);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.println("Vector C: ");
		for(int i = 0;i<LONGITUD;i++) {
			System.out.print(vectorC[i]);
			System.out.print(" ");
		}
		
	}

}
