import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ch7 {
	private static Scanner in = new Scanner(System.in);
	private static Random ran = new Random();

	public static void main(String[] args) {
		
	/* int[] array;
		array = new int[10];
		System.out.printf("%s%8s\n","Index","Value");
		
		for(int counter =0;counter <array.length;counter++)
			System.out.printf("%5d%8d\n",counter,array[counter]);
	*/
		
	/*	int[] array = {10,123,133,373,191,283,162,176,777,198};
		
		System.out.printf("%s%8s\n", "Index","Value");
		
		for(int counter =0;counter <array.length;counter++)
			System.out.printf("%5d%8d\n", counter,array[counter]);
	*/
		
	/*	final int ARRAY_LENGTH =10;
		int[] array = new int[ARRAY_LENGTH];
		
		for(int counter =0;counter <array.length;counter++)
			array[counter]=2+2*counter;
		System.out.printf("%s%8s\n","Index","value");
		
		for(int counter =0;counter<array.length;counter++)
			System.out.printf("%5d%8d\n", counter,array[counter]);
		
		int total=0;
		for(int counter=0;counter<array.length;counter++)
			total+=array[counter];
		System.out.printf("Total of array element is %d", total);
  */
		
	/*	int[] array = {0,0,10,0,0,1,2,4,5,8,1};
		System.out.println("Grade distribution");
		
		for(int counter=0;counter<array.length;counter++){
			if(counter==10)
				System.out.printf("%5d", 100);
			else
				System.out.printf("%02d-%02d:",counter*10,counter*10+9);
			
			for(int stars=0;stars<array[counter];stars++)
				System.out.print("*");
			
			System.out.println();
		}
	*/
		
	/*	int[] freq = new int [7];
		
		for(int roll=1;roll<=6000000;roll++)
			++freq[1+ran.nextInt(6)];
		
		System.out.printf("%s%10s\n", "Face","Frequency");
		
		for(int face =1;face<freq.length;face++)
			System.out.printf("%4d%10d\n", face,freq[face]);
	*/
		
	/*	int[] responses = {1,2,4,1,3,5,2,3,4,2,2,1,3,4,5,2,3,4,3,14};
		int[] frequency= new int[6];
		
		for(int answer =0;answer<responses.length;answer++)
		{
			try
			{
				++frequency[responses[answer] ];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.printf("   responses[%d] = %d\n\n",answer,responses[answer] );
			}
		}
		
		System.out.printf("%s%10s\n", "Rating","Frequency");
		
		for(int rating=1;rating <frequency.length;rating++)
			System.out.printf("%6d%10d\n", rating,frequency[rating]);
	*/
		
		//********DECK OF CARDS TEST********** 
		DeckOfCards decky = new DeckOfCards();
		/*decky.shuffle();//place card in random order
		
		// print all 52 cards in the order in which they are dealt
		for(int i=1;i<=52;i++)
		{
			//deal and display a card
			System.out.printf("%-19s", decky.dealCard());
			
			if(i%4==0)
				System.out.println();
		}*/
	/*	int hand1,hand2;
		do{
		decky.shuffle();
		System.out.println("\tHAND1");
		decky.dealing();
		hand1=decky.better();
		System.out.print(hand1+" is hand1");
		
		System.out.println("\n\tHAND2");
		decky.dealing();
		hand2=decky.better();
		System.out.print(hand2+" is hand2");
		if(hand1>hand2)
			System.out.println("\nHand1 is better");
		else
			System.out.println("\nHand2 is better\n");
		}while(hand1<5&&hand2<5);
	*/
		// ENHANCED FOR TEST
	/*	int[] array = {12,3,2,1,6,78,4212,34,15};
		int total =0;
		//add each element's number to total
		for(int number:array)
			total+=number;
		
		System.out.print("Total of all elements in the array is "+total);
	*/
		
		//ARRAY REFERENCE AND VALUE CALL
/*		int [] array = {1,23,3,4,45,5,6,2};
		
		System.out.println("Effects of passing reference to entire array:\n"
				+ "The values of the original array are:");
		
		//output array elements
		for(int value:array)
			System.out.printf("   %d", value);
		
		modifyArray(array);
		System.out.println("\n\n The values of the modified array are:");
		
		//output modified array elements 
		for(int value:array)
			System.out.printf("   %d", value);
		
		System.out.printf("\n\nEffects of  passing array element value:\n"
				+ "array[3] before modifyElement: %d\n", array[3]);
		modifyElement(array[3]);
		System.out.printf("array[3] after modify element: %d\n", array[3]);
	}//END MAIN
		
		public static void modifyArray(int[] array2){
			for(int counter =0;counter<array2.length;counter++)
				array2[counter]*=2;
		}
		
		public static void modifyElement(int element){
			element*=2;
			System.out.printf("Value of element in modifyElement: %d\n", element);
		}
    */
		
		// GRADEBOOK7 TEST
	
	/*	int[] gradeArray = {99,98,96,34,56,45,21,67,89,65,4,3,2,56,43,21};
		gradeBook7 test = new gradeBook7("Welcome to CS101 Introduction to programming",gradeArray);
		test.displayMessage();
		test.processGrades();
	}// end main
*/
	/*
		int [][] array1 = { {1,45,5},{4,27,3}};
		int [][] array2 = { {1,2,4},{6},{7,5}};
		
		System.out.println("Values in array1 by row are");
		outputArray(array1);
		System.out.println("\nValues in array2 by row are");
		outputArray(array2);
	}//end main
	
	public static void outputArray(int[][] array){
		for(int row=0;row<array.length;row++){
			for(int column =0;column<array[row].length;column++)
				System.out.printf("%d  ", array[row][column]);
			System.out.println();
		}
	  }
  */
	//GRADEBOOK TEST USING TWO DIMENSIONAL ARRAY
/*		int [][] grad ={ {87,94,59},{82,23,21},{56,99,77},{37,59,67},{63,58,74},{27,63,58},{77,58,96},{25,45,69},{58,23,14},{98,97,96},{35,36,34}  };
				gradeBook7 test = new gradeBook7("Welcome to gradeBook test",grad);
				test.displayMessage();
				test.processGrades();
	  }
 */
	// ELLIPSES ... TO CREATE METHODS THAT RECEIVE UNSPECIFIED  NUMBER OF ARGUMENTS	
/*		double d1=10.0;
		double d2=20.0;
		double d3=30.0;
		double d4=40.0;
		
		System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",d1,d2,d3,d4);
		System.out.printf("Average of d1 and d2 is %.1f\n",average(d1,d2));
		System.out.printf("Average of d1, d2 and d3 is %.1f\n",average(d1,d2,d3));
		System.out.printf("Average of d1, d2, d3 and d4 is %.1f\n",average(d1,d2,d3,d4));
	}// END MAIN
	
	public static double average(double... number){
		double total=0.0;
		for(double d:number)
			total+=d;
		return total/number.length;
	  }
  */		
	
		// USING COMMAND LINE ARGUMENTS
/*		if(args.length!=4){
			System.out.println("Error: please re-enter the entire command, including array size,initial value and increment");
		}
		else{
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int [arrayLength];
			
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			int test = Integer.parseInt(args[3]);
			
			for(int counter = 0;counter<array.length;counter++)
				array[counter]= test - initialValue + increment * counter;
			
			System.out.printf("%s%8s\n", "Index","Value");
			for(int counter =0;counter < array.length;counter++)
				System.out.printf("%5d%8d\n", counter,array[counter]);
		}//end else
		
	  }//end main
  */
		// ****CLASS ARRAYS****
	/*	double [] doubleArray = {8.4,3.2,6.9,7.6,2.4};
		Arrays.sort(doubleArray);
		System.out.printf("\ndoubleArray:");
		
		for(double value: doubleArray)
			System.out.printf("%.1f ", value);
		
		//Fill 10-element array with 7s
		int [] filledIntArray = new int[10];
		Arrays.fill(filledIntArray, 7);
		displayArray(filledIntArray,"filledIntArray");
		
		//copy array intArray into array intArrayCopy
		int[] intArray = {1,2,3,4,5,6};
		int[] intArrayCopy = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");
		
		//compare intArray and intArrayCopy for equality
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("\n\nintArray %s intArrayCopy\n",(b ? "=":"!="));
		
		//compare intArray and filledIntArray for equality
		b=Arrays.equals(intArray, filledIntArray);
		System.out.printf("intArray %s intFilledArray\n", (b ? "=":"!="));
		
		//search intArray for the value 5
		int location = Arrays.binarySearch(intArray, 5);
		
		if(location>=0)
			System.out.printf("found 5 at element %d in intArrays\n",location);
		else
			System.out.println("5 not fpund in intArray");
		
		//search intArray for the value 8763
		location = Arrays.binarySearch(intArray, 8763);
		
		if(location >=0)
			System.out.printf("Found 8763 at element 5d in intArray\n", location);
		else
			System.out.println("8763 not found in intArray");
		
	}// END MAIN
	
	//output values in each array
	public static void displayArray(int[] array,String description){
		System.out.printf("\n%s: ", description);
		for(int value:array)
			System.out.printf("%d ", value);
	   }//displayArray
  */
	
		//INTRODUCTION TO ARRAYlIST
	/*	
		ArrayList<String> items = new ArrayList <String>();
		
		items.add("red");//append an item to the list
		items.add(0,"yellow"); //insert the value at index 0
		
		// header
		System.out.print("Display list contents with counter controlled loop");
		//display the colors in the list
		for(int i=0;i<items.size();i++)
			System.out.printf(" %s",items.get(i));
		
		//display the colors using the foreach in the display method
		display(items,"\n display lists contents with enhanced for statement");
		
		items.add(0,"gree");
		items.add("yellow");
		display(items,"List with two new elements");
		
		items.remove("yellow");
		display(items,"Remove first instance of yellow)");
		
		items.remove(1);
		display(items,"Remove second list element (green)");
		
		//check if a value is in the list
		System.out.printf("\"red\" is %sin the list\n", items.contains("red")?"":"not ");
		
		//displays numbers of elements in the list
		System.out.printf("Size: %s\n", items.size());
	}//END MAIN
	
	public static void display(ArrayList<String> items,String header){
		System.out.print(header);
		//display each element in item
		for(String item:items)
			System.out.printf(" %s", item);
		System.out.println();
   	  }//end method display
  */
	/*	
		int[][] g = new int[2][3];
		g[0][1]=9;
		for(int i=0;i<g.length;i++)
			for(int j=0;j<g[i].length;j++){
				System.out.print("Enter the value for row "+ i + " and column "+j+":");
				g[i][j]=in.nextInt();
			}
		int min=g[0][0];
		for(int i=0;i<g.length;i++)
			for(int j=0;j<g[i].length;j++)
				if(g[i][j]<min)
					min = g[i][j];
		System.out.println("\nThe minimum of the values is "+ min);
				for(int d:g[0])
					System.out.println(d+"  ");
				System.out.printf("%20s%10s%10s\n","column 1","column 2","column 3");
				for(int i =0;i<g.length;i++){
					System.out.printf("row%d", i);
					for(int d:g[i])
						System.out.printf("%10d", d);
					System.out.println();
				}
		}//end main
  */
		
		//**************CHAPTER SEVEN EXERCISES************//
		//SALES COMMISSIONS
/*		ArrayList<Integer> sales = new ArrayList<Integer>();
		do{
		System.out.print("<ctrl> z to exit..Enter the gross sales for the salesPerson:");
		int gross = in.nextInt();
		sales.add(gross);
		}while(in.hasNext());
		
		int count[] = new int[11];
		for(int d:sales){
			int total = 200 + (9*d)/100;
			int i  = total/100;
			if(i>10)
				i=10;
			++count[i];
			
		}// end method count 
		System.out.printf("\n%6s%10s\n","Range","no of workers");
		//printing method
		for(int i=2;i<count.length;i++){
			if(i==10)
				System.out.printf("$%4d and more: %d\n", 100*i,count[i]);
			else
			System.out.printf("$%4d-%4d: %5d\n",100*i,100*i+99,count[i]);
		}
	 }//end main method
*/
		//ELIMINATE DUPLICATE**
/*		int[] array = new int[5];
		int counter=0;
		while(counter < array.length){
			boolean stat = false;
			System.out.print("Enter the number "+(counter+1)+": ");
			array[counter]=in.nextInt();
			if(array[counter]<=100&&array[counter]>=10)
			{
				for(int i=0;i<counter;i++){
					if (i==counter) continue;
					if(array[counter]==array[i])
						stat=true;
				}
				if(stat==false)
				{
					System.out.print("Unique numbers so far are:");
					for(int i=0;i<=counter;i++)
						System.out.print(array[i]+"   ");
					System.out.println();
					counter++;
				}
				else
					System.out.println("Number is a duplicate");
			}
			else
				System.out.println("Number must be between 10 and 100");
		}//end while loop		
	 }//end method main
*/	
		//VARIABLE LENGTH ARGUMENT LIST**
/*		int a[]=new int[5];int counter=0;
		while(true){
			try{
			System.out.printf("Enter number %d to multiply:",counter+1);
			int no=in.nextInt();
			if(no<0)
				break;
			a[counter]=no;
			counter++;}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
		System.out.println(product(a));
	}//END MAIN******************************************
	
	public static int product(int ... number){
		int total=1;
		for(int d:number)
			if(d!=0)
			total*=d;
		return total;
	 }
*/
		//COMMAND LINE ARGUMENTS
/*		System.out.println(args.length);
		int[] array;
		array = new int[(args.length==1)?Integer.parseInt(args[0]):10];
		System.out.println(array.length);
		for(int i=0;i<array.length;i++){
			System.out.print("Enter the number "+ (i+1)+":");
			array[i]=in.nextInt();
		}
		System.out.println("\naverage of all the numbers is "+average(array));
	}//end main
		
	public static int average(int...no){int avr=0;
		for(int d:no)
			avr+=d;
		return avr/no.length;
	  }
*/	
		//USING THE ENHANCED FOR STATEMENT WITH PARSING OF ARGS STRINGS
/*		System.out.printf("Total of all the command args is %.2f", cmd(args));
	}//END MAIN
	
	public static double cmd(String ...args){
		double total=0;
		for(String d : args)
			total+=Double.parseDouble(d);
		return total/args.length;
	 }
*/
		//SIMULATION OF TWO DICE ROLLED
/*		int freq[] = new int[15];
		for(int i =0;i<360000000;i++){
		int die1=1+ran.nextInt(6);
		int die2 =1+ ran.nextInt(6);
		int sum = die1+ die2;
		++freq[sum];
		}	// end for
		for(int i=2;i<=12;i++)
			System.out.printf("%2d:%8d\n", i,freq[i]);
   	  }
*/
		
		//AIRLINE RESERVATIONS SYSTEM
/*		int eco=5,fc=1;
		do{
		System.out.print("Enter 1 for FIRSTCLASS...2 for ECONOMY:");
		int choice = in.nextInt();
		boolean seat[] =new boolean[11];
		
		if(fc == 6&&choice==1){
			System.out.print("First class section is full...\nEnter 1. for economy,2. if not interested:");
			int full=in.nextInt();
			if(full==1)
				choice=2;
			else System.out.println("Next leaves in 3 hours...\n");
		}
		if(eco==11&&choice==2){
			System.out.print("Economy section is full...\nEnter 1. for First Class,2. if not interested:");
			int full=in.nextInt();
			if(full==1)
				choice=1;
			else System.out.println("Next leaves in 3 hours...\n");
		}
		
		if(choice == 1 && fc <=5){
			seat[fc]=true;
			System.out.printf("Seat number %d\nFirst class section\n",fc++);
		}
		if(choice==2&&eco<=10){
			seat[eco]=true;
			System.out.printf("Seat number %d\nEconomy Section\n",eco++);
		}
		
		}while(eco <11||fc<6);//end do statement
	
	  }//end main
*/
		//TOTAL SALES
/*		int[][] sales= new int[6][5];int person=0;int product=0;int value=0;
		while(person>=0&&value>=0&&product>=0){
		System.out.print("Enter the SalesPerson's number:");
		person = in.nextInt();
		System.out.print("Enter the product number:");
		product=in.nextInt();
		System.out.print("Enter the total dollar value of product sold that day:");
		value=in.nextInt();
		if(person>0&&value>0&&product>0){
		sales[product][person]=value;}
		System.out.println();
		}
	
		System.out.printf("%18s%8s%8s%8s%10s\n", "Sales1","Sales2","Sales3","Sales4","Product T");
		for(int i=1;i<sales.length;i++){
			System.out.printf("Product %d:",i);
			for(int j=1;j<sales[i].length;j++){
				System.out.printf("%8d", sales[i][j]);
			}
			int total=0;
			for(int d:sales[i])total+=d;
			System.out.printf("%8d",total ); 
			System.out.println();
		}
		System.out.printf("%10s%8s%8s%8s%8s\n", "","______","______","______","______");
		System.out.printf("%10s%8d%8d%8d%8d", "Sales Tot:",column(1,sales),column(2,sales),column(3,sales),column(4,sales));
	}
	public static int column(int i,int [][] a){
		int t=0;
		for(int d=1;d<=5;d++){
			t+=a[d][i];
			}
		return t;
   	  }
   */
			//KNIHGTS TOUR
	/*	knights test = new knights();
		
		test.tour();
		//test.board();
	//for(int i=0;i<8;i++){
		//for(int j=0;j<8;j++)
			test.move();
		//}
		
		test.board();
	*/
		
	/*	knightsBrute test = new knightsBrute();
		//test.where();
		//test.board();
		int brute=0;int countdown=0;
		while(brute!=64){
			brute = test.where();
			countdown++;
		//int [] tour = new int [1000000];
		//for(int i=0;i<1000000;i++){
			//System.out.println("*****"+i);
			//test.board();
			//System.out.println();
			
		}
		
		int no=0,max=0,maxNumber=0;
		/*System.out.printf("%5s%10s\n","no","frequency");
		for(int i:tour){
			System.out.printf("%5d%7d\n", ++no,i);
			if(i>max){
				maxNumber = no;
				max = i;}}
		System.out.println("Maximum is "+max+" and the number is "+maxNumber);
	}*/
		//System.out.println("the breakthrough at   "+ countdown);
	
		//LABWORK PRACTISE***.....SORTING ELEMENTS OF AN ARRAY
	/*	int[] sorty = {5,4,43,53,223,553,355,6,6443,3,5,5,3,3,24,3,5,23,33,224};
		for(int i=0;i<sorty.length;i++)
			for(int k=i+1;k<sorty.length;k++){
				if(sorty[k]<sorty[i]){
					int swap = sorty[i];
					sorty[i]=sorty[k];
					sorty[k]=swap;
				}
			}
		for(int d:sorty)
			System.out.print(d+" ");
	*/
		
		//EIGHT QUEENS CAMPAIGN
	//	queens test = new queens();
		
	//	test.block(3,3);	
		//test.eliminated();
		//System.out.println("Min is "+ test.minimum(4,6));
		//test.next();
		
		
		//test.board();
		//test.chess();
	/*	int force=0,count=0;
		while(force!=64){
			count++;
			test.qreset();
		force = test.moved();
		System.out.print("\n"+force+" at count "+count);
		force=64;
		}
	*/
		//EXHAUSTIVE TECHNIQUE
		//test.exhaustive();
		
		
		/*knightsBrute test = new knightsBrute();
		test.where();
		//test.board()
		int brute=0;int countdown=0;int [] tour = new int [1000009];
		while(brute!=64){
			brute = test.where();
		
			
		tour[countdown]=brute;	countdown++;
	//	for(int i=0;i<100;i++){
			//System.out.println("*****"+i);
		//	test.board();
			//System.out.println();	
		//}
		
		}	int no=0,max=0,maxNumber=0;
		System.out.printf("%5s%10s\n","no","frequency");
		for(int i:tour){
			System.out.printf("%5d%7d\n", ++no,i);
			if(i>max){
				maxNumber = no;
				max = i;}}
		System.out.println("Maximum is "+max+" and the number is "+maxNumber);
*/
     
		
		//KNIGHTS CLODED TOUR TEST***
   /* 	knights test = new knights();
		
		test.tour();
	for(int i=0;i<8;i++){
		for(int j=0;j<8;j++)
			test.move(i,j);
		}
		test.board();
	*/
		
		//***SIEVE OF ERATOSTHENES
	/*	methods test = new methods();
		test.prime(1000);   */
		
		
		//FIBONACCI TEST
	/*	methods test = new methods();
		test.fibo(1500);
	*/
		
	//Polling
		methods test = new methods();
		test.poll();
}
}


