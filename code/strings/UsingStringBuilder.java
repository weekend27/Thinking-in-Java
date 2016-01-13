package strings;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand = new Random();
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < 10; i++) {
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}
}

/**Output:
[16, 79, 37, 8, 91, 31, 83, 33, 73, 67]
*/