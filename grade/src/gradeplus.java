// Book: Book.java
// Creating and manipulating a Book object

public class gradeplus
{
	// main method begins a program execution
	public static void main(String[] args) 
	{
		// create a Scanner to obtain input from command window
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// create a book and assign it to mybook
		grade myGrade = new grade();
		
		// To display initial value of courseName
		System.out.printf( "initial value of course name is %s\n\n " , 
				myGrade.getCourseName() );
		
		// prompt for and read course name
		System.out.println( "Please enter the course name:");
		String courseName = input.nextLine();
		myGrade.setCourseName(courseName);// set the  course name 
		System.out.println();// outputs a blank line 
		
		// display a welcome message after specifying course name 
		myGrade.displayMessage();
		
	}

}
