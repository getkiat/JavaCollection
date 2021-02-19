package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		/*
		 * LinkedList
		 * Benefits: 
		 * 1) stack
		 * 2) queue
		 * for FIFO & LIFO types behaviour
		 * 
		 * addFirst
		 */
		LinkedList<Employee> al = new LinkedList<Employee>(); 
		
		al.add(new Employee("Amar","mumbai","pro1"));
		al.add(new Employee("Amar2","delhi","pro2"));
		al.add(new Employee("Amar3","prune","pro3"));
		al.add(new Employee("Amar4","kl","pro4"));
		
		al.add(1,new Employee("Amar5","sg","pro5")); 	//add @ array[1], 1 is position
		al.remove(3);									//remove @ array[3]  
		
		al.addFirst(new Employee("Amar6","sg","pro6")); //linkedlist function
		al.removeFirst();
		al.removeLast();
		
		
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
