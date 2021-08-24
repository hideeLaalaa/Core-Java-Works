/*import java.util.Scanner;
public class controll {
	private String Cn;
	public controll(String name) {
		Cn=name;
	}
	public void setCn(String name){
		Cn=name;
	}
	public String getCn(){
		return Cn;
	}
	public void display(){
		System.out.printf("Welcome to the gradebook for \n\t%s!!\n\n", getCn());
	}
	public void average(){
		Scanner input = new Scanner(System.in);
		int total=0;
		int grade=0;
		int counter=-1;
		double average;
		int no=1;
		
		while(grade!=-1){
			total=grade + total;counter++;
			System.out.printf("-1 to end..Enter ur grade%d:",no);
			grade=input.nextInt();
			
			
			no++;
		}
		
	if (counter!=0){
		System.out.printf("counter is %d and total is %d", counter,total);
		average=(double)total/counter;
		System.out.printf("\nThe average of the grades is %.2f",average);
	}
	else
		System.out.println("no grades were entered");
	}
	
}*/
		
import java.util.Scanner;
public class controll {
	private String Cn;
	public controll(String name) {
		Cn=name;
	}
	public void setCn(String name){
		Cn=name;
	}
	public String getCn(){
		return Cn;
	}
	public void display(){
		System.out.printf("Welcome to the gradebook for \n\t%s!!\n\n", getCn());
	}
	public void school(){
		Scanner input = new Scanner(System.in);
		int pass=0;
		int fail=0;
		int grade;
		int counter=0;
		while (counter<10){
		System.out.print("Please enter the grade 1 for pass and 2 for fail:\n");
		grade=input.nextInt();
		counter++;
		
		if (grade==1){
			pass++;
		}
		else if(grade == 2){
			fail++;
		}
		else{
			System.out.println("The grade entered cannot be processed");
			counter--;
		}
	}
		System.out.printf("The number of students that passed is %d\nand the ones that failed is %d\n", pass,fail);
		if (pass>8){
			System.out.println("Bonus to insructor");
		}
		else if (fail>=6){
			System.out.print("majority failed....aigoo!!!");
		}
		else{
			System.out.println("Hmmmn...dont even know what to say!!");
		}
			
	}
	
}
