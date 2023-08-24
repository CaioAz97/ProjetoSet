package application;

import java.util.HashMap;
import java.util.Map;

import entities.PruductMap;

public class MapAulaDois {

	public static void main(String[] args) {
		
		Map<PruductMap, Double> stock = new HashMap<>();
		
		PruductMap p1 = new PruductMap("Tv", 900.0);
		PruductMap p2 = new PruductMap("Notebook", 1200.0);
		PruductMap p3 = new PruductMap("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		PruductMap ps = new PruductMap("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}

}
