/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("a", "diamond", 2);
		System.out.println(a);
		Card b = new Card("a", "diamond", 2);
		System.out.println(a.matches(b));
	}
}

// dd
