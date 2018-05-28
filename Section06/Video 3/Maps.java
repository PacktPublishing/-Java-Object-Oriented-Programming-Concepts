package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Maps {

	/*
	 * Maps are about unique identifiers
	 * key/value pairs -> An Object (the key or the ID) is paired with another object (the value) 
	 * IMPORTANT: Requires for the equals() method to be implemented by keys to establish identity
	 */
	public static void main(String[] args) {

		Client c1 = new Client(1);
		Client c2 = new Client(2);
		Client c3 = new Client(3);
		String s1 = new String ("a");
		String s2 = new String ("b");
		String s3 = new String ("c");
		
		/*
		 * HashMap: Unsorted, Unordered
		 * IMPORTANT: Requires for the hashCode() method to be implemented to determine in which bucket to use equals()
		 */
		HashMap<String, Client> hashMap = new HashMap<String, Client>();
		
		s1.equals(s2);
		s1.hashCode();
		
		hashMap.put(s1, c1);
		hashMap.put(s2, c2);
		hashMap.put(s3, c3);
		
		System.out.println(hashMap.get(s1).equals(c1));
		System.out.println("hasMap contains the key s1 ? "+hashMap.containsKey(s1));
		
		Set<String> myKeySet = hashMap.keySet(); // get the keySet
		Iterator<String> it = hashMap.keySet().iterator(); // An iterator over the keys
		Collection<Client> clientcollection = hashMap.values(); // get a collection of the values
		Iterator<Client> it2 = hashMap.values().iterator(); // An iterator over the values

		/*
		 * Hashtable: Similar to HashMap but with synchronized methods
		 * => Slower than HashMap
		 */
		
		Hashtable<String, Client> hashTable = new Hashtable<String, Client>();
		hashTable.put(s1, c1);
		
		/*
		 * LinkedHashMap: Maintains insertion or access order (key-value paires are linked) 
		 * Slower then HashMap for insertion and deletion 
		 * Faster then HashMap for iterating through the key/value pairs
		 */

		LinkedHashMap<String, Client> linkedHashMap = new LinkedHashMap<String, Client>();
		
		linkedHashMap.put(s1, c1);
		
		Set<String> anotherKeySet = linkedHashMap.keySet(); // get the keySet
		Iterator<String> it3 = linkedHashMap.keySet().iterator(); // An iterator over the keys
		
		/*
		 * TreeMap: Sorted by the natural order of the elements (the key's natural order)
		 * You can define a custom sort order with a Comparator
		 */
		
		TreeMap<String, Client> treeMap = new TreeMap<String, Client>(); 
		
		s1.compareTo(s2); // String implements the Comparable Interface 
		
		treeMap.put(s1, c1);
		
		System.out.println(treeMap.get(s1).equals(c1));
		
		// A TreeMap that uses a Implementation of Comparator to establish the sort order
		TreeMap<Client, String> anotherTreeMap = new TreeMap<Client, String>(new ClientComparator()); 
	}
}