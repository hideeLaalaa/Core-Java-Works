package classes;

import java.util.EnumSet;
//FOR STATIC IMPORT EXAMPLE
import static java.lang.Math.*;

import com.deitel.jhtp.ch08.integerClass;
import com.deitel.jhtp.ch08.integerSet;
import com.deitel.jhtp.ch08.ticPlay;
import com.deitel.jhtp.ch08.time1;
import com.deitel.jhtp.ch08.ratNumbers;
import static com.deitel.jhtp.ch08.math.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class ch8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// ****TIME1 TEST***
		//creates and initializea time1 object
/*		time1 time = new time1();
		
		//output string representations of the time
		System.out.print("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.println("The initial Standard time is: "+time.toString());
		
		//change time and output updated time
		time.setTime(13, 28,4);
		System.out.println("\nUniversal time after setTime is: "+time.toUniversalString());
		System.out.println("Standard time after setTime is: "+time.toString());
		System.out.println();
		
		//attempt to set time with invalid values
		try{
			time.setTime(99, 99, 99);
		}catch(IllegalArgumentException e){
			System.out.printf("Exception: %s\n\n", e.getMessage());
		}
		
		//display time after attempt to set invalid values
		System.out.println("After attempting invalid settings:");
		System.out.println("Universal time: "+time.toUniversalString());
		System.out.println("Standard time: "+time.toString());
*/	 //END OF TIME1TEST
		
		//***THIS-TEST****
/*		SimpleTime time = new SimpleTime(15,30,19);
		System.out.println(time.buildString());
*/	
		
		//***OVERLOAD CONSTRUCTORS***
/*		time1 t1 = new time1();
		time1 t2 = new time1(2);
		time1 t3 = new time1(21,34);
		time1 t4 = new time1(12,25,42);
		time1 t5 = new time1(t4);
		
		System.out.println("Constructed with:");
		System.out.println("t1: all arguments defaulted");
		System.out.printf("		%s\n",t1.toUniversalString());
		System.out.printf("		%s\n",t1.toString() );
		
		System.out.println("t2: hour specified; minute and second defaulted");
		System.out.printf(" 	%s\n",t2.toUniversalString());
		System.out.printf(" 	%s\n",t2.toString());
		
		System.out.println("t3: hour and minute specified; second defaulted");
		System.out.printf(" 	%s\n",t3.toUniversalString());
		System.out.printf(" 	%s\n",t3.toString());
		
		System.out.println("t4: hour,minute and second specified");
		System.out.printf(" 	%s\n",t4.toUniversalString());
		System.out.printf(" 	%s\n",t4.toString());
		
		System.out.println("t5: time1 object t4 specified");
		System.out.printf(" 	%s\n", t5.toUniversalString());
		System.out.printf(" 	%s\n", t5.toString());
		
		//attempt to initialize t6 with invalid values
		try{
			time1 t6 = new time1(27,74,99);
		}catch(IllegalArgumentException e){
			System.out.printf("\nException while initilizing t6: %s\n",
					e.getMessage());
		}
*/
		
		//*****EMPLOYEE TEST****
/*		try{
			date birth = new date(7,24,1991);
			date hire = new date(3,32,2000);
			employee employ = new employee ("Bob","Blue",birth,hire);
			System.out.println(employ);
		}catch(IllegalArgumentException e){
			System.out.println("error "+e);
		}
*/
		
		//*****ENUM TEST*****
/*		System.out.println("All books:\n");
		//print all enum book
		for(book Book:book.values())
			System.out.printf("%-10s%-45s%s\n",Book,Book.getTitle(),Book.getCopyrightYear());
		
		System.out.println("\nDisplay a range of enum constants:\n");
		//print first four books
		for(book b: EnumSet.range(book.IW3HTP, book.CPPHTP))
			System.out.printf("%-10s%-45s%s\n",b,b.getTitle(),b.getCopyrightYear());		
*/
		
		//*****EMPLOYEE TEST****
