package com.deitel.jhtp.ch08;

public class integerClass {

	private int[] digits = new int[40];
	private boolean neg = false;
	private boolean multStat=false;
	
	public integerClass(String no) {
		parse(no);
	}
	
	public integerClass(String no,boolean stat) {
		parse(no);
		this.neg=stat;
	}
	
	public integerClass(){
		
	}
	
	public void negate(){
		this.neg=(!neg);
	}

	public void parse(String no){
		int x;
		int l=digits.length;
		
		if(no.length()<=l)
			for(int i=0;i<no.length();i++){
				String n ="";
				try{
					n+=no.charAt(i);
					digits[l-(no.length()-i)]=Integer.parseInt(n);
				}catch(Exception e){}
			}
		else
			throw new IllegalArgumentException("Digits cant be more than 40");
	}
	
	public int[] getDigits(){
		return digits;
	}
	
	public static integerClass add(integerClass a,integerClass b){
		integerClass add = new integerClass();
		if(!b.negative()&&!a.negative()){
			add=addition(a,b);
		}
		else if(b.negative()&&a.negative()){
			add=addition(a,b);
			add.negate();
		}
		else if(b.negative()&&!a.negative()){
			if(isLessThan(a,b)){
				add=subtract(b,a);
				add.negate();
			}
			else{
				add=subtract(a,b);
			}
		}
		else{
			if(isLessThan(a,b)){
				add=subtract(b,a);
			}
			else{
				add=subtract(a,b);
				add.negate();
			}
		}
		return add;
	}
	
	private static  integerClass addition(integerClass a,integerClass b){
		integerClass add = new integerClass();
		int sum,rem=0;
		for(int i=(a.getDigits().length-1);i>=0;i--){
			sum=a.getDigits()[i]+b.getDigits()[i]+rem;
			add.getDigits()[i]=sum%10;
			rem=sum/10;
		}
		return add;
	}
	
	public static integerClass sub(integerClass a,integerClass b){
		integerClass sub = new integerClass();
		
		if(b.negative()&&!a.negative()){
			sub=addition(a,b);
		}
		else if(!b.negative()&&a.negative()){
			sub=addition(a,b);
			sub.negate();
		}
		else if(!b.negative()&&!a.negative()){
			if(isLessThan(a,b)){
				sub=subtract(b,a);
				sub.negate();
			}
			else{
				sub=subtract(a,b);
			}
		}
		else{
			if(isLessThan(a,b)){
				sub=subtract(b,a);
			}
			else{
				sub=subtract(a,b);
				sub.negate();
			}
		}
		return sub;
	}
	
	private static integerClass subtract(integerClass a,integerClass b){
		integerClass sub = new integerClass();
		int dif,rem=0,bor=10;
		for(int i=(a.getDigits().length-1);i>=0;i--){
			int n = a.getDigits()[i]-rem;
			if(n>=b.getDigits()[i]){
				sub.getDigits()[i]=n-b.getDigits()[i];
				rem=0;
			}
			else{
				sub.getDigits()[i]=n+bor-b.getDigits()[i];
				rem=1;
			}
		}
		return sub;
	}
	
	public static boolean isEqualTo(integerClass a,integerClass b){
		return equalTo(a,b);
	}
	
	public static boolean isNotEqualTo(integerClass a,integerClass b){
		return !equalTo(a,b);
	}
	
	private static boolean equalTo(integerClass a,integerClass b){
		boolean status = true;
		if(b.negative()&&!a.negative()||!b.negative()&&a.negative()){
			status=false;
		}
		else{
			for(int i=0;i<a.getDigits().length;i++){
				if(a.getDigits()[i]!=b.getDigits()[i]){
					status=false;
					break;}
			}
		}
		return status;
	}
	
	public static boolean isGreaterThan(integerClass a,integerClass b){
		return greaterThan(a,b);
	}
	
	private static boolean greaterThan(integerClass a,integerClass b){
		boolean status = false;
		if(b.negative()&&!a.negative()){
			status = true;
		}
		else if(!b.negative()&&a.negative()){
			status= false;
		}
		else if(!b.negative()&&!a.negative()){
			for(int i=0;i<a.getDigits().length;i++){
				if(a.getDigits()[i]!=b.getDigits()[i])
				{	
					if(a.getDigits()[i]>b.getDigits()[i])
						status=true;
					break;}
			}
		}
		else{
			for(int i=0;i<a.getDigits().length;i++){
				if(a.getDigits()[i]!=b.getDigits()[i])
				{	
					if(a.getDigits()[i]<b.getDigits()[i])
						status=true;
					break;}
			}
		}
		return status;
	}
	
	public static boolean isLessThan(integerClass a,integerClass b){
		return !greaterThan(a,b);
	}
	
	public static boolean isGreaterThanOrEqualTo(integerClass a,integerClass b){
		return isGreaterThan(a,b)||isEqualTo(a,b);
	}
	
	public static boolean isLessThanOrEqualTo(integerClass a,integerClass b){
		return isLessThan(a,b)||isEqualTo(a,b);
	}
	
	public static boolean isZero(integerClass a){
		boolean status = true;
		for(int i=0;i<a.getDigits().length;i++){
			if(a.getDigits()[i]!=0){
				status=false;		
			}
		}
		return status;
	}
	
