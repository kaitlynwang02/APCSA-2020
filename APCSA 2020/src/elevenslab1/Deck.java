package elevenslab1;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.Random;

import elevenslab1.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck 
{

	public static final int NUMCARDS = 52;
	
	//public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	//public static final String RANKs[] = {"ZERO","ACE","TWO","THREE","FOUR",
	//"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	//public static int POINTVALUES[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	
	private ArrayList<Card> cards;
	private int top, size;

   //make a Deck constructor
	
	public Deck (String[] ranks, String[] suits, int[] pointValues) {
		cards = new ArrayList<Card> ();
		for (int s = 0; s < suits.length; s++) {
			for (int r = 0; r < ranks.length; r++) {
				cards.add(new Card(ranks[r], suits[s], pointValues[r]));
			}
		}
		size = cards.size();
		top = size-1;
		selectionShuffle(cards);
	}
	
   	//isEmpty method
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	//deal method
	
	public Card deal() {
			//return cards.get(j) + "";
		Card topCard;
			if (!isEmpty()) 
				topCard = cards.get(top);
			else 
				//return new Card();
				return null;
			
		top--;
		size--;
		return topCard;
	}
		
	//size method
	
	public int size() {
		return size;
	}
	
	//shuffle method
	
	public ArrayList<Card> selectionShuffle(ArrayList<Card> values) {
	
		
		Random rand = new Random();
		
		int x = 0;
		
		Card y;
		
		for (int i = values.size()-1; i > 0; i--) {
			x = rand.nextInt(i);
			y = values.get(x);
			values.set(x, values.get(i));
			values.set(i, y);
			
		}
		
		return values;
		
	}
	
	//toString method
	public String toString() 
	{
		String deckPrint = "";
		for (int i = 0; i <= top; i++) 
		{
			deckPrint = deckPrint + cards.get(i).toString() + ", ";
		}
		return deckPrint;
	}
	
}