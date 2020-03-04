package elevenslab1;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {
	private static int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 53;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		
		//System.out.println(Shuffler.perfectShuffle());
		
		
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
	
		//System.out.println(Shuffler.selectionShuffle());
		
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
		
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int [] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
	
		int[] shuffled = new int[52];
		
		int k = 0;
		
		for (int j = 0; j <= 25; j++)
		{
			values[j] = shuffled[k];
			k = k+2;
		}
		
		k = 1;
		
		for (int j = 26; j <= 51; j++) 
		{
			values[j] = shuffled [k];
			k = k+2;
		}
		//return cards;
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
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		int Min = 0;
		int Max = 0;
		
		int r = 0;
		
		for (int k = 51; k >= 1; k--)
		{
			Max = k;
			r = Min + (int)(Math.random() * ((Max - Min) + 1));
			values[k] = values[r];
		}
		//return cards;
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
		
		for (int i = 0; i < first.length; i++)
			if (first[i] != second[i])
				
	}
}
