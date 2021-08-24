import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AssertTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> posValues = new ArrayList<>();
		ArrayList<ArrayList<ArrayList<Integer>>> Position = new ArrayList<>(3);
		ArrayList<Integer> miss = new ArrayList<>();
//		posValues.add(12);
//		
//		miss.clear();
//		miss=posValues;
//		//miss.addAll(posValues);
//		miss.add(99);
//		miss.remove((Integer)2);
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		ArrayList<Integer> z = new ArrayList<Integer>();
		y.add(5);
		x.add(7);
		z.add(x.get(0)+y.get(0));
		int j=0;
		boolean tell = false;
		Random ran = new Random(337);
		System.out.println("Triumphing  is z: " + ran.nextInt(5));
		x = new ArrayList<>();
		x.add(13);
		x.add(12);
		x.add(5);
		String date = "2/25/  2020";
		date.trim();
		date.replaceAll(" ", "k");
		
		System.out.println("This is z: " + date);
		String day = null,mth,yr = null;
			day=date.substring(0, date.indexOf("/"));
			mth=date.substring(date.indexOf("/")+1,date.lastIndexOf("/"));
			yr=date.substring(date.lastIndexOf("/")+1,date.length());
		System.err.println(mth+"/"+day+"/"+yr);
		int[][][] sudoku = new int[9][3][3];
		miss.add(1);
		miss.add(2);
		posValues.add(1);
		posValues.add(2);
		System.err.println(miss.equals(posValues));
		Position.add(new ArrayList<>());
		Position.get(0).add(miss);
		Position.get(0).get(0).add(55);
		posValues.add(7);
		miss.add(9);
		System.out.println(miss+""+""+Position.get(0).get(0));
		for(int xx:miss){
			miss.remove((Integer)5);
			if(miss.contains(posValues.get(1)))
				System.out.println(xx);}
		
		System.out.print("Enter a number between 0 and 10: ");
	//	int number = in.nextInt();
		
		// assert that the value is >= 0 and <=10
		//assert number >50000;
//		assert (number >= 0 && number <= 10) : "bad number " + number;
//
//		//		number = (true ? 3: 8);
//		
//		System.out.printf("You entered %d\n", number);
		
	}
	
}

