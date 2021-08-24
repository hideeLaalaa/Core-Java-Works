package com.deitel.jhtp.ch08;

public class packageDataTest {

	public static void main(String[] args) {
		packageData pack = new packageData();
		System.out.printf("After instantiation:\n%s\n",pack);
		
		pack.number=88;
		pack.string="Goodbye";
		
		System.out.printf("\nAfter changing values:\n%s\n",pack);
	}

}

class packageData{
	int number;
	String string;
	
	public packageData(){
		number =0;
		string ="hello";
	}
	
	public String toString(){
		return String.format("number: %dd; String: %s", number,string);
	}
}