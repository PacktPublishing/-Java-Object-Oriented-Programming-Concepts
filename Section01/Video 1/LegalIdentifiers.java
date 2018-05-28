package whatisanobject;

public class LegalIdentifiers {
	
	/* Cannot be a Java keyword */
	//char int;
	int isLegal;

	/* Composed of only Unicode characters, numbers, currency 
	 * symbols, and connecting characters (underscores)  */
	//String _*_illegal;
	//public void ill@egal(){};
	String hello123World;
	public void legal123(){};
	
	/* Must start with a letter, a currency character ($), 
	 * or a connecting character (underscore) */
	//long 5_IsIllegal;
	int $islegal;
	long _2_x_IsLegal;
	public void _legal(){};
	
	// case-sensitive
	int car;
	int Car;
}
