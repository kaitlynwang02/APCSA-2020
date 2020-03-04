package elevenslab1;

import java.util.ArrayList;
import java.util.Random;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {
	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 4;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	/*public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		
		
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");

		
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
	}*/


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static ArrayList<Card> perfectShuffle(ArrayList<Card> values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
	
		ArrayList<Card> shuffled = new ArrayList<Card>();
		int x;
		
		if (values.size() > 0) {
			if (values.size() % 2 == 0) {
				x = (values.size()/2);
				for (int i = 0; i < x; i++) {
					shuffled.add(values.get(i));
					shuffled.add(values.get(i + x));
				} 	
			}
			else {
				x = (values.size()/2) + 1;
				for (int i = 0; i < x-1; i++) {
					shuffled.add(values.get(i));
					shuffled.add(values.get(i + x));
				} 
				shuffled.add(values.get(x));
			}
			
		}
		
		for (int i = 0; i < values.size(); i++) {
			values.set(i, shuffled.get(i));
		}
		
		return values;
		
		/*int[] values = new int[52];
		
		int k = 0;
		
		for (int j = 0; j <= 25; j++)
		{
			shuffled[k] = values[j];
			k = k+2;
		}
		
		k = 1;
		
		for (int j = 26; j <= 51; j++) 
		{
			shuffled[k] = values[j];
			k = k+2;
		}
		//return shuffled;*/
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static ArrayList<Card> selectionShuffle(ArrayList<Card> values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		
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
		
		/*int Min = 0;
		int Max = 0;
		
		int r = 0;
		
		for (int k = 51; k >= 1; k--)
		{
			Max = k;
			r = Min + (int)(Math.random() * ((Max - Min) + 1));
			values[k] = values[r];
		}
		//return cards;*/
	}
	
	// flip method
	
	public static String flip() 
	{
		if (Math.random() < .333)
			return "tails";
		else
			return "heads";
	}
	
	// arePermutations method
	
	public static boolean arePermutations() 
	{
		int length = 5;
		int[] first = new int[length];
		int[] second = new int[length];
		
		int x = 0;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; i < length; j++) {
			if (first[i] != second[j]) {
				x++; }
			}	
		}
		if (x==length-1) 
			return true;
		else
			return false;
	}
}
