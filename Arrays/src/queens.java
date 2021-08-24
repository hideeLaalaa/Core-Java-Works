import java.util.Random;
// DVELOPING HEURISTICS FOR AN EIGHT QUEENS ON A CHESS

public class queens {
	private int[][] chess = new int[8][8];
	private int[][] board = new int[8][8];
	private int[] q1 = new int[2];
	private int[] q2 = new int[2];
	private int[] next = new int[2];
	private int[][] queens = new int[8][8];
	private Random rand = new Random();

	public queens() {
		
	}
	
	public void reset(int[][] x){
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				x[i][j]=0;
	}
	
	public void next(){
		System.out.printf("next is %d,%d\n", next[0],next[1]);
	}
	
	public void queue(){
		q1[0]=0;q1[1]=5;
		q2[0]=7;q2[1]=4;
		//FOR QUEEN1
		int no=0;int i=0;queens[q1[0]][q1[1]]=++no;queens[q2[0]][q2[1]]=++no;
		while(i++<35){

			next[0]=q1[0];next[1]=q1[1];
			reset(board);
			block(q2[0],q2[1]);
			eliminated();
			System.out.print(minimum(q1[0],q1[1])+"..");
			if(next[0]!=q1[0]||next[1]!=q1[1]){
				q1[0]=next[0];
				q1[1]=next[1];				
				queens[q1[0]][q1[1]]=++no;
				//System.out.println(no+" q1 at "+next[0]+","+next[1]);
			}
			
			//FOR QUEEN2

			next[0]=q2[0];next[1]=q2[1];
			reset(board);
			block(q1[0],q1[1]);
			eliminated();
			//System.out.print(minimum(q2[0],q2[1])+"..");
			if(next[0]!=q2[0]||next[1]!=q2[1]){
				q2[0]=next[0];
				q2[1]=next[1];
				queens[q2[0]][q2[1]]=++no;
				//System.out.println(no+" q2 at "+next[0]+","+next[1]);
			}
			
		}System.out.println();
		q(queens);
	}
	
	public void block(int i,int j){
		int x=i;int y=j;
		//for horizontal
		int no=0;
		while(no<8){
			board[i][no]=1;no++;
		}
		no=0;
		//for vertical
		while(no<8){
			board[no][j]=1;no++;
		}
		//diagonal left
		int k=i;int l=j;
		while(l>0&&k<7){
			k++; l--; board[k][l]=1;
		}
		k=i;l=j;
		while(l>0&&k>0){
			k--;l--; board[k][l]=1;
		}
		k=i;l=j;
		while(l<7&&k>0){
			k--; l++; board[k][l]=1;
		}
		k=i;l=j;
		while(l<7&&k<7){
			l++; k++; board[k][l]=1;
		}
		
	}
	
	public void move(){
		for(int i=0;i<chess.length;i++){
			for(int j=0;j<chess[i].length;j++){
				elimination(i,j);	
				}			
		} 
	}
	
	public int minimum(int i,int j){
		int no=0;int jo=j-1;int ri=j+1;int max=30;int ret=8;
			while(no<8&&jo>=0&&ri<8){
			if(chess[i][jo]<=max&&queens[i][jo]==0&&board[i][jo]!=1){
				ret=0;next[0]=i;next[1]=jo;max = chess[i][jo];jo--;}
			if(chess[i][ri]<=max&&queens[i][ri]==0&&board[i][ri]!=1){
				ret=4;next[0]=i;next[1]=ri;max=chess[i][ri];ri++;}
			no++;}
		
			no=0;jo=i-1;ri=i+1;
			while(no<8&&jo>=0&&ri<8){
				if(chess[jo][j]<=max&&queens[jo][j]==0&&board[jo][j]!=1){
					ret=2;next[0]=jo;next[1]=j;max = chess[jo][j];jo--;}
				if(chess[ri][j]<=max&&queens[ri][j]==0&&board[ri][j]!=1){
					ret=6;next[0]=ri;next[1]=j;max=chess[ri][j];ri++;}
			no++;}
				
				int k=i+1;int l=j-1;
				while(l>=0&&k<8){
					if(chess[k][l]<=max&&queens[k][l]==0&&board[k][l]!=1){
						ret=7;next[0]=k;next[1]=l;max=chess[k][l];
						}
					k++; l--; 
				}
				
				k=i-1;l=j-1;
				while(l>=0&&k>=0){
					if(chess[k][l]<=max&&queens[k][l]==0&&board[k][l]!=1){
						ret=1;next[0]=k;next[1]=l;max=chess[k][l];
						}
					k--;l--;
				}
				
				k=i-1;l=j+1;
				while(l<8&&k>=0){
					if(chess[k][l]<=max&&queens[k][l]==0&&board[k][l]!=1){
						ret=3;next[0]=k;next[1]=l;max=chess[k][l];
						}
					k--; l++;
				}
				
				k=i+1;l=j+1;
				while(l<8&&k<8){
					if(chess[k][l]<=max&&queens[k][l]==0&&board[k][l]!=1){
						ret=5;next[0]=k;next[1]=l;max=chess[k][l];
						}
					l++; k++; 
				}
			return max;
		}
	
