import java.util.Arrays;
import java.util.Scanner;

public class Turtle {
	private final int row=20,co=20;
	Scanner in = new Scanner(System.in);
	private enum dir{UP,DOWN,LEFT,RIGHT};
	
	private int grid[][]=new int[row][co];
	private int[] draw2d = new int[2];
	private boolean penDown = false;
	private int end;
	private char write ='x';
	
	private dir draw = dir.RIGHT;
	
	public Turtle() {
		reset();
	}
	
	//pen up
	public void setPen(){
		System.out.printf("\nCurrent pen: %c\n", write);
		System.out.print("Enter new pen character");
		write = in.next().charAt(0);
	}
	public void penUp(){
		if(penDown==true)
			penDown=false;
	}
	public void penDown(){
		if(penDown==false)
			penDown=true;
		//draw at current position
		grid[draw2d[0]][draw2d[1]]=1;
	}
	//turn left
	public void turnleft(){
		switch(draw){
		case UP:
			draw = dir.LEFT; break;
		case DOWN:
			draw = dir.RIGHT; break;
		case LEFT:
			draw = dir.DOWN; break;
		case RIGHT:
			draw = dir.UP; break;
		}
	}
	//turn right
	public void turnRight(){
		switch(draw){
		case UP:
			draw=dir.RIGHT;break;
		case DOWN:
			draw = dir.LEFT; break;
		case LEFT:
			draw = dir.UP; break;
		case RIGHT:
			draw = dir.DOWN; break;
		}
	}
	
	//Getters
	public void LocateDir(){
		System.out.printf("\nPen location is(%d,%d)",draw2d[0],draw2d[1]);
		System.out.println("********************\n");
	}
	//move forward n spaces in dir
	public void forward(int distance){
		switch(draw){
		case RIGHT:
			end = draw2d[1]+distance;
			//check out of bounds
			if(end>=co)
				end = co-1;
			//draw
			if(penDown){
				for(int col=draw2d[1];col<end;col++){
					grid[draw2d[0]][col]=1;
				}
			}
			//set new draw2d
			draw2d[1]=end;
			break;
			//move left
		case LEFT:
			end = draw2d[1] - distance;
			//check out of bounds
			if(end <=0)
				end =0;
			
			//draw
			if(penDown){
				for(int col = draw2d[1];col>=end;col--)
					grid[draw2d[0]][col]=1;
			}
			//set new draw2d
			draw2d[1] = end;
			break;
			//move up
		case UP:
			end = draw2d[0] - distance;
			//check out of bounds
			if(end<=0)
				end =0;
			//draw
			if(penDown){
				for(int row=draw2d[0];row>=end;row--)
					grid[row][draw2d[1]]=1;
			}
			//set new draw2d
			draw2d[0]=end;
			break;
			//move down
		case DOWN:
			end = draw2d[0] +distance;
			//check if out of bounds
			if(end >=row)
				end = row-1;
			//draw
			if(penDown){
				for(int row = draw2d[0]; row<end ;row++)
					grid[row][draw2d[1]]=1;
			}
			//set new draw2d
			draw2d[0] = end;
			break;
		}
	}
	
	//prints the grid
	public void showGrid(){
		System.out.println();
		for(int row=0;row<grid.length;row++){
			//border
			System.out.print("| ");
			for(int column=0;column<grid.length;column++){
				System.out.printf("%c", grid[row][column]==1?write:' ');
				System.out.print(" ");
			}
			System.out.println(" |");
		
		}
	}
	//reset draw2d and grid
	public void reset(){
		//reset each row
		for(int[] row:grid)
			Arrays.fill(row, 0);
		//centralise 'pen'
		draw2d[0]=9;
		draw2d[1]=9;
	}
	//print command menu
	public void printMenu(){
		LocateDir();
		System.out.println("0. Change Pen\n1. Pen Up\n2.Pen Down\n3. Turn Right\n4.Turn Left\n5. Move Forward in defined spaces");
		System.out.println("6.Display the 20*20 array\n7. Reset Drawing\n8. Draw Rectangle\n9. Finish Drawing");
	}
	//to get current location of the pen
	public void rect(int length,int breadth){
		draw2d[0]=length;
		draw2d[1]=breadth;
		penDown = true;
		end = draw2d[1]+length;
		//check out of bounds
		for(int i=0;i<4;i++){
		if(i==0){
		if(end>=co)
			end = co-1;
		//draw
		if(penDown){
			for(int col=draw2d[1];col<end;col++){
				grid[draw2d[0]][col]=1;
			}
			//set new draw2d
			draw2d[1]=end;
		}
	}
		if(i==1){		
		end = draw2d[0] +breadth;
		//check if out of bounds
		if(end >=row)
			end = row-1;
		//draw
		if(penDown){
			for(int row = draw2d[0]; row<end ;row++)
				grid[row][draw2d[1]]=1;
		}
		//set new draw2d
		draw2d[0] = end;
	}
		if(i==2){
			end = draw2d[1] - length;
			//check out of bounds
			if(end <=0)
				end =0;
			//draw
			if(penDown){
				for(int col = draw2d[1];col>=end;col--)
					grid[draw2d[0]][col]=1;
			}
			//set new draw2d
			draw2d[1] = end;
		}
		if(i==3){
			end = draw2d[0] - breadth;
			//check out of bounds
			if(end<=0)
				end =0;
			//draw
			if(penDown){
				for(int row=draw2d[0];row>=end;row--)
					grid[row][draw2d[1]]=1;
			}
			//set new draw2d
			draw2d[0]=end;
		}
		
		}
	}// end method drawRectangle
	
	
}
