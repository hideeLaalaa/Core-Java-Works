
// application that determines the nature of an integer if its + or -

import java.util.Scanner;
public class inttype 
{
	// method main begins execution of application
	public static void main(String[] args) 
	{
		// Scanner obtains input from user
		Scanner input = new Scanner(System.in);
		
		int a,b,c,d,e;
		int positive=0,negative=0,zeros=0;
		
		System.out.println(" Please make ur first entry:");
		a = input.nextInt();
		System.out.println(" Please make ur next entry:");
		b = input.nextInt();
		System.out.println(" Please make ur next entry:");
		c = input.nextInt();
		System.out.println(" Please make ur next entry:");
		d = input.nextInt();
		System.out.println(" Please make ur next entry:");
		e = input.nextInt();
		
		if ( a / 1 == -a)
			negative=negative + 1;
		if ( a /1 == a)
			positive = positive + 1;
		else
			zeros = zeros + 1;
		
		if (b / 1 == -b)
			negative=negative + 1;
		if (b /1 == b)
			positive = positive + 1;
		else
			zeros = zeros + 1;
		
		if ( c/ 1 == -c)
			negative=negative + 1;
		if ( a /1 == c)
			positive = positive + 1;
		else
			zeros = zeros + 1;
		
		if ( d / 1 == -d)
			negative=negative + 1;
		if ( d /1 == d)
			positive = positive + 1;
		else
			zeros = zeros + 1;
		
		if ( e / 1 == -e)
			negative=negative + 1;
		if ( e /1 == e)
			positive = positive + 1;
		else zeros = zeros + 1;
		
		System.out.printf("%s%d\n%s %d\n%s %d", "the number of positive integer is", positive, "The number of negative number is ", negative , "the number of zeros is", zeros);
	}
}
