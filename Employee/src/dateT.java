import java.util.Scanner;

import employee.date;
public class dateT {
	
	
	public static void main(String[] args) {
	int day;
	int month;
	int year;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		date dateT= new date(0,0,0);
		
		System.out.println("Please enter today's day:");
		day = input.nextInt();
		dateT.setDay(day);
		
		System.out.println("please enter the month we are in?:");
		month=input.nextInt();
		dateT.setMonth(month);
		
		System.out.println("Which year is it?:");
		year=input.nextInt();
		dateT.setYear(year);
		
		//dateT.getDate();
		
		
	}

}
