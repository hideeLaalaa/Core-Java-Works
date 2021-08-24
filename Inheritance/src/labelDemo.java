import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class labelDemo {

	public static void main(String[] args) {
		//create label with plain text
		JLabel northLabel = new JLabel("North");
		
		//icon image for JLabel
		ImageIcon labelIcon = new ImageIcon("C:/Users/olatoyosi/Documents/HERB/workspace/Inheritance/src/demo.gif");
		
		//label with an icon
		JLabel centerLabel = new JLabel(labelIcon);
		centerLabel.setText("Centralized");
		
		//another icon label
		JLabel southLabel = new JLabel(labelIcon);
		
		//both text and icon
		southLabel.setText("South");
		
		//frame to hold the labels
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adding labels to the frame
		app.add(southLabel,BorderLayout.SOUTH);
		app.add(northLabel,BorderLayout.NORTH);
		app.add(centerLabel,BorderLayout.CENTER);
		
		app.setSize(300, 300);
		app.setVisible(true);
		
	}

}
