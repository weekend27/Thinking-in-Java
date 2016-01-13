// Creating an adapter with inheritance.
package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDoubles extends RandomDoubles implements Readable{
	private int count;
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomDoubles(9));
		while (s.hasNext()) {
			System.out.println(s.nextDouble() + " ");
		}
		s.close();
	}
}

/**Output:
0.16327070176198255 
0.6275648233493292 
0.5503030788563358 
0.573032183849448 
0.4536073298088503 
0.39492198656814703 
0.6433518242860539 
0.46695262093750445 
0.014962991103321222 
*/
