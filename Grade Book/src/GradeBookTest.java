// Grade Book Test: GradeBookTest.java
// Creating a GradeBook object and calling its displayMessage method
import java.util.Scanner;

public class GradeBookTest
{
	// main method begins execution of java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from user
		Scanner input = new Scanner(System.in);
		// Creating a GradeBook object and assigning it to myGradebook
		GradeBook myGradeBook = new GradeBook();
		
		// prompt for an input course name
		System.out.println( "please enter the course name:");
		String nameOfCourse = input.nextLine(); // read a line of text
		System.out.println(); // outputs a blank line
		
		// call my gradebook's displayMessage method
		// and pass nameOfCouurse as an argument
		myGradeBook.displayMessage( nameOfCourse);

	} // end method main

}// end class GradeBookTest
