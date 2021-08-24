package com.deitel.jhtp.ch08;
import javax.swing.JOptionPane;

public class ticPlay {

	private static ticTacToe p1;
	private static ticTacToe p2;
	
	public ticPlay() {
		
	}
	
	public static void game(){
		boolean game = true;
		int x=5;
		chIcon();
		while(game){
			if(p1.play()){
				x=JOptionPane.showConfirmDialog(null,ticTacToe.board()+"\nDo you want to play a new game?", "SuperB "+p1.getName()+" WINS!!!!!!",0);
			}
			else if(p2.play()){
				x=JOptionPane.showConfirmDialog(null,ticTacToe.board()+"\nDo you want to play a new game?", "SuperB "+p2.getName()+" WINS!!!!!!",0);
			}
			else if(ticTacToe.isFull()){
				x=JOptionPane.showConfirmDialog(null,ticTacToe.board()+"\nDo you want to play a new game?", "Stale Mate...No Winner!",0);
			}
			if(x==1)
				break;
			else if(x==0){
				chIcon();
				x=5;
			}
		}
		
	}
	
	public static void chIcon(){
		String x=JOptionPane.showInputDialog(null, "Player1 Choose either X or O");
		x=x.toUpperCase();
		try{
		p1 = new ticTacToe("Player1",x);
		p2 = new ticTacToe("Player2",(x.equals("X")?"O":"X"));
		}catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e);}
	}

}
