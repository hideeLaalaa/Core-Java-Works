package com.deitel.jhtp.ch08;
import javax.swing.JOptionPane;

public class ticTacToe {

	public static String[][] board = new String[3][3];
	private String[][] plays = new String[3][3];
	private String icon="o";
	private String name;
	public static boolean win = false;
	private enum ic{X,O,Empty};

	public ticTacToe() {
		reset();
		reset();
	}
	
	public ticTacToe(String x,String y) {
		reset();
		reset();	
		setIcon(y);
		setName(x);
	}
	
	public void setName(String x){
		name = x;
	}
	
	public String getName(){
		return name;
	}
	
	public void setIcon(String x){
		x.toUpperCase();
		if(x.equals("X")||x.equals("O"))
			icon=x;
		else
			throw new IllegalArgumentException("You can only choose only either X or O");
	}
	
	public String getIcon(){
		return icon;
	}
	
	public boolean won(){
		boolean stat=false;
		if(chVert()||chHori()||chDiag()){
			stat=true;
			win=true;}
		return stat;
	}
	
	public boolean chHori(){
		boolean stat = true;
		for(int i=0;i<plays.length;i++){
			stat=true;
			if(plays[i][0].equals(getIcon()))
				for(int j=0;j<plays[i].length;j++){
					if(!plays[i][j].equals(getIcon()))
						stat=false;
				}
			else stat=false;
			if(stat)
				break;
		}
		return stat;
	}
	
	public boolean chVert(){
		boolean stat = true;
		for(int i=0;i<plays.length;i++){
			stat=true;
			if(plays[0][i].equals(getIcon()))
				for(int j=0;j<plays[i].length;j++){
					if(!plays[j][i].equals(getIcon()))
						stat=false;
				}
			else stat=false;
			if(stat)
				break;
		}
		return stat;
	}
	
	public boolean chDiag(){
		boolean stat=false;
		if(ch(1,1)){
			if((ch(0,0)&&ch(2,2))||(ch(0,2)&&ch(2,0)))
				stat=true;
		}
		return stat;
	}
	
	public boolean ch(int i,int j){
		if(plays[i][j].equals(getIcon()))
			return true;
		else return false;
	}
	
	//FOR THE COMP
	public int checkDiag1(){
		int stat=0;
		if(ch(1,1)){
			stat++;
			if(ch(0,0))
				stat++;
			if(ch(2,2))
				stat++;
		}
		return stat;
	}
	
	public int checkDiag2(){
		int stat=0;
		if(ch(1,1)){
			stat++;
			if(ch(0,2))
				stat++;
			if(ch(2,0))
				stat++;
		}
		return stat;
	}
	
	public int cv(int i){
		int stat=0;
			for(int j=0;j<plays[i].length;j++){
				if(plays[j][i].equals(getIcon()))
					stat++;
				}
		return stat;
	}
	
	public int cv(){
		int stat = 0;
		for(int i=0;i<plays.length;i++){
			if(cv(i)==2);
				stat=i;
		}
		return stat;
	}
	
	public int chHor(int x){
		int stat = 5;
		for(int i=0;i<plays.length;i++){
			if(ch(i)==x);
				stat=i;
		}
		return stat;
	}
	
	public int ch(int i){
		int stat=0;
			for(int j=0;j<plays[i].length;j++){
				if(plays[i][j].equals(getIcon()))
					stat++;
				}
		return stat;
	}
	//This is where i stopped after trying to get the count of each char 
	//in  a particular position....The next step is to write a method for 
	//blocking and winning if count is 2 and if 1 it should increment the no
	//of char in the pos...Also to implement the triangle trick if nothing
	//to block or increment only if the count of the opp. char is not substa
	//ntial where the trick is being implemented.
	public void toPlay(int x){
		boolean stat = false;
		
			
	}
	
	public void pickPlay(int x){
		if(x%10==0){
			int i=0;
			while(true){
				if(!board[x][i].equals("X")&&!board[x][i].equals("O"))
				{	plays[x][i]=getIcon();
					board[x][i]=getIcon();
					break;
				}i++;
			}
		}
	}
	
	
	public void computer(){
		boolean stat=true;
		while(stat&&!isFull()){
			try{
				int x = getPlay();
				x-=1;
				int i=x/3;
				int j=x%3;
				if(!board[i][j].equals("X")&&!board[i][j].equals("O"))
				{	plays[i][j]=getIcon();
					board[i][j]=getIcon();
					stat=false;
				}
				else
					JOptionPane.showMessageDialog(null, "Option Already Taken");
			}catch(Exception e){JOptionPane.showMessageDialog(null, "Error Option");}
		}
	}
	
	public int getPlay(){
		return 0;
		
	}
	
	
	public void getInput(){
		boolean stat=true;
		while(stat&&!isFull()){
			try{
				int x =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your play\n"+board(),getName(),0));
				x-=1;
				int i=x/3;
				int j=x%3;
				if(!board[i][j].equals("X")&&!board[i][j].equals("O"))
				{	plays[i][j]=getIcon();
					board[i][j]=getIcon();
					stat=false;
				}
				else
					JOptionPane.showMessageDialog(null, "Option Already Taken");
			}catch(Exception e){JOptionPane.showMessageDialog(null, "Error Option");}
		}
	}
	
	public boolean play(){
		getInput();
		 return won();
	}
	
	public void reset(){
		int x=1;
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				board[i][j]=(x+"");
				plays[i][j]=(x+"");
				x++;
			}    
		}
		win=false;
	}
	
	public static boolean isFull(){
		boolean stat=true;
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				if(!board[i][j].equals("X")&&!board[i][j].equals("O"))
					{stat=false; break;}
			}
		}
		return stat;
	}
	
	public static String board(){
		String x="";
		for(int i=0;i<board.length;i++){
			x+="|";
			for(int j=0;j<board[i].length;j++){
				x+=String.format("%4s%4s", board[i][j],"|");
			}
			x+="\n";
		}
		return x;
	}

}

