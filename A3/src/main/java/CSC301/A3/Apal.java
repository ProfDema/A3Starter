package CSC301.A3;


public class Apal {
	
	private static Apal instance;
	
	private ApalConfig config;
	
	public static Apal getInstance() {
		if (instance == null) {
		// create instance
		}
		return instance;
	}
		
	public Apal() {
		// initialization...
		config = ApalConfig.getInstance();
		// verify configuration ...
		// there is no need to code anything for configuration
		// verify process for the purpose of this assignment
	}
	
	public boolean mayUseApal(Order order, String orderPath) {
		// TASK 1
		// check if file orderPath is unlocked and available
		// if so, return true
		return false;
	}	

}
