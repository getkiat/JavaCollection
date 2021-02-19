package collectiondemos;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet<Employee> al = new HashSet<Employee>();
		
		al.add(new Employee("Amar","mumbai","pro1"));
		al.add(new Employee("Amar2","delhi","pro2"));
		al.add(new Employee("Amar3","prune","pro3"));
		al.add(new Employee("Amar4","kl","pro4"));
		
		for(Employee em:al) {
			System.out.println(em); //unpredictable result
		}
	}

}
