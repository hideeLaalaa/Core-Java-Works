import java.util.LinkedList;


public class SudokuBoard {

	static Box[][][] sudoku = new Box[9][3][3];
	static LinkedList<LinkedList<LinkedList<Integer>>> colMissPosition;
	static LinkedList<LinkedList<LinkedList<Integer>>> rowMissPosition;
	static LinkedList<LinkedList<LinkedList<Integer>>> boxMissPosition;
	int count=0,totalMiss=0,trials=0;
	boolean allSolved = false;

	int[][][] sudokuValues =
	{ 		{{0,0,0},
			 {7,0,0},
			 {0,0,0}},
						{{6,0,0},
				 		 {0,0,3},
				 		 {0,9,1}},
									{{4,0,0},
				 			 		 {6,0,0},
				 			 		 {0,8,0}},
			{{0,0,0},
			 {0,5,0},
			 {0,0,0}},
						{{0,0,0},
				 		 {1,8,0},
				 		 {3,0,6}},
									{{0,0,0},
									 {0,0,3},
									 {0,4,5}},
			{{0,4,0},
			 {9,0,3},
			 {0,2,0}},
						{{2,0,0},
				 		 {0,0,0},
				 		 {0,0,0}},
									{{0,6,0},
				 			 		 {0,0,0},
				 			 		 {1,0,0}}
	};
	
//	int[][][] sudokuValues =
//	{ 		{{0,1,0},
//			 {0,0,0},
//			 {0,0,0}},
//						{{0,0,0},
//				 		 {8,3,1},
//				 		 {0,0,0}},
//									{{2,0,0},
//				 			 		 {0,0,0},
//				 			 		 {0,5,0}},
//			{{0,0,0},
//			 {0,0,5},
//			 {0,9,0}},
//						{{1,0,7},
//				 		 {0,9,0},
//				 		 {0,0,0}},
//									{{9,0,0},
//									 {0,0,8},
//									 {0,0,3}},
//			{{3,7,0},
//			 {4,0,9},
//			 {0,0,0}},
//						{{0,0,5},
//				 		 {7,6,0},
//				 		 {0,0,8}},
//									{{0,0,2},
//				 			 		 {0,0,0},
//				 			 		 {0,3,4}}
//	};
	
//	int[][][] sudokuValues =
//	{ 		{{0,2,0},
//			 {5,8,0},
//			 {0,0,0}},
//						{{6,0,8},
//				 		 {0,0,9},
//				 		 {0,4,0}},
//									{{0,0,0},
//				 			 		 {7,0,0},
//				 			 		 {0,0,0}},
//			{{3,7,0},
//			 {6,0,0},
//			 {0,0,8}},
//						{{0,0,0},
//				 		 {0,0,0},
//				 		 {0,0,0}},
//									{{5,0,0},
//									 {0,0,4},
//									 {0,1,3}},
//			{{0,0,0},
//			 {0,0,9},
//			 {0,0,0}},
//						{{0,2,0},
//				 		 {8,0,0},
//				 		 {3,0,6}},
//									{{0,0,0},
//				 			 		 {0,3,6},
//				 			 		 {0,9,0}}
//	};

	//SOLVED NONE
//	int[][][] sudokuValues =
//		{ 		{{0,0,0},
//				 {0,5,9},
//				 {2,0,0}},
//							{{0,0,6},
//					 		 {0,0,0},
//					 		 {0,0,8}},
//										{{0,0,0},
//					 			 		 {0,0,8},
//					 			 		 {0,0,0}},
//				{{0,4,5},
//				 {0,0,3},
//				 {0,0,6}},
//							{{0,0,0},
//					 		 {0,0,0},
//					 		 {0,0,3}},
//										{{0,0,0},
//										 {0,0,0},
//										 {0,5,4}},
//				{{0,0,0},
//				 {0,0,0},
//				 {0,0,0}},
//							{{3,2,5},
//					 		 {0,0,0},
//					 		 {0,0,0}},
//										{{0,0,6},
//					 			 		 {0,0,0},
//					 			 		 {0,0,0}}
//		};
	
