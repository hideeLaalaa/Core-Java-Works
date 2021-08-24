package com.deitel.jhtp.ch08;
import javax.swing.JOptionPane;

public class az {

	public az() {
		
	}
	
	public static void main(String args[]){
		int a,b,count=0;
		a = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of b"));
		for(int i=1;i<=b;i++){
			if(i%2==0)
				count++;
		}
		JOptionPane.showMessageDialog(null, "Amount of numbers divisible by 2 between '1' and '"+b+"' is: "+count);
	}

}
