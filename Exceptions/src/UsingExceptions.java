
public class UsingExceptions {

	public static void main(String[] args) {
		
		//EX1 INCORPORATING THROWING EXCEPTIONS
	/*	try{
			throwException();
		}catch(Exception exception){
			System.err.println("Exception handled in main");
		}
		doesNotThrowException();
	*/
		
		try{
			method1();
		}
		catch(Exception exception){
			System.err.printf("%s\n\n", exception.getMessage());
			exception.printStackTrace();
			StackTraceElement[] traceElements = exception.getStackTrace();
			
			System.out.println("\nStack trace from getSTackTrace:");
			System.out.println("Class\t\tFile\t\t\tLine\tMethod");
			
			for(StackTraceElement element : traceElements ){
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s\n", element.getMethodName());
			}
		}
		
	}
	
	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		method3();
	}
	
	public static void method3() throws Exception{
		throw new Exception("Exception thrown in method3");
	}
	
	
	
	public static void throwException() throws Exception{
		
		try{
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch (Exception exception){
			System.err.println("Exception handled in method throwException");
			throw exception;
		}
		finally{
			System.err.println("Finally executed in throwException");
		}
	}
	
	public static void doesNotThrowException(){
		
		try{
			System.out.println("Method doesNotThrowException");
		}catch(Exception exception){
			System.err.println(exception);
		}finally{
			System.err.println("Finally executed in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowException");
	}

}
