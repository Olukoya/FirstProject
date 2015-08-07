import java.util.Scanner;
public class LoopDebuggingActivity {

	@SuppressWarnings("resource")
	public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String userInput;
        System.out.println("Enter your string: ");
        userInput = keyboard.next();
        
        while ( userInput != "" )
        {
            System.out.println(userInput);
            userInput = keyboard.next();   
        }
       
    }
}