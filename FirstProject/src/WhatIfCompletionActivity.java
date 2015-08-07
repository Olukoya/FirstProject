import java.util.Scanner;
public class WhatIfCompletionActivity {

	public static void main(String[] args) {
		double num1, num2, sum, product, average;
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextDouble();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextDouble();

		sum = num1+num2;
		product = num1*num2;
		average = (num1+num2)/2;
		
		if (sum <= 200)
		{
		System.out.println("Sum: " +sum);
		System.out.println("Product: " +product);
		System.out.println("Average: " +average);
		}
		else
		{
		System.out.println("Sum: " +sum+ "*");
		System.out.println("Product: " +product);
		System.out.println("Average: " +average);
		}
	}

}
