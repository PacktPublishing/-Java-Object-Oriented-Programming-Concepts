package collections;

public class Client implements Comparable<Client> {

	public long id;

	public Client(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Client)
			if(this.id == ((Client)obj).getId() )
				return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int) this.id % 7; // up to 7 buckets possible
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public int compareTo(Client v2) {
		if(v2 == null)
			return 1;
		else if(this.getId() == v2.getId())
			return 0;
		else if(this.getId() >= v2.getId())
			return 1;
		else if(this.getId() < v2.getId())
			return -1;
		return 0;
	}
	
}