	public void elimination(int i,int j){
		int x=i;int y=j;
		chess[i][j]=1;
		//for horizontal
		chess[i][j]+=7-j; // for right 0
		
		chess[i][j]+=j; // for left 1
		//for vertical
		chess[i][j]+=i; // for up 2
		
		chess[i][j]+=7-i; // for down 3
		
		//diagonal left down 4
		int k=i;int l=j;
		while(l>0&&k<7){
			k++; l--; chess[i][j]++;
		}
		
		// diagonal left up 5
		k=i;l=j;
		while(l>0&&k>0){
			k--;l--; chess[i][j]++;
		}
		
		//diagonal right up 6
	
		k=i;l=j;
		while(l<7&&k>0){
			k--; l++; chess[i][j]++;
		}
		
		//diagonal right down 7
		k=i;l=j;
		while(l<7&&k<7){
			l++; k++; chess[i][j]++;
		}
			}
	
	public void eliminated(){
		for(int i=0;i<chess.length;i++){
			for(int j=0;j<chess[i].length;j++){
				
				chess[i][j]=0;
				int no=0;int jo=j-1;int ri=j+1;
				while(no<8){
				
					if(jo>=0)
					if(board[i][jo]<1&&queens[i][jo]==0){
						chess[i][j]++;jo--;
					}
					if(ri<8)
					if(board[i][ri]<1&&queens[i][ri]==0){
						chess[i][j]++;ri++;
					}
						no++;
				}
				no=0;jo=i+1;ri=i-1;
				//for vertical
				while(no<8){
					
					if(jo<8)
					if(board[jo][j]<1&&queens[jo][j]==0){
						chess[i][j]++;jo++;
					}
					if(ri>=0)
					if(board[ri][j]<1&&queens[ri][j]==0){
					chess[i][j]++;ri--;}
					no++;
				}
				int x=i;int y=j;
				//diagonal left down 4
				int k=i;int l=j;
				while(l>0&&k<7){
					
					k++; l--; 
					if(board[k][l]<1&&queens[k][l]==0)
						chess[i][j]++;
				}
				
				// diagonal left up 5
				k=i;l=j;
				while(l>0&&k>0){
					
					k--;l--; 
					if(board[k][l]<1&&queens[k][l]==0)
						chess[i][j]++;
				}
				
				//diagonal right up 6
				k=i;l=j;
				while(l<7&&k>0){
					
					k--; l++;
					if(board[k][l]<1&&queens[k][l]==0)
						chess[i][j]++;
				}
				
				//diagonal right down 7
				k=i;l=j;
				while(l<7&&k<7){
					
					l++; k++;
					if(board[k][l]<1&&queens[k][l]==0)
						chess[i][j]++;
				}
				}			
		} 
	}
	
	public void chess(){
		for(int i=0;i<chess.length;i++){
			for(int j=0;j<chess[i].length;j++)
				System.out.print(chess[i][j]+" ");
			System.out.println();
		}
	}
	
	public void q(int[][] chess){
		for(int i=0;i<chess.length;i++){
			for(int j=0;j<chess[i].length;j++)
				System.out.printf("%3d",chess[i][j]);
			System.out.println();
		}
	}
	
