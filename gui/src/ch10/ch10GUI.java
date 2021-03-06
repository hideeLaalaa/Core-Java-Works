package ch10;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ch10GUI extends JPanel{

	private Random ran = new Random();
	private MyShape[] shape;
	
	public ch10GUI(int no){
		setBackground(Color.WHITE);
		shape = new MyShape[no];
		
		for(int i=0;i<no;i++)
		{
			int x = 1 + ran.nextInt(3);
			if(x==1)
				shape[i] = new myLine();
			if(x==2)
				shape[i] = new Rectangle();
			if(x==3)
				shape[i] = new Oval();
		}
		
		for(MyShape currentShape : shape){
			currentShape.setX1(ran.nextInt(300));
			currentShape.setY1(ran.nextInt(300));
			currentShape.setX2(ran.nextInt(300));
			currentShape.setY2(ran.nextInt(300));
			currentShape.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
			
			if(currentShape instanceof Oval){
				((Oval) currentShape).setFill(ran.nextBoolean());
			}
			if(currentShape instanceof Rectangle){
				((Rectangle) currentShape).setFill(ran.nextBoolean());
			}

//			if(currentShape instanceof Oval){
//				Oval ov = (Oval) currentShape;
//				ov.setFill(true);
//				ov = new Oval(10,10,250,250,Color.black,true);
//				
//				oval++;
//			}
//			if(currentShape instanceof Rectangle){
//				//((Rectangle) currentShape).equals(new Rectangle(45,70,150,250,Color.blue,true));
//				rect++;
//			}
//			
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
				"Lines",myLine.l,"Ovals",Oval.l,
				"Rectangles",Rectangle.l);
	}
	


public static void main(String[] args){
	
//	String noOfShapes  = JOptionPane.showInputDialog("Enter amount of shapes you want");
//	ch10GUI panel = new ch10GUI(Integer.parseInt(noOfShapes));
//	//ADDING CH9 MODIFICATION
//	JLabel status = new JLabel(panel.toString());
//	JFrame app = new JFrame();
//	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	app.add(panel);
//	app.add(status, BorderLayout.SOUTH);
//	app.setSize(300, 300);
//	app.setVisible(true);
	
	try{
		int no=1;
		Scanner tele = new Scanner (new File("C:\\Users\\olatoyosi\\Documents\\HERB\\workspace\\gui\\src\\ch10\\tele.txt"));
		Scanner panels = new Scanner (new File("C:\\Users\\olatoyosi\\Documents\\HERB\\workspace\\gui\\src\\ch10\\panels.txt"));
		while(tele.hasNext()||panels.hasNext()){
			System.out.printf("%d: %s & %s\t\t\t\t\t",no++,tele.nextLine(),panels.nextLine());
		}
	}catch(FileNotFoundException ffe){
		System.err.println("Error opening file.");
		System.exit(1);
	}
	
	
}

public void excel(){
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet("C:\\Users\\olatoyosi\\Desktop\\telemetry.xlsx");
	XSSFRow row=sheet.createRow(2);
	XSSFCell cell=row.createCell(120);
}

}
