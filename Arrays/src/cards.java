// card class representing card playing 
public class cards {
	private String face;
	private String suit;
	private int ch;

	public cards(String cardFace,String cardSuit) {
		face=cardFace;
		suit=cardSuit;
	}
	
	public String toString(){
		return face + " of " + suit;
	}
	
	public String getFace(){
		return face;
	}
	
	public String getSuit(){
		return suit;
	}
	

}