/*		//show that count is 0 before creating employees
		System.out.printf("Employees before instantiation: %d\n", 
				employee.getCount());
		//creating two employees; count should be two
		employee e1 = new employee("Susan","Baker", null, null);
		employee e2 = new employee("Bob","Black", null, null);
		//show that count is 2 after d creation
		System.out.println("\nEmployees after instatiation: ");
		System.out.printf("via e1.getCount(): %d\n",e1.getCount());
		System.out.printf("via e2.getCount(): %d\n",e2.getCount());
		System.out.printf("via employee.getCount(): %d\n", employee.getCount());
		//get names of employees
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(),
				e1.getLastName(),e2.getFirstName(),e2.getLastName());
		//only one reference to each employee,so d fllg statements indicates
		//the objects are eligible for garbage collection
		e1=null;
		e2=null;
*/
		
		//*****STATIC IMPORT****
/*		System.out.printf("sqrt(900)= %.2f\n",sqrt(900));
		System.out.printf("ceil(-9.8)= %.2f\n",ceil(-9.8));
		System.out.printf("log(E) = %f\n",log(E));
		System.out.printf("cos(0) = %f\n",cos(0));
*/
		
		//RECTANGLE TEST****
/*		Rectangle rect = new Rectangle();
		System.out.print("Enter length of rectangle:");
		rect.setLength(in.nextInt());
		System.out.print("Enter width of rectangle:");
		rect.setWidht(in.nextInt());
		System.out.println(rect);
*/
		
		//***TIME8_5 TEST****
/*		time8_5 t = new time8_5(8,4,3);
		System.out.println(t);
		t.setHour(18);
		t.setMinute(57);
		t.setSecond(22);
		System.out.println(t);
*/
		
		//****SAVINGS ACCOUNT TEST****
/*		savings hidee = new savings(2000);
		savings detunj = new savings(3000);
		savings.modifyInterestRate((float) 0.04);
		System.out.println("Mr Hidee");
		for(int i=0;i<12;i++){
			System.out.println(hidee);
		}
		System.out.println("\n\nMr Detunj");
		for(int i=0;i<12;i++){
			System.out.println(detunj);
		}
		savings.modifyInterestRate((float) 0.05);
		System.out.println("\nMr Hidee\n"+hidee);
		System.out.println("\nMr Detunj\n"+detunj);
*/
		
		//*****ENHANCED CLASS TIME8_5
/*		time8_5 t = new time8_5(6,26,59);
		System.out.println(t);
		t.tick();
		System.out.println(t);
		t.setTime(23, 59, 58);
		System.out.println(t);
		t.tick();
		t.incrementHour();
		System.out.println(t);
*/
		
		//*****ENHANCED CLASS DATE
/*		date today = new date(11,11,2019);
		for(int i=0;i<60;i++){
			today.nextDay();
			System.out.println(today);
		}
*/
		
/*		//***NEED TO FINISH CALCULATIONS OF SIN AND COSINE AND THAT OF NTH ROOT****
		System.out.printf( "sqrt( 923.0 ) = %f\n",sqrt((float)9.9,2) );
    	System.out.printf( "sqrt( 923.0 ) = %f\n",Math.sqrt(9.9) );
		float x =(float) 0.8978;
		//System.out.printf( "cos( -9.8 ) = %.1f\n", conv((float)20,(float)2/3));
		fract(x);
		System.out.printf( "PI = %f\n", Sin(23) );
*/
		
		//****TRAFFIC LIGHT SYSTEM****
/*		System.out.println("Traffic Light\n");
		//to print each traffic light
		for(book traffic:book.values())
			System.out.printf("%-10s%-1ds\n", traffic,traffic.getTime());
*/
		
		//COMPLEX NUMBER TESTING
/*		System.out.print("Enter first complex number:");
		complex a = new complex(in.nextLine());
		System.out.print("Enter operation sign:");
		String sign =  in.nextLine();
		System.out.print("Enter second complex number:");
		complex b = new complex(in.nextLine());
	    complex calc = new complex();
	    if(sign.equals('+'))
	    	System.out.println(calc.complexAdd(a, b));
	    else if(sign.equals('-'))
	    	System.out.println(calc.complexSub(a, b));
	    else
	    	System.out.println("Wrong operation sign");
	 
*/	
		
		//CLASS DATEandTIME TEST
	/*	dateAndTime dt = new dateAndTime();
		System.out.println(dt.toUniversalString());
		System.out.printf("%s\n\n", dt);
		for(int i=0;i<25;i++){
		dt.incrementHour();
		System.out.printf("%s\n", dt.toUniversalString());
		System.out.printf("%s\n\n", dt);
		}
	*/
	    
	    //***INTEGER SET TEST***
