package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queues {

	/*
	 * Intended to contain a list of tasks to be processed
	 */
	public static void main(String[] args) {

		/*
		 * A PriorityQueue is intended to create a  "priority-in, priority out" 
		 * Elements are ordered & sorted, they have a priority
		 * elements of the priority queue are ordered according to their 
		 * 		natural ordering (implement Comparable)
		 * 		Comparator 
		 * A queue is characterized by a first-in first-out (FIFO) behaviour
		 */

		Client c1 = new Client(1);
		Client c2 = new Client(2);
		Client c3 = new Client(3);
		
		PriorityQueue<Client> priorityQ = new PriorityQueue<Client>();
		
		priorityQ.add(c1);
		priorityQ.add(c2);
		priorityQ.add(c3);
		priorityQ.add(c3); // allows for duplicates
		System.out.println("\nNext element is c3 :"+priorityQ.peek().equals(c3));
		System.out.println("Next element is c2 :"+priorityQ.peek().equals(c2));
		System.out.println("Next element is c1 :"+priorityQ.peek().equals(c1));
		priorityQ.poll();
		System.out.println("Next element is c3 :"+priorityQ.peek().equals(c3));
		System.out.println("Next element is c2 :"+priorityQ.peek().equals(c2));
		System.out.println("Next element is c1 :"+priorityQ.peek().equals(c1));  
				
		/*
		 * In a LinkedList elements are linked to one another => allows you to add 
		 * and remove at the beginning or the end. Convenient for implementing Stacks and Queues 
		 * Iterates slowly compared to an ArrayList but faster insertion and deletion
		 * Implements the java.util.Queue interface => implements peek(), poll(), and offer()
		 */

		LinkedList<Client> linkedList = new LinkedList<Client>();
		
		linkedList.add(c1);
		linkedList.addFirst(c2);
		linkedList.add(2, c3); // use indexes !!
		System.out.println("\nindex of c3: "+linkedList.indexOf(c3));
		System.out.println("index of c2: "+linkedList.indexOf(c2));
		linkedList.clear();
		linkedList.add(c1); // First In !!
		linkedList.add(c2);
		linkedList.add(c3);
		
		System.out.println("Next element is c1 :"+linkedList.peek().equals(c1));
		System.out.println("Next element is c2 :"+linkedList.peek().equals(c2));
		System.out.println("Next element is c3 :"+linkedList.peek().equals(c3));
		linkedList.poll();
		System.out.println("Next element is c1 :"+linkedList.peek().equals(c1));
		System.out.println("Next element is c2 :"+linkedList.peek().equals(c2));
		System.out.println("Next element is c3 :"+linkedList.peek().equals(c3));
		
	}

}
