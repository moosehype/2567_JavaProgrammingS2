import java.util.*;

import javax.swing.Spring;
public class LabSheet403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;
		
		System.out.println("Plese Enter your name,seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		System.out.println(abbreviantName(fullName));

		input.close();
	}
	public static String abbreviantName(String fName) {
		String initalletter="";
		for(int i=0;i<fName.length();i++) {
			if(fName.charAt(i)==' ') {
				initalletter =(initalletter+fName.charAt(i+1)).toUpperCase();
			}
			
		}return initalletter;
	}

}
