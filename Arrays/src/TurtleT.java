import java.util.Scanner;

public class TurtleT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Turtle test = new Turtle();
		boolean running = true;
		while(running){
			test.printMenu();
			switch(in.nextInt()){
			case 0:
				test.setPen(); break;
			case 1:
				test.penUp(); break;
			case 2: 
				test.penDown(); break;
			case 3:
				test.turnleft(); break;
			case 4:
				test.turnRight(); break;
			case 5:
				test.forward(in.nextInt()); break;
			case 6:
				test.showGrid(); break;
			case 7:
				test.reset(); break;
			case 8:
				System.out.print("Enter the length and breadth seperated by spaces:");
				test.rect(in.nextInt(), in.nextInt()); break;
			case 9:
				running = false;
				break;
			default:
			break;
			}
		}

	}

}
