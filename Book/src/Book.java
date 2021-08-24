// Book: Book.java
// Creating and manipulating a Book object

public class Book 
{
	
	public static int matX[][] = { 	{83,150,30},
			{31,42,23},
			{85,95,85} 
	};
	
	public static int d,z=-1,c1,c2,x=0,y=0,b=0;
	
	
	// main method begins a program execution
	public static void main(String[] args) 
	{
		// A PROGRAM TO MULTIPLY TWO MATRIX
/*		// create a Scanner to obtain input from command window
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print("Enter the number of row for matrix A:");
		int m = in.nextInt();
		System.out.print("Enter the number of col for Matrix A:");
		int n = in.nextInt();
		System.out.print("Enter the number of row for matrix B:");
		int nn= in.nextInt();
		System.out.print("Enter the number of col for matrix B:");
		int p = in.nextInt();
		
		if(n != nn)
			System.out.println("Col of matrix a must be equal to row of matrix b for mult to be done");
		else{
			int [][] A = new int[m][n];
			int [][] B = new int[n][p];
			int [][] C = new int[m][p];
			for(int i=0;i<A.length;i++){
				System.out.print("Enter value for row "+i+" MatA seperated with spaces:");
				for(int j= 0;j<A[i].length;j++)
					A[i][j]=in.nextInt();
			}
			
			for(int i=0;i<B.length;i++){
				System.out.print("Enter value for row "+i+" MatB seperated with spaces:");
				for(int j= 0;j<B[i].length;j++)
					B[i][j]=in.nextInt();
			}
			
			
			for(int row = 0;row < m;row++){
				
				for(int col =0;col < p;col++){
					
					for(int size=0;size <n;size++){
						
						int calc = A[row][size]*B[size][col];
						C[row][col]+=calc;
						
					}
				}
			}
			for(int i=0;i<C.length;i++){
				for(int j=0;j<C[i].length;j++)
					System.out.print(C[i][j]+"  ");
				System.out.println();
			}
			
		}
	*/
		
		//DISPLAYING FIRST N FIBONACCI NUMBERS
		java.util.Scanner in = new java.util.Scanner(System.in);
/*		System.out.print("Enter the value for n:");
		int n = in.nextInt();
		if(n>0){
			int p1=0,p2=1;
			System.out.print(p1);
			if(n>1){
				System.out.print(".."+p2);
				for(int i=3;i<=n;i++){
					int no = p1+p2;
					System.out.print(".."+no);
					p1=p2;
					p2=no;
				}
			}
			
		}
	*/
		
		//NEWTON RAPHSON CODED CODE for square root of 3
/*		double f0,f1,x1=1,x2=0;
		for(int i=0;i<100;i++){
			f0=(x1*x1)-3;
			f1=2*x1;
			x2=x1-f0/f1;
			x2=(int) (x2*1000);
			x2/=1000;
			if(x1==x2)
				break;
			x1=x2;
		}
		System.out.println("Square root of 3 is: "+x2);
	*/
		
		//SADDLE POINTS IN A MATRIX
		l1();
		
	}
	
	public static void l1(){
		z++;
		x=z;
		y=0;
		b=y+1;
		if(z<matX[0].length){
			l2();
		}
		else
			l5();
		
	}
	
	public static void l2(){
		if(matX[x][y]>matX[x][b]){
			y=b;
			b=y+1;
//			c2=y;
//			c1=x;
			//System.out.println("Z:"+z+"x and y"+x+","+y);
			l22();
		}else{
//			c2=y;
//			c1=x;
			l23();}
	}
	
	public static void l22(){
		c1=x;
		c2=y;
		if(b<matX.length)
			l2();
		else{
				x=0;
				l3();
			}
	}
	
	public static void l23(){
		b++;
		l22();
	}
	
	
	public static void l3(){
		if(matX[c1][c2]>=matX[x][c2]){
			//System.out.println("This is c1 n c2"+c1+","+c2);
			x++;
			l31();
		}else{
			y=c2+1;
			lx();
			}
	}
	
	public static void lx(){
		y++;
		if((y>2))
			l1();
		else
			lx2();
	}
	
	public static void lx2(){
		//System.out.println("This is "+y+ " is "+c2);
		if(matX[c1][c2]==matX[c1][y]){
			c2=y;
			x=0;
			l3();
		}
		else{
			lx();
			}
	}
	
	public static void l31(){
		if(x<matX[0].length)
			l3();
		else
			ly();
	}
	
	public static void ly(){
		d=1;
		System.out.println("THE COORDINATE OF A SADDLE POINT FOUND IS "+c1+","+c2+" with value: "+matX[c1][c2]);
		if(z<matX[0].length){
			//y=c2+1;
			lx();}
		else
			l5();
	}
	
	public static void l5(){
		if(d!=1)
			System.out.println("THERE ARE NO SADDLE POINTS IN THE MATRIX");
			
	}

}
