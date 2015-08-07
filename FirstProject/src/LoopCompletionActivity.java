import java.util.Scanner;
public class LoopCompletionActivity {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
        
        int num, total = 0;
        
        // Loop should start here
        num = keyboard.nextInt();
        total += num;
        //Loop should end here
        
        System.out.println("The total of all 10 numbers is " + total);

	}

}
