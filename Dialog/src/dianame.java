// basic input with a dialog box

import javax.swing.JOptionPane;

public class dianame
{
	private int yr=100;
	public dianame(int x){
		yr=x;
	}
	
	public double sqr(){
		return yr*10000;
	}
	
	public static void main(String[] args){
		test rest = new test();
		for(int i=0;i<5;i++)
		System.out.println(rest.meew());
	}

}

class test{
	private dianame[] root;
	
	public test(){
		root = new dianame[5];
		for(int count=0;count<root.length;count++)
			root[count]=new dianame(100/(count+2));
	}
	
	public dianame meew(){
		int i=0;
		if(i<root.length)
			return root[i++];
		else 
			return null;
	}
}


