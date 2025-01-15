
public class Product {
	private String name;
	private double price;
	private double vat;
	
	public void setProduction(String productName,double productPrice,double productVat) {
		name = productName;
		price = productPrice;
		vat = productVat;
	}
	public double calculateTotalPrice() {
		double vatPrice = (price * vat/100);
		
		return vatPrice += price;
	}
	public void displayProductDetails() {
		 System.out.println("Product Details: ");
		 System.out.println("Product Name: "+name);
		 System.out.println("Price (Before Vat): "+price);
		 System.out.println("Price (After Vat): "+calculateTotalPrice());
	}

}
