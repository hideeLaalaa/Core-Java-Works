import java.util.Random;
import java.util.Scanner;
public class Arra {

	private static final Random rand = new Random();
	private static int wager;private static int balance=1000;
	private enum Status{ CONTINUE,WON,LOST};
	private static Scanner in = new Scanner(System.in);
	private static final int SNAKE_EYES = 2;
	private static final int TREY =3;
	private static final int SEVEN =7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		int loss[] = new int[22];
		int win[]=new int[22];
		int count=0;
		System.out.println("Welcome to the craps game");
		while(count <11000000){
		int myPoint=0;
		Status gameStatus;
		int sumOfDice = rollDice();
		
		switch(sumOfDice)
		{
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				win[1]++;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				loss[1]++;
				break;
			default:
				gameStatus =Status.CONTINUE;
				myPoint = sumOfDice;
				//System.out.printf("Point is %d\n", myPoint);
				break;
		}
		int cont=1;
		while(gameStatus == Status.CONTINUE){
			sumOfDice = rollDice();
			cont++;
			if(sumOfDice == myPoint){
				gameStatus = Status.WON;
				if(cont>20) cont=21;
				win[cont]++;
			}
			else if (sumOfDice == SEVEN){
				gameStatus = Status.LOST;
				if(cont>20) cont=21;
				loss[cont]++;}
			count++;
		}
		
		/*if(gameStatus == Status.WON){
			System.out.println("Player wins");
			balance = balance + wager;}
		else if(gameStatus == Status.LOST){
			System.out.println("Player loses");
			balance = balance - wager;
			}
		*/	
		//		balance();
	//	comment();
		}
		System.out.printf("%5s%10s%10s\n","S/N","Win","Loss");
		for(int d=1;d<22;d++){
			System.out.printf("%5d%10d",d,win[d]);
			System.out.printf("%10s\n",loss[d]);
		}
		int total=0;
		for(int d:win) total+=d;
		System.out.println("total of win is "+ total);
		total=0;
		for(int d:loss) total+=d;
		System.out.println("Total of losses is "+ total);
	}
	
/*	public static void bet(){
		do{
		System.out.print("Enter the amount you want to wager:");
		wager=in.nextInt();
		if(wager>balance) System.out.println("You cant wager what you dont have");
		}while(wager>balance);
	}
	
	public static void balance(){
		System.out.println("BALANCE IS "+ balance);
	}
	
	public static void comment(){
		if (balance == 0)
			System.out.println("Sorry you busted!!!");
		if(balance <1000)
			switch(balance/100){
			case 9:System.out.println("Aw C'mon,take a chance");break;
			case 8:System.out.println("Its never too late to take a big chance");break;
			case 7:System.out.println("You still garrit!!");break;
			case 6:System.out.println("How far na?");break;
			case 5:System.out.println("Oh Shit!!!");break;
			case 4:System.out.println("Its going down for real!!!!");break;
			case 3:System.out.println("Oh,You are going for broke");break;
			case 2:System.out.println("Rolling in the deep!!!");break;
			case 1:System.out.print("Luck running out uhn????");break;
			case 0:System.out.println("Sorry you just got busted!!!");break;
			}
		int more = rand.nextInt(6);
		if(balance>1000)
			switch(more){
			case 0: System.out.println("You're up big now. Now's the time to cash in");break;
			case 1: System.out.println("A rich man in the making");break;
			case 2: System.out.println("You still gat the money");break;
			case 3: System.out.println("More money Less luck they say");break;
			case 4: System.out.println("Stil maiking profit");break;
			default:
				System.out.println("C'mon, The higher the stake,the higher the money");
			}
		if(balance > 5000)
			System.out.println("You are a boss in this thing!!!...");
		if(balance > 7000)
			System.out.println("Shit you really gat this luck of a thingy working for you wella");
		if(balance>10000)
			System.out.println("Hahaha!! do you want to drain the money in our account");
		
			
	}
*/	
	public static int rollDice(){
		int die1 = 1 + rand.nextInt(6);
		int die2 = 1 + rand.nextInt(6);
		
		int sum = die1 + die2;
		
		//System.out.printf("Player rolled %d + %d = %d\n", die1,die2,sum );
		return sum;
	}


}
