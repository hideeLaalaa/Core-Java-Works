import java.util.Scanner;
public class Simpletron {
	private static double[] registry = new double[1000];
	private static String[][] ascii={
			{"","soh","stx","etx","eot","enq","ack","bel","bs","ht"},
		    {"nl","vt","ff","cr","so","si","dle","dcl","dc2","dc3",},
		    {"dc4","nak","syn","etb","can","em","sub","esc","fs","gs"},
		    {"rs,","us","sp","!",Character.toString('"'),"#","$","%","&","`"},
		    {"(",")","*","+",",","-",".","/","0","1",},
		    {"2","3","4","5","6","7","8","9",":",";"},
		    {"<","=",">","?","@","A","B","C","D","E"},
		    {"F","G","H","I","J","K","L","M","N","O"},
		    {"P","Q","R","S","T","U","V","W","X","Y"},
		    {"Z","[","\\","]","^","_","'","a","b","c"},
		    {"d","e","f","g","h","i","j","k","l","m"},
		    {"n","o","p","q","r","s","t","u","v","w"},
		    {"x","y","z","{","|","}","~","del"}
		};
	private static double accumulator;
	private static String input;
	private static int location=00;
	private static int operation;
	private static int operand;
	private static int x;
	static final int READ =10;
	static final int WRITE =11;
	static final int sREAD =12;
	static final int sWRITE =13;
	static final int LINE =14;
	static final int LOAD =20;
	static final int STORE =21;
	static final int ADD =30;
	static final int SUBTRACT =31;
	static final int DIVIDE =32;
	static final int MULTIPLY =33;
	static final int MODULUS =34;
	static final int EXPONENTIAL =35;
	static final int BRANCH =40;
	static final int BRANCHING =41;
	static final int BRANCHZERO =42;
	static final int HALT =43;
	static Scanner in = new Scanner(System.in);

	public Simpletron(){

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operate();
		//double b = 9.700063637883485484373262363;
		//long  z = (long) (b*(Math.pow(1000, 8)));
		
		//System.out.printf("%d", z);
		//System.out.println("Enter:"+hexadec(in.next()));
		//System.out.println(dechexa(in.nextInt()));
	}
	
	public static void displayMessage(){
		System.out.println("\n****Welcome to Simpletron!***"
				+"\n***Please enter your program one instruction"
				+"\n***or data word at a time into the input***"
				+"\n***text field. I will display the location"
				+"\n***number and a question mark. You the ***"
				+"\n***type the word for that location. Press the"
				+"\n***Done button to stop entering your program"
				+"\nLoc Inst"
				+"\n*** ***");
	}
	
	public static void operate(){
		displayMessage();
		int code;
		do{
			System.out.printf("%02d ? ",location);
			input = in.next();
			code = hexadec(input);
			if(code/10000!=0&&!input.equals("-99999"))
				System.out.println("Error...Instruction must be between -9999 to +9999");
			else if(!input.equals("-99999"))
				registry[location++]=code;
		}while(location<1000&&!input.equals("-99999"));
		System.out.print("***Program loading completed***\n"
				+ "***Program execution begins***\n");
		runCode();
	}
	
	public static void runCode(){
		for(x=0;x<registry.length;x++){
			double no=(registry[x]);
			if(no!=0){
				operation = (int) (no/100);
				operand = (int) (no%100);
				proccess();
			}
		}
		dump();
	}
	
	public static void error(String type){
		switch(type){
		case "zero":
			System.out.println("***Attempts to divide by zero***");
		}
		System.out.print("***Simpletron abnormally terminated***");
		dump();
		System.exit(0);
	}
	
	public static int hexadec(String s){
		int val=0;
		try{
			String digits = "0123456789ABCDEF-";
			s=s.toUpperCase();
			for(int i=0;i<s.length();i++){
				char c = s.charAt(i);
				int d = digits.indexOf(c);
				if(d!=-1)
					val = 16*val+d;
				else if(d==16)
					val*=-1;
				else
				{
					System.out.println(c+" is not a valid hexadecimal digits");
					val = 0;
					break;
				}
			}
		}catch(NullPointerException e){};
		return val;
	}
	
