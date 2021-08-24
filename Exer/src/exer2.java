// example 2 
// bank account with withdrawal capability

public class exer2 
{
	private double Balance;
	public exer2(double initialBalance){
		if (initialBalance > 0)
			Balance = initialBalance;
	}
	
	public void credit( double amount ){
		Balance = Balance + amount;
	}
	
	public void debit(double amount){
		if (amount <= Balance)
		Balance = Balance - amount;
		else {
			Balance = Balance;
			System.out.println( "Debit exceeded amount in your account");
		}
			
	}
	
	public double getBalance(){
		return Balance;
	}

}
