package Association.Aggregaion.Composition;

public class Part {

	public boolean isFunctional = true;
	
	public void fix() {
		if(!isFunctional)
			isFunctional = true;
	}
	
}