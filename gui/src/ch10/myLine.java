package ch10;

import java.awt.Graphics;
import java.awt.Color;

public class myLine extends MyShape{
	
	protected static int l;

	public myLine() {
		super();
		l++;
	}
	
	public myLine(int x1,int y1,int x2,int y2,Color color) {
		super(x1,y1,x2,y2,color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getX1(), getY1(), getX2(), getY2());	
		//System.out.println(l);
	}
	
	public String toString(){
		return String.format("%d\n", l);
	}

}
