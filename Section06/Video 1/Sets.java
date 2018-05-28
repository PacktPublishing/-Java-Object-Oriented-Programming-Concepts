package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	/*
	 * Sets do not allow object duplicates, in a set every object appears only once
	 * Relies on the equals() method to establish that objects are duplicates 
	 */
	public static void main(String[] args) {

		Client c1 = new Client(1);
		Client c2 = new Client(2);
		Client c3 = new Client(3);
		
		/*
		 * HashSet
		 * unsorted & unordered
		 * uses hashCode() to define where to store an object and where to fetch it 
		 */
		HashSet<Client> hashSet = new HashSet<Client>();
		
		hashSet.add(c1);
		hashSet.add(c2);
		hashSet.add(c3);
		System.out.println("Size of the Set: "+hashSet.size());
		//hashSet.add(1, c2); // no concept of index
		//hashSet.get(0); // no concept of index
		System.out.println("attempt to add the same object again: "+hashSet.add(c1));
		System.out.println("c1 is removed form the Set: "+hashSet.remove(c1));
		System.out.println("c2 is removed form the Set: "+hashSet.remove(c2));
		if(hashSet.contains(c3))
			System.out.println("Set contains c3");
		
		/*
		 * LinkedHashSet
		 * Ordered (objects are linked to one another)
		 */
		
		LinkedHashSet<Client> linkedHashSet = new LinkedHashSet<Client>() ;
		
		linkedHashSet.add(c2);
		linkedHashSet.add(c1);
		linkedHashSet.add(c3);
		System.out.println("\nSize of the Set: "+linkedHashSet.size());
		System.out.println("attempt to add the same object again: "+linkedHashSet.add(c1));
		// A linked set iterates faster than ones that are not linked !! 
		Iterator<Client> it =  (Iterator<Client>) linkedHashSet.iterator();
		int i=0;
		for(Client v : linkedHashSet){
			System.out.println("element "+i+" is c1 : "+v.equals(c1));
			System.out.println("element "+i+" is c2 : "+v.equals(c2));
			System.out.println("element "+i+" is c3 : "+v.equals(c3));
			i++;
		}
		/*
		 * TreeSet
		 * Sorted
		 * Requires elements to be Comparable to sort them 
		 * The developer can provide a Comparator to implement a custom order
		 */
		
		TreeSet<Client> treeSet = new TreeSet<Client>();
		
		treeSet.add(c2);
		treeSet.add(c1);
		treeSet.add(c3);
		int k=0;
		for(Client v : treeSet){
			System.out.println("\nelement "+i+" is c1 : "+v.equals(c1));
			System.out.println("element "+i+" is c2 : "+v.equals(c2));
			System.out.println("element "+i+" is c3 : "+v.equals(c3));
			k++;
		}	
		System.out.println("element lower than c2 in sort order is c3: "+treeSet.lower(c2).equals(c3));
		System.out.println("is there an element higher than c2? "+treeSet.higher(c2));
		
		/*
		 * A TreeSet that uses a Comparator<Client> implementation 
		 */	
		
		// Using a Using a Comparator<Client> implementation
		TreeSet<Client> anotherTreeSet = new TreeSet<Client>(new ClientComparator());
		anotherTreeSet.addAll(treeSet);
		i=0;
		for(Client v : anotherTreeSet){
			System.out.println("\nelement "+i+" is c1 : "+v.equals(c1));
			System.out.println("element "+i+" is c2 : "+v.equals(c2));
			System.out.println("element "+i+" is c3 : "+v.equals(c3));
			i++;
		}
		System.out.println("is there an elment lower than c2? "+anotherTreeSet.lower(c2));
		System.out.println("is c3 the elment higher than c2? "+anotherTreeSet.higher(c2).equals(c3));
	}

}
