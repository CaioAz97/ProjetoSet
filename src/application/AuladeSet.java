package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class AuladeSet {

	public static void main(String[] args) {

		
		Set<String> set = new LinkedHashSet<>();
		
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		
		
			for(String p : set) {
				System.out.println(p);
			}
	}

}
