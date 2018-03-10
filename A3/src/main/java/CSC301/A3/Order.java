package CSC301.A3;

public class Order {
	
	private int orderID;
	private String prodID;
	private String labelInfo;
	private int quantity;
	private int boltsize;
	
	
	
	public Order(int orderID, String prodID, String labelInfo, int quantity, int boltsize) {
		this.orderID = orderID;
		this.prodID = prodID;
		this.labelInfo = labelInfo;
		this.quantity = quantity;
		this.boltsize = boltsize;
	}
	
	protected int getOrderID() {
		return this.orderID;
	}
	
	protected String getProdID() {
		return prodID;
	}
	
	protected String getLabelInfo() {
		return labelInfo;
	}
	
	protected int getQuantity() {
		return quantity;
	}
	
	protected int getBoltsize() {
		return boltsize;
	}
	
	

}
