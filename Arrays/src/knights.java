//knight's tour on a chess board...
import java.util.Random;
import java.util.Scanner;

public class knights {
	private final int hori=8;
	private final int vert=8;
	private int[][] chess = new int[vert][hori];
	private int[] start = new int[2];
	private Random ran = new Random();
	private int[][] access = new int[8][8];
	private int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
	private int[] vertical ={-1,-2,-2,-1,1,2,2,1};

	public knights() {
	
	}
	
	public void reset(){
		for(int i=0;i<chess.length;i++)
			for(int j=0;j<chess[i].length;j++)
			chess[i][j]=0;
	}
	
	public int close(int i,int j){
		int ret=10;
		for(int y=0;y<horizontal.length;y++){
			try{
			if(chess[i+vertical[y]]
			[j+horizontal[y]]==64)
				ret=1;}
			catch(ArrayIndexOutOfBoundsException e){
		    }
		}
		return ret;
			}
	
	public void move(int x,int y){
		//for(int y=0;y<8;y++){
			//for(int z=0;z<8;z++){
		start[0]=x;
		start[1]=y;
		reset();
		int count =1;int falsity=1;
		chess[start[0]][start[1]]=count;
		//while(falsity<=1)
		for(int i=0;i<64;i++){
			tour();
			int min=min();
		//System.out.println(min+" for count "+count);
		//System.out.println(access[start[0]][start[1]]);
			if(min!=8){
			start[0]+=vertical[min];
			start[1]+=horizontal[min];
			chess[start[0]][start[1]]=++count;}
			
			
		}//end while
		//System.out.println(y+" and "+z);
		System.out.println("count is "+ count);
		if(count==64)
			if(close(x,y)==1){
				System.out.println("Here we have a close call");
				board();
			}
			//}
		//}
	}//end method move 
	
	public void board(){
		for(int i=0;i<chess.length;i++){
			System.out.print("\n\n|");
			for(int j=0;j<chess[i].length;j++)
				System.out.printf("%3d   ",chess[i][j]);
			System.out.println("|\n");
		}
/*      System.out.print("Accessibility status\n\n");
		for(int i=0;i<access.length;i++){
			System.out.print("|");
			for(int j=0;j<access[i].length;j++)
				System.out.printf("%3d   ",access[i][j]);
			System.out.println("|\n");
		}*/
	}
	
	
	public void tour(){
		for(int i=0;i<access.length;i++){
			for(int j=0;j<access[i].length;j++){
				int count =0;
				access[i][j]=0;
				//
				if(chess[i][j]<1)
					while(count<8){
					try{
						if(chess[i+vertical[count]]
						[j+horizontal[count]]<1)
							access[i][j]++;}
						catch(ArrayIndexOutOfBoundsException e){
					    }
				count++;}
		
		}
		}
		
	}

