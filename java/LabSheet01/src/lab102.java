import java.util.*;
import java.text.*;
public class lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int time = input.nextInt();
		int Hour = time/60;
		int Day = Hour/24;
		int Year = Day/365;
		int other = Year%365;
		System.out.print(time+" minutes is approximately is "+Year+"Years "+Day+"days ");
		
	}

}
