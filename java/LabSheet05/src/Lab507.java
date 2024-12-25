import javax.swing.JOptionPane;
public class Lab507 {

	public static void main(String[] args) {
		
		int[] number = new int [5];
		for(int i = 0;i < number.length;i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+ (i+1) +":"));
			
		}
		showOdd(number);
		showEven(number);

	}

	public static void showEven(int[] _inputnumber1) {
		String number = "";
		for (int numberEven : _inputnumber1) {
			if (numberEven%2 == 0) {
				number += numberEven+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of even number : \n"+number);
	}

	public static void showOdd(int[] _inputnumber2) {
		String number ="";
		for (int numberOdd : _inputnumber2) {
			if (numberOdd%2 != 0) {
				number += numberOdd+" ";
			}
		}
		JOptionPane.showMessageDialog(null,"List of odd number : \n"+number);
		
	}

}
