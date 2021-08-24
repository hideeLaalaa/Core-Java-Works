// invoice app test
import java.util.Scanner;
public class InvoicT 
{
	public static void main(String[] args) 
	{
		Invoice Test= new Invoice( "","",0,0.0);
		Scanner input = new Scanner(System.in);
		
		String number;
		String description;
		int quantity;
		double price;
		
		System.out.println("Enter ur number:");
		number = input.nextLine();
		Test.setno(number);
		
		System.out.println("Enter d description of the item:");
		description = input.nextLine();
		Test.setdesc(description);
		
		System.out.println("Enter the quantity of items purchased:");
		quantity = input.nextInt();
		if (quantity > 0)
		Test.setquan(quantity);
		
		System.out.println("Enter the price of the item purchased:");
		price = input.nextDouble();
		if (price > 0)
		Test.setitem(price);
		System.out.printf("Item %s of %d quantity which price is %.2f",Test.getdesc(),Test.getquan(),Test.getitem());
		System.out.printf("The total amount of all items purchased = $%.2f\n", Test.amount());
		
		
	}

}
