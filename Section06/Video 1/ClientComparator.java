package collections;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client>{

	public int compare(Client v1, Client v2) {
		
		if(v1 == null && v2 != null)
			return -1;
		else if(v1 != null && v2 == null)
			return 1;
		else if(v1 == null && v2 == null)
			return 0;
		else if(v1.getId() == v2.getId())
			return 0;
		else if(v1.getId() >= v2.getId())
			return 1;
		else if(v1.getId() < v2.getId())
			return -1;
		return 0;
	}

}
