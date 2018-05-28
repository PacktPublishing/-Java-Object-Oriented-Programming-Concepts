package encapsulation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassA {

	public double variable;
	
	//private double variable;
	
	//public void setVariable(double v){
		// setting the variable is wrapped in a method that becomes a single point of access ...
		//this.variable = v;
		//this.variable = BigDecimal.valueOf(v).setScale(6, RoundingMode.HALF_EVEN).doubleValue();
	//}
}
