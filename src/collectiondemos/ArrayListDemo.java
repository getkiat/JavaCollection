package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo  {
	public static void main(String[] args){
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(new Employee("Amar","mumbai","pro1"));
		al.add(new Employee("Amar2","delhi","pro2"));
		al.add(new Employee("Amar3","prune","pro3"));
		al.add(new Employee("Amar4","kl","pro4"));
		
		al.add(1,new Employee("Amar5","sg","pro5")); 	//add @ array[1], 1 is position
		al.remove(3);									//remove @ array[3]  
		
		/* Sorting
		 * comparable(implement via object class)
		 * comparator(implement via NameComparator)
		 */
		Collections.sort(al,new NameComparator());
		
		
		for(Employee em:al) {
			System.out.println(em);
		}
		
		
	}

	
}