/*	try{
		integerSet setA = new integerSet(2,4,6,8,12);
	    integerSet setB = new integerSet(1,2,3,4,5,6,7,8,9,10);
	    integerSet setC = new integerSet(2,4,6,8,10,98);
	    integerSet setE = new integerSet(1,98);
	    integerSet setUni = integerSet.union(setA, setB); 
	    integerSet setInter = integerSet.intersection(setC, setE);

	    System.out.printf("%-20s:%2s\n%-20s:%2s\n%-20s:%2s\n%-20s:%2s\n\n", 
	    		"SetA",setA,
	    		"SetB",setB,
	    		"Union A and B",setUni,
	    		"Intersect A and B",setInter
	    		);
	   	setA.insertElement(198);
		
	    System.out.println("Inserting element 98 in SetA:	"+setA);
	    
	    System.out.println("\n\nIs setA and SetC equal:"+integerSet.isEqualTo(setA,setC));
	    
	    setB.deleteElement(10);
	    System.out.println("\nDeleting element 10 in SetA:	"+setB);
	    
	    System.out.println("\nPrinting setE:	"+setE);

	    System.out.println("\n\nIs setC and SetB equal:"+integerSet.isEqualTo(setB,setC));
	}catch(IllegalArgumentException e){    
		System.out.print("Exception: "+e.getMessage());
	}
*/
		
		//DATE CLASS TEST
/*		dateClass dob = new dateClass(11,29,1990);
		dateClass xmas = new dateClass("December",25,2018);
		dateClass herb = new dateClass(47,1998);
		
		System.out.printf("DOB: %-5s\nXMAS: %-5s\nHERB: %-5s", dob,xmas,herb);
*/
		
		//***RATIONAL NUMBERS***
/*		ratNumbers a = new ratNumbers(-5,6);
		ratNumbers b = new ratNumbers(8,9);
		System.out.println(new ratNumbers().div(a, b).toString(5));
*/
		
		//****INTERGER CLASS****
/*		integerClass a = new integerClass("21212");
		integerClass b = new integerClass("8779");
		integerClass c = new integerClass("18622010408");
		integerClass d = new integerClass("1111111111112981111111111");
		integerClass f = new integerClass("22");
		integerClass e = new integerClass("111111111111111111111111111");
		a.negate();
		b.negate();
//		System.out.println(a);
//		System.out.println(b);
		
		integerClass ans=integerClass.multiply(a,f);
		System.out.println(ans);
		System.out.println(integerClass.divide(ans,b));
		System.out.println(integerClass.divide(d,f));
		/*System.out.printf("%s\n%s\n%s\n%s\n%s\n%b",integerClass.isEqualTo(a, b),
				integerClass.isLessThan(a, b),integerClass.isGreaterThan(a, b),
				integerClass.isGreaterThanOrEqualTo(a, b),
				integerClass.isLessThanOrEqualTo(a, b),
				integerClass.isNotEqualTo(a, b),integerClass.isZero(b));
		*/
	
		//*****ticTacToe******//
		ticPlay.game();
		
		
	}//END OF MAIN METHOD
	
}//END OF CLASS

class SimpleTime{
	private int hour;
	private int minute,second;
	
	//if the constructor uses parameter names identical to instance
	//variable names the "this" reference is required to distinguish btw the names
	//required to distinguish the names
	public SimpleTime(int hour,int minute,int second
			){
		this.hour=hour;
		this.minute=minute;
		this.second=second;		
	}
	
	//use explicit and implicit "this" to call toUniversalString
	public String buildString(){
		return String.format("%24s: %s\n%24s: %s", 
				"this.toUniversalString()",this.toUniversalString(),
				"toUniversalString",toUniversalString());
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
	}
}


