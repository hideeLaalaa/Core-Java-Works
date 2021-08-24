
import javax.swing.*;

import objectOriented.commissionEmployee;

import java.awt.*;

public class ch09 {
 
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(new point(3,5),new point(10,5),new point(3,9),new point(10,9));
		Square sq= new Square(new point(3,5),new point(9,5),new point(3,11),new point(3,11));
		Trapezium trap = new Trapezium(new point(3,5),new point(10,5),new point(2,12),new point(11,12));
		Parallelogram parallel = new Parallelogram(new point(3,5),new point(9,5),new point(4,9),new point(10,9));
		System.out.println(rect);
		System.out.println(sq);
		System.out.println(trap);
		System.out.println(parallel);
		sq.setPoint1(new point(0,0));
		sq.setPoint2(new point(9,0));
		sq.setPoint3(new point(0,9));
		sq.setPoint4(new point(9,9));
		rect = new Rectangle(3,2,9,7);
		System.out.println(rect);
	}

}

//WRITING CLASS BASEPLUSCOMMISSIONEMPLOYEE USING COMPOSITION INSTEAD OF INHERITANCE
class compCommissionEmployee{
	
	commissionEmployee employ;
	private double baseSalary;
	
	public compCommissionEmployee(String first,String last,String ssn,
			double sales,double rate, double salary){
		employ = new commissionEmployee(first,last,ssn,sales,rate);
		setBase(salary);
	}
	

	public void setBase(double salary){
		if(salary>=0.0)
			baseSalary=salary;
		else
			throw new IllegalArgumentException("Base salary must be >=0.0");
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	public double earnings(){
		return baseSalary + (employ.getCommissionRate() * employ.getGrossSales());
	}
	
	public String toString(){
		return String.format("%s %s\n%s: %.2f","base-slaried", 
				employ,"base salary",getBaseSalary());
	}

}

class point{
	private double x;
	private double y;
	
	public point(double x,double y){
		setX(x);
		setY(y);
	}
	
	public void setX(double x){
		if(x>=0)
			this.x=x;
	}
	
	public void setY(double y){
		if(y>=0)
			this.y=y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
}
//SUPER CLASS QUADILATERALS
class quadilateral{
	
	private point point1;
	private point point2;
	private point point3;
	private point point4;
	
	public quadilateral(point x1,point x2,point y1,point y2){
		setPoint1(x1);
		setPoint2(x2);
		setPoint3(y1);
		setPoint4(y2);
	}
	
	public void setPoint1(point x1){
		this.point1=x1; 
	}
	
	public void setPoint2(point x2){
		this.point2=x2;
	}
	
	public void setPoint3(point y1){
		this.point3=y1;
	}
	
	public void setPoint4(point y2){
		this.point4=y2;
	}
	
	public point getPoint1(){
		return point1;
	}
	
	public point getPoint2(){
		return point2;
	}
	
	public point getPoint3(){
		return point3;
	}
	
	public point getPoint4(){
		return point4;
	}
	
	public double getX1(){
		return (point2.getX()-point1.getX());
	}
	
	public double getX2(){
		return (point4.getX()-point3.getX());
	}
	
	public double getY1(){
		return (point3.getY()-point1.getY());
	}
	
	public double getY2(){
		return (point4.getY()-point2.getY());
	}
	
	public double getArea(){
		return (getX1()*getY1());
	}
	
	public String toString(){
		return String.format("%s:%.2f(metreSq)",
				"Area",getArea());
	}
}

class Square extends quadilateral{

	public Square(point x1, point x2, point y1, point y2) {
		super(x1, x2, y1, y2);
	}	
	public Square(int x, int y, int length) {
		super(new point(x,y), new point(x+length,y), new point(x,y+length), new point(x+length,y+length));
	}	
	@Override
	public String toString(){
		return String.format("%s\n%s","SQUARE", super.toString());
	}
}

class Rectangle extends quadilateral{

	public Rectangle(point x1, point x2, point y1, point y2) {
		super(x1, x2, y1, y2);
	}
	public Rectangle(int x, int y, int length,int height) {
		super(new point(x,y), new point(x+length,y), new point(x,y+height), new point(x+length,y+height));
	}	
	@Override
	public String toString(){
		return String.format("%s\n%s","RECTANGLE", super.toString());
	}
}

//CLASS PARALLELOGRAM
class Parallelogram extends quadilateral{

	public Parallelogram(point x1, point x2, point y1, point y2) {
		super(x1, x2, y1, y2);
	}
	public Parallelogram(int x, int y, int length,int height) {
		super(new point(x,y), new point(x+length,y), new point(x+10,y+height), new point(x+length+10,y+height));
	}	
	@Override
	public String toString(){
		return String.format("%s\n%s","PARALLEOGRAM", super.toString());
	}
}

//CLASS TRAP
class Trapezium extends quadilateral{
	
	public Trapezium(point x1, point x2, point y1, point y2) {
		super(x1, x2, y1, y2);
	}
	public Trapezium(int x, int y, int length1,int length2,int height) {
		super(new point(x,y), new point(x+length1,y), new point(x-10,y+height), new point(x-10+length2,y+height));
	}	
	@Override
	public double getArea(){
		return(0.5*(getX1()+getX2())*getY1());
	}
	
	@Override
	public String toString(){
		return String.format("%s\n%s","TRAPEZIUM", super.toString());
	}
	
}
