package CSC301.A3;

import java.util.Map;

public class ShipOrder {
	
	private ApalManager apalManager = new ApalManager();
	
    public int ShippedQuantity(Order order, String orderPath) throws InsufficientResources
    {
    		ApalSession apalSession = apalManager.createSession(order, orderPath);
    		Map<String, Integer> orderLabels = apalSession.loadLabels();
    		// compute actual quantity ...
    		return 0;
    }
    
    // other methods ...

}
