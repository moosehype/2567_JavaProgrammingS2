import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		
		String txtConcat ="";
		
		String word;
		
		while(true) {
			System.out.print("Enter Word: ");
			word = type.next();
			
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Program Terminate");
				break;
				
			}
			txtConcat = word+" ";
			}
		System.out.println(txtConcat);
		type.close();
	
	}

	}


