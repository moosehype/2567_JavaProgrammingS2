import java.util.*;
public class employeeDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input employee id :");
		String empId = scan.next();
		scan.nextLine();
		System.out.print("Input employee name :");
		String empName = scan.nextLine();
		System.out.print("Input employee salary :");
		double empSalary = scan.nextDouble();
		System.out.print("Input employee sales : ");
		double empSales = scan.nextDouble();
		System.out.println();
		
		Sales emp1 = new Sales(empId,empName,empSalary,empSales);
		System.out.println(emp1);
		double total = emp1.getSalary()+emp1.getCommission();
		System.out.printf("Total salary %.2f baht.",total);
		
	}
}