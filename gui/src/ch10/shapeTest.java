package ch10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class shapeTest extends JPanel{
	private Random ran = new Random();
	//private MyShape[] shape;
	private ArrayList <MyShape> shape = new ArrayList();
	int line,rect,oval;
	
	public shapeTest(int no){
	
		setBackground(Color.WHITE);
		//shape = new MyShape[no];
		
		for(int i=0;i<no;i++)
		{
			int x = 1 + ran.nextInt(3);
			if(x==1)
				shape.add(new myLine());
				//shape[i] = new myLine();
			if(x==2)
				shape.add(new myRectangle());
				//shape[i] = new myRectangle();
			if(x==3)
				shape.add(new myOval());
				//shape[i] = new myOval();
		}
		
		for(MyShape currentShape : shape){
			currentShape.setX1(ran.nextInt(300));
			currentShape.setY1(ran.nextInt(300));
			currentShape.setX2(ran.nextInt(300));
			currentShape.setY2(ran.nextInt(300));
			currentShape.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			if(currentShape instanceof myLine){
				line++;	
			}
			if(currentShape instanceof myOval){
				((myOval) currentShape).setFill(ran.nextBoolean());
				oval++;
			}
			if(currentShape instanceof myRectangle){
				((myRectangle) currentShape).setFill(ran.nextBoolean());
//				currentShape.equals(new myRectangle(10,10,250,250,Color.black,true));
				rect++;
			}
			
		}
		
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(MyShape drawShape : shape){
			drawShape.draw(g);
		}
			} 

	public String toString(){
		return String.format("%s:%2d,%1s:%2d,%1s:%2d", 
				"Lines",line,"Ovals",oval,
				"Rectangles",rect);
	}
	


public static void main(String[] args){
	
	String noOfShapes  = JOptionPane.showInputDialog("Enter amount of shapes you want");
	shapeTest panel = new shapeTest(Integer.parseInt(noOfShapes));
	//ADDING CH9 MODIFICATION
	JLabel status = new JLabel(panel.toString());
	JFrame app = new JFrame();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	app.add(panel);
	app.add(status, BorderLayout.SOUTH);
	app.setSize(300, 300);
	app.setVisible(true);
	


}

}



