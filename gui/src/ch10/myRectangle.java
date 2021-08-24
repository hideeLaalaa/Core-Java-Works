package ch10;

import java.awt.Color;
import java.awt.Graphics;

public class myRectangle extends myBoundedShape{
	
	public myRectangle(){
		super();
	}
	
	public myRectangle(int x1,int y1,int x2,int y2,Color color,boolean fill){
		super(x1, y1, x2, y2, Color.red, true);
	}
	
	public void draw(Graphics g){
		g.setColor(getColor());
		if(getFill())
			g.fillRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		else
			g.drawRect(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}

}
