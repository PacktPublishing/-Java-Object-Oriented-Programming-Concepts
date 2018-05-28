package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		
		String s1 = new String ("a");
		String s2 = new String ("b");
		String s3 = new String ("c");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
	    for (int i=0, n=arrayList.size(); i < n; i++) // sequential
	    	arrayList.get(i);

	    for (Iterator<String> it=arrayList.iterator(); it.hasNext(); ){ // iterator
	    	String myString = it.next();
	    }
	    
	    Iterator<String> it2 = arrayList.iterator();
	    while(it2.hasNext()){
	    	String myString = it2.next();
	    	System.out.println(myString);
	    	it2.remove();
	    }
	    System.out.println(arrayList.size());
	}
}
