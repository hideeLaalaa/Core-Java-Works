
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class myLine {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color myColor;
	
	public myLine(int x1,int y1,int x2,int y2,Color color) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		myColor = color;
	}
	
	public int getx1(){
		return x1;
	}
	
	public int getx2(){
		return x2;
	}
	
	public int gety1(){
		return y1;
	}
	
	public int gety2(){
		return y2;
	}
	
	public void setx1(int x1){
		if(x1>=0)
			this.x1=x1;
		else
			this.x1=0;
	}
	
	public void setx2(int x2){
		if(x2>=0)
			this.x2=x2;
		else
			this.x2=0;
	}
	
	public void sety1(int y1){
		if(y1>=0)
			this.y1=y1;
		else
			this.y1=0;
	}
	
	public void sety2(int y2){
		if(y2>=0)
			this.y2=y2;
		else
			this.y2=0;
	}
	
	//draw the line in the specified color
	public void draw(Graphics g){
		g.setColor(myColor);
		g.drawLine(getx1(), gety1(), getx2(), gety2());
	}

}

class myRectangle{
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color myColor;
	boolean flag;
	
	public myRectangle(int x1,int y1,int x2,int y2,Color color,boolean flag){
		setx1(x1);
		setx2(x2);
		sety1(y1);
		sety2(y2);
		this.myColor=color;
		this.flag=flag;
	}
	
	public myRectangle(){
		this(0, 0, 0, 0, Color.BLACK, false);
	}
	
	public void setx1(int x1){
		if(x1>=0)
			this.x1=x1;
		else
			this.x1=0;
	}
	
	public void setx2(int x2){
		if(x2>=0)
			this.x2=x2;
		else
			this.x2=0;
	}
	
	public void sety1(int y1){
		if(y1>=0)
			this.y1=y1;
		else
			this.y1=0;
	}
	
	public void sety2(int y2){
		if(y2>=0)
			this.y2=y2;
		else
			this.y2=0;
	}
	
	public int getx1(){
		return x1;
	}
	
	public int getx2(){
		return x2;
	}
	
	public int gety1(){
		return y1;
	}
	
	public int gety2(){
		return y2;
	}
	
	public int getUpperLeftx(){
		if(getx1()<getx2())
			return getx1();
		else
			return getx2();
	}
	
	public int getUpperLefty(){
		if(gety1()<gety2())
			return gety1();
		else
			return gety2();
	}
	
	public int getWidth(){
		return Math.abs(getx1()-getx2());
	}
	
	public int getHeight(){
		return Math.abs(gety1()-gety2());
	}	
	
	public void draw(Graphics g){
		if(flag==true){
			g.setColor(myColor);
			g.fillRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		}
		else
			g.drawRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		
	}
}

class myOval{
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color myColor;
	boolean flag;
	
	public myOval(){
		this(0, 0, 0, 0, Color.BLACK, false);
	}
	
	public myOval(int x1,int y1,int x2,int y2,Color color,boolean flag){
		setx1(x1);
		setx2(x2);
		sety1(y1);
		sety2(y2);
		this.myColor=color;
		this.flag=flag;
	}
	
	public void setx1(int x1){
		if(x1>=0)
			this.x1=x1;
		else
			this.x1=0;
	}
	
	public int getx1(){
		return x1;
	}
	
	public int getx2(){
		return x2;
	}
	
	public int gety1(){
		return y1;
	}
	
	public int gety2(){
		return y2;
	}
	
	public void setx2(int x2){
		if(x2>=0)
			this.x2=x2;
		else
			this.x2=0;
	}
	
	public void sety1(int y1){
		if(y1>=0)
			this.y1=y1;
		else
			this.y1=0;
	}
	
	public void sety2(int y2){
		if(y2>=0)
			this.y2=y2;
		else
			this.y2=0;
	}
	
	public int getUpperLeftx(){
		if(getx1()<getx2())
			return getx1();
		else
			return getx2();
	}
	
	public int getUpperLefty(){
		if(gety1()<gety2())
			return gety1();
		else
			return gety2();
	}
	
	public int getWidth(){
		return Math.abs(getx1()-getx2());
	}
	
	public int getHeight(){
		return Math.abs(gety1()-gety2());
	}
	
	public void draw(Graphics g){
		if(flag==true){
			g.setColor(myColor);
			g.fillOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		}
		else
			g.drawOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}
	
}

class dp extends JPanel{
	private Random ran = new Random();
	private myLine[] lines;
	private myRectangle[] rect;
	private myOval[] oval;
	private myRectangle[] square;
	
	public dp(){
		setBackground(Color.WHITE);
		lines = new myLine[1+ran.nextInt(5)];
		rect = new myRectangle[1+ran.nextInt(5)];
		oval = new myOval[1+ran.nextInt(5)];
		square = new myRectangle[1+ran.nextInt(5)];
		
		//for rectangle
		for(int i=0;i<rect.length;i++){
			Color c = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
			int x1=ran.nextInt(300);
			int y1=ran.nextInt(300);
			int x2=ran.nextInt(300);
			int y2=ran.nextInt(300);
			rect[i]= new myRectangle(x1,y1,x2,y2,c,ran.nextBoolean());
		}
		
		//for square
		for(int i=0;i<square.length;i++){
			Color c = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
			int x1=ran.nextInt(300);
			int y1=ran.nextInt(300);
			int x2=ran.nextInt(300);
			int y2=y1+Math.abs(x1-x2);
			square[i]= new myRectangle(x1,y1,x2,y2,c,ran.nextBoolean());
		}
		
		//for ovals
		for(int i=0;i<oval.length;i++){
			Color c = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
			int x1=ran.nextInt(300);
			int y1=ran.nextInt(300);
			int x2=ran.nextInt(300);
			int y2=ran.nextInt(300);
			oval[i]= new myOval(x1,y1,x2,y2,c,ran.nextBoolean());
		}
		
		//create lines
		for(int i=0;i<lines.length;i++){
			int x1=ran.nextInt(300);
			int y1=ran.nextInt(300);
			int x2=ran.nextInt(300);
			int y2=ran.nextInt(300);
			
			//generate a random coordinates
			Color color = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
			
			//add the lines to the list of lines to be displayed
			lines[i]= new myLine(x1,y1,x2,y2,color);
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		//draw the lines
//		for(myLine line :lines)
//			line.draw(g);
//		
//		for(myRectangle sq :square)
//			sq.draw(g);
//		
//		for(myRectangle rectangle :rect)
//			rectangle.draw(g);
//		
//		for(myOval ov :oval)
//			ov.draw(g);
		g.drawLine(10, 10, 65, 70);
	}
	//THIS IS CHAPTER NINE EXERCISE 
	public String toString(){
		return String.format("%s:%2d,%1s:%2d,%1s:%2d,%1s:%2d", 
				"Lines",lines.length,"Ovals",oval.length,
				"Rectangles",rect.length,"Squares",square.length);
	}
	
}
