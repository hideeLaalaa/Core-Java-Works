import java.io.IOException;

public class ch11 {

	public static void main(String[] args) {
		
		//EXE17
		//Exe17();
		
		//EXE18
		//Exe18();
		
		//EXE19
		//Exe19();
		
		//EXE20
		//Exe20();

		//EXE21
		//Exe21();
		
		//EXE22
		//Exe22b();

		
	}
	
	public static void Exe17(){
		//CATCHING EXCEPTIONS WITH SUPERCLASS
		try {
			int x = 3;
			if(x < 0)
				throw new ExceptionC("This is an ExceptionC");
			else
				
				throw new ExceptionB("This is an ExceptionB");
		} catch (ExceptionA e) {
			e.printStackTrace();
			
		} finally{
			System.out.println(" Exercise Done"
					+ "!!..."
					+ "");
		}
		
	}
	
	public static void Exe18(){
		//CATCHING EXCEPTIONS USING CLASS EXCEPTION
		int x;
		for(x =0;x<4;x++)
		{try {
			if(x == 0)
				throw new ExceptionA("This is an ExceptionA");
			if(x==1)
				throw new ExceptionB("This is an ExceptionB");
			if(x==2)
				throw new NullPointerException("This is a NullPointerException");
			if(x==3)
				throw new IOException("This is an IOException");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		} 
	}
	
	public static void Exe19(){
		//ORDER OF CATCH BLOCKS
		int x;
		for(x =0;x<4;x++)
		{try {
			if(x == 0)
				throw new ExceptionA("This is an ExceptionA");
			if(x==1)
				throw new ExceptionB("This is an ExceptionB");
			if(x==2)
				throw new NullPointerException("This is a NullPointerException");
			if(x==3)
				throw new IOException("This is an IOException");
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ExceptionA e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
//		catch (ExceptionB e) {
//			e.printStackTrace();
//		}
		
		} 
	}
	
	
	public static void Exe20(){
		//CONSTRUCTOR FAILURE
		try {
			SomeClass test = new SomeClass();
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}
	
	public static void Exe21(){
		//RETHROWING EXCEPTIONS
		try {
			SomeMethod test = new SomeMethod();
			test.someMethod();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println();
			StackTraceElement[] test = e.getStackTrace();
			System.out.printf("%s%14s%15s%13s\n","Class","File","Line","Method");
			for(StackTraceElement t : test){
				System.out.printf("%-15s",t.getClassName());
				System.out.printf("%-10s",t.getFileName());
				System.out.printf("%5s%-1s","",t.getLineNumber());
				System.out.printf("%-8s%5s","",t.getMethodName());
				System.out.println();
			}
		}
	}
	
	public static void Exe22() throws Exception{
		try{
			int[] x = {0,5,2};
			x[11]=8;
			throw new ExceptionB("This is ExceptionB");
			
		}catch(ExceptionB e){
			System.err.println("E22 first \n"+e);
		}
		
	}
	public static void Exe22b(){
		//CATCHING EXCEEPTIONS USING OUTER SCOPES
		try{
			Exe22();
		}catch(ExceptionB e){
			
			System.err.println("E22B\n"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.err.println("ArrayE22B\t"+e);
		}
		catch(Exception e){
			
			System.err.println("ArrayError\n"+e);
		}
	}


}

class SomeMethod{
	
	public void someMethod() throws ExceptionB{
		try{
			someMethod2();
		}catch(ExceptionA e){
			throw e;
		}
	}
	
	public void someMethod2() throws ExceptionB{
		throw new ExceptionC("this is exception thrown for someMethod");
	}
	
}

class SomeClass{
	
	public SomeClass() throws ExceptionB{
		throw new ExceptionC("Thrown inside SomeClass");
	}
	
	public String toString(){
		return ("This is the SomeClass Created");
	}
}

class ExceptionA extends Exception{
	

	public ExceptionA(){
		super();
	}
	
	public ExceptionA(String text,Exception e){
		super(text,e);
	}
	
	public ExceptionA(String text){
		super(text);
	}
	
	public ExceptionA(Exception e){
		super(e);
	}
	
	
	
}

class ExceptionB extends ExceptionA {
	
	public ExceptionB(){
		super();
	}
	
	public ExceptionB(String text,Exception e){
		super(text,e);
	}
	
	public ExceptionB(String text){
		super(text);
	}
	
	public ExceptionB(Exception e){
		super(e);
	}
	
}


class ExceptionC extends ExceptionB{
	
	public ExceptionC(){
		super();
	}
	
	public ExceptionC(String text,Exception e){
		super(text,e);
	}
	
	public ExceptionC(String text){
		super(text);
	}
	
	public ExceptionC(Exception e){
		super(e);
	}
	
}
