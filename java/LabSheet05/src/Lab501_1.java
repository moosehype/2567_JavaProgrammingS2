import javax.swing.JOptionPane;

public class Lab501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};

		boolean deptWasFound = false;
		String dept = JOptionPane.showInputDialog("Enter item number to order");
		for(int i=0;i<deptName.length;i++) {
			if (dept.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
			if (deptWasFound) {
				JOptionPane.showMessageDialog(null, dept+" was found in the list");
			}else {
				JOptionPane.showMessageDialog(null, dept+" was not found in the list");
			}
		}
		
	}

}
