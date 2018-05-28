package abstratc.interfaces;

public interface AeroPlane {
	
	public static final String IS_A_CONSTANT="constant";
	
	public abstract void goTo(int distance, int load);
	
	public abstract void comeBack();
	
}