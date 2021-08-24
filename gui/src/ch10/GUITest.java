package ch10;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GUITest {

	public static void main(String args[]){
		
		String noOfShapes  = JOptionPane.showInputDialog("Enter amount of shapes you want");
		ch10GUI panel = new ch10GUI(Integer.parseInt(noOfShapes));
		//ADDING CH9 MODIFICATION
		JLabel status = new JLabel(panel.toString());
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.add(status, BorderLayout.SOUTH);
		app.setSize(300, 300);
		app.setVisible(true);
			
		
	}

}
