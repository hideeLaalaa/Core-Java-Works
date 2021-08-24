import java.util.Random;
import java.util.Scanner;

public class maTutor {

	public static int pass;
	private static int iSign;
	public static int counter;
	private static int level;
	private static final Random ran = new Random();
	private static int x;
	private static int y;
	private static int sign=0;// field accessible to all methods of this class
	public static void main(String[] args) {
	

	
	Scanner in = new Scanner(System.in);
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
	}
	System.out.println("\t\t"+(pass*100/counter)+"%");
	if((pass*100/counter)<75){
		System.out.println("Please ask your teacher for extra help");}
	else
		System.out.println("Congratulations, you are ready to go the next level");
	System.out.println();
	}while(y==10);
}

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
}

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
}

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
}

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
}
