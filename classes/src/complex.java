
public class complex {

	private double realPart;
	private double imaginaryPart;
	
	public complex() {
		realPart=0;
		imaginaryPart=0;
	}
	
	public complex(String input){
		this.realPart=getReal(input);
		this.imaginaryPart=getImaginary(input);
	}
	
	public double getReal(String input){
		double i=0;
		String type = "";
		try{
			for(int x=0,dec=0;x<input.length();x++){
				//System.out.println(input.charAt(x));
				if(input.charAt(x)==' '||input.charAt(x)=='+'||input.charAt(x)=='-'){
					if(x!=0)
						break;
				}
				else if(input.charAt(x)!='.'){
					if(type.equals("dec"))
					{
						String p = "";
						i+=(Integer.parseInt(p+input.charAt(x)))/Math.pow(10,dec++);
					}
					else{
						i*=10;
						String p = "";
						i+=Integer.parseInt(p+input.charAt(x));
					}	
				}
				else if(input.charAt(x)=='.'){
					type = "dec";
					dec++;
				}
				//System.out.println("This is "+i);
			}
		}catch(Exception e){
			System.out.println("Wrong format exception "+e);
		}
		realPart=i;
		if(input.charAt(0)=='-')
			realPart*=-1;
		return realPart;
	}
	
	public double getImaginary(String input){
		//System.out.println(input);
		boolean imagine=false;
		boolean minus =false;
		String type="";
		double x=0;
		for(int i=0,dec=0;i<input.length();i++){
			//System.out.println(i+" charThere is "+input.charAt(i));
			if(input.charAt(i)==' ')
				continue;	
			if(input.charAt(i)=='-'&&i!=0)
			    minus=true;
			if(input.charAt(i)=='+'||input.charAt(i)=='-'&&i!=0)
				imagine=true;
			else if(imagine==true){
				//System.out.println(input.charAt(i));
				if(input.charAt(i)=='i'){
					break;
				}
				else if(input.charAt(i)!='.'){
					if(type.equals("dec"))
					{
						String p = "";
						x+=(Integer.parseInt(p+input.charAt(i)))/Math.pow(10,dec++);
					}
					else{
						x*=10;
						String p = "";
						x+=Integer.parseInt(p+input.charAt(i));
					}	
				}
				else if(input.charAt(i)=='.'){
					type = "dec";
					dec++;
				}
				//System.out.println("This is "+x);
			}
			
		}imaginaryPart=x;
		if(minus)
			imaginaryPart*=-1;
		return imaginaryPart;
	}
	
	public String complexAdd(complex a,complex b){
		this.realPart=a.realPart+b.realPart;
		this.imaginaryPart=a.imaginaryPart+b.imaginaryPart;
		return this.toString();
	}
	
	public String complexSub(complex a,complex b){
		this.realPart=a.realPart-b.realPart;
		this.imaginaryPart=a.imaginaryPart-b.imaginaryPart;
		return this.toString();
	}
	
	public String toString(){
		return String.format("%.2f + %.2fi",realPart,imaginaryPart);
	}

}
