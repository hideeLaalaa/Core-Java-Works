//application to display a drawpanel

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
public class dpTest {

	public static void main(String[] args) {
		/*drawPanel panel=new drawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(250,250);
		application.setVisible(true);
		*/
		
	/*	String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n Enter 2 to drae ovals");
		int choice = Integer.parseInt(input);
		shapesP panel= new shapesP(choice);
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	*/
	/*	shapesP panel = new shapesP();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	*/

		// BAR CHART TEST
/*		String input = JOptionPane.showInputDialog("Enter the number ");
		int choice = Integer.parseInt(input);
		String input1 = JOptionPane.showInputDialog("Enter the number 2 ");
		int ch2=Integer.parseInt(input1);
		String input11 = JOptionPane.showInputDialog("Enter the number 3 ");
		int ch3=Integer.parseInt(input11);
		String input111 = JOptionPane.showInputDialog("Enter the number 4 ");
		int ch4=Integer.parseInt(input111);
		String input1111 = JOptionPane.showInputDialog("Enter the number 5 ");
		int ch5=Integer.parseInt(input1111);
	
		shapesP panel=new shapesP(choice,ch2,ch3,ch4,ch5);
		JFrame app= new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300, 300);
		app.setVisible(true);
*/
		
		//SMILIE DRAWING
/*		shapesP smile= new shapesP();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(smile);
		app.setSize(660, 750);
		app.setVisible(true);
	 }
  */
		
		//DRAW RAINBOW TEST
/*		Arcs panel = new Arcs();
		JFrame app = new JFrame();
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300,300);
		app.setVisible(true);
	String input = JOptionPane.showInputDialog("Enter the number ");
*/
		
		//*****TEST DRAW CH8******
		String noOfShapes  = JOptionPane.showInputDialog("Enter amount of shapes you want");
		drawP panel = new drawP(Integer.parseInt(noOfShapes));
		//ADDING CH9 MODIFICATION
		JLabel status = new JLabel(panel.toString());
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.add(status, BorderLayout.SOUTH);
		app.setSize(300, 300);
		app.setVisible(true);
	
	}//end main
	

}
