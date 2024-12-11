import java.util.*;
public class SecyrePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your password(type 'exit' to exit");
			String password = scan.nextLine();
			
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			String error = "";
			
			if (password.length()<8) {
				error = "- Password must be at least 8 characters long. \n";
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
		}

	}

}
