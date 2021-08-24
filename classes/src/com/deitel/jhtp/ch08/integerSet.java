package com.deitel.jhtp.ch08;
//STILL NEED EXCEPTION HANDLING

public class integerSet {

private boolean[] number = new boolean[101];
	
	public integerSet(){
		
	}
	
	public integerSet(int... set){
		insertElement(set);
	}
	
	public boolean[] getSet(){
		return number;
	}
	
	public static integerSet union(integerSet a,integerSet b){	
		integerSet c = new integerSet();
		for(int i=0;i<a.getSet().length;i++){	
			if(a.getSet()[i]==true&&b.getSet()[i]==true)
				c.getSet()[i]=true;
		}
		return b;
	}
	
	public static integerSet intersection(integerSet a,integerSet b){
		integerSet c = new integerSet();
		for(int i=0;i<a.getSet().length;i++){
			if(b.getSet()[i]==true&&a.getSet()[i]==true)
				c.getSet()[i]=true;
		}
		return c;
	}
	
	public void insertElement(int... set){
		for(int k:set)
			if(k<=100&&k>=0)
				getSet()[k]=true;
			else
				throw new IllegalArgumentException("Set element must be btw 0 and 100");
	}
	
	public void deleteElement(int k){
		getSet()[k]=false;
	}
	
	public static boolean isEqualTo(integerSet a,integerSet b){
		boolean isEqual=true;
		for(int i=0;i<a.getSet().length;i++){
			if(b.getSet()[i]!=a.getSet()[i])
			{	
				isEqual=false;
				break;
			}
		}
		return isEqual; 
	}
	
	public String toString(){
		String set="";
		boolean empty =true;
		for(int i=0;i<getSet().length;i++){
			if(getSet()[i]==true){
				set+=String.format("%d%4s",i,"");
				empty=false;
			}
		}
		if(empty==true)
			set="---";
		return set;
	}
	
}
