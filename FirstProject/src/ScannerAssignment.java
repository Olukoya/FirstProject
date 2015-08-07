import java.util.Scanner;
public class ScannerAssignment {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b,multiple;
		Scanner sc = new Scanner (System.in);
		System.out.println("Input first number\n");
		a = sc.nextInt();
		System.out.println("Input second number\n");
		b = sc.nextInt();
		multiple = a*b;
		
		System.out.println("The multiple is " +multiple);
	}

}
