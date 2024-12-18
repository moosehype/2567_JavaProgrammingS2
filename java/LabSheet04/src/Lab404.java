import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudenIDvalid, isSubjectCodeValid;
		while(true) {
			
			//Input student ID
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			
			//Input subject code
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			
			//check lengths of student ID and subject code
			isStudenIDvalid = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);
			
			if(isStudenIDvalid && isSubjectCodeValid) {
				//check student details
				boolean isITstudent = isITStudent(studentID);
				boolean isITsubject = isITsubject(subjectCode);
				
				displayData(isITstudent,isITsubject);
				break;
			}else {
				System.out.println("");
			}
			public static void displayData(boolean isITstudent, boolean isITsubject) {
		
	}
			public static boolean isLength(String input,int len) {
				return input.length()==len;
			}
			public static boolean isITStudent(String studentID) {
				return false;
			}
			public static boolean isITsubject(String subjectCode) {
				return false;
			}
		
	}
