// account that withdraws application
import java.util.Scanner;
public class ExerTT 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		exer2 Foly = new exer2( 10000.00);
		int password;
		System.out.println("Please enter your password");
		password=input.nextInt();
			if(password != 8991)
		{
				System.out.println("Wrong password .... please enter again");
				password=input.nextInt();
		}
			else
			{
				int choice=0;	
				
				while(choice != -1)
			{
					System.out.println("how can i help you?\n1. Deposit\n 2. Withdraw\n 3.Balance\nPress -1 to end ");
					choice = input.nextInt();
						
					if (choice == 3)
					{
						// display initial account balance of the account
						System.out.printf( "Hi,your current accounnt balance is : %f\n", Foly.getBalance());
					}
					if (choice == 1)
					{
						double depositcash;
						System.out.println("Please enter the amount you wish to deposit:");
						depositcash = input.nextDouble();
						System.out.printf("Adding %f to ur account \n", depositcash);
						Foly.credit(depositcash);
						//displaying account balance
						System.out.printf("Your account balance is %f\n", Foly.getBalance());
					}
					if (choice == 2)
					{
						System.out.printf("please enter the amount you wish to withdraw : \n");
						double withdraw;
						withdraw = input.nextDouble();
						if (withdraw <= Foly.getBalance())
						{
							System.out.printf("Deducting %f from your account\n", withdraw);
							Foly.debit(withdraw);
							System.out.printf("Your new accoun balance is %s\n", Foly.getBalance());
						}
						else{
							System.out.println("Sorry you do not have up to such amount in ur account");
							}
					}
			}
			}
	}
}