
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmployeeDetails("Omega", 45, 20.0);
		emp2.setEmployeeDetails("Alpha", 38, 25.0);
		
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
		
		
	}

}