	public static integerClass multiply(integerClass a,integerClass b){
		integerClass m = new integerClass();
		int rem=0,bor,mult,l=m.getDigits().length-1;
		bor=1;
		for(int bb=(b.getDigits().length-1);bb>=0;bb--,bor++){
			int incr=l;
			for(int aa=(a.getDigits().length-1);aa>=0;aa--){
				if(39-aa>=0){
					mult=b.getDigits()[bb]*a.getDigits()[aa];
					if(mult<=9){
						int pow =(Math.abs((bb-aa)%2));
						m.getDigits()[incr]+=(mult*Math.pow(10,pow));
					}
					else{
						if((Math.abs(bb-aa))%2==0)
						m.getDigits()[incr]+=mult;
						else{
							int inc = incr-1;
							m.getDigits()[inc]+=(mult/10*Math.pow(10,Math.abs(aa-(39-bb))%2));
							m.getDigits()[incr]+=(mult%10*Math.pow(10,(Math.abs(bb-aa))%2));
						}
						
					}
				}
				else{
					int def= Math.abs(l-aa)-0;
				}
				addNext(m.getDigits(),incr);
				if(Math.abs((bb-aa))%2==1)
					incr--;
			}
			if(bor%2==0)
				l--;
		}
		m.multStat=true;
		return m;
	}
	
	public static integerClass divide(integerClass a,integerClass bb){
		integerClass m = new integerClass();
		boolean stat=false,point=false,mult=a.getStat();int rem=0;
		int div,b=getInt(bb),start=0;
		//System.out.println(getInt(a));
		for(int i=0;i<40;i++){
			int num=0;
			if(a.getDigits()[i]!=0)
				stat=true;
			for(int j=start;j<=i;j++){
				num+=(a.getDigits()[j]*Math.pow((mult?100:10),(i-j)));
			}
			//if(num!=0)
				//System.out.println(num);
			num+=(rem*(mult?100:10));
			div=num/b;
			if(div==0&&stat==true){
				start=(point==false?start:i);
				point=false;
			}
			else if(div>0){
				start=i+1;
			}
			m.getDigits()[i]=div;
			//System.out.printf("%d\t%d\n",i,m.getDigits()[i]);
			if(num!=0&&div!=0)
			rem=num-(div*b);
		}
		if(a.getStat())
			m.multStat=true;
		return m;
	}
	
	public static integerClass diveide(integerClass a,integerClass bb){
		integerClass m = new integerClass();
		boolean stat=true;int rem=0;
		int div,b=getInt(bb),end=a.getDigits().length-1,start=0;
		for(int i=0;i<=start;i++){
			int num=0;
			for(int j=end;j<=start;j++){
				num+=(a.getDigits()[j]*Math.pow(10,end-j));
			}
			num+=(rem*10);
			div=num/b;
			if(div==0){
				start=(stat==true?i:start);
				end=(i+1<0?0:i+1);
				stat=false;
			}
			else {
				stat=true;
				System.out.println();
			}
			m.getDigits()[i]=div;
			if(num!=0)
			rem=num-(div*b);
		}
		return m;
	}
	
	public static int remainder(integerClass a,integerClass bb){
		integerClass m = new integerClass();
		boolean stat=false,point=false;int rem=0;
		int div,b=getInt(bb),start=0;
		for(int i=0;i<40;i++){
			int num=0;
			if(a.getDigits()[i]!=0)
				stat=true;
			for(int j=start;j<=i;j++){
				num+=(a.getDigits()[j]*Math.pow(10,i-j));
			}
			if(num!=0)
				System.out.println(num);
			num+=(rem*10);
			div=num/b;
			if(div==0&&stat==true){
				start=(point==false?start:i);
				point=false;
			}
			else if(div>0){
				start=i+1;
			}
			m.getDigits()[i]=div;
			System.out.printf("%d\t%d\n",i,m.getDigits()[i]);
			if(num!=0&&div!=0)
			rem=num-(div*b);
		}
		return rem;
	}
	
	
	
	public static int getInt(integerClass a){
		int no=0;
		boolean stat=a.getStat();
		for(int i=0;i<a.getDigits().length;i++){
			if(a.getDigits()[i]!=0)
			no+=(a.getDigits()[i]*Math.pow(10,(a.getDigits().length-i-1)*(stat?2:1)));
			//System.out.printf("%d\t%d\n",i,no);
		}
		return no;
	}
	
	private boolean checkPrev(int incr,int m[]){
		boolean stat=false;
		for(int i=incr-1;i>=0;i--)
			if(m[i]>0){
				stat=true;
				break;
			}
			return stat;
	}
	
	public boolean getStat(){
		boolean stat=false;
		for(int i=getDigits().length-1;i>=0;i--){
			if(getDigits()[i]>9){
				stat=true;
				break;}
		}
		return stat;
	}
	
	private static void addNext(int[] m,int incr){
		if(m[incr]>99&&incr>0){
			m[incr-1]+=m[incr]/100;
			m[incr]=m[incr]%100;
			addNext(m,incr-1);
		}
	}
	
	public boolean negative(){
		return this.neg;
	}
	
	public String toString(){
		boolean stat=false;
		String no="";
		int n;
		for(int i=0;i<digits.length;i++){
			n=getDigits()[i];
			if(n>0)
				stat=true;
			if(stat==true){
				if(n<=9&&multStat==true){
					if(checkPrev(i,getDigits())==true)
						no+=("0"+n);
					else
						no+=n;
				}
				else
					no+=n;
			}
			else if(stat==false&&i==digits.length-1)
				no+=0;
		}
		
		return String.format("%s%s",(this.neg?"-":""), no);
	}


	}
