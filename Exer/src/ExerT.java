// 
import java.util.Scanner;
public class ExerT {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		exer1 myexer = new exer1();
		
		System.out.println( "Please enter the name of the course: " );
		String Course = input.nextLine();
		myexer.setCourseName(Course);
		System.out.println();
		
		System.out.println( "Please enter the name of the Lecturer: " );
		String instructor = input.nextLine();
		myexer.setInstructor(instructor);
		System.out.println();
		
		myexer.displayMessage();
		
	
		
		
		
		
	}

}
