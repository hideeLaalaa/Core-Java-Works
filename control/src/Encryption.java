//Making a difference chapter 4
import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
		//**ENCRYPTING A FOUR DIGIT NUMBER ENTERED AS INPUT**//
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 4-digit code:");
		int no=input.nextInt();
		while(no/10000!=0){
			System.out.println("Must be 4-digit code,nothing more nothing less:");
			no=input.nextInt();
		}
		while(no/1000==0){
			System.out.println("Must be 4-digit code:");
			no=input.nextInt();
		}
		if(no/10000==0)
			if(no/1000!=0){
				int last=no%10;
				int third=(no/10)%10;
				int sec=(no/100)%10;
				int first=(no/1000);
				last=(last+7)%10;
				sec=(sec+7)%10;
				third=(third+7)%10;
				first=(first+7)%10;
				int one=third;
				int two=last;
				int three=first;
				int four=sec;
				System.out.printf("e digit is %d%d%d%d", one,two,three,four);
				}

		//***DECRYPTING THE ENCRYPTED NUMBER***//
/*		Scanner input=new Scanner(System.in);
*/		System.out.println("\n\nEnter the 'e' 4-digit code:");
		 no=input.nextInt();
		while(no/10000!=0){
			System.out.println("Must be 4-digit code,nothing more nothing less:");
			no=input.nextInt();
		}
		while(no/1000==0){
			System.out.println("Must be 4-digit code:");
			no=input.nextInt();
		}
		if(no/10000==0)
			if(no/1000!=0){
				int last=no%10;
				int third=(no/10)%10;
				int sec=(no/100)%10;
				int first=(no/1000);
				int one=third;
				int two=last;
				int three=first;
				int four=sec;
				if(one==9){
					one = one -7;
				}else if(one==8) {one=one-7;}
				else one=one+3;
				if(two==9){
					two = two -7;
				}else if(two==8) two=two-7;
				else two=two+3;
				if(three==9){
					three = three -7;
				}else if(three==8) three=three-7;else three=three+3;
				if(four==9){
					four = four -7;
				}else if(four==8) four=four-7;
				else four=four+3;	
				System.out.printf("'d' digit is %d%d%d%d", one,two,three,four);
			}
		
		
	}

}
