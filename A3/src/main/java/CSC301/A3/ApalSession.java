package CSC301.A3;

import java.util.Map;

public class ApalSession {
	
	private Order order;
	private String filePath;
	
	public ApalSession(Order order, String filePath) {
		this.order = order;
		this.filePath = filePath;
	}

	// TASK 2: complete the method loadLabels()
	public Map<String, Integer> loadLabels() {
        // the APAL machine cuts the wallpaper and writes 
		// label info in filePath
		// each label has the following format:
		// "barcode", "product", "label info", "bolt quantity"
		// Example: consider the order
		// new Order(100, "test", "label", 1000, 30)
		// say APAL machine actually counts 1012 units
		// this method must do two things:
		// 1) Read the following from the filePath:
		// 34 comma delimited records as follows:
		// "1", "test", "label", "30"
		// ...
		// "33", "test", "label", "30"
		// "34", "test", "label", "22"
		// 2) Return a Map object that contains pairs ("1",30),...,("33", 30), ("34", 22)
		// each pair is (barcode, bolt quantity)
		return null;
	}
}
