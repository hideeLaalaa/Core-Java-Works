package ch10;

import java.awt.Color;
import java.awt.Graphics;

public class myOval extends myBoundedShape{
	
	public myOval(){
		super();
	}
	
	public myOval(int x1,int y1,int x2,int y2,Color color,boolean fill){
		super();
	}
	
	public void draw(Graphics g){
		g.setColor(getColor());
		if(getFill())
			g.fillOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
		else
			g.drawOval(getUpperLeftx(), getUpperLefty(), getWidth(), getHeight());
	}

}
