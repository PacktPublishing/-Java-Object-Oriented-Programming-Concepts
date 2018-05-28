package valueobjects;

public class Engine {

	public Parameter consumption;

	public Engine(Parameter parm) {
		this.consumption = parm;
	}
	
	public Parameter getConsumption() {
		return this.consumption;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Engine){
			Engine engineToCompare = (Engine)obj;
			if(this.consumption.equals(engineToCompare.getConsumption()))
				return true;
		}
		return false;
	}
}
