import java.util.Scanner;
public class ch55 {

	private String coursename;
	private int total;private int gradeCounter;private int aCount;private int bCount;
	private int cCo;private int dCo;private int fCo;

	public ch55(String name) {
		coursename=name;
	}
	public void setCourse(String name){
		coursename=name;
	}public String getCourse(){return coursename;}
	
	public void display(){
		System.out.printf("Welcome to the gradebook for \n\t%s!!\n\n", getCourse());
	}
	public void input(){
		Scanner input=new Scanner(System.in);
		int grade;
		System.out.printf("%s\n%s\n		%s\n		%s\n", "Enter integer grades range from 0-100","Type end of file indicator to terminate input:","On Mac OS X type <ctrl> d then press enter","On windows type <ctrl> z then press enter");
		
		while (input.hasNext()){
			grade=input.nextInt();
			total+=grade;
			++gradeCounter;
			incrementLetterGradeCounter(grade);
		}
	}
	
	private void incrementLetterGradeCounter(int grade){
		switch (grade/10){
		case 9:
		case 10:
			++aCount;
			break;
			
		case 8:
			++bCount;break;
			
		case 7:
			++cCo;break;
			
		case 6:
			++dCo;break;
			
		default:
			++fCo;break;
		}
	}
	
	public void report(){
		System.out.println("\nGrade report:");
		
		if(gradeCounter!=0){
			double average=(double) total/gradeCounter;
			
			System.out.printf("Total of the %d grades entered is %d\n", gradeCounter,total);
			System.out.printf("Class average is %.2f\n",average );
			System.out.printf("Number of students who received each grades\nA:%d\nB:%d\nC:%d\nD:%d\nE:%d\n"
					,aCount,bCount,cCo,dCo,fCo);
		}
		else{
			System.out.println("No grades were entered");
		}
	}

}
