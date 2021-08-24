import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import java.awt.color.*;
import javax.swing.JPanel;

public class shapesP extends JPanel{
	Random ran = new Random();
	
	/*private int choice;private int i;
	private int ch2;private int ch3;private int ch4;private int ch5; 
	
	public shapesP(int choices,int c2,int c3,int c4,int c5) {
		// TODO Auto-generated constructor stub
		choice = choices;
		ch2=c2;ch3=c3;ch4=c4;ch5=c5;
	}
*/	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		// rect and oval forming cone 
/*		for(int i =0;i<10;i++){
			
			switch( choice ){
			case 1: 
				g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
				break;
				
			case 2:
				g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
				break;
			}
		}*/
		
		// CONCENTRIC CIRCLES
/*		for (int i=0;i<13;i++){
			g.drawOval(130-10*i, 120-10*i,10+20*i,10+20*i);
		}*/
		
		//INPUT FIVE NUMBER AND THEY WOULD BE REP IN A BAR CHART
/*		g.drawLine(10, 10, 10, 250);
		g.drawLine(10, 250, 270, 250);
		
		
			g.drawRect(15+1*20, 250-choice,10, choice);
			g.drawRect(15+2*20, 250-ch2,10, ch2);
			g.drawRect(15+3*20, 250-ch3,10, ch3);
			g.drawRect(15+4*20, 250-ch4,10, ch4);
			g.drawRect(15+5*20, 250-ch5,10, ch5);
	*/		
		
		//draw the face
/*		g.setColor(Color.black);
		g.fillOval(28, 1, 600, 600);
		g.fillOval(28, 340, 600, 260);
		g.fillRect(100, 1, 470, 130);
		g.setColor(Color.red);
		g.fillOval(30, 30, 600, 600);
		
		g.setColor(Color.BLACK);
		//g.fillOval(150, 190, 130, 40);
		g.fillOval(155, 200, 120, 42);
		g.fillOval(395, 200, 120, 42);
		//g.fillOval(390, 185, 125, 45);
		// draw the eyes
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(155,195, 120, 45);
		g.fillOval(395, 195, 120, 45);
		//g.fillOval(165, 195, 90, 90);
		//g.fillOval(405, 195, 90, 90);

		//white in the middle of the eyes
		g.setColor(Color.BLACK);
		//draw the mouth
		g.fillOval(150, 330, 360, 180);
		//draw brows
		g.fillOval(140, 140, 155, 35);
		g.fillOval(370, 140, 155, 35);
		
		g.fillOval(200, 210, 30, 30);
		g.fillOval(440,210, 30, 30);
		g.setColor(Color.gray);
		g.fillOval(212, 222, 7, 7);
		g.fillOval(452, 222, 7, 7);
		
		//touch up the mouth in to a smile
		g.setColor(Color.red);
		g.fillRect(150, 330, 360, 90);
		g.setColor(Color.red);
		g.fillOval(150, 365, 360, 120);
		//brows
		//g.fillRect(145, 155, 150, 35);
		g.fillOval(145, 160, 150, 35);
		g.fillOval(375, 160, 150, 35);
		//g.fillRect(375, 155, 150, 35);
		
		g.setColor(Color.black);
		g.fillOval(315, 330, 30, 70);
		g.fillOval(310, 385, 15, 15);
		g.fillOval(335, 385, 15, 15);
		
		
		
		//this is h
				g.drawLine(560, 620, 560, 640);
				g.drawLine(561, 620, 561, 640);
				g.drawLine(570, 620, 570, 640);
				g.drawLine(571, 620, 571, 640);
				g.drawLine(560, 630, 570, 630);
				g.drawLine(560, 631, 570, 631);
				//this is i
				g.drawLine(580, 620, 595, 620);
				g.drawLine(580, 621, 595, 621);
				g.drawLine(580,640,595,640);
				g.drawLine(580,641,595,641);
				g.drawLine(588,620,588,640);
				g.drawLine(587,620,587,640);
				
				//this is d
				g.drawLine(575, 650, 575, 670);
				g.drawLine(574, 650, 574, 670);
				g.drawLine(575, 650, 583, 660);
				g.drawLine(576, 650, 582, 660);
				g.drawLine(575, 670, 583, 660);
				g.drawLine(575, 670, 582, 660);
	*/
		//BULLS EYE
/* Color col1 = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));
	Color col2 = new Color(ran.nextInt(255),ran.nextInt(255),ran.nextInt(255));
		int a=20;int c=600;
		for(int i=1;i<=5;i++){
			if(i%2==1)
			g.setColor(col1);
			else
				g.setColor(col2);
				g.fillOval(a, a, c, c);
				a+=50;c-=100;
		}
	*/	
		// 10 RANDOM FILLED SHAPES IN RANDOM COLORS,POSITIONS,SIZES.
/*		for(int i=1;i<=20;i++){			
			int choice =1+ ran.nextInt(2);
			Color col = new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256));
			switch(choice){
			case 1: g.setColor(col);
			g.fillOval(ran.nextInt(400), ran.nextInt(300),100+ ran.nextInt(200),100+ ran.nextInt(300));
			break;
			case 2: g.setColor(col);
			g.fill3DRect(ran.nextInt(600), ran.nextInt(600), ran.nextInt(300), ran.nextInt(300),true);
			break;
			}// end switch
		}//end for loop
*/		
		


	}
		
		
	}