	public SudokuBoard() {
		setSudoku();
		Square.Square();
		Row.Row();
		Column.Column();
		initializeBoxMiss();
		setMissPosition();
		System.out.println("\t\tPROBLEM");	
		printSudoku();
		test();
	}
	
	public void test(){
//		SudokuBoard x = new SudokuBoard(1);
//		LinkedList<Integer> test = new LinkedList<>();
//		test = new LinkedList<>();
//		test.add(1);
//		test.add(2);
//		test.add(4);
//		updateValues2(test,Row.row.get(3).get(2),Row.row.get(3).get(3),Row.row.get(3).get(5));
//		printRowMiss();
//		printColMiss();
//		printBoxMiss();
//		printMissArray();
	}
	
	
	public void setSudoku(){
		for(int x=0;x<sudoku.length;x++){
			for(int y = 0;y<sudoku[x].length;y++){
				for(int z = 0;z<sudoku[x][y].length;z++){
					try {
						int box = x;
						int row = 3*(box/3)+y;
						int col = 3*(box%3)+z;
						sudoku[x][y][z]=new Box
								(sudokuValues[x][y][z],box,row,col);
						if(sudokuValues[x][y][z]==0)
							totalMiss++;
					} catch (Exception e) {
						System.err.println(x+"\t"+y+"\t"+z);
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public void solve(){
		
		while(!full()){
			posTactics1();
			missTactics1();
			if(trials>100){
				System.out.println("This program is finding it hard to solve this sudoku\n"
						+ "Its too hot to handle");
				break;
			}
			trials++;
		}
	}
	
	
	public void printSudoku(){
		//LinkedList<LinkedList<LinkedList<Integer>>> test = new LinkedList<>();
		//System.out.println("Solved: "+Box.solved);
		System.out.println("_____________________________________");
		for(int x = 1;x<10;x++){
			int hori = ((x<4)?-1:(x<7)?2:5);
			int y=(x-1)%3;
			
			for(int i=1;i<10;i++){
				if((i-1)%3==0){
					hori++;
					System.out.print("| {");}
				int value = sudoku[hori][y][(i-1)%3].getBoxValue();
				System.out.printf("%2s", (value>0?Integer.toString(value):""));
				if(i==9)
					System.out.print("}|");
				else if(i%3==0)
					System.out.print("}");
				else
					System.out.print(",");
				
			}
			
			if(x%3==0)
				System.out.println("\n-------------------------------------");
			else
				System.out.println();
		} 
		System.out.println();
//		printBoxMiss();
//		printRowMiss();
		//printSudokuMiss();
	}
	
	public void printBoxMiss(){
		System.out.printf("%3s %10d %10d %10d %10d %10d %10d %10d %10d %10d\n","BOX",1,2,3,4,5,6,7,8,9);
		for(int j=0;j<9;j++){
			System.out.printf("%-3d:", (j+1));
			for(int i=0;i<9;i++){
				System.out.printf("%3s%-5s","", boxMissPosition.get(j).get(i));
			}
			System.out.println();
		}
	}
	
	public void printMissArray(){
		System.out.printf("%3s %10d %10d %10d %10d %10d %10d %10d %10d %10d\n","BOX(Miss)",1,2,3,4,5,6,7,8,9);
		for(int j=0;j<9;j++){
			System.out.printf("%-3d:", (j+1));
			for(int i=0;i<9;i++){
				System.out.printf("%3s%-5s","", Square.square.get(j).get(i).getMissValue());
			}
			System.out.println();
		}
	}
	
	public void printRowMiss(){
		System.out.printf("%3s %10d %10d %10d %10d %10d %10d %10d %10d %10d\n","ROW",1,2,3,4,5,6,7,8,9);
		for(int j=0;j<9;j++){
			System.out.printf("%-3d:", (j+1));
			for(int i=0;i<9;i++){
				System.out.printf("%3s%-5s","", rowMissPosition.get(j).get(i));
			}
			System.out.println();
		}
	}
	public void printColMiss(){
		System.out.printf("%3s %10d %10d %10d %10d %10d %10d %10d %10d %10d\n","COL",1,2,3,4,5,6,7,8,9);
		for(int j=0;j<9;j++){
			System.out.printf("%-3d:", (j+1));
			for(int i=0;i<9;i++){
				System.out.printf("%3s%-5s","", colMissPosition.get(j).get(i));
			}
			System.out.println();
		}	
	}
	
	public void allSolved(){
		System.out.println("\t\tSOLUTION");
		System.out.printf("COUNT: \"%d\"\tSOLVED: %d/%d\n ", count, Box.solved,totalMiss);
		printSudoku();
		System.exit(100);
	}
	
	
	public void initializeBoxMiss(){
		for(int x=0;x<sudoku.length;x++){
			for(int y = 0;y<sudoku[x].length;y++){
				for(int z = 0;z<sudoku[x][y].length;z++){
					if(sudoku[x][y][z].isEmpty())
						try {
							initialBoxMiss(x,y,z);
						} catch (Exception e) {
							e.printStackTrace();
						}
				}
			}
		}
	}
	
	
	public void posTactics2(int box, int no ,int type){
		
		switch(type){
		//TYPE ZERO IS BOX
		case 0:{
			for(int i=0;i<9;i++){
				if(i!=no)
					if(boxMissPosition.get(box).get(no).equals
						(boxMissPosition.get(box).get(i))){
						LinkedList<Integer> values = new LinkedList<>(); 
						values.add((no+1));
						values.add((i+1));
						LinkedList<Integer> pos = boxMissPosition.get(box).get(i);
						Box[] boxes ={ Square.square.get(box).get(pos.get(0)),
								Square.square.get(box).get(pos.get(1)) };
						updateValues2(values,boxes);
						//updateTactics2(box,pos,values,type);
				}else{
					LinkedList<Integer> values = new LinkedList<>(); 
					values.add((no+1));
					LinkedList<Integer> pos = boxMissPosition.get(box).get(no);
					Box[] boxes ={ Square.square.get(box).get(pos.get(0)),
							Square.square.get(box).get(pos.get(1)) };
					updateValues2(values,boxes);
				}
			}
		
		}break;
		//TYPE 1 is Row
		case 1:{
			int row = box;
			for(int i=0;i<9;i++){
				if(i!=no)
					if(rowMissPosition.get(row).get(no).equals
						(rowMissPosition.get(row).get(i))){
						//System.err.println(row+":\t"+no+" & "+i);
						LinkedList<Integer> values = new LinkedList<>(); 
						values.add((no+1));
						values.add((i+1));
						LinkedList<Integer> pos = rowMissPosition.get(row).get(i);
						Box[] boxes ={ Row.row.get(row).get(pos.get(0)),
								Row.row.get(row).get(pos.get(1)) };
						updateValues2(values,boxes);
				}else{
					LinkedList<Integer> values = new LinkedList<>(); 
					values.add((no+1));
					LinkedList<Integer> pos = rowMissPosition.get(row).get(no);
					Box[] boxes ={ Row.row.get(row).get(pos.get(0)),
							Row.row.get(row).get(pos.get(1)) };
					updateValues2(values,boxes);
				}
			}
		
		}break;
		///TYPE IS A COLUMN
		case 2:{
			int col = box;
			for(int i=0;i<9;i++){
				if(i!=no)
					if(colMissPosition.get(col).get(no).equals
						(colMissPosition.get(col).get(i))){
						LinkedList<Integer> values = new LinkedList<>(); 
						values.add((no+1));
						values.add((i+1));
						LinkedList<Integer> pos = colMissPosition.get(col).get(i);
						Box[] boxes ={ Column.col.get(col).get(pos.get(0)),
								Column.col.get(col).get(pos.get(1)) };
						updateValues2(values,boxes);
				}else{
					LinkedList<Integer> values = new LinkedList<>(); 
					values.add((no+1));
					LinkedList<Integer> pos = colMissPosition.get(col).get(no);
					Box[] boxes ={ Column.col.get(col).get(pos.get(0)),
							Column.col.get(col).get(pos.get(1)) };
					updateValues2(values,boxes);
				}
			}
			
			
		}break;
		
		}
		
	}
	
	public void setValue(Box box,int value){
		try {
//			printRowMiss();
//			printColMiss();
//			printBoxMiss();
//			printMissArray();
			box.setValue(value);
			updateValues(box);
			box.setMissArray(new LinkedList<>());
			newMissValues();
			Box.solved++;
			if(Box.solved==totalMiss)
				allSolved=true;
			printSudoku();
			if(allSolved)
				allSolved();
			trials++;
//			missTactics1();
//			posTactics1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void posTactics1(){
		//THIS TACTICS CHECKS IF A NUMBER CAN ONLY BE FOUND IN ONE POSITION
		//CHECKING EACH BOX FOR THIS PATTERN
		int box = -1;
		for(LinkedList<LinkedList<Integer>> i : boxMissPosition){
			box++;
			int number = -1;
			for(LinkedList<Integer> j : i){
				if(j.size()>0)
					count++;
				number++;
				if(j.size()==1){
					int y= (j.get(0)<3?0:j.get(0)<6?1:2);
					int z=	(j.get(0)%3);
					try {
						setValue(sudoku[box][y][z],number+1);
					} catch (Exception e) {
						System.err.println("Na here"+e);
						e.printStackTrace();
					}
				}
				else if(j.size()==2){
					posTactics2(box,number,0);
				}
			}
		}
		
		//CHECKING EACH ROW FOR THIS PATTERN
		int row = -1;
		for(LinkedList<LinkedList<Integer>> i : rowMissPosition){
			row++;
			int number = -1;
			for(LinkedList<Integer> j : i){
				if(j.size()>0)
					count++;
				number++;
				if(j.size()==1){
					int x= (row<3?0:row<6?3:6);
					x +=( j.get(0)<3?0:j.get(0)<6?1:2 );
					int z=	(j.get(0)%3);	
					try {
						setValue(sudoku[x][(row%3)][(z)],number+1);
					} catch (Exception e) {
						  System.err.println("Na here");
					}
				}
				else if(j.size()==2){
					posTactics2(row,number,1);
				}
				
			}
			
			
		}
		
		//CHECKING EACH COLUMN FOR THIS PATTERN
		int col = -1;
		for(LinkedList<LinkedList<Integer>> i : colMissPosition){
			col++;
			int number = -1;
			for(LinkedList<Integer> j : i){
				if(j.size()>0)
					count++;
				number++;
				if(j.size()==1){
					int x= col/3;
					x +=( j.get(0)<3?0:j.get(0)<6?3:6 );
					int y=	(j.get(0)%3);	
					try {
						setValue(sudoku[x][y][(col%3)],number+1);
					} catch (Exception e) {
						System.err.println("Na here");
					}
				}
				else if(j.size()==2){
					posTactics2(col,number,2);
				}
			}
		}
	}
	
	public void setMissPosition(){
		
		//FOR BOX
		Square.squareMissPosition();
		
		//FOR HORIZONTAL
		Row.rowMissPosition();
		
		///FOR VERTICAL
		Column.colMissPosition();
		
	}
	
	public boolean full(){
		
		return (checkVert() && checkHori() && checkSq());
	}
	
	
	public void missTactics2(Box box){
		//CHECK EACH BOX FOR SIMILAR MISSVALUES
		LinkedList<Box> pos = new LinkedList<>();
		boolean same = true;
		pos.add(box);
		for(Box i : Square.square.get(box.box) ){
			same = true;
			if(!i.equals(box)&&i.isEmpty()){
				
				for(int x:i.getMissValue()){
					if(box.getMissValue().contains((Integer)x)==false)
					{
						same=false;
					}
				}
				if(same){
					pos.add(i);
				}
			}
			
		}
		if(pos.size()==box.getMissValue().size()){
			Box[] boxes = new Box[pos.size()]; 
			for(int i=0;i<boxes.length;i++)
				boxes[i]=pos.get(i);
			updateValues2(box.getMissValue(),boxes);
		}
		
		//CHECK EACH ROW FOR SIMILAR MISSVALUES
		pos = new LinkedList<>();
		pos.add(box);
		for(Box i : Row.row.get(box.row) ){
			same = true;
			if(!i.equals(box)&&i.isEmpty()){
				
				for(int x:i.getMissValue()){
					if(box.getMissValue().contains((Integer)x)==false)
					{
						same=false;
					}
				}
				if(same){
					pos.add(i);
				}
			}
			
		}
		if(pos.size()==box.getMissValue().size()){
			Box[] boxes = new Box[pos.size()]; 
			for(int i=0;i<boxes.length;i++)
				boxes[i]=pos.get(i);
			updateValues2(box.getMissValue(),boxes);
		}
				
		//CHECK EACH COLUMN FOR SIMILAR MISSVALUES
		pos = new LinkedList<>();
		pos.add(box);
		for(Box i : Column.col.get(box.col) ){
			same = true;
			if(!i.equals(box)&&i.isEmpty()){
				
				for(int x:i.getMissValue()){
					if(box.getMissValue().contains((Integer)x)==false)
					{
						same=false;
					}
				}
				if(same){
					pos.add(i);
				}
			}
			
		}
		if(pos.size()==box.getMissValue().size()){
			Box[] boxes = new Box[pos.size()]; 
			for(int i=0;i<boxes.length;i++)
				boxes[i]=pos.get(i);
			updateValues2(box.getMissValue(),boxes);
		}
				
				
	}
	
	public void missTactics1(){
		//System.out.println();
		for(LinkedList<Box> i : Square.square){

			for(Box j : i){
				if(j.isEmpty())
					count++;
				if(j.getMissValue().size()==1){
					try {
						setValue(j,j.getMissValue().get(0));

					} catch (Exception e) {
						System.err.println("Na here"+e);
						e.printStackTrace();
					}
				}
				
				else if(j.getMissValue().size()>1){
					missTactics2(j);
				}
				
			}
			
		}
		
	}	
	
	public void initialBoxMiss(int x,int y,int z){
		LinkedList<Integer> miss = compareMiss(x,y,z);
			sudoku[x][y][z].setMissArray(miss);
	}
	
	public boolean checkVert(){//OSHI
	
		for(int x = 1;x<10;x++){
			if (checkVertical(x)==false)
				return false;
		} 
		return true;
	}
	
	public boolean checkHori(){

		for(int x = 1;x<10;x++){
			if (checkHorizontal(x)==false)
				return false;
		} 
		return true;
	}
	
	public boolean checkSq(){
		for(int x = 1;x<10;x++){
			if (checkSquare(x)==false)
				return false;
		} 
		return true;
	}
	
//	public LinkedList<Integer> compareUpdateMiss(int x,int y,int z ){
//		LinkedList<Integer> miss = new LinkedList<Integer>();
//		LinkedList<Integer> vert = getVerticalMiss(x,y,z);
//		LinkedList<Integer> hori = getHorizontalMiss(x,y,z);
//		LinkedList<Integer> square = getSquareMiss(x,y,z);
//		for(int value : square){
//			if(hori.contains(value)&&vert.contains(value))
//				miss.add(value);
//		}
//		return miss;
//	}
	
	public LinkedList<Integer> compareMiss(int x,int y,int z ){
		LinkedList<Integer> miss = new LinkedList<Integer>();
		LinkedList<Integer> vert = getVerticalMiss(x,y,z);
		LinkedList<Integer> hori = getHorizontalMiss(x,y,z);
		LinkedList<Integer> square = getSquareMiss(x,y,z);
		for(int value : square){
			if(hori.contains(value)&&vert.contains(value))
				miss.add(value);
		}
		return miss;
	}
	
	public boolean checkVertical(int x){
		boolean complete = true;
		int sum=0;
		int z=(x-1)%3;
		x=x/3;
		int vert = (x % 3)-3;
		for(int i=1;i<10;i++){
			if((i-1)%3==0)
				vert+=3;
			//if the value in the vertical box is valid, then sum up
			sum+=sudoku[vert][(i-1)%3][z].getBoxValue();
			
		}
		if(sum!=45)
			complete = false;
		return complete;
	}
	
	public boolean checkHorizontal(int x){
		boolean complete = true;
		int sum=0;
		int hori = ((x<4)?-1:(x<7)?2:5);
		int y=(x-1)%3;
		for(int i=1;i<10;i++){
			if((i-1)%3==0)
				hori++;
			sum+=sudoku[hori][y][(i-1)%3].getBoxValue();
		}
		if(sum!=45)
			complete = false;
		return complete;
	}
	
	public boolean checkSquare(int x){
		boolean complete = true;
		int sum=0;
		int square = -1;
		for(int i=1;i<10;i++){
			if((i-1)%3==0)
				square++;
			sum+=sudoku[x-1][square][(i-1)%3].getBoxValue();		
		}
		if(sum!=45)
			complete = false;
		return complete;
	}
	
	public LinkedList<Integer> getVerticalMiss(int x,int y,int z ){
		LinkedList<Integer> miss = new LinkedList<Integer>();
		for(int i=1;i<10;i++)
			miss.add(i);
		int vert = (x % 3)-3;
		for(int i=1;i<10;i++){
			if((i-1)%3==0)
				vert+=3;
			int number = sudoku[vert][(i-1)%3][z].getBoxValue(); 
			//if the value in the vertical box is valid, then remove from the miss vertValues
			if(number>0) 
				miss.remove((Integer)number);
		}
		return miss;
	}
	
	public LinkedList<Integer> getHorizontalMiss(int x,int y,int z ){
		LinkedList<Integer> miss = new LinkedList<Integer>();
		for(int i=1;i<10;i++)
			miss.add(i);
		int hori = ((x<3)?-1:(x<6)?2:5);
		for(int i=1;i<10;i++){
			if((i-1)%3==0)
				hori++;
			int number = sudoku[hori][y][(i-1)%3].getBoxValue();
			if(number>0)
				miss.remove((Integer)number);
		}
		return miss;
	}
	
	public LinkedList<Integer> getSquareMiss(int x,int y,int z ){
		LinkedList<Integer> miss = new LinkedList<Integer>();
		for(int i=1;i<10;i++)
			miss.add(i);
		int square = -1;
		for(int i=1;i<10;i++){
			if((i-1)%3==0)
				square++;
			int number = sudoku[x][square][(i-1)%3].getBoxValue();
			if(number>0)
				miss.remove((Integer)number);
		}
		return miss;
	}
	
	public String toString(){
		
		return String.format("%s: %d", "Solved",Box.solved);
	}
	
	public void updateValues2(LinkedList<Integer> values, Box... boxs){
		boolean sameRow=true,sameBox=true,sameCol=true;
		LinkedList<Box> boxList = new LinkedList<>();
		
		for(Box test:boxs)
			boxList.add(test);
		
		if(values.size()>1)//do this only if it 
			for(Box test:boxs){//Each box
				for(int x : test.getMissValue()){//missValue for each box
					if(!values.contains(x)){//remove unwanted from missPositions
					updatePositionValues(test,x-1);
					}				
				}
			}
		
		for(int x = boxs.length-1;x>=0;x--){
			if(boxs[0].box != boxs[x].box){//if the box(es) are in the same col/row/box
				sameBox=false;
			}
			if(boxs[0].col != boxs[x].col){//if the box(es) are in the same col/row/box
				sameCol=false;
			}
			if(boxs[0].row != boxs[x].row){//if the box(es) are in the same col/row/box
				sameRow=false;
			}
		}
		
		for(int x : values){//neededValue for each box removeUpdate in other positions
			if(sameBox){
				LinkedList<Integer> test = new LinkedList<>();
				for(int y: boxMissPosition.get(boxs[0].box).get(x-1))//where the values are also located in d bx
				{	if(!boxList.contains(Square.square.get(boxs[0].box).get(y))){
						test.add(y);}
				}
				for(int num : test){//remove update the values in d pos
					updatePositionValues(Square.square.get(boxs[0].box).get(num),x-1);
				}
			}
			
			if(sameRow){
				LinkedList<Integer> test =new LinkedList<>();
				for(int y: rowMissPosition.get(boxs[0].row).get(x-1))//where the values are also located in d bx
				{	if(!boxList.contains(Row.row.get(boxs[0].row).get(y))){
						test.add(y);}
				}
				for(int num : test){//remove update the values in d pos
					updatePositionValues(Row.row.get(boxs[0].row).get(num),x-1);
				}	
			}
			
			if(sameCol){
				LinkedList<Integer> test =new LinkedList<>();
				for(int y: colMissPosition.get(boxs[0].col).get(x-1))//where the values are also located in d bx
				{	if(!boxList.contains(Column.col.get(boxs[0].col).get(y))){
						test.add(y);}
				}
				for(int num : test){//remove update the values in d pos
					updatePositionValues(Column.col.get(boxs[0].col).get(num),x-1);
				}				
			}	
		}
		
		newMissValues();
	}

	public void updateValues(Box box){
		for(int x:box.getMissValue()){
			//System.out.println(x+""+box.getBoxValue());
			if(x!=box.getBoxValue())
				updatePositionValues(box,(x-1));
		}
		LinkedList<Integer> test = new LinkedList<>();
		for(int x: rowMissPosition.get(box.row).get(box.getBoxValue()-1))
			test.add(x);
		for(int num : test){
			if(num!=box.rowNo)
				updatePositionValues(Row.row.get(box.row).get(num),box.getBoxValue()-1);
		}
		test = new LinkedList<>();
		for(int x: colMissPosition.get(box.col).get(box.getBoxValue()-1))
			test.add(x);
		for(int num : test){
			if(num!=box.colNo)
				updatePositionValues(Column.col.get(box.col).get(num),box.getBoxValue()-1);
		}
		test = new LinkedList<>();
		for(int x: boxMissPosition.get(box.box).get(box.getBoxValue()-1))
			test.add(x);
		for(int num : test){
			if(num!=box.boxNo)
				updatePositionValues(Square.square.get(box.box).get(num),box.getBoxValue()-1);
		}
		rowMissPosition.get(box.row).get(box.getBoxValue()-1).clear();
		colMissPosition.get(box.col).get(box.getBoxValue()-1).clear();
		boxMissPosition.get(box.box).get(box.getBoxValue()-1).clear();
	}
	
	public void updatePositionValues(Box box,int... x) {
		for(int y:x){
			if(rowMissPosition.get(box.row).get(y).contains((Integer)box.rowNo))
				rowMissPosition.get(box.row).get(y).remove((Integer)box.rowNo);
     			if(colMissPosition.get(box.col).get(y).contains((Integer)box.colNo))
				colMissPosition.get(box.col).get(y).remove((Integer)box.colNo);
			if(boxMissPosition.get(box.box).get(y).contains((Integer)box.boxNo))
				boxMissPosition.get(box.box).get(y).remove((Integer)box.boxNo);			
		}
		
	}


	public void newMissValues(){
		
		for(int x=0;x<9;x++){
			
			for(int y=0;y<9;y++){
				LinkedList<Integer> miss = new LinkedList<>();
				
				for(int z =1;z<10;z++){
					Box test = Square.square.get(x).get(y);
					if(Square.square.get(x).get(y).isEmpty())
						if( boxMissPosition.get(x).get(z-1).contains((Integer)test.boxNo) && 
								colMissPosition.get(test.col).get(z-1).contains((Integer)test.colNo) && 
								rowMissPosition.get(test.row).get(z-1).contains((Integer)test.rowNo)){
							miss.add(z);
						}
						
					}
					
					Square.square.get(x).get(y).setMissArray(miss);
				}
				
			}
			
		}
		
	}






class Column extends SudokuBoard{
	static LinkedList<LinkedList<Box>> col = new LinkedList<>();
	
	public static void Column(){
			for(int i=0;i<9;i++){
				col.add(new LinkedList<>());
				int vert = (i / 3)-3;
				for(int j=0;j<9;j++){
					if((j)%3==0)
						vert+=3;
					col.get(i).add(sudoku[vert][(j)%3][(i%3)]);
				}
			}
	}
	
	public static void colMissPosition(){
		colMissPosition = new LinkedList<>();
		///FOR VERTICAL
		for(int x=0;x<9;x++){
			LinkedList<LinkedList<Integer>> col = new LinkedList<>();
			for(int i=0;i<9;i++){
				col.add(new LinkedList<>());
				for(int j=1;j<10;j++){
					if(Column.col.get(x).get(j-1).getMissValue().contains((Integer)(i+1)) )
						col.get(i).add(j-1);
				}
			}
			colMissPosition.add(col);
		}
	}
		
	public static void updateColValue(int colNo,int no){
			
			for(int j =1;j<10;j++){
				
				if(col.get(colNo).get(j-1).getMissValue().contains((Integer)(no)) ){
					col.get(colNo).get(j-1).getMissValue().remove((Integer)no);
					rowMissPosition.get( col.get(colNo).get(j-1).row).get(no-1).remove((Integer)colNo);
					boxMissPosition.get( col.get(colNo).get(j-1).box).get(no-1).remove((Integer) ((colNo%3) + 3*((j-1)%3 )) );
				}				
			}
			colMissPosition.get( (colNo) ).get(no-1).clear();
		}
	
}

class Row extends SudokuBoard{
	static LinkedList<LinkedList<Box>> row = new LinkedList<>();
	
	public static void Row(){
		for(int i=0;i<9;i++){
			row.add(new LinkedList<>());
			int hori = ((i<3)?-1:(i<6)?2:5);
			for(int j=0;j<9;j++){
				if((j)%3==0)
					hori++;
				row.get(i).add(sudoku[hori][(i%3)][(j)%3]);
			}
		}
	}
	
	public static void rowMissPosition(){
		rowMissPosition = new LinkedList<>();
		//FOR HORIZONTAL
		for(int x=0;x<9;x++){
			LinkedList<LinkedList<Integer>> row = new LinkedList<>();
			for(int i=0;i<9;i++){
				row.add(new LinkedList<>());
				int hori = ((x<3)?-1:(x<6)?2:5);
				for(int j=1;j<10;j++){
					if((j-1)%3==0)
						hori++;
					if(Row.row.get(x).get(j-1).getMissValue().contains((Integer)(i+1)) )
						row.get(i).add(j-1);
				}
			}
			rowMissPosition.add(row);
		}
	}
		
	public static void updateRowValue(int rowNo,int no){
			
			for(int j =1;j<10;j++){
				if(row.get(rowNo).get(j-1).getMissValue().contains((Integer)(no)) ){
					row.get(rowNo).get(j-1).getMissValue().remove((Integer)no);
					colMissPosition.get( row.get(rowNo).get(j-1).col).get(no-1).remove((Integer) (rowNo) );
					boxMissPosition.get( row.get(rowNo).get(j-1).box).get(no-1).remove((Integer) (((j-1)%3) + 3*(rowNo%3 )) );
				}
			}
			rowMissPosition.get( (rowNo) ).get(no-1).clear();
		}
}


class Square  extends SudokuBoard{
	static LinkedList<LinkedList<Box>> square = new LinkedList<>();
	
	public static void Square(){
		for(int i=0;i<9;i++){
			square.add(new LinkedList<>());
			int row=-1;
			for(int j=0;j<9;j++){
				if((j)%3==0)
					row++;
				square.get(i).add(sudoku[i][row][(j)%3]);
			}
		}
	}
	
	public static void squareMissPosition(){
		//Square();
		boxMissPosition = new LinkedList<>();
		//FOR BOX
		for(int x=0;x<9;x++){
		LinkedList<LinkedList<Integer>> box = new LinkedList<>();
		for(int i=0;i<9;i++){
			box.add(new LinkedList<>());
			for(int j =1;j<10;j++){
				if(square.get(x).get(j-1).getMissValue().contains((Integer)(i+1)) )
					box.get(i).add(j-1);
			}
		}
		boxMissPosition.add(box);
		}
	}
	
	public static void updateSquareValue(int box,int no){
		
		for(int j =1;j<10;j++){
			if(square.get(box).get(j-1).getMissValue().contains((Integer)(no)) ){
				square.get(box).get(j-1).getMissValue().remove((Integer)no);
				colMissPosition.get( square.get(box).get(j-1).col).get(no-1).remove((Integer) (((j-1)%3) + 3*(box%3 )) );
				rowMissPosition.get( square.get(box).get(j-1).row).get(no-1).remove((Integer) (((j-1)/3) + 3*(box/3 )) );
			}
		}
		boxMissPosition.get( (box) ).get(no-1).clear();
	}
}