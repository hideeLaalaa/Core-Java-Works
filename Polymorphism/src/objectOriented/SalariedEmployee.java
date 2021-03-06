package objectOriented;

import employee.date;

public class SalariedEmployee extends Employee{
	public static void main(String[] args){
		
		PayrollSystemModification test = new PayrollSystemModification();
		test.run();
	}

	private double weeklySalary;
	
	public SalariedEmployee(String first, String last, String ssn,double salary) {
		super(first, last, ssn);
		setWeeklySalary(salary);
	}
	
	public SalariedEmployee(String first, String last, String ssn,double salary,date d) {
		super(first, last, ssn,d);
		setWeeklySalary(salary);
	}
	
	public void setWeeklySalary(double salary){
		if(salary>=0.0)
			weeklySalary = salary;
		else
			throw new IllegalArgumentException("weekly salary must be >=0.0");	
	}
	
	public double getWeeklySalary(){
		return weeklySalary;
	}
	
	@Override
	public double earnings(){
		return getWeeklySalary();
	}
	
	@Override
	public String toString(){
		return String.format("salaried employee: %s\n%s: $%,.2f", 
				super.toString(),"weekly salary",getWeeklySalary());
	}
	
}

//HOURLY EMPLOYEE
class HourlyEmployee extends Employee{

	private double wage;
	private double hours;
	
	public HourlyEmployee(String first, String last, String ssn,double hrWage,double hrWorked) {
		super(first, last, ssn);
		setWage(hrWage);
		setHours(hrWorked);
	}
	
	public HourlyEmployee(String first, String last, String ssn,double hrWage,double hrWorked,date d) {
		super(first, last, ssn,d);
		setWage(hrWage);
		setHours(hrWorked);
	}
	
	private void setWage(double hrWage){
		if(hrWage>=0.0)
			wage = hrWage;
		else throw new IllegalArgumentException("Wage must be >=0.0");
	}
	
	double getWage(){
		return wage;
	}
	
	public void setHours(double hour){
		if(hour>=0.0&&hour<=168.0)
			hours = hour;
		else
			throw new IllegalArgumentException("hours worked must be >=0.0 and <=168.0");	
	}
	
	public double getHours(){
		return hours;
	}
	
	@Override
	public double earnings(){
		if(getHours()<=40)
			return getWage()*getHours();
		else
			return 40 * getWage() + (getHours()-40)*getWage()*1.5;
	}
	
	@Override
	public String toString(){
		return String.format("salaried employee: %s\n%s: $%,.2f; %s: %,.2f", 
				super.toString(),"hourly wage",getWage(),"hours worked",getHours());
	}
	
}

//PIECEWORKER EMPLOYEE
class pieceWorker extends Employee{

	private double wage;
	private double pieces;
	
	public pieceWorker(String first, String last, String ssn,double wage,double pieces) {
		super(first, last, ssn);
		setWage(wage);
		setPieces(pieces);
	}
	
	public pieceWorker(String first, String last, String ssn,double wage,double pieces,date d) {
		super(first, last, ssn,d);
		setWage(wage);
		setPieces(pieces);
	}
	
	private void setWage(double piecesWage){
		if(piecesWage>=0.0)
			wage = piecesWage;
		else throw new IllegalArgumentException("Wage must be >=0.0");
	}
	
	private double getWage(){
		return wage;
	}
	
	public void setPieces(double piece){
		if(piece>=0.0&&piece<=168.0)
			pieces = piece;
		else
			throw new IllegalArgumentException("hours worked must be >=0.0 and <=168.0");	
	}
	
	public double getPieces(){
		return pieces;
	}
	
	@Override
	public double earnings(){
			return getWage()*getPieces();
	}
	
	@Override
	public String toString(){
		return String.format("salaried employee: %s\n%s: $%,.2f; %s: %,.2f", 
				super.toString(),"Pieces Worker",getWage(),"Pieces worked",getPieces());
	}
	
}


//SALARIED EMPLOYEE
class CommissionEmployee extends Employee {

	private double grossSales;
	private double comissionRate;
	
	public CommissionEmployee(String first,String last,String ssn,
			double sales,double rate) 
	{
		//implicit call to object constructor occurs here
		super(first,last,ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	
	public CommissionEmployee(String first,String last,String ssn,
			double sales,double rate,date d) 
	{
		//implicit call to object constructor occurs here
		super(first,last,ssn,d);
		setGrossSales(sales);
		setCommissionRate(rate);
	}
	
	public CommissionEmployee() {
		super();
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
	
	@Override
	public double earnings(){
		return getCommissionRate() * getGrossSales();
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s\n%s: %,.2f\n%s: %.2f", 
				"commission employee",super.toString(), 
				"gross sales", getGrossSales(),
				"commissionRate", getCommissionRate());
	}
}


//INDIRECT CONCRETE SUBCLASS BASECOMMISSIONEMPLOYEE
class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last, String ssn,
			double sales,double rates,double salary) {
		super(first, last, ssn,sales,rates);
		setBaseSalary(salary);
	}
	
