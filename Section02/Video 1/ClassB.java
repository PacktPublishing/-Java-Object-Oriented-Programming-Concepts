package encapsulation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassB {

	public static void someMethod(){
		ClassA instanceOne = new ClassA();
		instanceOne.variable = 55.12345678;
		//instanceOne.variable = BigDecimal.valueOf(55.12345678).setScale(4, RoundingMode.HALF_EVEN).doubleValue();
	}
}