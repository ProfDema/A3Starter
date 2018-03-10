package CSC301.A3;

public class InsufficientResources extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientResources(int orderID) {
		super("Insufficient Resourses to process " + Integer.toString(orderID));
	}

}
