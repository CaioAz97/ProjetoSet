package application;

import java.util.Map;
import java.util.TreeMap;

public class AuladeMap {

	public static void main(String[] args) {
		
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email","maria@gmail.com" );
		cookies.put("phone", "55599921");
		
		
		
		cookies.remove("email");
		cookies.put("phone", "9999555511");
		
		
		System.out.println("Contains 'phone' key:  " + cookies.containsKey("phone"));
		System.out.println("Phone numbers: " + cookies.get("phone"));
		System.out.println("Emails: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All cookies: ");
				for(String key : cookies.keySet()) {
					System.out.println(key + ": " + cookies.get(key)) ;
		}
		
	}

}
