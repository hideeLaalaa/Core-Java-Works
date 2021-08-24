import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	public static int quotient(int numerator,int denominator) throws ArithmeticException
	{
			return numerator/denominator;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		
		do{
			try{
				System.out.print("Please enter an integer numerator: ");
				int numerator = input.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = input.nextInt();
				
				int result = quotient(numerator,denominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator,denominator,result);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException){
				System.err.println( "Exception: "+inputMismatchException);
				input.nextLine();
				
				System.out.println("You must enter integers. Please try again.\n");
			}
			catch(ArithmeticException arithmeticException){
				System.err.println( "Exception: "+arithmeticException);
				System.out.println("Zero is an invalid denominator. Please try again. \n");
			}
		}while(continueLoop);

	}

}
