package identity.equality;

public class ClassA {

	private int myInt;
	private String myString;
	
	public ClassA(int i) {
		this.myInt= i;
	}
	
	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int i) {
		this.myInt = i;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj != null && obj instanceof ClassA){
//			if(((ClassA) obj).getMyInt() == this.getMyInt())
//				return true;
//		}
//		return false;
//	}
	
}
