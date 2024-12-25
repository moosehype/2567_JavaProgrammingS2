import java.text.DecimalFormat;
 
import javax.swing.*;
public class ShoppingCart {
 
	public static void main(String[] args) {
		// call method displayCartItemAndTotal
		displayCartAndTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		displayCartAndTotal("Milk",20.5,"Bread",15.0);
		displayCartAndTotal();
 
	}//end of main() Method
	
	public static void displayCartAndTotal (Object... items) {
		DecimalFormat df = new DecimalFormat("#.00");
		if(items.length == 0) {
			System.out.print("No items in the cart.");
			return;
		}
		System.out.println("Items in the cart:");
		for (int i = 0;i < items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			JOptionPane.showMessageDialog(null, "- "+itemName+": $"+df.format(itemPrice));
			//System.out.printf("- %s: $%.2f%n",itemName,itemPrice);
		}
		System.out.println();
	}
 
}