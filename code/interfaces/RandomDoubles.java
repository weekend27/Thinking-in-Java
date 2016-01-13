package interfaces;

import java.util.Random;

public class RandomDoubles {
	private static Random rand = new Random();
	public double next() {
		return rand.nextDouble();
	}
	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.next() + " ");
		}
	}
}

/**Output:
0.8290528537938224 
0.4401331908043855 
0.09618113048854204 
0.8333182084121239 
0.008147050971026637 
0.8900883513220621 
0.6613027002058982 
*/
