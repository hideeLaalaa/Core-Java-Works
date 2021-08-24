
public class Employ {
	private String firstName;
	private String lastName;
	private double sal;
	
	public Employ(String fName,String lName,double salary) {
		// TODO Auto-generated constructor stub
		firstName=fName;
		lastName=lName;
		sal=salary;
	}
		public void setName(String fName){
			firstName=fName;
		}public String getName(){return firstName;}
		
		public void setLName(String lName){
			lastName=lName;
		}public String getLName(){return lastName;}
		
		public void setSal(double salary){
			sal=salary;
		}public double getSal(){return sal;}
		
		public double yearSal(){
			double calc;
			return calc = sal * 12;
		}
		
		public double promo(){
			double incr=(0.1*sal)+sal;
			return incr=incr *12;
		}
}
