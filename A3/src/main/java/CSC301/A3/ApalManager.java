package CSC301.A3;

public class ApalManager {

	private Apal apal = Apal.getInstance();
	
	// Task 3
	
	public ApalSession createSession(Order order, String orderPath) throws InsufficientResources {
		if (apal.mayUseApal(order, orderPath)) {
			return new ApalSession(order, orderPath);
		} else {
			   throw new InsufficientResources(order.getOrderID());
			}
	}
	
	
	// ... more methods
	
}
