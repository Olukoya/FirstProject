import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
	int actualNumber = 6;
	int guess = 0;
	@SuppressWarnings("resource")
	Scanner keyboard = new Scanner(System.in);
	System.out.println("I have chosen a number between 1 and 10. Try to guess it");
	while (guess != actualNumber)
	{
	System.out.println("Your guess? : ");
	guess = keyboard.nextInt();
	}
	System.out.println("That's right. You're a good guesser");
	}

}
