package ListasMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer,String>(); 
		map.put(12, "soy el 12");
		map.put(1, "soy el 1");
		map.put(2, "Soy el 2");
		
		// Imprimimos el Map con un Iterador
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
		  Integer key = (Integer) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}
		
		System.out.printf("\n");
		
		TreeMap<Integer, String> TreeMap = new TreeMap<Integer,String>(); 
		map.put(12, "soy el 12");
		map.put(1, "soy el 1");
		map.put(2, "Soy el 2");
		
		// Imprimimos el Map con un Iterador
		Iterator it2 = map.keySet().iterator();
		while(it2.hasNext()){
		  Integer key = (Integer) it2.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}
	}

}