class date{
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth=
		{0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public date(int theMonth,int theDay,int theYear){
		year = theYear;
		month = checkMonth(theMonth);
		day = checkDay(theDay);
		
		System.out.printf("Date object constructor for date %s\n", this);
	}
	
	public date(){};
	
	int checkMonth(int testMonth){
		if(testMonth>0&&testMonth<=12)
			return testMonth;
		else
			throw new IllegalArgumentException("month must be 1-12");
	}
	
	
	int checkYear(int testYear){
		if(testYear>1900&&testYear<2050)
			return testYear;
		else
			throw new IllegalArgumentException("Year must be btw 1900 and 2050");
	}
	
	public void setDay(int dayy){
		day=dayy;
	}public int getDay(){return day;}
	
	public void setMonth(int monthh){
		month=monthh;
	}public int getMonth(){
		return month;	
	}
	public void setYear(int yearr){
		year=yearr;
	}
	public int getYear(){
		return year;
	}
	int checkDay(int testDay){
		if(testDay>0&&testDay<=daysPerMonth[month])
			return testDay;
		
		if(month==2&&testDay==29&&(year%400==0||(year%4==0&&year%100!=0)))
			return testDay;
		
		throw new IllegalArgumentException("days out of range for the specified month and year");
	}
	public void nextDay(){
		day++;
		if(day>0&&day==(daysPerMonth[month]+1)){
			month++;
			day=1;
		}
		if(month>0&&month==13){
			year++;
			month=1;
		}
	}
	public String toString(){
		return String.format("%d/%d/%d",month,day,year);
	}
}

class dateAndTime{
	private int month;
	private int day;
	private int year;
	private int sec;
	private int min;
	private int hour;
	public dateAndTime(){
		
	}
	date Date = new date(12,30,2018);
	time8_5 Time = new time8_5(23,58,59);
	
	public void incrementHour(){	
		Time.incrementHour();
		if(Time.getHour()==0){
			Date.nextDay();
		}
	}
	
	public String toString(){
		return String.format("%s\t%s", Date,Time);
	}
	
	public String toUniversalString(){
		return String.format("%s\t%s",Date,Time.toUniversalString());
	}
}

class time8_5{
private int second=0;
	
	//no argument constructor
	public time8_5(){
		this(0,0,0);
	}
	
	public time8_5(int h){
		this(h,0,0);
	}
	
	public time8_5(int h,int m){
		this(h,m,0);
	}
	
	public time8_5(int h,int m,int s){
		setTime(h,m,s);
	}
	//time1 object supplied
	public time8_5(time8_5 time){
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	
	public void setTime(int h,int m,int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h){
		if(h>=0&&h<24)
		{
			second-=(getHour()*3600);
			second+=(h*3600);
		}
		else
			throw new IllegalArgumentException("hour must be 0-23");
	}
	
	public void setMinute(int m){
		if(m >=0&&m<60)
		{
			second-=(getMinute()*60);
			second+=(m*60);
		}
		else
			throw new IllegalArgumentException("minute must be 0-59");
	}
	
	public void setSecond(int s){
		if(s>=0&&s<60)
		{
			second-=getSecond();
			second+=s;
		}
		else
			throw new IllegalArgumentException("second must be 0-59");
	}
	
	public int getHour(){
		return (second/3600)%24;
	}
	
	public int getMinute(){
		return ((second-getHour()*3600)/60)%60;
	}
	
	public int getSecond(){
		return (second%60)%60;
	}
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d %s", 
				( (getHour()==0||getHour()==12) ? 12 : getHour()%12 ),
				getMinute(),getSecond(),(getHour()<12?"AM":"PM"));
	}
	
	public void tick(){
		second++;
	}
	
	public void incrementMinute(){
		second+=60;
	}
	
	public void incrementHour(){	
		second+=3600;
	}
}

class dateClass{
	date check = new date();
	private static final String[] month = {"January","February","March"
			,"April","May","June","July","August","September",
			"October","November","December"
	};
	
