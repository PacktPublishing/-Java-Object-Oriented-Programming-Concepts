package hashcode.equals;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<Client, Policy> myClientPolicyMap = new HashMap<Client, Policy>();
		
		Client client13 = new Client(13);
		Policy policy13 = new Policy(13);
		
		myClientPolicyMap.put(client13, policy13);
		
		Client client13_2 = new Client(13);
		
		System.out.println("are equal? "+client13_2.equals(client13)+" so client6 should be found in myClientPolicyMap!!");

		if(myClientPolicyMap.get(client13_2) != null)
			System.out.println("found");
		else
			System.out.println("not found !!");
		
	}

}
