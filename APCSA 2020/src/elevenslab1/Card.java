package elevenslab1;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	//public static final String RANK[] = {"ZERO","ACE","TWO","THREE","FOUR",
			//"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
	
	//public static String SUIT[] = {"DIAMOND", "SPADE", "HEART", "CLUB"};

	//public static int POINTVALUE[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	private String rank;
	private String suit;
  	private int pointvalue;
  	
  	//constructors

  	public Card() {
		this("", "", 0);
	}
	
	
	public Card(String r, String s, int p) {
		setRank(r);
		setSuit(s);
		setPointValue(p);
	}
	
	// modifiers
		//set methods

	public void setRank(String r) {
		rank = r;
	}
	
	public void setSuit(String s) {
		suit = s;
	}
	
	public void setPointValue(int p)
	{
		pointvalue = p;
	}

  	//accessors
		//get methods

	public String getSuit() {
		
		/*for (int i = 0; i < SUIT.length; i++) {
			if (suit.equals(SUIT[i])) 
				return SUIT[i];
		}
		*/
		return suit;
	}
	
	public String getRank() {
		
		/*for (int i = 0; i < RANK.length; i++) {
			if (rank == RANK[i]) 
				return RANK[i];
		}
		*/
		return rank;
	}
	
	public int getPointValue() {
		
		/*for (int i = 0; i < POINTVALUE.length; i++) {
			if (pointvalue == POINTVALUE[i]) 
				return POINTVALUE[i];
		}
		*/
		return pointvalue;
	}
	//equality method
	
	public boolean testEquality(Card otherCard) 
	{
		if (otherCard.getSuit().equals(this.getSuit()) && otherCard.getRank().equals(this.getRank()) && otherCard.getPointValue() == (this.getPointValue()))
		{
			return true;
		}
		return false;
	}
	
  	//toString
	
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointvalue + ")";
	}
 }