	private static final int[] daysPerMonth=
		{0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	private int day = 0;
	private int mm =0;
	private int year =0;
	
	public dateClass(int mm,int dd,int yy){
		setDate(mm,dd,yy);
	}
	
	public dateClass(String m,int dd,int yy){
		setDate(getMm(m),dd,yy);
	}
	
	public dateClass(int ddd,int yyyy){
		setDate(ddd_M(ddd),ddd_D(ddd),yyyy);
	}
	
	public dateClass(){
		setDate(1,1,1900);
	}
	
	public void setDate(int month,int day,int year){
		this.mm=check.checkMonth(month);
		this.day=this.checkDay(day);
		this.year=check.checkYear(year);
	}
	
	public String getMonth(int mm){
		return this.month[mm-1];
	}
	
	int checkDay(int testDay){
		if(testDay>0&&testDay<=daysPerMonth[mm])
			return testDay;
		
		if(this.mm==2&&testDay==29&&(this.year%400==0||(this.year%4==0&&this.year%100!=0)))
			return testDay;
		
		throw new IllegalArgumentException("days out of range for the specified month and year");
	}
	
	public int ddd_M(int ddd){
		int M=0;
		for(int i=1;i<this.daysPerMonth.length;i++){
			if(ddd>daysPerMonth[i])
				ddd-=daysPerMonth[i];
			else {
				M = i;
				break;}
		}
		return M;
	}
	
	public int getDdd(){
		int ddd=0;
		for(int i=1;i<this.mm;i++){
				ddd+=daysPerMonth[i];
		}
		return (this.day+ddd);
	}
	
	public int ddd_D(int ddd){
		int D=0;
		for(int i=1;i<this.daysPerMonth.length;i++){
			if(ddd>daysPerMonth[i])
				ddd-=daysPerMonth[i];
			else {
				D = ddd;
				break;}
		}
		return D;
	}
	
	public int getMm(String m){
		int month=0;
		for(int i=0;i<this.month.length;i++){
			if(this.month[i].equals(m))	
				month=(i+1);
		}
		if(month==0)
			throw new IllegalArgumentException("Month doesnt exist");
		return month;
	}
	
	public String toString(){
		String date = this.mm+"/"+this.day+"/"+this.year+"\n"
				+this.getMonth(this.mm)+" "+this.day+", "+this.year
				+"\n"+getDdd()+" "+this.year+"\n";
		return date;
	}
	
}

class employee
{
	private String firstName;
	private String lastName;
	private date birthDate;
	private date hireDate;
	private static int count=0;
	
	//initialize employee ,add 1 to static count and
	//output string indicating that constructor  was called
	public employee(String first,String last,date dob,date hd){
		firstName = first;
		lastName = last;	
		birthDate = dob;
		hireDate = hd;
		++count;//increment static count of employees
		System.out.printf("Employee constructor: %s %s; count"
				+ " = %d\n",firstName,lastName,count);
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public static int getCount(){
		return count;
	}
	
	public String toString(){
		return String.format("%s,%s Hired: %s Birthday: %s", 
				firstName,lastName,birthDate,hireDate);
	}
}


class Rectangle{
	private float length =1,width=1;
	
	public void setLength(float length){
		if(length>0&&length<20.0)
		this.length=length;
	}
	
	public float getLength(){
		return length;
	}
	
	public float getWidth(){
		return width;
	}
	
	public void setWidht(int width){
		this.width=width;
	}	
	
	public double perimeter(){
		return (2*(length+width));
	}
	
	public double area(){
		return length*width;
	}
	
	public String toString(){
		return String.format("Length:%.2f\nBreadth:%.2f\nArea is %.2f\nPerimeter is %.2f", getLength(),getWidth(),area(),perimeter());
	}
}



class savings{
	private static float annualInterestRate;
	private float savingsBalance;
	private int m;
	private String[] month = {"January","February","March"
			,"April","May","June","July","August","September",
			"October","November","December"
	};
	
	public savings(int savings){
		savingsBalance=savings;
	}
	
	public void monthlyInterest(){
		double interest=annualInterestRate/12*savingsBalance;
		savingsBalance+=interest;
	}
	
	public static void modifyInterestRate(float rate){
		annualInterestRate = rate;
	}
	
	public String toString(){
		monthlyInterest();
		return String.format("%-10s%.2f", month[(m++)%12],savingsBalance);
	}
}