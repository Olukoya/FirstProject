import java.util.Scanner;

public class MowingTimeChallenge {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double length,width,sqYardage,time;
		
		System.out.print( "Length? " );
		length = keyboard.nextDouble();
		
		System.out.print( "Width? " );
		width = keyboard.nextDouble();
		
		sqYardage = length*width;
		time = sqYardage*2;
		
		System.out.println("Square Yardage: " +sqYardage);
		
		System.out.println("Mowing Time in minutes: " +time);
		

	}

}
