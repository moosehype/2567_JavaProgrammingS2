public class TestProduct {
 
	public static void main(String[] args) {
		Product product = new Product();
		
		product.setProduction("Smartphone", 30000.0, 7.0);
		
		System.out.print("");
		product.displayProductDetails();
	}
 
}