	public void board(){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++)
				System.out.print(board[i][j]+" ");
			System.out.println();
		}
	}
			
	public int moved(int qi,int qj,int qk,int ql){
		q1[0]=qi;q1[1]=qj;
		q2[0]=qk;q2[1]=ql;
		boolean stat=true;
		reset(board);
		block(q2[0],q2[1]);
		if(board[q1[0]][q1[1]]==1)
			stat=false;
		reset(board);
		block(q1[0],q1[1]);
		if(board[q2[0]][q2[1]]==1)
			stat=false;
		//FOR QUEEN1
		int no=0;int i=0;queens[q1[0]][q1[1]]=++no;queens[q2[0]][q2[1]]=++no;
		
		while(i++<32&&stat==true){
			
			next[0]=q1[0];next[1]=q1[1];
			reset(board);
			block(q2[0],q2[1]);
			random(q1[0],q1[1]);
			if(next[0]!=q1[0]||next[1]!=q1[1]){
				q1[0]=next[0];
				q1[1]=next[1];				
				queens[q1[0]][q1[1]]=++no;
				//System.out.println(no+" q1 at "+next[0]+","+next[1]);
			}
			
			//FOR QUEEN2

			next[0]=q2[0];next[1]=q2[1];
			reset(board);
			block(q1[0],q1[1]);
			random(q2[0],q2[1]);
			if(next[0]!=q2[0]||next[1]!=q2[1]){
				q2[0]=next[0];
				q2[1]=next[1];
				queens[q2[0]][q2[1]]=++no;
				//System.out.println(no+" q2 at "+next[0]+","+next[1]);
			}
			
		}//System.out.println();
		//q(queens);
		return no;
		
	}
	
	public void random(int i,int j){
		int count=0;
		do{
		int k=i;int l=j;
		int number=rand.nextInt(6);
		//System.out.println(number);
		switch(number){
		case 0://all the horizontal
			number=j;
			while(number==j)
			number=rand.nextInt(8);
			//System.out.println("..."+number);
			l=number;
				if(queens[i][l]==0&&board[i][l]!=1){
					next[0]=i;next[1]=l;}
				break;
		case 1://all the vertical
			number=i;
			while(number==i)
			number=rand.nextInt(8);
			k=number;
			//System.out.println("..."+number);
			if(queens[k][j]==0&&board[k][j]!=1){
				next[0]=k;next[1]=j;}
			break;
		case 2:
			//diagonal left up to right down
			number=rand.nextInt(8);
			//System.out.println("..."+number);
			while(number>=0&&l<7&&k<7){
				l++;k++;number--;
			}
			if(queens[k][l]==0&&board[k][l]!=1){
				next[0]=k;next[1]=l;}
			break;
		case 3:
			//diagonal right up to left down
			number=rand.nextInt(8);
			//System.out.println("..."+number);
			while(number>=0&&k<7&&l>0){
				k++;l--;number--;
			}
			if(queens[k][l]==0&&board[k][l]!=1){
				next[0]=k;next[1]=l;}
			break;
		case 4:
			//diagonal left down to right up
			number=rand.nextInt(8);
			//System.out.println("..."+number);
			while(number>=0&&l<7&&k>0){
				l++;k--;number--;
			}
			if(queens[k][l]==0&&board[k][l]!=1){
				next[0]=k;next[1]=l;}
			break;
		case 5:
			//diagonal right down to left up
			number=rand.nextInt(8);
			//System.out.println("..."+number);
			while(number>=0&&l>0&&k>0){
				l--;k--;number--;
			}
			if(queens[k][l]==0&&board[k][l]!=1){
				next[0]=k;next[1]=l;}
			break;
			
		}count++;
		}while(next[0]==i&&next[1]==j&&count<500&&queens[q2[0]][q2[1]]!=64&&queens[q1[0]][q1[1]]!=64);
			
	}
	
	public void exhaustive(){
		for(int i=0;i<chess.length;i++)
			for(int j=0;j<chess[i].length;j++){
				q1[0]=i;q1[1]=j;
				reset(board);
				block(i,j);
				for(int k=0;k<board.length;k++)
					for(int l=0;l<board[k].length;l++){
						block(i,j);
						if(board[k][l]!=1){
							q2[0]=k;q2[1]=l;
							int brute=0;
							while(brute<64){
								block(i,j);
								brute=moved(i,j,k,l);
							    qreset();
							}
							System.out.printf("%d,%d...%d,%d is %d\n",i,j,k,l,brute);
							
							}
					}
			}
	}
	
	public void qreset(){
		reset(chess);
		reset(queens);
		reset(board);
	}
}
