import java.util.Scanner;
public class EmployT {

	public static void main(String[] args) {
		Employ Employee1 = new Employ("","",0.0);
		Employ Employee2 = new Employ("","",0.0);
		Scanner input = new Scanner(System.in);
		
		String firstName;
		System.out.println("Employee1 Enter your first name:");
		firstName=input.nextLine();
		Employee1.setName(firstName);
		String lastName;
		System.out.println("Employee1 Enter your Last name:");
		lastName=input.nextLine();
		Employee1.setLName(lastName);
		
		System.out.println("Employee2 Enter your first name:");
		firstName=input.nextLine();
		Employee2.setName(firstName);
		System.out.println("Employee2 Enter your Last name:");
		lastName=input.nextLine();
		Employee2.setLName(lastName);
		
		double sal;
		System.out.printf("%s How much do you collect monthly:\n",Employee1.getName());
		sal=input.nextDouble();
		Employee1.setSal(sal);
		System.out.printf("%s Your annual salary is %.2f\n",Employee1.getName(),Employee1.yearSal());
		System.out.printf("Wow new annul sal after raise is %.2f\n",Employee1.promo());
		
		
		System.out.printf("\n\n%s How much do you collect monthly:\n",Employee2.getName());
		sal=input.nextDouble();
		Employee2.setSal(sal);
		System.out.printf("%s Your annual salary is %.2f\n",Employee2.getName(),Employee2.yearSal());
		System.out.printf("\nWow new annul sal after raise is %.2f\n",Employee2.promo());
			
	
	}

}
