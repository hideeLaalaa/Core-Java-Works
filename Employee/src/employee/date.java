package employee;

//date test
public class date {
//	private int day;
//	private int month;
//	private int year;
//
//	public date(int dayy,int  monthh,int yearr) {
//		day=dayy;
//		month=monthh;
//		year=yearr;
//		
//	}public void setDay(int dayy){
//		day=dayy;
//	}public int getDay(){return day;}
//	
//	public void setMonth(int monthh){
//		month=monthh;
//	}public int getMonth(){return month;}
//
//	public void setYear(int yearr){
//		year=yearr;
//	}public int getYear(){return year;}
//	
//	public void getDate(){
//		System.out.printf("today's date is : %d/%d/%d",getDay(),getMonth(),getYear());
//	}
//	
	
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth=
		{0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public date(int theMonth,int theDay,int theYear){
		year = checkYear(theYear);
		month = checkMonth(theMonth);
		day = checkDay(theDay);
		
	//	System.out.printf("Date object constructor for date %s\n", this);
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

class math{
	
	public static float sqrt(float x){
		float ret=0;
		for(float i=1;i<x;i++){
			if(i*i==x)
				ret=i;
		}
		return ret;
	}
	
	public static double floor(double x){
		return (int)x;
	}
	
	public static double ceil(double x){
		return ((int)x+1);
	}
	
	public static double PI(){
		return 22/7;
	}
	
	public static double E(){
		return 2.71828;
	}
}
