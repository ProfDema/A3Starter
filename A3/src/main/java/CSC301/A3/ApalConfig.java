package CSC301.A3;

public class ApalConfig {

	private static ApalConfig instance;
	private static String configFilePath = "...";
	
	public static ApalConfig getInstance() {
		if (instance == null) {
		   // create instance
		}
		return instance;
	}
	
	public ApalConfig() {
		// load configuration from file
		// for us configuration file will contain only
		// one datum: the quantity of available labels
		// please make sure to add it as a property of this
		// class and set it using the info read from the 
		// configFilePath
	}
	
}
