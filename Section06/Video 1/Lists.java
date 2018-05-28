package collections;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Lists {

	/*
	 * A List conserves the index of an Object & has a set of methods related to indexes
	 * List implementations (ArrayList, Vector, LinkedList) are ordered by index position
	 */
	public static void main(String[] args) {

		/*
		 * ArrayList: a dynamic size array
		 * Fast iteration and fast random access
		 * Ordered collection (by index)
		 * Not sorted
		 */

		String s1 = new String ("a");
		String s2 = new String ("b");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(s1);
		arrayList.add(1, s2);
		arrayList.add(2, s2); // ArrayList does not impose on objects to be present only once
		System.out.println("the first element is s1: "+arrayList.get(0).equals(s1));
		System.out.println("the second element is s2: "+arrayList.get(1).equals(s2));
		System.out.println("the first index element of s2: "+arrayList.indexOf(s2));
		System.out.println("the last index element of s2: "+arrayList.lastIndexOf(s2));
		
		if(arrayList.contains(s1))
			System.out.println("ArrayList contains s1");

		/*
		 * Vector: Similar to ArrayList but with synchronized methods (thread safety)
		 * Slower than ArrayList
		 * Ordered collection (by index)
		 * Not sorted
		 */
		Client c1 = new Client(1);
		Client c2 = new Client(2);
		Client c3 = new Client(3);
		
		Vector<Client> vector = new Vector<Client>();

		vector.add(c1);
		vector.add(1, c2);
		
		System.out.print("\nfirst element is c1: ");
		System.out.println(vector.firstElement() == c1);
		System.out.print("last element is c2: ");
		System.out.println(vector.lastElement() == c2);
		System.out.print("last index of c2 is: ");
		System.out.println(vector.lastIndexOf(c2));
		
		if(vector.contains(c1))
			System.out.println("vector contains c1");
		
		/*
		 * Stack extends Vector, a last-in-first-out (LIFO) stack of objects
		 * Synchronized methods (thread safety)
		 * Slower than ArrayList
		 * Ordered collection (by index)
		 * Not sorted
		 */

		Stack<Client> stack = new Stack<Client>();
		
		stack.push (c1); // First in !!
		stack.push (c2);
		stack.push (c3); // Last in !!
		stack.get(0); // index operations allowed ...
		stack.get(1);
		
		System.out.println("\nNext element is c1 :"+stack.peek().equals(c1));
		System.out.println("Next element is c2 :"+stack.peek().equals(c2));
		System.out.println("Next element is c3 :"+stack.peek().equals(c3));
		stack.pop();
		System.out.println("Next element is c1 :"+stack.peek().equals(c1));
		System.out.println("Next element is c2 :"+stack.peek().equals(c2));
		System.out.println("Next element is c3 :"+stack.peek().equals(c3));
	}
}
