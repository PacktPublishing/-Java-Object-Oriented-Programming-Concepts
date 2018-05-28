package hashcode.equals;

public class Client {

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
	
}
