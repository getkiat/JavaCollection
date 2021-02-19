package collectiondemos;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		/*
		 * TreeSet
		 * By default comes with Sortings
		 * Therefore it requires Comparable in object class
		 */

		TreeSet<Employee> al = new TreeSet<Employee>();
		
		al.add(new Employee("Amar","mumbai","pro1"));
		al.add(new Employee("Amar2","delhi","pro2"));
		al.add(new Employee("Amar3","prune","pro3"));
		al.add(new Employee("Amar4","kl","pro4"));
		
		
		for(Employee em:al) {
			System.out.println(em); 
		}
	}
}
