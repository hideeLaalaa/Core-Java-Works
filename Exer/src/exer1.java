// instructor ish
public class exer1 
{
	private String instructorName;
	private String courseName;
	
	// method to set course name
	public void setCourseName(String name)
	{
		courseName = name;// store course name
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void setInstructor(String name){
		instructorName = name;
	}
	
	public String getInstructor(){
		return instructorName;
	}
	
	// display a welcome message to the user	
	public void displayMessage()
	{
		System.out.printf("Welcome to scoresheet for \n\t%s\nLecturer"
				+ " : %s\n", getCourseName(),getInstructor());
	}


}
