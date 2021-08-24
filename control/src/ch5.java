import java.util.Scanner;
public class ch5 {

	public static void main(String[] args) {
		
		/*double amount;
		double princpal=1000.0;
		double rate=0.05;
		
		System.out.printf("%s%13s\n", "Head","Amounts");
		
		for(int year=10;year<=20;year++){
			amount=princpal*Math.pow(1.0+rate, year);
		System.out.printf("%4d%,17.3f\n",year,amount);
		}*/
		
		/*ch55 test =new ch55("Maccurson first");
		test.display();
		test.input();
		test.report();
	*/
		// TRUTH TABLE
/*		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
				"Conditional AND (&&)","false && false",(false && false),
				"false && true",(false && true),"true && false",(true && false),"true && true",(true && true));
		
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
				"Conditional OR (||)","false || false",(false || false),
				"false || true",(false || true),"true || false",(true || false),"true || true",(true || true));

		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
				"Boolean logical operator AND (&)","false & false",(false & false),
				"false & true",(false & true),"true & false",(true & false),"true & true",(true & true));
	
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
				"Boolean logical inclusive OR (|)","false | false",(false | false),
				"false | true",(false | true),"true | false",(true | false),"true | true",(true | true));

		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n", 
				"Boolean logical exclusive OR (^)","false ^ false",(false ^ false),
				"false ^ true",(false ^ true),"true ^ false",(true ^ false),"true ^ true",(true ^ true));
*/
		//smallest integer
/*		Scanner input = new Scanner(System.in);;
		System.out.println("Enter  the amount of numbers you wish to compare:");
		int no=input.nextInt();
		int number;int smallest = 1000000;
		for(int i=1;i<=no;i++){
			System.out.printf("Enter number %d:",i);
			number = input.nextInt();
		
			if(number<smallest)
				smallest = number;
		}System.out.print(smallest);
	*/
		
		//factorial of 1-20
/*		System.out.printf("%s%30s\n", "number","Factorial");
		for(long i = 1;i<=20;){
			long no =i;
			long fact = 1;
			while(no>0){
						fact =fact * no;
						no--;
			}
			System.out.printf("%d!%,30d\n",i,fact);
			i++;
		}
	*/
			//Modified Compound-Interest Program
/*		double amount;double principal=1000.00;int rate = 5;
		for(rate=5;rate<=10;){
			System.out.printf("%s%20s %d\n", "Year","Amount on deposit",rate);
			
		for(int year = 1;year<=10;year++){
			double fate = (double) rate/100;
			amount = principal*Math.pow(1.0+fate, year);
			System.out.printf("%4d%,20.2f\n",year,amount);
		}System.out.println("\n");
		rate++;
		}
	*/
		//5.15a
/*		for(int x=0;x<10;x++){
			for(int no=x;no>=0;no--){
			System.out.print("*");}
			System.out.println();
		}*/
		//5.15b
/*	for(int x=10;x>=0;x--){
		for (int no=x;no>0;no--){
			System.out.print("*");
		}System.out.println();
	}*/
		//5.15C
/*		for(int x=10;x>=0;x--){
			int no=10-x;
			for(int noo=no;noo>0;noo--){
				System.out.print(" ");
			}
			for(int n=x;n>0;n--){
				System.out.print("*");
			}System.out.println();
		}*/
		//5.15D
/*		for(int x=10;x>0;x--){
			int no=x-1;
			for(int noo=no;noo>0;noo--){
				System.out.print(" ");
			}
			for(int n=10-no;n>0;n--){
				System.out.print("*");
			}System.out.println();
		}
	*/
		
		//BAR CHART PRINTING PROGRAM USING ASTERIKS
/*		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st bar number:");
		int no1=input.nextInt();
		System.out.println("Enter the 2nd bar number:");
		int no2=input.nextInt();
		System.out.println("Enter the 3rd bar number:");
		int no3=input.nextInt();
		System.out.println("Enter the 4th bar number:");
		int no4=input.nextInt();
		System.out.println("Enter the 5th bar number:");
		int no5=input.nextInt();
		
		for(int i=30;i>0;i--)
			{	
				if(no1==i)System.out.printf("%d\t***\t",i);
					else if(no1>i)System.out.printf("%d\t* *\t",i);
						else System.out.printf("%d\t\t",i);
				if(no2>=i)System.out.print("***\t");
					else if(no2>i)System.out.print("* *\t");
						else System.out.print("\t");
				if(no3>=i)System.out.print("***\t");
					else if(no3>i)System.out.print("* *\t");
						else System.out.print("\t");
				if(no4>=i)System.out.print("***\t");
					else if(no4>i)System.out.print("* *\t");
						else System.out.print("\t");
				if(no5>=i)System.out.print("***\t");
					else if(no5>i)System.out.print("* *\t");	
						else System.out.print("\t");
				System.out.println();
			}
		System.out.print("*********a*******b*******c*******d*******e*******");
	*/
		//CALCULATING SALES INPUTTING BOTH PRODUCT IDENTIFIER AND QUANTITY TOGETHER	
/*			Scanner input=new Scanner(System.in);
		int pair=0;double retail = 0;double total = 0;
		do
			{
				System.out.println("Enter the product no and quantity 2gedaa..-1 to stop entry:");		
				pair=input.nextInt();
				if(pair/100!=0&&pair/100<10)
				{
					int a= pair%10;
					int b=(pair/100)%10;b=b*10;
					a=b+a;
					
					switch(pair/100){
					case  1:
						total=2.98*a;
						break;
					case 2:
						total=4.50*a;
						break;
					case 3:
						total=9.98*a;
						break;
					case 4:
						total=4.49*a;
						break;
					case 5:
						total=6.87*a;
						break;
					default:
						System.out.println("first digit does not correspond to any product identifier");
					}
					
							retail =retail+ total;
				
				}
			}	while(pair!=-1);
		System.out.printf("your total retail sales is %,.2f", retail);
	*/
		// SYSTEM AUTO PRINTS TRUE OR FALSE IF CONDITIONAL STATEMENT IS TRUE OR FALSE
/*			int i=1;int j=2;int k=3;int m=2;
			System.out.println(k+m<j | 3-j>=k);
			System.out.println(!(k>m));
	*/
		// 	CALCULATING THE VALUE OF PIE
/*		double pie=4;double j=5;int no=2;
		for(double i=3;i<=296000;i+=4){
			pie=pie-(4/i);
			pie=pie+(4/j);
			j+=4;
			System.out.printf("%s%20s\n%d%20f\n","TERMS","PIE",no,pie);
			no+=2;
		}
	*/
		//	PYTHAGORAS QUESTION UNSOLVED
		
		//TRIANGLE PRINTING SIDE BY SIDE
/*		for(int x=0;x<10;x++){
			for(int no=x;no>=0;no--){System.out.print("*");}
				for(int sp=x;sp<=9;sp++){System.out.printf("%s"," ");}
		int boo=10-x;
			for (int bo=boo;bo>0;bo--){	System.out.print("*");	}
				for(int sp=1+x;sp>0;sp--){System.out.printf("%s"," ");}
		int go=x;
			for(int noo=go+1;noo>0;noo--){System.out.print(" ");}
			for(int n=10-x;n>0;n--){System.out.print("*");}
		int so=10-x;
			for(int noo=so;noo>0;noo--){System.out.print(" ");}
			for(int n=x;n>=0;n--){System.out.print("*");}
					System.out.println();
		}
*/
		// DE MORGAN'S LAW OF CONDITIONAL STATEMENT
/*		int x=6;int y=5;int a=4;int b=5;int g=5;
		System.out.printf("%s%30s", "Example","Demorgan's equivalent");
		System.out.printf("\n%s%20s", "!(x<5)&&!(y>=7)","!((x<5)||(y>=7))");
		System.out.printf("\n%b%20b",!(x<5)&&!(y>=7),!((x<5)||(y>=7)));
		System.out.printf("\n%s%20s", "!(a==b)||!(g!=5)","!((a==b)&&(g!=5))");
		System.out.printf("\n%b%20b",!(a==b)||!(g!=5),!((a==b)&&(g!=5)));
		System.out.printf("\n%s%20s", "!((x<=8)&&(y>4))","!(x<=8)||!(y>4)");
		System.out.printf("\n%b%20b",!((x<=8)&&(y>4)),!(x<=8)||!(y>4));
		System.out.printf("\n%s%20s", "!((a>4)||(b<=6))","!(a<4)&&!(b<=6)");
		System.out.printf("\n%b%20b",!((a>4)||(b<=6)),!(a<4)&&!(b<=6));
	*/
		//DIAMOND PRINTING AND MODIFIED PRINTING PROGRAM 
/*		System.out.println("Enter the number of rows:");
		Scanner input = new Scanner(System.in);
		double enter =  input.nextInt();
		int b=1;int c=4;int w=0;double d;
		for(double i = 1;i <= enter;i++){
			if(i<=enter/2 +0.5)d = enter-i;else{
				if(enter%2==1){w=w+4;d=i-1;}
				else {w+=4;d=i;}
			}
			for(double a=d;a>=0;a--){
				System.out.print(" ");
				if(a==0){for(int z=b;z>w;z--)System.out.print("*");}
			}
			System.out.println();
			b=b+2;
			c--;		
	}
*/	
		// USING A STRUCTURED PROGRAM TO REPLACE A BREAK STATEMENT
/*		for(int i=0,j=0;i<10;i++){
			if(i<=4)
				System.out.println(i);
		}
*/
		// USING A STRUCTURED PROGRAM TO REPLACE A CONTINUE STATEMENT
/*		for(int i=0;i<=10;i++){
			if(i!=4)
				System.out.printf("%d\t",i);
		}
*/
		//THE TWELVE DAYS OF CHRISTMAS SONG
/*		int number; 
		for(number =1;number<=12;number++){
			switch(number){
			case 1:
				System.out.println("On the first day of christmas my true love sent to me:");
				break;
			case 2:
				System.out.println("On the second day of christmas my true love sent to me:");
				break;
			case 3:
				System.out.println("On the third day of christmas my true love sent to me:");
				break;
			case 4:
				System.out.println("On the fourth day of christmas my true love sent to me:");
				break;
			case 5:
				System.out.println("On the fifth day of christmas my true love sent to me:");
				break;
			case 6:
				System.out.println("On the sixth day of christmas my true love sent to me:");
				break;
			case 7:
				System.out.println("On the seventh day of christmas my true love sent to me:");
				break;
			case 8:
				System.out.println("On the eight day of christmas my true love sent to me:");
				break;
			case 9:
				System.out.println("On the ninth day of christmas my true love sent to me:");
				break;
			case 10:
				System.out.println("On the tenth day of christmas my true love sent to me:");
				break;
			case 11:
				System.out.println("On the eleventh day of christmas my true love sent to me:");
				break;
			case 12:
				System.out.println("On the tweelfth day of christmas my true love sent to me:");
				}
			for(int rep = number;rep > 0;rep--){
				switch(rep){
				case 1:
					System.out.println("A patridge in a pear tree");
					break;
				case  2:
					System.out.println("Two turtle doves");
					break;
				case 3:
					System.out.println("Three french hens");
					break;
				case 4:
					System.out.println("Four calling birds");
					break;
				case 5:
					System.out.println("Five golden rings");
					break;
				case 6:
					System.out.println("Six geese a laying");
					break;
				case 7:
					System.out.println("Seven swams a swimming");
					break;
				case 8:
					System.out.println("Eight maids a milking");
					break;
				case 9:
					System.out.println("Nine ladies dancing");
					break;
				case 10:
					System.out.println("Ten lords a leaping");
					break;
				case 11:
					System.out.println("Eleven pipers a piping");
					break;
				case 12:
					System.out.println("Twelve drummers a drumming");
				}
			}
			System.out.println("********************************************************");
			System.out.println("*********************************************************");
		}
*/
			//MAKING A DIFFERENCE //FACEBOOK ISH//
/*		long principal=500000000;double amount=0.00;
		double rate = 0.05;int counter =1;
		while(amount<1000000000){
			amount= principal*(Math.pow(1.0+rate, counter));
			counter++;
			System.out.println("month "+ counter + " is "+(long) amount
					);
		}
		System.out.println("number of months is " + counter);
	*/	
		
		
	}

}
