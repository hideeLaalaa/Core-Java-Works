
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;


public abstract class myShape {

	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color myColor;
	
	public myShape() {
		this(0,0,100,100,Color.BLACK);
	}
	
	public myShape(int x1,int y1,int x2,int y2,Color color) {
		this.setX1(x1);
		this.setX2(x2);
		this.setY1(y1);
		this.setY2(y2);
		this.setColor(color);
	}
	
	public void setColor(Color color){
		try{ 	
			this.myColor=color;
		}catch(IllegalArgumentException e){
			System.out.println("Argument must of the type Color");
		}
	}
	
	public Color getColor(){
		return this.myColor;
	}
	
	public void setX1(int x1){
		if(x1>=0)
			this.x1=x1;
		else this.x1=0;
	}
	
	public int getX1(){
		return x1;
	}
	
	public void setX2(int x2){
		if(x2>=0)
			this.x2=x2;
		else this.x2=0;
	}
	
	public int getX2(){
		return x2;
	}
	
	public void setY1(int y1){
		if(y1>=0)
			this.y1=y1;
		else this.y1=0;
	}
	
	public int getY1(){
		return y1;
	}
	
	public void setY2(int y2){
		if(y2>=0)
			this.y2=y2;
		else this.y2=0;
	}
	
	public int getY2(){
		return y2;
	}
	
	public abstract void draw(Graphics g);

}


class maLine extends myShape{

	public maLine() {
		super();
	}
	
	public maLine(int x1,int y1,int x2,int y2,Color color) {
		super(x1,y1,x2,y2,color);
	}

	@Override
	public void draw(Graphics g) {
		//g.drawString("tetula", 250, 200);
		g.setColor(super.getColor());
		g.drawLine(super.getX1(), super.getY1(), super.getX2(), super.getY2());	
	}

}


class maRectangle extends myShape{

	private boolean filled;
	
	public maRectangle() {
		super();
		setFill(false);
	}
	
	public maRectangle(int x1,int y1,int x2,int y2,Color color,boolean fill){
		super(x1,y1,x2,y2,color);
		setFill(fill);
	}
	
	public int getUpperLeftx(){
		if(getX1()<getX2())
			return getX1();
		else
			return getX2();
	}
	
	public int getUpperLefty(){
		if(getY1()<getY2())
			return getY1();
		else
			return getY2();
	}
	
	public int getWidth(){
		return Math.abs(getX1()-getX2());
	}
	
	public int getHeight(){
		return Math.abs(getY1()-getY2());
	}
	
	public void setFill(boolean flag){
		try{
			this.filled=flag;
		}catch(IllegalArgumentException e){
			System.out.println("Filled value must be a boolean type");
		}
	}
	
	public boolean getFill(){
		return this.filled;
	}
	
	public void draw(Graphics g){
		g.setColor(getColor());
		if(getFill())
			g.fillRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		else
			g.drawRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}

}

class maOval extends myShape{

	private boolean filled;
	
	public maOval(){
		super();
		setFill(false);
	}
	
	public maOval(int x1,int y1,int x2,int y2,Color color,boolean fill) {
		super(x1,y1,x2,y2,color);
		setFill(fill);
	}
	
	public int getUpperLeftx(){
		if(getX1()<getX2())
			return getX1();
		else
			return getX2();
	}
	
	public int getUpperLefty(){
		if(getY1()<getY2())
			return getY1();
		else
			return getY2();
	}
	
	public int getWidth(){
		return Math.abs(getX1()-getX2());
	}
	
	public int getHeight(){
		return Math.abs(getY1()-getY2());
	}
	
	public void setFill(boolean flag){
		try{
			this.filled=flag;
		}catch(IllegalArgumentException e){
			System.out.println("Filled value must be a boolean type");
		}
	}
	
	public boolean getFill(){
		return this.filled;
	}
	
	public void draw(Graphics g){
		g.setColor(getColor());
		if(getFill())
			g.fillOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		else
			g.drawOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}

}

class drawP extends JPanel{
	private Random ran = new Random();
	private myShape[] shape;
	int line,rect,oval;
	
	public drawP(int no){
		setBackground(Color.WHITE);
		shape = new myShape[no];
		
		for(int i=0;i<no;i++)
		{
			int x = 1 + ran.nextInt(3);
			if(x==1)
				shape[i] = new maLine();
			if(x==2)
				shape[i] = new maRectangle();
			if(x==3)
				shape[i] = new maOval();
		}
		
		for(myShape currentShape : shape){
			currentShape.setX1(ran.nextInt(300));
			currentShape.setY1(ran.nextInt(300));
			currentShape.setX2(ran.nextInt(300));
			currentShape.setY2(ran.nextInt(300));
			currentShape.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			if(currentShape instanceof maLine){
				line++;	
			}
			if(currentShape instanceof maOval){
				((maOval) currentShape).setFill(ran.nextBoolean());
				oval++;
			}
			if(currentShape instanceof maRectangle){
				((maRectangle) currentShape).setFill(ran.nextBoolean());
				rect++;
			}
		}

		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(myShape drawShape : shape){
			drawShape.draw(g);
		}
			} 

	public String toString(){
		return String.format("%s:%2d,%1s:%2d,%1s:%2d", 
				"Lines",line,"Ovals",oval,
				"Rectangles",rect);
	}
	
}
