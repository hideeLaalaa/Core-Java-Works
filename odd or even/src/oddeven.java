// odd or even:oddeven.java
// A program that determines if a number is odd or even
import java.util.Scanner;

public class oddeven 
{
	//main method begins execution of Java execution
	public static void main(String[] args) 
	{
		// Scanner obtains input from command line
		Scanner input = new Scanner(System.in);
												
		int x;
		
		System.out.print( "please make ur entry:");
		x = input.nextInt();
		
		
		
	if  ( ( x%2) == 0) 
		System.out.printf( "%d%s" , x, " is an even number" );
	else 
		System.out.printf( "%d%s", x , " is an odd number");
	
	
	
		
	
	}	

}
