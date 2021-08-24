// GradeBook constructor used to specify the course name at the 
// time the object is created

public class gray3Test 
{
	// main method begins programs execution

	public static void main(String[] args) 
	{
		// create a GradeBook object
		gray3 gradeBook1 = new gray3(
				"CPE283 introduction to computer engineering workshop");
		gray3 gradeBook2 = new gray3(
				"CHE242 introduction to fluid mechanics by miss eleta");
		// display initial value of courseName for gray3
		
		System.out.printf( "gradebook1 coursename is: %s\n", 
				gradeBook1.getCourseName());
		System.out.printf( "gradebook2 coursename is: %s\n", 
				gradeBook2.getCourseName());
		
		
	} // end main

} // end class gray3Test
