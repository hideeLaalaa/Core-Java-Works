package com.deitel.jhtp.ch08;

public class math {

	private static int den;
	private static int pow;
	public math() {
		// TODO Auto-generated constructor stub
	}
	public static float sqrt(float x,int n){
		//System.out.println(x);
		float ret=0;
		for(float i=(x>=1?1:0);i<(x>1?(x/2)+1:1);){
			//if(i<0.708&&i>0.6)
			//System.out.println(i);
	    	 ret=XSqrt(i,x,n);
			if(ret>0){
				//ret=i;
				break;
			}
			
			i+=0.000001;
		}
		return ret;
	}
	
	///public static 
	
	private static int st(float x){
		int ret=0;
		switch((int)(x)/10){
		case 0:
			ret=0;
			break;
		case 1:
			ret=3;
			break;
		case 2:
			ret=4;
			break;
		case 3:
			ret=5;
			break;
		case 4:
			ret=6;
			break;
		case 5:case 6:
			ret=7;
			break;
		case 7:case 8:
			ret=8;
			break;
		case 9:
			ret=9;
			break;
		default:
			ret=10;
		}
		return ret;
	}
	
	private static float XSqrt(float testRoot,float no,int times){
		testRoot*=1000000;
		testRoot=(int)testRoot;
		testRoot/=1000000;
		float ret=testRoot;
		for(int i=1;i<times;i++){
			testRoot*=ret;
		}
		testRoot*=1000;
		testRoot=(int)testRoot;
		testRoot/=1000;
		if(testRoot*100==no*100)
			return ret;
		else{
			return 0;
		}			
	}
	
	public static double floor(double x){
		return (int)x;
	}
	
	public static double Ceil(double x){
		return ((int)x+1);
	}
	
	public static double PI(){
		return 22/7;
	}
	
	public static double E(){
		return 2.71828;
	}
	
	private static long fact(int n){
		long ret=n;
		int i;
		for(i=1;i<n;i++)
			ret*=i;
		return ret;
	}
	
	private static double Pow(double x,int y){
		double ret = x;
		for(int i=1;i<y;i++)
			ret*=x;
		return ret;
	}
	
	public static float conv(float x,float power){
		fract(power);
		x=(float) Pow(x,(int) getPow());
		//System.out.println(x);
		x=sqrt(x,getDen());
		//System.out.println(x);
		return x;
	}
	

	private static int getPow(){
		return pow;
	}
	
	private static int getDen(){
		return den;
	}
	
	public static void fract(float p){
		pow = (int) (p*1000);
		int no=2;
		den=1000;
		if(pow%den==0){
			pow/=den;
			den/=den;
		}
		if(den%pow==0){
			den/=pow;
			pow/=pow;
		}
		while(no<=den||no<=pow){
			if(pow%no==0&&den%no==0){
				pow/=no;
				den/=no;
			}
			no++;
		}
		System.out.println(pow+"\t "+den);
	}
	
	public static double Cos(double x){
		x*=(3.142/180);
		double ret=1;
		if(x!=0)
		for(int i=2,j=1;i<=30;i+=2,j++){
			if(j%2!=0)
				ret-=(Pow(x,i)/fact(i));
			else
				ret+=(Pow(x,i)/fact(i));
			System.out.println(i+"\t"+fact(i)+"\t"+Pow(x,i));
		}
		return ret+0.0001;
	}
	
	public static double Sin(double x){
		x*=(3.142/180);
		double ret=x;
		if(x!=0)
		for(int i=3,j=1;i<10;i+=2,j++){
			if(j%2!=0)
				ret-=(Pow(x,i)/fact(i));
			else
				ret+=(Pow(x,i)/fact(i));
			System.out.println(i+"\t"+fact(i)+"\t"+Pow(x,i));
		}
		return ret;
	}

}
