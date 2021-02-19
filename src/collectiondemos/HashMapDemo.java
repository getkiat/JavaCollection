package collectiondemos;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Map
		 * Hashmap:
		 */
		HashMap<Integer,Employee> hm= new HashMap<Integer,Employee>();
		
		hm.put(101, new Employee("Amar","mumbai","pro1"));
		hm.put(102, new Employee("Amar2","mumbai","pro2"));
		hm.put(103, new Employee("Amar3","mumbai","pro3"));
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, Employee> entry : hm.entrySet());
			System.out.println("key = "+ entry.getKey() +" "+entry.getValue());
		
		
	}

}
