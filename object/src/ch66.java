import java.util.Scanner;
import java.util.Random;
public class ch66 {
	private enum coin{TAILS,HEADS}; 
	private enum stat{WON,EXIT,PLAY};
	private static stat stat;
	public static int pass;
	private static int iSign;
	public static int counter;
	private static int level;
	private static final Random ran = new Random();
	private static int x;
	private static int y;
	private static int sign=0;// field accessible to all methods of this class
	public static void main(String[] args) {
		
		//maximum of three numbers
/*		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three decimal values seperated with spaces:");
		double number1= input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		double result=maximum(number1,number2,number3);
		
		System.out.println("maximum is "+ result +"    "+ Math.floor(result));
	}
		
		public static double maximum(double x,double y,double z ){
			double max=x;
			if (y>max) max=y;
			if (z>max) max=z;
			return max;
		}
*/
		//SCOPE FIELD AND LOCAL VARIABLE ISH
/*		int x=7; //main's local variable shadows field
		System.out.println("Local x is " + x);
		local();
		field();
		local();
		field();
		System.out.printf("\n local x in main is %d\n",x);
	}
	
	public static void local(){
		int x=62; //just for this method
		System.out.println("\nOn entering local variable is " + x);
		++x;
		System.out.printf("\n On exitting local variable is %d\n", x);
	}// end method local
	
	public static void field(){
		System.out.println("\nOn entering field is  " + x);
		x*=14;
		System.out.println("\n On exit field is "+ x );
		}// end method field
	*/
		// METHOD OVERLOADING..DIFF METHODS WITH SAME NAME
/*		System.out.printf("Square of integer 7 is %d\n", square(7));
		System.out.printf("Square of double 7.5 is %f\n",square(9.0));
	}//end main
	
	public static int square(int value){
		System.out.printf("\n Called square with int argument: %d\n", value);
		return value*value;
	}
	public static double square(double value){
		System.out.printf("\nCalled square with double argument is %f\n", value);
		return value*value;
	}*/
		//PARKING CHARGES
/*		Scanner input = new Scanner(System.in);
		int hours;
		do{
		System.out.print("-1 to exit..Please enter the hours parked yesterday for this customer:");
		hours=input.nextInt();
		if(hours<=24)
		System.out.println("You parked for "+ hours+ " hours yesterday,ur charge is $"+charges(hours));
		else System.out.println("C'mon there are just 24 hours in a day\n");
		}while(hours !=-1);
	}
	public static double charges(int hours){
		double amount;
		switch(hours){
		case 1:case 2:case 3:amount = 2.00;
		break;
		case 24: amount = 10.00;
		break;
		default: amount =(0.5 *(hours -3))+ 2;
		}
		return amount;
	}*/
		// ROUNDING NUMBERS TO FLOOR DOUBLE
/*		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number:");
		double x = input.nextDouble();
		double y = (int) x;
		System.out.printf("the original number is %.2f\nThe rounded number is %.1f ",x,y);
	*/
		//ROUNDING NUMBERS TO HUNDRETH,THOUSANDTH AND TENTH 
/*		double y = 55.278;
		double x =(int)(y*10+0.5);
		System.out.println(x/10);
		System.out.println((int) y);
		double z=((int)(y*100+0.5));
		System.out.println(z/100);
		double thou=(int)( y*1000+0.5);
		System.out.println(thou/1000);
	*/
		//WRITING METHOD TO RAISE AN INTEGER TO POWER  AND TESTING
/*		int base;int power;
		Scanner input = new Scanner(System.in);
	   do{
		   System.out.print("Enter the base number and power seperated with a space or enter:");
		   base=input.nextInt();
		   power=input.nextInt();
	   }while(base<0&&power<0);
	   System.out.print(power(base,power));
	}// end main
	public static int power(int base,int power){
		int x= base;
		for(int i=1;i<power;i++)
			base=base*x;
		return base;
 	}
*/	
		//METHOD HYPOTENUSE CALC AND TEST
/*		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sides of the triangle seperated with a space:");
		double y=input.nextDouble();
		double x=input.nextDouble();
		System.out.print(hypotenuse(y,x));	
	}// end main
	
	public static double hypotenuse(double side1,double side2){
		side1*=side1;side2*=side2;
		return Math.sqrt(side1+side2);	
   	}// end method
*/	
		//METHOD MULTIPLES
/*		Scanner input= new Scanner(System.in);
		int no1;int no2;
		do{
			System.out.print("-1 to exit...Enter both numbers seperated with space:");
			no1=input.nextInt();
			no2=input.nextInt();
			System.out.println(multiple(no1,no2));
		}while(no1!=-1||no2!=-1);
	}// END MAIN
	
	public static boolean multiple(int number1,int number2){
		boolean x=(number1%number2==0);
		return x;
	}
*/	
		// EVEN OR NOT(ODD)
/*	Scanner in = new Scanner(System.in);
	int no;
	do{
			System.out.print("Enter the number you want to test if its even or not:");
			no=in.nextInt();
			if(no!=-1)
			System.out.println(even(no));
		}while(no!=-1);
	}END MAIN
	
	public static boolean even(int number){
		return number%2==0;
	}
*/
		//METHOD DISPLAYING A SQUARE OF ASTERIKS
/*	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of sides:");
	int sides=input.nextInt();
	square(sides);
	}//END MAIN
	
	public static void square(int number){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the character to be filled:");
		char fill = input.next().charAt(0);
		for(int s=1;s<=number;s++){
		for(int i=1;i<=number;i++)
			System.out.printf(fill+" ");
			System.out.println();
		}
			}
*/
		//METHOD TO CALCULATE AREA OF A CIRCLE
/*		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius:");
		double rad = in.nextDouble();
		System.out.println("The area of your circle is "+ circleArea(rad));
	}end main
	
	public static double circleArea(double radius){
		double area=(Math.PI*Math.pow(radius, 2));
		return area;
	 }
*/
		//TESTING AND METHOD FOR SEPERATING DIGITS
/*		Scanner input = new Scanner(System.in);
		System.out.print("Enetr the digits:");
		int digit = input.nextInt();
		sep(digit);
	}

	public static void sep(int a){
		for(int i=100000000;i>0;i/=10){
			int se=a/i;
			int s=se%10;
			if(se!=0)
			System.out.printf("%d  ",s);
			
		}//END LOOP
	  }//END METHOD TO SEPERATE DIGITS
  */
		//TEMPERATURE CONVERSION
/*		Scanner input = new Scanner(System.in);
		System.out.print("Enetr the celsius value:");
		double cel=input.nextDouble();
		System.out.println("Fahrenheit corresponding value is "+fahrenheit(cel));
		System.out.print("Enter the fahrenheit value:");
		double fah=input.nextDouble();
		System.out.println("The Celsius corresponding value is "+celsius(fah));
	}//End main
	
	public static double fahrenheit(double celsius){
		double fah= 9.0/5.0 * celsius + 32;
		return fah;
	}
	public static double celsius(double fah){
		double celsius= 5.0/9.0 * (fah - 32);
		return celsius;
	 }
  */	
		//METHOD TO GET THE SMALLEST OF THREE NUMBERS
/*		Scanner in=new Scanner(System.in);
		System.out.print("Enter the three floating point numbers you want to compare:");
		float x= in.nextFloat();
		float y = in.nextFloat();
		float z = in.nextFloat();
		System.out.println("Minimum of the three is "+ min3(x,y,z));
	}//End main
	
	public static float min3(float a,float b,float c){
		return Math.min(a, Math.min(c, b));
	  }
  */
		// PERFECT NUMBERS
/*		displayPrime(100000);
	}//end main
	
	public static void displayPrime(int no )
	{	for(int i=1;i<=no;i++)
		{	int div=0;
			for(int j=i;j>1;j--)
			{	if(i%j==0)
				{	div=i/j + div;
					if(div==i)
					{
						System.out.println(i + " is a perfectly perfect number");
						System.out.print("Factors are: ");
						for(int k=i;k>1;k--)
							if(i%k==0)System.out.print(i/k + " ");
							System.out.println();
					}
				}
			}
			
		}
	 }
  */
		// PRIME NUMBERS....6.25C SKIPPED
	/*	for(int i=1;i<=20000;i++)
		prime(i);
	}//end main
	
	public static void prime(int number){
		int pri=0;
		for(int i=2;i<number;i++){
			if(number%i==0)
			pri = -1;
		}
		if(pri!=-1)
			System.out.println(number +" is a prime number");
		//else
			//System.out.println(number +" is not a prime number");
		}
	*/	
		// METHOD TO REVERSE DIGITS OF A GIVEN NUMBER
/*		reverse(7654321);
	}//end main
	
	public static void reverse(int number){
		for(int i=10;i<1000000000;i*=10){
			if(number/(i/10)!=0){
			int rev=(number/(i/10))%10;
			System.out.print(rev);}
		}
	 }
  */
		// GREATEST COMMON DIVISOR OF TWO NUMBERS
/*		System.out.print(gcd(48,gcd(165,111)));
	}//end method
	
	public static int gcd(int x,int y){
		int a=x;int b=y;
		if(y>x){a=y;b=x;}
		while(a%b!=0){
			int first=a%b;
			a=b;b=first;
		}
		if(a%b==0)return b;
		return b;
	  }
  */
		// METHOD THAT RETURN GRADE POINT 
/*		Scanner input = new Scanner(System.in);
		System.out.print("Enter grade:");
		int grade=input.nextInt();
		System.out.print("grade point is "+ gPoint(grade));
	}//end main
	
	public static int gPoint(int number){
		int gp;
		switch(number/10){
		case 9:case 10:
			gp= 4;
			break;
		case 8:
			gp= 3;
			break;
		case 7:
			gp= 2;
			break;
		case 6:
			gp= 1;
			break;
		default:
			gp= 0;
			break;	
		}
		return gp;
	 }
  */	
	
		// EX 6.29 COIN TOSSING
/*		Scanner in = new Scanner(System.in);
		int choice;int count=0;int head =0;int tail=0;coin stat;
		do{
			System.out.print("1 to continue tossing coin,2 to exit");
			choice=in.nextInt();
			if(choice==1){
				count +=1;
			switch(flip()){
			case HEADS:
				head+=1;
				break;
			case TAILS:
				tail+=1;
			}
			}else if(choice!=2)System.out.println("Wrong choice");
		}while(choice!=2);
		System.out.print(count+" rolls\n"+"Tail is "+tail+" and head is "+ head);
	}//END MAIN
	
	public static coin flip(){
		int fli=ran.nextInt(2);
		if(fli==1)
		return coin.HEADS;
		else
			return coin.TAILS;
	 }
  */
		//GUESS THE NUMBER
	/*	Scanner in=new Scanner(System.in);
		while(stat!=stat.EXIT){
			play();
			System.out.println("Do you wish to continue(y/n)");
			stat=(in.next().charAt(0)=='y')?stat.PLAY:stat.EXIT;
		}
	}//end main
	
	public static void play(){
		Scanner in =new Scanner(System.in);
		int count=0;int a=15;
		int number=1+ran.nextInt(1000);
		while(stat!=stat.WON&&count<=a){
			count++;
			System.out.print("Guess the number btw 1 and 1000:");
			int guess=in.nextInt();
			if(guess<=1000&&guess>0)
			{
			if(guess==number){
				if(count<10){System.out.println("WOW!!! Unbelievable,bet you were lucky");}
				if(count>10){System.out.println("Thumbs up!!!but you could have done better");}
				if(count==10){System.out.println("HaHaHa you know the secret");}
				stat=stat.WON;
			}
			if(guess<number){
				if(number-guess<=10)
				System.out.println("low but really close");
				else
				System.out.println("Too low and not even close");
				stat=stat.PLAY;
			}
			if(guess>number){
				if(guess-number<=10)
					System.out.println("Its a lil bit high");
				else
				System.out.println("Too high");
				stat=stat.PLAY;
			}	
			System.out.println(count+" trials out of "+a);
			if(count>a)
				System.out.println("You were unable to guess "+number+" in time,GAMEOVER");
			}else System.out.println("Guess should be between 1 and 1000");
		}
	  }
  */
		// DISTANCE BETWEEN POINTS
/*		Scanner in = new Scanner(System.in);
		System.out.println("Enter coordinates in the form (x1,y1,x2,y2) seperated with space: ");
		int x1=in.nextInt();
		int y1=in.nextInt();
		int x2=in.nextInt();
		int y2=in.nextInt();
		System.out.print("the distance between the two points is "+distance(x1,y1,x2,y2));
	}
	
	public static double distance(double x1,double y1,double x2,double y2){
		double x=Math.pow(x2-x1,2);
		double y=Math.pow(y2-y1, 2);
		return Math.sqrt(y+x);
	 }
  */
		//TABLE OF BINARY,OCTAL AND HEXADECIMAL NUMBERS

		base();
		}// END MAIN
	
