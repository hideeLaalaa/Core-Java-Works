package objectOriented;

public class ch10Test {

	public static void main(String[] args) {
		
		shapeHierachyRun();
	}

	public static void shapeHierachyRun(){
		int n=0;
		Shape[] shapes = new Shape[6];
		shapes[n++]=new circle(15);
		shapes[n++]=new triangle(15,7);
		shapes[n++]=new square(15);
		shapes[n++]=new sphere(20);
		shapes[n++]=new cube(8);
		shapes[n++]=new tetrahedron(5);
		
		n=1;
			for(Shape currentShape: shapes){
				System.out.printf("shape %d is a %s\n", n++,currentShape.getClass().getSimpleName());
				if(currentShape instanceof twoDimensionalShape)
					System.out.println(((twoDimensionalShape) currentShape));
			
				if(currentShape instanceof threeDimensionalShape)
					System.out.println(((threeDimensionalShape) currentShape));
				System.out.println();
			}
			}	
	
}




//************************************************//
//***********SHAPE HIERACHY**********************//
abstract class Shape{ 
	
	protected double length=0;	
	public abstract double area();
	
	public abstract String toString();
	
}

abstract class twoDimensionalShape extends Shape{
	
	public String toString(){
		return String.format("Length: %.2fm\n%s : %.2f(m2)",length,"AREA",area());
	}
}

class circle extends twoDimensionalShape{
	
	public circle(double diameter){
		length=diameter;
	}
	
	public double area(){
		return(Math.PI*Math.pow((length/2),2));
	}
	
}

class square extends twoDimensionalShape{
	
	public square(double length){
		this.length=length;
	}
	
	public double area(){
		return(Math.pow((length),2));
	}
	
}

class triangle extends twoDimensionalShape{
	double height;
	public triangle(double base,double height){
		length=base;
		this.height=height;
	}
	
	public double area(){
		return(height*length*0.5);
	}
	
	public String toString(){
		return String.format("Height: %.2fm, %s",height,super.toString());
	}
	
}


//circle square triangle
//sphere cube tetrahedron
abstract class threeDimensionalShape extends Shape{
	
	private double radius; 

	public abstract double volume();
	
	public String toString(){
		return String.format("Length: %.2fm\n%s : %.2f(m2)\n%s : %.2f(m3)",length,"AREA",area(),"VOLUME",volume());
	}
}

class sphere extends threeDimensionalShape{
	
	public sphere(double diameter){
		length=diameter;
	}
	
	public double area(){
		return(Math.PI*Math.pow((length/2),2)*4);
	}
	
	public double volume(){
		return(Math.PI*Math.pow((length/2),3)*(4/3));
	}
	
}

class cube extends threeDimensionalShape{
	
	public cube(double length){
		this.length=length;
	}
	
	public double area(){
		return(Math.pow((length),2)*6);
	}
	
	public double volume(){
		return(Math.pow((length),3));
	}
	
}

class tetrahedron extends threeDimensionalShape{
	
	public tetrahedron(double length){
		this.length=length;
	}
	
	public double area(){
		return(Math.sqrt(3) * (length * length));
	}
	
	public double volume(){
		return(Math.pow((length),3)/(6*Math.sqrt(2)));
	}
	
}