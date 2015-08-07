import java.util.*;
public class InvoiceApp
	{

	public static void main(String[] args)
		{
		@SuppressWarnings("resource")
		//Declarations
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tax Rate:");
		double taxRate = keyboard.nextDouble();
		double price;
		double subtotal = 0;
		ArrayList<Double> priceArray = new ArrayList<Double>();
		
		do 
		{
		System.out.print("Price: \n");
		price = keyboard.nextDouble();
		priceArray.add(price);
		subtotal += price;
		
		}
		while (price != 0.0);
		System.out.println("Receipt\n");
		for (int i=0; i < priceArray.size()-1;i++){
		System.out.println(priceArray.get(i));
		}
		double grandTotal = 0;
		double tax = taxRate * subtotal;
		grandTotal = (1 + taxRate) * subtotal; 
		System.out.println(subtotal+" subtotal");
		System.out.println(tax+ " tax");
		System.out.println(grandTotal+" grand total");
	}

}
