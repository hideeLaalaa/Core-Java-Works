// inputting and outputting floating point numbers with account objects
import java.util.Scanner;

public class Daisy 
{
	// main method begins execution of java application
	public static void main( String[] args ){
		Gtbank Daisy = new Gtbank(10000.00);
		Gtbank Trove = new Gtbank(200000.00);
		
		//display initial balance of each object
		System.out.printf("Daisy's acct balance is: $%.2f\n", Daisy.getBalance());
		System.out.printf("Trove's acct balance is: $%.2f\n", Trove.getBalance());
		
		// create to obtain input from user
		Scanner input = new Scanner(System.in);
		double depositCash;
		System.out.printf("Enter ur deposit amount Miss Daisy:");
		depositCash = input.nextDouble(); // obtain the user cash amount
		System.out.printf("\nadding %.2f to ur acct\n\n", depositCash);
		Daisy.credit(depositCash);
		
		// display balances 
		System.out.printf("account Daisy balance is : $%.2f\n", Daisy.getBalance());
		System.out.printf("Trove's acct balance is: $%.2f\n", Trove.getBalance());
		
		System.out.printf("Enter ur deposit amount Miss Trove:");
		depositCash = input.nextDouble(); // obtain the user cash amount
		System.out.printf("\nadding %.2f to ur acct\n\n", depositCash);
		Trove.credit(depositCash);
		
		// display balances 
				System.out.printf("account Daisy balance is : $%.2f\n", Daisy.getBalance());
				System.out.printf("Trove's acct balance is: $%.2f\n", Trove.getBalance());
				
	}

}