	public static String dechexa(int dec){
		String hex ="";
		char hexaString[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem;
		while(dec>0){
			rem=dec%16;
			hex=hexaString[rem]+hex;
			dec=dec/16;
		}
		return hex;
	}
	
	public static void dump(){
		System.out.printf("\n%3s\n%4s\t%6s%.2f\n%3s\t%02d\n%3s\t%02d\n%13s\t\t%02d\n%5s\t\t\t%02d\n\n%30s\n", "REGISTERS:",
				"accumulator","+",accumulator,"instructionCounter",location,"instructionRegister",
				location,"operationCode",operation,"operand",operand,"***MEMORY***");
		System.out.printf("%10s", "0");
		for(int i=1;i<100;i++)
			System.out.printf("%6s%2d","",i);
		System.out.println();
		int counter=0;
		for(int i=0;i<100;i++){
			if(counter<registry.length)
			{	if(counter%10==0)
					System.out.printf("%3d",counter);
				for(int j=0;j<100;j++){
					double no =(registry[counter]);
						System.out.printf("%4s%.2f","",no);
					counter++;
				}
				System.out.println();
			}
		}

	}
	
	public static void proccess(){
		try{
			switch(operation){
			case READ:
				int no;
				do{
				System.out.print("Enter number you want to write:");
				no = in.nextInt();
				if(no<-9999||no>9999)
					System.out.println("Number must be between -9999 to +9999...");
				}while(no<-9999||no>9999);
				registry[operand]= (no);
				break;
			case WRITE:
				System.out.printf("Number is %d\n",(registry[operand]));
				break;
			case sREAD:
				System.out.print("Please enter string:");
				input = in.next();
				double noo = input.length();
				for(int k=0;k<input.length();k++){
					for(int i=0;i<ascii.length;i++){
						for(int j=0;j<ascii[i].length;j++){
							char y = input.charAt(k);
							if(Character.toString(y).equals(ascii[i][j]))
							{	noo*=1000;
								noo+=(((i*10)+j));}
						}
					}
				}noo/=Math.pow(1000,input.length());
				System.out.println("End of writing string "+noo);
				registry[operand] = noo; 
				break;
			case sWRITE:
				System.out.println("Start"+registry[operand]);
				String out="";
				double num = registry[operand];
				int stop = (int)registry[operand];
				double x=0;
				for(int i=0;i<stop;i++){
					num=registry[operand];
					for(int k=0;k<(i+1);k++)
						num*=1000;
					long n = (long) (num%1000);
					System.out.println("System prints "+(num)+",,,,"+(n));
					if(n<140)
						out = out + ascii[(int) (n/10)][(int) (n%10)];
				}
				System.out.println("System prints "+out);
				break;
			case LINE:
				System.out.println();
				break;
			case LOAD:
				accumulator = (registry[operand]);
				break;
			case STORE:
				registry[operand] = (accumulator);
				break;
			case ADD:
				accumulator += (registry[operand]);
				break;
			case SUBTRACT:
				accumulator -= (registry[operand]);;
				break;
			case DIVIDE:
				double n=(registry[operand]);
				if(n!=0)
					accumulator /= n;
				else
					error("zero");
				break;
			case MULTIPLY:
				accumulator *= (registry[operand]);;
				break;
			case MODULUS:
				accumulator %= (registry[operand]);;
			case EXPONENTIAL:
				accumulator = (int) Math.pow(accumulator,(registry[operand]));
			case BRANCH:
				x = operand-1;
				break;
			case BRANCHING:
				if(accumulator<0)
					x = operand-1;
				break;
			case BRANCHZERO:
				if(accumulator==0)
					x = operand-1;
				break;
			case HALT:
				dump();
				System.out.print("***The program has ended***");
				System.exit(0);
				break;
			default:
			   
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You have no access to the location you are trying to access!!!");
		}
	}
}

//QUESTION B OF SML PROGRAMS TO READ 7 NO AND COMPUT AVERAGE
/*+0001 00
+0007 01
+0007
+2001 load acc from 01 
+4213 branch to 13 if acc is zero
+1033 read number to 33
+2030 load acc from 30
+3033 add 33 to acc
+2130 store acc to 30
+2001 load acc from 01
+3100 sub 00 from acc
+2101 store acc to 01
+4003 branch to 03
+2030 load acc from 30
+3202 divide acc by 02
+2130 store acc to 30
+1130 write 30*/
//QUESTION C OF SML PROGRAMS TO READ SERIES OF NUMBERS AND DISPLAY LARGEST NUMBER
//THE FIRST NUMBER INDICATES HOW MANY NUMBERS TO BE PROCESSED
/*+0001 00
+0001
+1001 read number to 01
+2001 load acc from 01
+4219 branch to 19 if acc is zero
+1033 read number to 33
+2030 load acc from 30
+3133 sub 33 from acc
+4113 branch to 13 if acc is neg
+2001 load acc from 01
+3100 sub 00 from acc
+2101 store acc to 01
+4004 branch to 04
+2033 load 33 to acc 
+2130 store acc to 30
+2001 load acc from 01
+3100 sub 00 from acc
+2101 store acc to 01
+4004 branch to 04
+1130 write 30*/
