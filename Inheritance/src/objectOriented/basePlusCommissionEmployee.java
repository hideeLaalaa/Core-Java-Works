package objectOriented;

public class basePlusCommissionEmployee extends commissionEmployee {

	private double baseSalary;
	
	public basePlusCommissionEmployee(String first,String last,String ssn,
			double sales,double rate,double salary) {
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary){
		if(salary>=0.0)
			baseSalary=salary;
		else
			throw new IllegalArgumentException("Base salary must be >=0.0");
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	@Override
	public double earnings(){
		return baseSalary + super.earnings();
	}
	
	@Override
	public String toString(){
		return String.format("%s %s\n%s: %.2f","base-slaried", 
				super.toString(),"base salary",getBaseSalary());
	}

}
