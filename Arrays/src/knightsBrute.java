import java.util.Random;
public class knightsBrute {

	private final int horizontal = 8;
	private final int vertical = 8;
	private int[][] chess = new int[vertical][horizontal];
	private int[] start = new int[2];
	private Random ran = new Random();
	private int count=1;
	private int[] error = new int[8];
	private int no0=0,no1=0;
	private int[] tour = new int[1000];
	
	public knightsBrute() {
			
	}
	
	public void knightsReset(){
		for(int i=0;i<chess.length;i++)
			for(int j=0;j<chess[i].length;j++)
				chess[i][j]=0;
		start[0]=0;
		start[1]=0;
		count =1;
		no0=0;
		no1=0;
		for(int i=0;i<error.length;i++)
			error[i]=0;
		
	}
	
	public void board(){
		for(int i=0;i<chess.length;i++){
			System.out.print("\n\n|");
			for(int j=0;j<chess[i].length;j++)
				System.out.printf("%3d   ",chess[i][j]);
			System.out.println("|\n");
		}
	}
	
	public int condition(int number){
		
		if(no0!=start[0]&&no1!=start[1])
			for(int i=0;i<8;i++){
				error[i]=0;
		}	
		switch(number){
		case 0:
			if(start[0]-1>=0&&start[1]+2<8&&chess[start[0]-1][start[1]+2]==0)
				 number=0;
			else 
			error[number]=1;
			break;
		case 1:
			if(start[0]-2>=0&&start[1]+1<8&&chess[start[0]-2][start[1]+1]==0)
				number=1;
			else 
				error[number]=1;
			break;
		case 2:
			if(start[0]-2>=0&&start[1]-1>=0&&chess[start[0]-2][start[1]-1]==0)
				number=2;
			else 
				error[number]=1;
			break;
		case 3:
			if(start[0]-1>=0&&start[1]-2>=0&&chess[start[0]-1][start[1]-2]==0)
				number=3;
			else 
				error[number]=1;
			break;
		case 4:
			if(start[0]+1<8&&start[1]-2>=0&&chess[start[0]+1][start[1]-2]==0)
				number=4;
			else 
				error[number]=1;
			break;
		case 5:
			if(start[0]+2<8&&start[1]-1>=0&&chess[start[0]+2][start[1]-1]==0)
				number=5;
			else 
				error[number]=1;
			break;
		case 6:
			if(start[0]+2<8&&start[1]+1<8&&chess[start[0]+2][start[1]+1]==0)
				number=6;
			else 
				error[number]=1;
			break;
		case 7:
			if(start[0]+1<8&&start[1]+2<8&&chess[start[0]+1][start[1]+2]==0)
				number=7;
			else 
				error[number]=1;
			break;
			default:
				number = 8;
		}
		no0=start[0];
		no1=start[1];
		//System.out.println(number+"   "+start[0]+"   "+start[1]+"    "+error[number]);
		return number;
	}
	
	public int where(){
		knightsReset();
		count=1;
			chess[start[0]][start[1]]=count;
			boolean falsity=false;
      while(falsity!=true){
    	  int number = ran.nextInt(8);
    	  int test = condition(number);
    	  if(error[number]==0)
		switch(test){
		case 0: 
			start[0]-=1;
			start[1]+=2;
			chess[start[0]][start[1]]=++count;
			break;
		case 1: 
			start[0]-=2;
			start[1]+=1;
			chess[start[0]][start[1]]=++count;
			break;
		case  2: 
			start[0]-=2;
			start[1]-=1;
			chess[start[0]][start[1]]=++count;
			break;
		case 3:
			start[0]-=1;
			start[1]-=2;
			chess[start[0]][start[1]]=++count;
			break;
		case 4:
			start[0]+=1;
			start[1]-=2;
			chess[start[0]][start[1]]=++count;
			break;
		case 5:
			start[0]+=2;
			start[1]-=1;
			chess[start[0]][start[1]]=++count;
			break;
		case 6:
			start[0]+=2;
			start[1]+=1;
			chess[start[0]][start[1]]=++count;
			break;
		case 7:
			start[0]+=1;
			start[1]+=2;
			chess[start[0]][start[1]]=++count;
			break;
		default:
				System.out.print("False");
			}
    	  falsity=true;
    	  for(int d:error)
    		  if(d<1)
    			  falsity=false;
		}

		return count;
	}
	
	public void thousand(){
		for(int i=0;i<1000;i++){
			count =1;
			where();
			tour[i]=count;
		}
		int no=0;
		System.out.printf("%5s%10s\n","no","frequency");
		for(int i:tour)
			System.out.printf("%5d%7d\n", ++no,i);
	}
	
}
