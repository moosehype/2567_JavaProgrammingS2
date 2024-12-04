import java.text.DecimalFormat;

import javax.swing.*;
public class Lab201 {

	public static void main(String[] args) {
		int isMember;
		final double BUFFET = 299;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = numberofCustomer * BUFFET;
		
		//System.out.printf("Total Price is %,.2f baht.",totalPrice);
		do { 
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."
				+"\nDo you have a member card");
		}while (isMember == JOptionPane.CANCEL_OPTION);
			
		if(isMember == JOptionPane.YES_OPTION ) {
			double priceAfterdiscount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(priceAfterdiscount) +" baht.");	
		}
		else if (isMember == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(numberofCustomer) +" baht.");	
		}
	}

}
