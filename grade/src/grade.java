// grade: grade.java
// gradeBook class that contains a courseName instance variable
// and method to get and set its value

public class grade
{
	private String courseName; // course name for this gradeBook
	
	// method to set the course name
	public void setCourseName( String name)
	{
		courseName = name; // store the course name 
	}// end method setCourseName
	
	// method to retrieve course name 
	public String getCourseName()
	{
		return courseName;
	}// end method getcourseName
	
	// display a welcome message to the gradeBook user
	public void displayMessage()
	{	
		// calls getCourseName to get name of 
		// the course this GradeBook represents
		System.out.printf( "Welcome to te grading book for \n%s!\n",
				getCourseName() );
	}
} 
