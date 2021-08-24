// Gtbank.java
// Account with a constructor to validate it
// initialize instance variable balance of type double

public class Gtbank 
{
	private double balance;

	public Gtbank( double initialBalance)
	{
		// validate that initial balance is greater than zero
		// if it  is not ,balance is initialized to its default 0.0
		if ( initialBalance > 0.0)
			balance = initialBalance;
	}// end account constructor
	
	//credit an amount to the account
	public void credit( double amount)
	{
		balance = balance + amount;
	}// end method credit
	
	//return the account balance
	public double getBalance()
	{
		return balance;// return balance to the calling class
	}

}
