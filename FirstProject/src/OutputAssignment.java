import java.util.Scanner;
public class OutputAssignment {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double gpa;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();

		System.out.print( "What is your GPA? " );
		gpa = keyboard.nextDouble();
		
		System.out.println("Age: " +age);
		
		System.out.println("Height: " +height);
		
		System.out.println("GPA: " +gpa);

	}

}
