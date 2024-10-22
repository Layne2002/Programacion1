
public class variables {

	public static void main(String[] args) {
		
		// declarar varianles
		byte mes = 12;
		byte mes2 = 3;
		int contador = 0;
		int contador2 =1;
		double pi = 3.141582;
		double pi2 = 3.141582906878;
		float interes = 4.25e2F;
		float interes2 = 5.25e2F;
		char letra = 'Z';
		char letra2 = 'A';
		boolean encontrado = true;
		boolean perdido = false;
		short corto = 1300;
		short corto2 =200;
		long largo = 1000000000;
		long largo2 = 1000000;
		
		//Valores todos juntos
		System.out.println("Los valores todos juntos son el mes: " + mes + " el contador: " + contador + " pi: " + pi + " el interes: " + interes + " la letra: " + letra + " el corto: " + corto +  "el largo: " + largo + "y para terminar el encontrado: " + encontrado + ".");
				
		//imprimir valores
		System.out.println(mes); //imprimir 12
		System.out.println(contador); //imprimir 0
		System.out.println(pi); //imprimir pi
		System.out.println(interes); //imprimir 425.0
		System.out.println(letra); //imprimir Z
		System.out.println(encontrado); //imprimir true
		System.out.println(corto); //imprimir 1300
		System.out.println(largo); //imprimir 1000000000		
		
		System.out.println();
		
		System.out.println("A continuación se imprimiran los 2º valores");
		
		System.out.println();
		
		//Valores todos juntos v2
		System.out.println("Los valores todos juntos son el mes: " + mes2 + " el contador: " + contador2 + " pi: " + pi2 + " el interes: " + interes2 + " la letra: " + letra2 + " el corto: " + corto2 +  "el largo: " + largo2 + "y para terminar el encontrado: " + perdido + ".");
		
		//imprimir valores 2
		System.out.println(mes2); //imprimir 12
		System.out.println(contador2); //imprimir 0
		System.out.println(pi2); //imprimir pi
		System.out.println(interes2); //imprimir 425.0
		System.out.println(letra2); //imprimir Z
		System.out.println(perdido); //imprimir true
		System.out.println(corto2); //imprimir 1300
		System.out.println(largo2); //imprimir 1000000000
				
		System.out.println();
			
		mes2 = mes;
		contador2 = contador;
		pi2 = pi;
		interes2 = interes;
		letra2 = letra;
		perdido = encontrado;
		corto2 = corto;
		
		System.out.println("Los valores editados son:");
		
		//Valores todos juntos editados
		System.out.println("Los valores todos juntos son el mes: " + mes + " el contador: " + contador + " pi: " + pi + " el interes: " + interes + " la letra: " + letra + " el corto: " + corto +  "el largo: " + largo + "y para terminar el encontrado: " + encontrado + ".");
		
		//imprimir valores editados
				System.out.println(mes); //imprimir 12
				System.out.println(contador); //imprimir 0
				System.out.println(pi); //imprimir pi
				System.out.println(interes); //imprimir 425.0
				System.out.println(letra); //imprimir Z
				System.out.println(encontrado); //imprimir true
				System.out.println(corto); //imprimir 1300
				System.out.println(largo); //imprimir 1000000000	
	}

}