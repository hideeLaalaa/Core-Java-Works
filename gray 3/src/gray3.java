 // gray 3 :gray3.java
 // GradBbook class with a constructor to initialize the course name
public class gray3 
{
	private String courseName; // course name for this GradeBook
	// constructor initializes courseName with string argument
	public gray3( String name ) // constructor name is class name
	{
		courseName = name; // initializes courseName
	}// end constructor
	
	// method to set the course name
	public void setCourseName( String name)
	{
		courseName = name; // store the courseName 
	} // end method courseName
	
	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	}// end method getCourseName
	
	// display a welcome message to the gradebook user
	public void displayMessage()
	{
		// this statement calls getCoursename to get the
		// name of the course this GradeBook user
		System.out.printf( "Welcome to the other side of Gradebook for \n%s!!\n", 
		getCourseName());
	}// end method displayMessage

}// end class gradeBook

