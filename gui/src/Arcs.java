import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Arcs extends JPanel {
	//define indigo and violet
/*	private static final Color VIOLET = new Color(128,0,128);
	private static final Color INDIGO = new Color(75,0,130);
	//colors to use in the rainbow,starting from the innermost
	//the two white entries result in an empty arc in the center
	private Color[] colors = {Color.WHITE,Color.WHITE,VIOLET,INDIGO,
			Color.blue,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.red
	};

	public Arcs() {
		setBackground(Color.WHITE);//set the background to white
	}
*/	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
	/*	int radius =40;
		// draw the rainbow near the bottom center
		int centerX = getWidth()/2;
		int centerY = getHeight()-10;
		
		//draws filled arcs starting with the outermost
		for(int counter =colors.length;counter>0;counter--){
			//set the color for the current arc
			g.setColor(colors[counter-1]);
			
			//fill the arc from 0 to 180 degrees
			g.fillArc(centerX - counter * radius, centerY-counter * radius, counter * radius * 2,counter * radius * 2,0, 180);
		}
	*/
		//*** SQUARE SHAPED SPIRAL  ***//
/*		int x = getWidth()/2;
		int y = getHeight()/2;
		
		for(int counter =0;counter<getHeight()/60;counter++){
			g.drawLine(x + 40 *counter, y-counter*40,x + 40*counter,y+ 40*(counter+1));
			g.drawLine(x+(counter)*40, y +40*(counter+1), x - (counter+1) *40, y +40*(counter+1));
			g.drawLine(x-40*(counter+1), y +40*(counter+1), x -(counter+1)*40, y-(counter+1)*40);
			g.drawLine(x-(counter+1)*40, y-(counter+1)*40, x+(counter+1)*40, y-40*(counter+1));
		} 
	  }
 */
		//**SPIRAL DRAWING WITH ARCS**//
/*		setBackground(Color.pink);
		int x = getWidth()/2;
		int y = getHeight()/2;
		g.drawString("HIDEE", x-20,y+20);
		
		for(int i =0,j=0,k=1,l=1;i<=15;i+=1,j+=2,k+=2,l++){
			g.drawArc(x-i*20, y-i*20,20*(j+1),20*(j+1), 0, 180);
			g.drawArc(x-20*(i+1), y-10*(j+1),20*(k+1) ,20*(k+1), 0, -180);
		}//end loop
		
		// to get the spiral interval
		g.drawArc(50, 50, 20, 20, 0, 180);
		g.drawArc(30, 40, 40, 40, 0, -180);
		g.drawArc(30, 30, 60, 60, 0, 180);
		g.drawArc(10, 20, 80, 80, 0, -180);
	*/	
	}
}
