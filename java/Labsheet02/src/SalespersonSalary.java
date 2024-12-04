import java.util.*;
public class SalespersonSalary {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declare constants
		 final double BASE_SALARY = 1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		
		while(true) {
			System.out.print("Enter gorss sales for the saleperson(or -1 to end): ");
			sales=input.nextInt();
			
			//check the sentinel value
			if (sales == SENTINEL) {
				break;
			}
			//compute salary
			salary = BASE_SALARY+ (sales * COMMISSION_RATE);
			
			//display the salary
			System.out.printf("The Salepersona's salary is : $%.2f%n", salary);
		}
			System.out.println("bye");
		
		
		input.close();
	}
 
}
