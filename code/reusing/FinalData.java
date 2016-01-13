package reusing;

import java.util.Random;

//The effect of final on fields.

class Value {
	int i;		// Package access
	public Value(int i) {this.i = i;}
}

@SuppressWarnings("unused")
public class FinalData {
	private static Random rand = new Random(57);
	private String id;
	public FinalData(String id) {this.id = id;}
	// Can be compile-time constants:
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	// Typical public constant:
	public static final int VALUE_THREE = 39;
	// Cannot be compile-time constants:
	private final int i4 = rand.nextInt(30);
	static final int INT_5 = rand.nextInt(20);
	private Value v1 = new Value(34);
	private final Value v2 = new Value(12);
	private static final Value VAL_3 = new Value(57);
	// Arrays:
	private final int[] a = {3,4,5,7,8};
	public String toString() {
		return id + ": " + "i4 = " + i4 + ", INT_5 = " + INT_5;
	}
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		// fd1.valueOne++;  // Error: can't change value
		fd1.v2.i++;  // Object isn't constant!
		fd1.v1 = new Value(9);  // OK -- not final
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++;   // Object isn't constant!
		}
		// fd1.v2 = new Value(0);   // Error: Can't
		// fd1.VAL_3 = new Value(1);  // Error: Can't change reference
		// fd1.a = new int[3];
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		FinalData fd3 = new FinalData("fd3");
		System.out.println(fd1);
		System.out.println(fd2);
		System.out.println(fd3);
	}

}

/**Output:
fd1: i4 = 21, INT_5 = 18
Creating new FinalData
fd1: i4 = 21, INT_5 = 18
fd2: i4 = 2, INT_5 = 18
fd3: i4 = 2, INT_5 = 18
*/
