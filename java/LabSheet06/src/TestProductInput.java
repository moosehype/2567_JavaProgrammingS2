import java.util.*;
public class TestProductInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Enter product name: ");
		String productName = scan.nextLine();
		System.out.print("Enter product price: ");
		double productPrice = scan.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		double vat = scan.nextDouble();
		System.out.println();
		
		System.out.println("Product Details:");
		product.setProduction(productName, productPrice, vat);
		product.displayProductDetails();
	}
}