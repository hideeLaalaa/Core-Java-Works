import java.util.Scanner;
public class ch4 {
	public static void main( String[] args )
	 {
		
		// gas mileage...calc gas per mile
		/*Scanner input = new Scanner(System.in);
		int miles=0;
		int gallon=0;
		String name;
		double milesT=0;
		double gallonT=0;
		double avr=0;
		System.out.println("Please enter ur name:");
		name=input.nextLine();
		
			while (gallon!=-1)	
				while (miles!=-1)
			{
					System.out.println("Enter -1 to exit Enter the number of miles driven:");
					miles = input.nextInt();
					if (miles!=-1){
					System.out.println("Enter -1 to exit Enter the no of gallons used for the miles driven:");
					gallon=input.nextInt();
					if (gallon!=-1){
					double total= (double) miles/gallon;
					System.out.printf("Your miles per gallon for this trip is :%.2f\n", total);
					avr= avr + total;
					}
					}
					else gallon = miles;
					
					
				
		}
		System.out.printf("Dear %s Your average miles per gallon for all the trips so far is: %.2f m/g\n", name,avr);
		*/
		//****credit limit calculator
/*		Scanner input=new Scanner(System.in);
		int choice=0;
		while(choice!=-1){
			System.out.println("press -1 to end...any number to continue to next user:");
			choice=input.nextInt();
		if(choice!=-1){
		ch44 test = new ch44(0,0,0,0,0,"");
		String names;
		System.out.println("Enter ur name:");
		names = input.next();
		test.setName(names);
		
		
		System.out.println("Enter ur acct no:");
		int  account = input.nextInt();
		test.setAcc(account);
		System.out.println("Enter ur beginning balance of the month:");
		int balance = input.nextInt();
		test.setBalance(balance);
		System.out.println("Enter the total of items charged:");
		int charge = input.nextInt();
		test.setCha(charge);
		System.out.println("Enter the total credits applied tp the customer's account:");
		int credit = input.nextInt();
		test.setCr(credit);
		System.out.println("Enter the allowed credit limit:");
		int limit=input.nextInt();
		test.setLimit(limit);
		if (test.newBalance()>limit)
			System.out.println("credit limit exceeded");
		else
			System.out.printf("\nDear %s Acct number %d,Your new balance is %d\n",test.getName(),test.getAcc(), test.newBalance() );
		}
		}
	*/
		//*** sales commission calculator
/*		Scanner input = new Scanner(System.in);
		int choice=0;
		while(choice!=-1){
		System.out.println("any number to continue to next worker...-1 to end");
		choice=input.nextInt();
		if(choice!=-1){
	ch44 test= new ch44("",239,129,99,350,200,0);
	System.out.println("Name of worker:");
	String names=input.next();
	test.setName(names);
	
	
	System.out.println("Enter the amount of item1 sold this week:");
	int quan=input.nextInt();
	test.setQuan(quan);
	test.Item1();
	System.out.println("Enter the amount of item2 sold this week:");
	quan=input.nextInt();
	test.setQuan(quan);
	test.Item2();
	System.out.println("Enter the amount of item3 sold this week:");
	quan=input.nextInt();
	test.setQuan(quan);
	test.Item3();
	System.out.println("Enter the amount of item4 sold this week:");
	quan=input.nextInt();
	test.setQuan(quan);
	test.Item4();
	test.salary();
	System.out.printf("Dear %s your salary for this week is :%.2f\n", test.getName(),test.salary());
		}
	}*/
		//***Salary calculator
/*		Scanner input = new Scanner(System.in);
		int no=0;
		while(no<3){
			no++;
		ch44 test = new ch44("",0,0);
		System.out.printf("Enter the name of employee %d:", no);
		String names=input.next();
		test.setName(names);
		System.out.printf("Enter the number of hours worked by employee %d last week:",no);
		int hours=input.nextInt();
		test.sHour(hours);
		System.out.printf("Enter employee %d's hourly rate:",no);
		int rates=input.nextInt();
		test.sRate(rates);
		System.out.printf("Dear %s,your gross pay for this week is : %.2f\n"
				+ "", test.getName(),test.gross());
		}
*/		
		//***Find the largest integer
/*	Scanner input=new Scanner(System.in);
	int no=0;
	int greatest=0;
	int counter=1;
	int number=1;
	while(number!=-1){
		System.out.printf("-1 to end..Enter the number %d:",counter);
	number=input.nextInt();
	counter++;
		if (number>no){
		greatest = number;
		}
			no=number;
	}
	System.out.printf("Greatest number so far is %d", greatest);
	*/
		
		//***Tabular output
/*		int no=0;
		System.out.println(" N		10*N		100*N		1000*N\n");
		while (no<5){
			no++;
			int a = 10 * no;
			int b = 100*no;
			int c = 1000*no;
			System.out.printf(" %d		%d		%d		%d\n", no,a,b,c);
		}*/
		
		//***find the two largest numbers
/*		Scanner input=new Scanner(System.in);
		int greatest2=0;
		int greatest1=0;
		int number1=0;
		int counter=1;
		int number2=0;
		while(number1!=-1){
			System.out.printf("Enter number %d:",counter++);
		number1=input.nextInt();
		if(number1!=-1){
		System.out.printf("Enter number %d:", counter++);
		number2=input.nextInt();
			if(number2!=-1){
			if (number1>greatest1){
				greatest1=number1;
			}else if(number1>greatest2){greatest2=number1;}
			if(number2>greatest1){
				greatest2=number2;
			}else if(number2>greatest2) greatest2=number2;
		}else number1=number2;
		}
						}
		System.out.printf("Greatest numbers so far are %d and %d", greatest1,greatest2);
	*/		
		//***Square of asteriks...so cool
/*		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of the sides of the square:");
		int row=input.nextInt();
		if(1<row)
		if(row<20){
		int co=row;
		int column;
			column=1;
			
			while(column<=co)
			{
				System.out.print(row%2==1? "* " : "* ");
				++column;
			}
			System.out.println();
			int hollow=row-2;
			column=1;
			co=co-1;
			while(hollow>=1){
			System.out.print("* ");
			column=1;
			
			while(column<co){
				System.out.print("  ");
				++column;}
			System.out.print("*\n");
			hollow--;}
			co=row;
			column=1;
			while(column<=co)
			{
				System.out.print(row%2==1? "* " : "* ");
				++column;
			}
		}*/
		
		//*****Palindromes e.g 11211
/*		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 5 digits number:");
		int five=input.nextInt();
		while((five/10000)>=10){
			System.out.println("Oh my error..the number must be 5 digits:");
			five=input.nextInt();
		}
		while((five/10000)==0){
			System.out.println("Oh my error..the number must be 5 digits:");
			five=input.nextInt();
		}
		
		if((five/10000)<10)
		if((five/10000)!=0){
			System.out.println("Alright");
			int one=(five/10000);int last=(five%10);
			int two=(five%10000)/1000;int four=(five/10)%10;
			
			if(one==last){
				if(two==four){
					System.out.printf("%d is a palindromes",five);}
					else{System.out.printf("I'm afraid %d is not a palindromes", five);}
					}
				else{System.out.printf("I'm afraid %d is not a palindromes", five);}
		}*/
		
		
		//*****decimal equivalent of a binary number
		//for binary but can be edited to converting from any base to decimal"changing mult or 
		//asking user to input base which is the mult"
	/*	Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the binary number you wish to convert to decimal:");
		int number=input.nextInt();
			int first=(number)%10;
		int div=10;
		int mod=10;
		int rest=first;
		int bin;
		int total=0;
		int mult=2;
		int count=0;
		while(count<=9){
			if(first<=1){
			if(rest<=1){
			rest=(number/div)%mod;
			bin=rest*mult;
			div=div*10;
			count++;
			mult=mult*2;
			total=total+bin;}
			else{
				System.out.println("The binary number must bee in 1 and 0 only..Enter again:");
				number=input.nextInt();
				count=0;
				div=10;
				mult=2;
				first=(number)%10;
				rest=first;}
			}
		else{
			System.out.println("The binary number must bee in 1 and 0 only..Enter again:");
			number=input.nextInt();
			count=0;
			div=10;
			mult=2;
			first=(number)%10;
			rest=first;
		}
		}
		total=total+first;
	System.out.printf("Decimal equivalent for %d is: %d",number,total);
*/
		//***CHECKBOARDS PATTERN OF ASTERIKS
	/*	int c=1;
		int d=1;
		int a=0;
		while(a<4)	
		{	while(c<=8){
			System.out.print("* ");
			c++;
			}
		System.out.println();
			while(d<=8){
			System.out.print(" *");
			d++;
			}
		System.out.println();
		a++;c=1;d=1;
		}
	*/
		//***infinite loop of multiplies of 2...eventually it stops at 10 digits
/*		int a=2;
		while(a!=0){
			System.out.println(a);
			a=a*2;
		}
*/
		//***Triangle is unfinished...sthg abt rules governing tri and right angled triangles
/*		Scanner input=new Scanner(System.in);
		System.out.println("Enter nonzero 3 digits number each representing sides of a triangle:");
		int tri=input.nextInt();
		int count=1;
		int last=0;int first=0;int sec=0;
		while(tri/1000!=0)
		while(count<=3){System.out.println("Error number must be 3 digits...re enter:");
		tri=input.nextInt();
		count++;}
		if(tri/1000==0){
			if(tri%10!=0){last=tri%10;}
			if((tri/10)%10!=0){sec=(tri/10)%10;}
			if(tri/100!=0){first=tri/100;}
			}
		if (last==first)
			if(first==sec){System.out.println("All sides are equal");}
*/
		//***Factorial of non negative integer
/*		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number you wish to find its factorial:");
		int number=input.nextInt();
		while (number<0){
			System.out.println("Enter the number you wish to find its factorial:");
			number=input.nextInt();
		}
		int fact;int coef=0;int total=1;
		while (coef<number){
			fact=number-coef;
			total=total*fact;
			coef++;
		}
		System.out.printf("\n%d! is %d", number,total);
*/		
		//***getting value of constant 'e'
/*		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms to cal value of math constant 'e':");
		int e=input.nextInt();
		double total=1;int no=1;int co=0;int coe=0;int fact=1;int calc;
		while(co<e){
			while(coe<no){
				fact=(no-coe)*fact;
				coe++;
			}System.out.println(fact);
			total=total+(1/(double)fact);
			no++;co++;coe=0;fact=1;
		}
		System.out.println(total);
*/
		//***value of e^x
/*		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms to calculate e^x:");
		int e=input.nextInt();
		double total=1;int mult=e;int no=1;int co=0;int coe=0;int fact=1;int calc;
		while(co<e){
			while(coe<no){
				fact=(no-coe)*fact;
				coe++;
			}System.out.printf("%d! is %d\n",no,fact);
			total=total+(mult/(double)fact);
			no++;co++;coe=0;fact=1;
			mult=e*mult;
		}
		System.out.printf("e^%d is %.2f",e,total);
*/		
		
		
		} ///
}
