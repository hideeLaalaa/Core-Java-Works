package objectOriented;

import employee.date;

public abstract class Employee implements payable{
	
	private String firstName;
	private String lastName;
	private String socialSecNo;
	private date birthDate;
//	private double grossSales;
//	private double comissionRate;
	
	public Employee(String first,String last,String ssn) 
	{
		//implicit call to object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecNo = ssn;
//		setGrossSales(sales);
//		setCommissionRate(rate);
	}
	
	public Employee(String first,String last,String ssn,date d) 
	{
		//implicit call to object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecNo = ssn;
		birthDate = d;
//		setGrossSales(sales);
//		setCommissionRate(rSate);
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void setBirthday(date d){
		birthDate = d;
	}
	
	public date getBirthday(){
		return birthDate;
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
	
//	public void setGrossSales(double sales){
//		if(sales>=0.0)
//			grossSales = sales;
//		else
//			throw new IllegalArgumentException("Gross sales must be >= 0.0");
//	}
//	
//	public double getGrossSales(){
//		return grossSales;
//	}
//	
//	public void setCommissionRate(double rates){
//		if(rates>0.0 && rates<1.0)
//			comissionRate = rates;
//		else
//			throw new IllegalArgumentException("comission rates must be > 0.0 and <1.0");
//	}
//	
//	public double getCommissionRate(){
//		return comissionRate;
//	}
	
//	public double earnings(){
//		return comissionRate * grossSales;
//	}
	
	@Override
	public String toString(){
		return String.format("%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSSN());
	}
	
	public abstract double earnings();
	
	public double getPaymentAmount(){
		return earnings();
	}

}
