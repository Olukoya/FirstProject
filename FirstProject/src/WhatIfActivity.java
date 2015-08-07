import java.util.Scanner;

public class WhatIfActivity {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double taxAmount, totalAmount = 0;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Customer Number? :");
		int customerNumber = keyboard.nextInt();
		
		System.out.print( "Customer First Name?  :");
		String fname = keyboard.next();
		
		System.out.print( "Customer Last Name?  :");
		String lname = keyboard.next();

		System.out.print( "Sales Amount?  :");
		double salesAmount = keyboard.nextDouble();
		
		System.out.print( "Tax Code?  :");
		String taxCode = keyboard.next();

		if (taxCode.equalsIgnoreCase("NRM"))
		{
		totalAmount = salesAmount * 1.06;
		}
		else if (taxCode.equalsIgnoreCase("NPF"))
		{
		totalAmount = salesAmount * 1.00;
		}
		else if (taxCode.equalsIgnoreCase("BIZ"))
		{
		totalAmount = salesAmount * 1.045;
		}
		else
		{
		System.out.println ("Wrong Tax Code");
		}
		System.out.println();		
		System.out.println("Customer Name: " +fname+ " " +lname);
		System.out.println("Customer Number: " +customerNumber);
		System.out.println("Sales Amount: " +salesAmount);
		System.out.println("Total Amount: " +totalAmount);
		
		
	}

}
