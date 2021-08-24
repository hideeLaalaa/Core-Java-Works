import java.util.InputMismatchException;
import java.util.LinkedList;

public class Box{
	
	static int solved=0;
	
	private LinkedList<Integer> posValues = new LinkedList<>();
	private LinkedList<Integer> blacklist = new LinkedList<>();
	
	private int value = 0;
	int box,row,col,colNo,boxNo,rowNo;
	
	public Box(){
		
	}
	public Box(int value) throws Exception{
		setValue(value);
	}
	
	public Box(int value,int box,int row,int col) throws Exception{
		setValue(value);
		setColumn(col,row);
		setRow(row,col); 
		setBox(box, (3*(row%3)+(col%3)));
	}
	
	public void setValue(int x) throws Exception{
		if(x>=0 && x<10){
			this.value=x;
			//posValues = new LinkedList<>(0);
		}
		else
			throw new InputMismatchException("Value must be between the value 0 and 9");
	}
	
	public void setBoxValue(int x) throws Exception{
		if(x>=0 && x<10){
			this.value=x;
			posValues = new LinkedList<>();
//			Row.updateRowValue(row, x);
//			Column.updateColValue(col, x);
//			Square.updateSquareValue(box, x);
		}
		else
			throw new InputMismatchException("Value must be between the value 0 and 9");
	}
	
	public int getBoxValue(){
		return this.value;
	}
	
	public void setColumn(int col, int colNo){
		this.col=col;
		if(colNo<9)
			this.colNo=colNo;
		else 
			System.err.println("Col>9");
	}
	
	public void setRow(int row, int rowNo){
		this.row=row;
		if(rowNo<9)
			this.rowNo = rowNo;
		else 
			System.err.println("Row>9");
	}
	
	public void setBox(int box, int boxNo){
		this.box=box;
		if(boxNo<9)
			this.boxNo=boxNo;
		else 
			System.err.println("Box>9");
	}
	
	public Boolean isEmpty(){
		return (this.value==0);
	}
	
	public void setMissArray(LinkedList<Integer> miss){
		this.posValues=new LinkedList<>();
		for(int num:miss)
				this.posValues.add(num);
//		if(!blacklist.contains((Integer)num))
	}
	
	public void setBlacklist(int no){
		if(!blacklist.contains((Integer)no))
			blacklist.add(no);
	}
	
	public LinkedList<Integer> getMissValue(){
		return this.posValues;
	}
	
	public void removeMissValue(int value){
		this.posValues.remove((Integer)value);
	}
	
	public void addMissValue(int value){
		this.posValues.add(value);
	}
	
	//public void setBoxMiss(int x,int y,int z);
	
	public String toString(){
		return String.format("%d", this.value);
	}
	
	
	
	
}