	public int min(){//this min is actually to find the maximum to return
		int min =10;
		int ret =8;
		int x = start[0];
		int y = start[1];
/*		for(int j=0;j<horizontal.length;j++){
		try{
			if(chess[start[0]+vertical[j]][start[1]+horizontal[j]]<1)
			{	if(access[start[0]+vertical[j]][start[1]+vertical[j]]<min)
			   {	min=access[start[0]+vertical[j]][start[1]+horizontal[j]];
				ret=j;}
		    	if(access[start[0]+vertical[j]][start[1]+horizontal[j]]==min)
				if(ahead(start[0]+vertical[j],start[1]+horizontal[j])>ahead(x,y))
				{	ret=j;
				x = start[0]+vertical[j]; y=start[1]+horizontal[j];}
			} 
		}
			catch(ArrayIndexOutOfBoundsException e){
		    }
		}*/
					if(start[0]-1>=0&&start[1]+2<8&&chess[start[0]-1][start[1]+2]<1)
					{ 	if(access[start[0]-1][start[1]+2]<min){
							min=access[start[0]-1][start[1]+2];
						ret=0;}
					if(access[start[0]-1][start[1]+2]==min)
						if(ahead(start[0]-1,start[1]+2)>ahead(x,y))
						{	ret =0;
						x = start[0]-1; y=start[1]+2;}
					 }
					if(start[0]-2>=0&&start[1]+1<8&&chess[start[0]-2][start[1]+1]<1)
					{	if(access[start[0]-2][start[1]+1]<min){
							min=access[start[0]-2][start[1]+1];
						ret=1;}
					if(access[start[0]-2][start[1]+1]==min)
						if(ahead(start[0]-2,start[1]+1)>ahead(x,y)){
							ret =1;
						x =start[0]-2; y=start[1]+1;}
					}
					if(start[0]-2>=0&&start[1]-1>=0&&chess[start[0]-2][start[1]-1]<1)
					{	if(access[start[0]-2][start[1]-1]<min){
							min=access[start[0]-2][start[1]-1];
						ret=2;}
					if(access[start[0]-2][start[1]-1]==min)
						if(ahead(start[0]-2,start[1]-1)>ahead(x,y)){
							ret =2;
						x=start[0]-2; y= start[1]-1;}
					}
					if(start[0]-1>=0&&start[1]-2>=0&&chess[start[0]-1][start[1]-2]<1)
					{	if(access[start[0]-1][start[1]-2]<min){
							min=access[start[0]-1][start[1]-2];
						ret=3;}
					if(access[start[0]-1][start[1]-2]==min)
						if(ahead(start[0]-1,start[1]-2)>ahead(x,y)){
							ret =3;
						x = start[0]-1; y=start[1]-2;}
					}
					if(start[0]+1<8&&start[1]-2>=0&&chess[start[0]+1][start[1]-2]<1)
					{	if(access[start[0]+1][start[1]-2]<min)
							min=access[start[0]+1][start[1]-2];
						ret=4;
					if(access[start[0]+1][start[1]-2]==min)
						if(ahead(start[0]+1,start[1]-2)>ahead(x,y)){
							ret =4;
						x=start[0]+1; y=start[1]-2;}
					}
					if(start[0]+2<8&&start[1]-1>=0&&chess[start[0]+2][start[1]-1]<1)
					{	if(access[start[0]+2][start[1]-1]<min){
							min=access[start[0]+2][start[1]-1];
						ret= 5;}
					if(access[start[0]+2][start[1]-1]==min)
						if(ahead(start[0]+2,start[1]-1)>ahead(x,y)){
							ret =5;
						x = start[0]+2; y=start[1]-1;}
					}
					if(start[0]+2<8&&start[1]+1<8&&chess[start[0]+2][start[1]+1]<1)
					{	if(access[start[0]+2][start[1]+1]<min){
							min=access[start[0]+2][start[1]+1];
						ret= 6;}
					if (access[start[0]+2][start[1]+1]==min)
						if(ahead(start[0]+2,start[1]+1)>ahead(x,y)){
							ret =6;
						x = start[0]+2; y=start[1]+1;
					}
					}
					if(start[0]+1<8&&start[1]+2<8&&chess[start[0]+1][start[1]+2]<1)
					{	if(access[start[0]+1][start[1]+2]<min){
							min=access[start[0]+1][start[1]+2];
						ret= 7;}
						if(access[start[0]+1][start[1]+2]==min)
					if(ahead(start[0]+1,start[1]+2)>ahead(x,y)){
							ret =7;
						x =start[0]+1; y=start[1]+2;}
					}
					//System.out.println("max here is this "+min);
					return ret;
			}

	public int ahead(int x,int y){
		int count =0;
		int max =0;
		for(int i=0;i<8;i++){
			switch(i){
			case 0:	
				if(x-1>=0&&y+2<8&&chess[x-1][y+2]<1)
					if(access[x-1][y+2] > max)
						max = access[x-1][y+2];
				break;
			case 1:	
				if(x-2>=0&&y+1<8&&chess[x-2][y+1]<1)
					if(access[x-2][y+1] > max)
						max = access[x-2][y+1];
				break;
			case 2:	
				if(x-2>=0&&y-1>=0&&chess[x-2][y-1]<1)
					if(access[x-2][y-1] > max)
						max = access[x-2][y-1];
				break;
			case 3:	
				if(x-1>=0&&y-2>=0&&chess[x-1][y-2]<1)
					if(access[x-1][y-2] > max)
						max = access[x-1][y-2];
				break;
			case 4:	
				if(x+1<8&&y-2>=0&&chess[x+1][y-2]<1)
					if(access[x+1][y-2] > max)
						max = access[x+1][y-2];
				break;
			case 5:	
				if(x+1<8&&y-2>=0&&chess[x+1][y-2]<1)
					if(access[x+1][y-2] > max)
						max = access[x+1][y-2];
				break;
			case 6:	
				if(x+2<8&&y+1<8&&chess[x+2][y+1]<1)
					if(access[x+2][y+1] > max)
						max = access[x+2][y+1];
				break;
			case 7:	
				if(x+1<8&&y+2<8&&chess[x+1][y+2]<1)
					if(access[x+1][y+2] > max)
						max = access[x+1][y+2];
				break;
			}
		}
		return max;
	}
	
	
}
