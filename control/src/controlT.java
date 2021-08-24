import java.util.Scanner;
public class controlT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.println("Enter name of course:");
		controll controlT = new controll("");
		name = input.nextLine();
		controlT.setCn(name);
		controlT.getCn();
		controlT.display();
		controlT.school();
	}

}