	public BasePlusCommissionEmployee(String first, String last, String ssn,
			double sales,double rates,double salary,date d) {
		super(first, last, ssn,sales,rates,d);
		setBaseSalary(salary);
	}
	
	public BasePlusCommissionEmployee() {
		super();
	}
	
	public void setBaseSalary(double salary){
		if(salary>=0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException("Base salary must be >=0.0");	
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	@Override
	public double earnings(){
		return getBaseSalary()+super.earnings();
	}
	
	@Override
	public String toString(){
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried",super.toString(),
				"base salary",getBaseSalary());
	}
	
}


//PAYROLL SYSTEM
class PayrollSystemTest{
	//Create subclass systems
	
	public void run(){
	SalariedEmployee sal = new SalariedEmployee("Adesina","Jones","222-22-2222",1000.0);
	HourlyEmployee hour = new HourlyEmployee("Sina","Bones","333-22-2222",18.89,40);
	CommissionEmployee com = new CommissionEmployee("Kane","Mide","444-22-2222",10000,.06);
	BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("Casper","Sam","555-22-2222",5000,.04,300);
	
	System.out.println("Employees processed individually:\n");
	
	System.out.printf("%s\n%s: $%,.2f\n\n", 
			sal,"earned",sal.earnings());
	System.out.printf("%s\n%s: $%,.2f\n\n", 
			hour,"earned",hour.earnings());
	System.out.printf("%s\n%s: $%,.2f\n\n", 
			com,"earned",com.earnings());
	System.out.printf("%s\n%s: $%,.2f\n\n", 
			base,"earned",base.earnings());
	
	// create four-element Employee array
	Employee[] employees = new Employee[4];
	
	//initialize array with Employees
	employees[0]=sal;
	employees[1]=hour;
	employees[2]=com;
	employees[3]=base;
	
	System.out.println("Employees processed polymorphically:\n");
	
	//generically process each element in array employees
	for(Employee currentEmployee: employees){
		System.out.println(currentEmployee);
		
		if(currentEmployee instanceof BasePlusCommissionEmployee){
			BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee)currentEmployee;
			
			employee.setBaseSalary(1.10*employee.getBaseSalary());
			
			System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
		}
		
		System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
	}
	
	for(int j=0;j<employees.length;j++)
		System.out.printf("Employee %d is a %s\n", j,employees[j].getClass().getSimpleName());
	
	}
}


//PAYROLL SYSTEM with exercise birthday test
class PayrollSystemModification{
	//Create subclass systems
	
	public void run(){
	SalariedEmployee laalaa = new SalariedEmployee("Adesina","Laalaa","+2348159095179",50000.0,new date(11,29,1999));
	HourlyEmployee idris = new HourlyEmployee("Idris","Bulltool","+2348107909407",3000,40,new date(2,16,1995));
	CommissionEmployee igwe = new CommissionEmployee("Igwe","General","+2348059632154",85000,.06,new date(12,15,1989));
	BasePlusCommissionEmployee rilwan = new BasePlusCommissionEmployee("Rilwan","Panels","+2348022353597",150000,.04,300,new date(10,27,1993));
	pieceWorker abdul = new pieceWorker("Ojodu","Abiodun","+2348063221575",(5.6*365),30,new date(12,15,1989));
	
	// create four-element Employee array
	Employee[] employees = new Employee[5];
	
	//initialize array with Employees
	employees[0]=laalaa;
	employees[1]=idris;
	employees[2]=igwe;
	employees[3]=rilwan;
	employees[4]=abdul;
	
	System.out.println("Employees processed polymorphically:\n");
	
	//generically process each element in array employees
	for(int month=1;month<=12;month++){
		
		System.out.println("MONTH "+month+":");
		
		for(Employee currentEmployee: employees){
			
			double earning = currentEmployee.earnings();
			
			if(currentEmployee.getBirthday().getMonth()==month){
				System.out.print("HAPPY BIRTHDAY!!! ");
				earning +=200;
			}
			
			System.out.println(currentEmployee);
			System.out.printf("earned $%,.2f\n\n", earning);
		}
		
//		for(int j=0;j<employees.length;j++)
//			System.out.printf("%s is a %s\n", employees[j].getFirstName(),employees[j].getClass().getSimpleName());
		
	}
	}
	
	
	
	
}