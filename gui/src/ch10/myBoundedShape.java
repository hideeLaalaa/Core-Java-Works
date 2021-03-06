package ch10;

import java.awt.Color;
import java.awt.Graphics;

public abstract class myBoundedShape extends MyShape{
	
	private boolean filled;
	
	public myBoundedShape() {
		super();
		setFill(false);
	}
	
	public myBoundedShape(int x1,int y1,int x2,int y2,Color color,boolean fill){
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
	

}


class Oval extends myBoundedShape{
	
	protected static int l;
	
	public Oval(){
		super();
		l++;
	}
	
	public Oval(int x1,int y1,int x2,int y2,Color color,boolean fill){
		super(x1,y1,x2,y2,color,fill);
	}
	
	public void draw(Graphics g){
		g.setColor(getColor());
		if(getFill())
			g.fillOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		else
			g.drawOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}

}


class Rectangle extends myBoundedShape{
	
	protected static int l;	
	public Rectangle(){
		super();
		l++;
	}
	
	public Rectangle(int x1,int y1,int x2,int y2,Color color,boolean fill){
		super(10, 20, 280, 270, color, fill);
	}
	
	public void draw(Graphics g){
		//System.out.println(getColor());
		g.setColor(getColor());
		if(getFill())
			g.fillRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		else
			g.drawRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}

}
