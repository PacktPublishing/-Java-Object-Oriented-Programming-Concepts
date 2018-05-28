package mixins.traits;

public interface AeroPlane {

	public static final String IS_A_CONSTANT="constant";
	
//	public abstract void goTo(int distance, int load);
//	
//	public abstract void comeBack();
	
	default void goTo(int distance, int load) {
		System.out.println("going to...");
	}
	
	default void comeBack() {
		System.out.println("Coming back...");
	}
}