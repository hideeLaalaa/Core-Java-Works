import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tort_hare {
	private Random ran = new Random();
	private enum tort{FAST_PLOD,SLIP,SLOW_PLOD};
	private enum hare{SLEEP,BIG_HOP,BIG_SLIP,SMALL_HOP,SMALL_SLIP};
	private String [] race = new String[71];
	private int t=0,h=0;
	private Scanner in = new Scanner(System.in);
	private JTextArea diss = new JTextArea(10,10);

	public Tort_hare() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){

		//tortoise and the hare race test
		Tort_hare test = new Tort_hare();
		test.move();
	}

	public void move(){
		boolean status = true;
		tort torty;
		hare hary;
		System.out.print("BANG !!!!!!\nAND THEY ARE OFF!!!!!\n\n");
		while(status==true){
			reset();
			stat();
			field();
			
			if(t>=70||h>=70)
				status=false;
//			in.nextInt();
		}
		win();
		System.out.println("\nHERE IS YOUR PAIL OF FRESH CARROTS AND LETTUCE!");
	}
	
	public void reset(){
		for(int i=0;i<race.length;i++)
			race[i]="_";
	}
	
	public void stat(){
		int number =1+ ran.nextInt(10);
		switch(number){
		case 1:case 2:
			t+=3;h=h;
			if(t>70) t=70;
			if(t!=h){
				race[t]="T";
				race[h]="H";}
			else
				race[t]="OUCH";
			break;
		case 3: case 4:
			t+=3;h+=9;
			if(t>70) t=70;
			if(h>70) h=70;
			if(t!=h){
				race[t]="T";
				race[h]="H";}
			else
				race[t]="OUCH";
			break;
		case 5:
			t+=3;h-=12;
			if(t>70) t=70;
			if(h<0) h=0;
			if(t!=h){
				race[t]="T";
				race[h]="H";}
			else
				race[t]="OUCH";
			break;
		case 6:case 7:
			t-=6;h++;
			if(h>70) h=70;
			if(t<0) t=0;
			if(t!=h){
				race[t]="T";
				race[h]="H";}
			else
				race[t]="OUCH";
			break;
		case 8:
			t++;h++;
			if(t>70) t=70;
			if(h>70) h=70;
			if(t!=h){
				race[t]="T";
				race[h]="H";}
			else
				race[t]="OUCH";
			break;
		case 9:case 10:
			t++;h-=2;
			if(t>70) t=70;
			if(h<0) h=0;
			if(t!=h){
				race[t]="T";
				race[h]="H";}
			else
				race[t]="OUCH";
			break;
		}
	}//end method stat to move tortoise and the hare
	
	
	public void field(){
		System.out.print("POSIT  :");
		for(int i=1;i<race.length;i++)
			System.out.printf("%4d",i);
		System.out.print("\nSTART>> ");
		for(String i:race){
			System.out.printf("%4s",i);
		}
		System.out.print(" <<<END\n\n\n");
	}
	
	public void win(){
		if(t>=70&&h<70)
			System.out.print("\nTORTOISE WINS!!!!\nYAY!!!!!");
		if(h>=70&&t<70)
			System.out.print("\nHare wins. Yuch");
		if(h>=70&&t>=70)
		switch(ran.nextInt(2)){
		case 0:
			System.out.print("\nTorty!!...Give it up for the underdog!!");
			break;
		case 1:
			System.out.print("\nIts a tie!!!!\n   What a race!!");
		}
		}
	
	}

