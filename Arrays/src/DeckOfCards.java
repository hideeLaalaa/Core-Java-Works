import java.util.Random;

public class DeckOfCards {
	
	private cards[] deck;
	private int currentCard;
	private static final int  NUMBER_OF_CARDS = 52;
	public int dell=4;
	private cards[] hand = new cards[5];
	private String[] face = new String[5];
	private String[] suit = new String[5];
	private static final Random ran = new Random();
	String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

	public DeckOfCards() 
	{
		
		deck = new cards[NUMBER_OF_CARDS];
		currentCard =0;
		
		for(int count =0;count<deck.length;count++)
			deck[count]=
				new cards(faces[count%13],suits[count/13]);
	}//end deck of cards constructor
	
	//shuffle deck of cards with one-pass algorithm
	public void shuffle(){
		
		//after shuffling,deal should start at deck[0] again
		currentCard =0;
		
		for(int first=0;first<deck.length;first++){
			int second = ran.nextInt(NUMBER_OF_CARDS);
			
			//swap current card with randomly selected card
			cards temp= deck[first];
			deck[first]= deck[second];
			deck[second]= temp;
		}//end for	
	}//end shuffle

	//deal five card
	public cards[] dealing(){
		//shuffle();
		int j;
		for(int i=0;i<5;i++){
			j=currentCard;
			hand[i]=deck[currentCard++];
			face[i]=deck[j].getFace();
			suit[i]=deck[j].getSuit();
			//System.out.printf(face[i]+"   ,   " +suit[i]+"\n");
			System.out.println(hand[i]);
		}
		return hand;
	}
	//for four of a kind
	public int four(){
		int four=0,flush=0,straight=0,full=0;
		for(int i=0;i<hand.length;i++){
			four=1;
			for(int j=0;j<hand.length;j++){
				if(i!=j)
					if(face[i]==face[j])
						four++;
			}
		}
		//if(four==4)
		//System.out.print("We have a four of a kind");
		//else System.out.println("__________");
		return four;
	}
	
	//checking for a straight if it has five cards of consecutive values
	public boolean straight(){
		int[] stray = new int[5];
		boolean stat=true;
		for(int j=0;j<hand.length;j++)
		for(int i=0;i<faces.length;i++){
			if(face[j]==faces[i])
				stray[j]=i;
		}
		//for(int d:stray)
			//System.out.println(d);
		int swap;
		for(int i=0;i<stray.length;i++)
			for(int j=i+1;j<stray.length;j++)
				if(stray[j]<stray[i]){
					swap=stray[j];
					stray[j]=stray[i];
					stray[i]=swap;
				}
		for(int i=1;i<stray.length;i++){
			if(!(stray[i-1]+1==stray[i]))
				stat=false;
		}
		//if(stat==false) 
		//	System.out.println("_______");
		//else
			//System.out.print("You have a straight hand!!!!!");
		return stat;
	}
	
	//checking for a full house if there is a pair and 3 of a kind
	public boolean full(){
		int total=1;
		for(int i=1;i<hand.length;i++)
			if(face[0]==face[i])
				total++;
		if(total==2||total==3)
		for(int i=0;i<hand.length;i++){
			if(face[i]!=face[0]){
				total++;
				for(int j=i+1;j<hand.length;j++){
					if(face[i]==face[j])
						total++;
				}
				break;
			}
		}
		if(total==5){
		//	System.out.println("FULL HOUSE!!!!");
			return true;}
		else{	//	System.out.println("Total  here is "+total); 
			return false;
		}
	}
	
	//checking for a flush if all the cards are of the same suit
	public int flush(){
		int flush =1;
		for(int i=1;i<hand.length;i++){
			if(suit[0]==suit[i] && suit[0]!=null)
				flush++;
		//	System.out.println(suit[i]);
		}
		//System.out.println(flush);
		
		return flush;
	}
	
	//checking the hand for a pair or two and three of a kind
	public int pairs(){
		//chrck for same face
		int sc=0,fc=0;
		for(int i=0;i<hand.length;i++)
			for(int j=i+1;j<hand.length;j++){
				if(face[i]==face[j])
					fc++;
				//if(fc==1)
					//System.out.println(i+" .... "+j);
			}
		//System.out.println("The number of pairs is "+fc);
		return fc;
	}
	
	//to check the class of a hand dealt
	public int better(){
		int better =0;
		for(int i=1;i<=7;i++)
			switch(i){
			case 1:
				if(pairs()==1)
					better=1;
				break;
			case 2:
				if(pairs()==2)
					better=2;
				break;
			case 3:
				if(pairs()==3)
					better =3;
				break;
			case 4:
				if(four()==4)
					better =4;
				break;
			case 5:
				if(flush()==5)
					better=5;
				break;
			case 6:
				if(straight()==true)
					better=6;
				break;
			case 7:
				if(full()==true)
					better =7;
				break;
			}
		return better;
	}
	
	//deal one card
	public cards dealCard(){
		if(currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}// end method dealCard
	
	
}//end class DeckOfCards