	public static void base(){
		System.out.printf("%s%22s%22s%22s\n","S/N","Binary","Octal","Hexadecimal");
		
		for(int number =1;number <= 255;number++)
		{
				System.out.printf("%4d",number);
				int bin=number;int binary=0;int a=8;
			
			for(int i= 256;i>0;i/=2)
				{
					int x=bin/i;
					bin=bin%i;
					binary= (int) (binary+(x*Math.pow(10, a)));
					a--;
				}// END BINARY
				
				System.out.printf("%20d",binary);
				int octal=0;int oct=number;int b =3;
				
			for(int i=512;i>0;i/=8)
				{
					int x = oct/i;
					oct=oct%i;
					octal=(int) (octal+(x*Math.pow(10, b)));
					b--;	
				}// END OCTAL

				System.out.printf("%20d",octal);
				int hexal=0;int hex=number;int c=2;
		
			for(int i= 256;i>0;i/=16)
				{
					int x= hex/i;
					hex=hex%i;
					hexal = (int) (hexal+(x*Math.pow(10, c)));
					c--;	
				}// END HEXADECIMAL
			
			System.out.printf("%20d", hexal);
			System.out.println();
		}// END BIG FOR
	 }// END METHOD BASE....
  
		//MAKING A DIFFERNCE CH6 ALL QUESTIONS
/*		Scanner in = new Scanner(System.in);
		int y;
		do{
		System.out.print("Student enter a difficulty level btw 1-5:");
		level=in.nextInt();
		System.out.print("1 for addition,2 for subtraction,3 for product\n4 for division,5 for random:");
		sign=in.nextInt();
		y=0;
		while(y<10){
			multGame();
			y++;
		}//END WHILE
		System.out.println("\t\t"+(pass*100/counter)+"%");
		if((pass*100/counter)<75){
			System.out.println("Please ask your teacher for extra help");}
		else
			System.out.println("Congratulations, you are ready to go the next level");
		System.out.println();
		}while(y==10);//END DO WHILE
	}//END MAIN
	
	public static int multGame(){
		Scanner in = new Scanner(System.in);
		x=1+ran.nextInt(level());
		y=1+ran.nextInt(level());
		int ans;int count=0;
		do{
			sign();
			ans=in.nextInt();
			if(ans!=iSign){count++;
				comment(2);}
			else if(ans==iSign){
				comment(1);pass+=1;count=3;}
			if(count==2)
				System.out.println("you couldnt get that in time");
			counter++;
		}while(ans!=iSign&&count<2);
		return pass;
	}//END METHOD OF THE GAME
	
	public static int level(){
		int i;
		switch(level){
		case 1:
			i= 9;break;
		case 2:
			i= 20;break;
		case 3:
			i= 50;break;
		case 4:
			i= 100;break;
		case 5:
			i= 1000;break;
			default:i=1;
		}
		return i;
	}//END METHOD LEVEL
	
	public static int sign(){
		int rape;
		if(sign==5)
			rape=1+ran.nextInt(4);
		else
			rape=sign;
		switch(rape){
		case 1:System.out.printf("How much is %d + %d:", x,y);iSign=x+y;break;
		case 2:System.out.printf("How much is %d - %d:", x,y);iSign=x-y;break;
		case 3:System.out.printf("How much is %d * %d:", x,y);iSign=x*y;break;
		case 4:System.out.printf("How much is %d / %d:", x,y);iSign=x/y;break;
		default:iSign=0;
		}
		return iSign;
	}//END METHOD SIGN
	
	public static void comment(int comment){
		if(comment ==1)
			switch(1+ran.nextInt(5)){
			case 1:System.out.println("Excellently answered!!");break;
			case 2:System.out.println("Keep up the good work!!!");break;
			case 3:System.out.println("Nice work!");break;
			case 4:System.out.println("Dope! ");break;
			case 5:System.out.println("Very good!!! a whole thumb up for you");break;
			}
		if(comment ==2)
		switch(1+ran.nextInt(5)){
		case 1:System.out.println("No. Please try again");break;
		case 2:System.out.println("Wrong. Try once more");break;
		case 3:System.out.println("Dont give up!");break;
		case 4:System.out.println("No. Keep trying");break;
		case 5:System.out.println("I believe you can do it");break;
		}
  	}// end comment
 */
	
		
	
}	
