package objectOriented;

public class commissionEmployee extends Object {
	//using protected access type to access these variables directly from the subclasses
/*	protected String firstName;
	protected String lastName;
	protected String socialSecNo;
	protected double grossSales;
	protected double comissionRate;
*/
	private String firstName;
	private String lastName;
	private String socialSecNo;
	private double grossSales;
	private double comissionRate;
	
	public commissionEmployee(String first,String last,String ssn,
			double sales,double rate) 
	{
		//implicit call to object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecNo = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	
	public void setFirstName(String first){
		firstName = first;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String last){
		lastName = last;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setSSN(String ssn){
		socialSecNo = ssn;
	}
	
	public String getSSN(){
		return socialSecNo;
	}
	
	public void setGrossSales(double sales){
		if(sales>=0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}
	
	public double getGrossSales(){
		return grossSales;
	}
	
	public void setCommissionRate(double rates){
		if(rates>0.0 && rates<1.0)
			comissionRate = rates;
		else
			throw new IllegalArgumentException("comission rates must be > 0.0 and <1.0");
	}
	
	public double getCommissionRate(){
		return comissionRate;
	}
	
	public double earnings(){
		return comissionRate * grossSales;
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
				"commission employee", firstName, lastName,
				"social security number", socialSecNo, 
				"gross sales", grossSales,
				"commissionRate", comissionRate);
	}

}
