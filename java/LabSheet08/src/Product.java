
public class Product {

	private String productID;
	private int productUnit;
	private double price;
	
	public void setID(String pid) {
		this.productID=pid;
	}
	public String getID() {
		return productID;
	}
	public void setUnit(int proUnit) {
		this.productUnit = proUnit;
	}
	public int getUnit() {
		return productUnit;
	}
	public void setPrice(double proPrice) {
		this.price = proPrice;
	}
	public double getPrice() {
		return this.price;
	}
	public double calculate() {
		return price * productUnit;
	}
}
