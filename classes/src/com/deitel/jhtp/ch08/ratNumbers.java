package com.deitel.jhtp.ch08;

public class ratNumbers{
	
	private int numerator;
	private int denumerator;
	
	public ratNumbers(){
		this.setDenum(0);
		this.setNum(0);
	}
	
	public ratNumbers(int num,int denum){
		redForm(num,denum);
	}
	
	public void redForm(int num,int denum){
		this.numerator=(num<0&&denum<0?num*-1:num)/hcf(num,denum);
		this.denumerator=(denum<0&&num<0?denum*-1:denum)/hcf(num,denum);
	}
	
	public int hcf(int x,int y){
		int max;
		int hcf=1;
		if(x<y)
			max=(x<0?(x*-1):x);	else max=(y<0?(y*-1):y);
		for(int i=1;i<=max;i++){
			if(x%i==0&&y%i==0)
				hcf=i;
		}
		return hcf;
	}
	
	public int getNum(){
		return this.numerator;
	}
	
	public int getDenum(){
		return this.denumerator;
	}
	
	public void setNum(int n){
		this.numerator=n;
	}
	
	public void setDenum(int d){
		this.denumerator=d;
	}
	
	public void inverse(){
		int n=this.getNum();
		this.setNum(getDenum());
		this.setDenum(n);
	}
	
	public static ratNumbers add(ratNumbers a,ratNumbers b){
		ratNumbers add = new ratNumbers();
		int d=a.getDenum()*b.getDenum();
		int n=(b.getDenum()*a.getNum())+(a.getDenum()*b.getNum());
		add.redForm(n, d);
		return add;
	}
	
	public static ratNumbers sub(ratNumbers a,ratNumbers b){
		ratNumbers sub = new ratNumbers();
		int d=a.getDenum()*b.getDenum();
		int n=(b.getDenum()*a.getNum())-(a.getDenum()*b.getNum());
		sub.redForm(n, d);
		return sub;
	}
	
	public static ratNumbers mult(ratNumbers a,ratNumbers b){
		ratNumbers mult = new ratNumbers();
		int d=a.getDenum()*b.getDenum();
		int n=(a.getNum())*(b.getNum());
		mult.redForm(n, d);
		return mult;
	}
	
	public static ratNumbers div(ratNumbers a,ratNumbers b){
		ratNumbers div = new ratNumbers();
		b.inverse();
		int d=a.getDenum()*b.getDenum();
		int n=(a.getNum())*(b.getNum());
		div.redForm(n, d);
		return div;
	}
	
	public float fPoint(){
		float x = (float)this.getNum()/this.getDenum();
		return x;
	}
	
	public String toString(){
		return String.format("%d/%d", this.getNum(),this.getDenum());
	}
	
	public String toString(int n){
		return String.format("%."+n+"f", fPoint());
	}
	
}