class methods{
	private static final Scanner in = new Scanner(System.in);
	private static final Random ran = new Random();

	//METHOD FOR SIEVE OF ERATOSTHENES
/*	public void prime(int no){
		boolean [] primo = new boolean[no];
		for(int i=0;i<primo.length;i++)
			if(i!=0&&i!=1)
			primo[i]=true;
		for(int i=2;i<primo.length;i++){
			for(int j=i;j<primo.length;j+=i){
				if(j!=i)
					primo[j]=false;}
		}
		for(int i=0;i<primo.length;i++)
			if(primo[i]==true)
				System.out.println(i);
	}*///end of method eratosthenes
	
	//FIBONACCI NTH SERIES
/*	public void fibo(int n){
		double old=0;
		double nu =1;
		double max=0;
		int count = 0;
		System.out.print(old+","+nu);
		for(int i=0;i<n;i++){
			double fi = old + nu;
			old=nu;
			nu=fi;
			if(fi>max){
				max = fi;
				count =i;}
			
			System.out.println(i+"...."+fi);
		}
		System.out.println("max is "+max+"  at count "+count);
	}  */
		
	//****POLLING****
	public void poll(){
		String issues[]= {"Political","Environmental",
				"Insecurity","Corruption","Insurgency"};
		int responses[][] = new int[5][10];
		for(int i=0;i<responses[0].length;i++){
			System.out.println("****Ratings for User "+(i+1)+"****\nRate btw 1-10");
			for(int j=0;j<issues.length;j++){
				System.out.printf("Rate %s:", issues[j]);
				responses[j][i]=in.nextInt();
			}
			System.out.println();
		}
		System.out.printf("%50s\n%19s%5s%5s%5s%5s%5s%5s%5s%5s%5s%10s\n", "***RATINGS RESULT***",
				"01","02","03","04","05","06","07","08","09","10","Average");
		int min=101,max=0,minx = 0,maxy = 0;
		for(int i=0;i<responses.length;i++){
			System.out.printf("%5s", issues[i]);
			for(int sp=issues[i].length();sp<issues[1].length();sp++)
				System.out.print(" ");
			double average=0;
			for(int j=0;j<responses[i].length;j++){
				System.out.printf("%5d", responses[i][j]);
				average+=responses[i][j];
			}
			System.out.printf("%9.1f\n",average/10);
			if(average<min){
				minx=i;
				min=(int) average;}
			if(average>max){
				maxy=i;
				max=(int) average;}
		}
		System.out.println("\nIssue with the higest point total\n\t"+issues[maxy]+":"+max);
		System.out.println("\nIssue with the Lowest point total\n\t"+issues[minx]+":"+min);
	}
	
}