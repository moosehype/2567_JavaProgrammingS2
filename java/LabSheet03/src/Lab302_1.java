import javax.swing.*;
 
public class Lab302_1 {
 
	public static void main(String[] args) {
		boolean chkEmail =false;
		String inputEmail;
		
		while(true) {
	inputEmail =JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();	
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")){
		
		inputEmail = JOptionPane.showInputDialog("Input your e-mail,again: ");
	}
		chkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com");
		if(chkEmail) {//if(checkEmail==true)
			JOptionPane.showMessageDialog(null,"Your e-mail is "+ inputEmail);
			break;//end of statement
		}else {
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or gmail dot com ");
			continue; //loop
		}
	}
	}
}