import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product name");
		String strProductUnit = JOptionPane.showInputDialog("Input Product unit");
		int productUnit = Integer.parseInt(strProductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("" + "Input Price per Unit"));
		
		double TotalPriceofProduct = productUnit * productPrice;
		double TotalwithVat = TotalPriceofProduct * 1.07;
		String frmTotalWithVat = String.format("#,2t");
		String frmTotalPriceofProduct = String.format("#,2t");
		JOptionPane.showInputDialog(null,"Total price is: " + TotalPriceofProduct + "baht."
									+"\nAdd VAT 7% is "+ TotalwithVat + "baht.");
		
		
	}

}
