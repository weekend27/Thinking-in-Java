package strings;

public class StringFormat {

	public static void main(String[] args) {
		int x = 9;
		double y = 3.141593;
		// The old way:
		System.out.println("Row 1: [" + x + " " + y + "]");
		// The new way:
		System.out.format("Row 1: [%d %f]\n", x, y);
		// or
		System.out.printf("Row 1: [%d %f]\n", x, y);
	}

}

/**Output:
Row 1: [9 3.141593]
Row 1: [9 3.141593]
Row 1: [9 3.141593]
*/
