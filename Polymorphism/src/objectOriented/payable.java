package objectOriented;

import employee.date;

public interface payable {
	double getPaymentAmount();
}

class invoice implements payable{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public invoice(String part,String desc,int count,double price){
		partNumber = part;
		partDescription = desc;
		setQuantity(count);
		setPricePerItem(price);
	}
	
	public void setPartNumber(String part){
		partNumber = part;
	}
	
	public String getPartNumber(){
		return partNumber;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	
	public void setPartDescription(String desc){
		partDescription = desc;
	}
	
	public void setQuantity(int count){
		if(count >=0 )
			quantity = count;
		else
			throw new IllegalArgumentException("Quantity must be >=0");
	}
	
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setPricePerItem(double price){
		if(price >=0.0)
			pricePerItem = price;
		else
			throw new IllegalArgumentException("Price per item must be >= 0");
	}
	
	public double getPricePerItem(){
		return pricePerItem;
	}
	
	@Override
	public String toString(){
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s $%,.2f",
				"invoice","part number",getPartNumber(),getPartDescription(),"quantity",
				getQuantity(),"price per item",getPricePerItem());
	}
	
	@Override
	public double getPaymentAmount(){
		return getQuantity()*getPricePerItem();
	}
}

abstract class pEmployee implements payable{
	private String firstName;
	private String lastName;
	private String socSecNum;
	
	public pEmployee(String fst, String lst,String ssn){
		firstName=fst;
		lastName=lst;
		socSecNum=ssn;
	}
	
	public void setFirstName(String fst){
		firstName=fst;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String last){
		lastName = last;
	}
	
	public String getlastName(){
		return lastName;
	}
	
	public void setSocSecNum(String ssn){
		socSecNum = ssn;
	}
	
	public String getSocSecNum(){
		return socSecNum;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s\nsocial security number: %s", 
				getFirstName(),getlastName(),getSocSecNum());
	}
	
}

class pHourlyEmployee extends pEmployee{
	HourlyEmployee employ;
	public pHourlyEmployee(String first, String last, String ssn, double hrWage, double hrWorked, date d) {
		super(first,last,ssn);
		employ = new HourlyEmployee(first, last, ssn, hrWage, hrWorked, d);
	}

	public pHourlyEmployee(String first, String last, String ssn, double hrWage, double hrWorked) {
		super(first,last,ssn);
		employ = new HourlyEmployee(first, last, ssn, hrWage, hrWorked);
	}

	@Override
	public double getPaymentAmount() {
		return employ.earnings();
	}
	@Override
	public String toString(){
		return String.format("%s", employ);
	}

}

class pCommissionEmployee extends pEmployee{
	CommissionEmployee employ;
	public pCommissionEmployee(String first, String last, String ssn,
			double sales,double rates) {		
		super(first,last,ssn);
		employ = new CommissionEmployee(first, last, ssn, sales, rates);
	}

	public pCommissionEmployee(String first, String last, String ssn,
			double sales,double rates,date d) {		
		super(first,last,ssn);
		employ = new CommissionEmployee(first, last, ssn, sales, rates,d);
	}


	@Override
	public double getPaymentAmount() {
		return employ.earnings();
	}
	
	@Override
	public String toString(){
		return String.format("%s", employ);
	}
}
	

class pBasePlusCommissionEmployee extends pCommissionEmployee{
	BasePlusCommissionEmployee employ;
	public pBasePlusCommissionEmployee(String first, String last, String ssn,
			double sales,double rates,double salary) {		
		super(first, last, ssn, sales, rates);
		employ = new BasePlusCommissionEmployee(first, last, ssn, sales, rates,salary);
	}

	public pBasePlusCommissionEmployee(String first, String last, String ssn,
			double sales,double rates,double salary,date d) {		
		super(first, last, ssn, sales, rates,d);
		employ = new BasePlusCommissionEmployee(first, last, ssn, sales, rates,salary);
	}


	@Override
	public double getPaymentAmount() {
		return employ.getBaseSalary()+super.getPaymentAmount();
	}
	
	@Override
	public String toString(){
		return String.format("%s", employ);
}

	public double getBaseSalary() {
		return employ.getBaseSalary();
	}

	public void setBaseSalary(double d) {
		employ.setBaseSalary(d);
	}

}

class psalariedEmployee extends pEmployee{
	
	private double weeklySalary;
	
	public psalariedEmployee(String fst, String lst, String ssn,double salary) {
		super(fst, lst, ssn);
		setWeeklySalary(salary);
		
	}
	
	public void setWeeklySalary(double salary){
		if(salary>=0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("Weekly salary must be >=0.0");
	}
	
	public double getWeeklySalary(){
		return weeklySalary;
	}
	
	@Override
	public double getPaymentAmount(){
		return getWeeklySalary();
	}
	
	@Override
	public String toString(){
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(),
				"weekly salary",getWeeklySalary());
		
	}
	
}

class payableInterfaceTest{
	
	public void run(){
		//creating 4 element payable arr
		payable[] payableObj = new payable[6];
		
		//populate arr with obj that implemrnt payable
		payableObj[0] = new invoice("01234","seat",2,375.00);
		payableObj[1] = new invoice("56789","tire",4,475.00);
		payableObj[2] = new SalariedEmployee("John","Smith","111-11-1111",800.00);
		payableObj[3] = new HourlyEmployee("Idris","Bulltool","+2348107909407",365*3.5,30,new date(2,16,1995));
		payableObj[4] = new CommissionEmployee("Igwe","General","+2348059632154",8000,.60,new date(12,15,1989));
		payableObj[5] = new BasePlusCommissionEmployee("Rilwan","Panels","+2348022353597",30000,.5,300,new date(10,27,1993));
		
		System.out.println("Invoices and Employees processed polymorphically:\n");
		
		// generically process each element in array payableObj
		for(payable currentPay:payableObj){
			if(currentPay instanceof BasePlusCommissionEmployee){
				BasePlusCommissionEmployee bestEmployee = (BasePlusCommissionEmployee) currentPay;
				bestEmployee.setBaseSalary(1.10*( bestEmployee).getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", bestEmployee.getBaseSalary());
			}
			System.out.printf("%s \n%s:$%,.2f\n\n", currentPay.toString(),
					"payment due",currentPay.getPaymentAmount());
		}
		
	}
}
