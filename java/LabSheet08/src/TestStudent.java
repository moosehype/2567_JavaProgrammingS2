import java.util.Scanner;
public class TestStudent {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("How many student in clasroom");
			int numberOfStudent = scan.nextInt();
			
			Student[] students = new Student[numberOfStudent];
			
			for(int i=0; i<numberOfStudent;i++) {
				students[i] = new Student();
				System.out.print("\nINPUT INFORMATION OF STUDENT!"+(i+1));
				Line();
				System.out.print("input student name");
				String stdName = scan.nextLine();
				while(true) {
					System.out.print("Input student score");
					int score = scan.nextInt();
					
					scan.nextLine();
					students[i].setScore(score);
					if(students[i].checkScore()) {
						System.out.print("Input score again: ");
						break;
					}
					else {
						System.out.print("Input score again: ");
					}
					System.out.println("\nList OF PASS Students (>50):");
					Line();
					for(Student student : students) {
						if (student.isPass()) {
							System.out.print(">> "+student.getName()+" {"+student.getScore()+"}");
						}
					}
				}
			}
			scan.close();
		}
		public static void Line() {
			for(int i=1; i<=60; i++) {
				System.out.print("-");
			}
		}
		

}
