package valueobjects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parameter {

	private double parameter;

	public Parameter(double d) {
		this.parameter = BigDecimal.valueOf(d).setScale(4, RoundingMode.HALF_EVEN).doubleValue();
	}

	public double getParameter() {
		return parameter;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Parameter){
			double extracted1 = BigDecimal.valueOf(((Parameter) obj).getParameter()).setScale(0, RoundingMode.HALF_EVEN).doubleValue();
			double extracted2 = BigDecimal.valueOf(this.getParameter()).setScale(0, RoundingMode.HALF_EVEN).doubleValue();
			if(extracted1 == extracted2)
				return true;
		}
		return false;
	}
}
