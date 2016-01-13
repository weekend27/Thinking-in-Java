// Initializing interface fields with
// non-constant initializers.
package interfaces;

import java.util.Random;

public interface RandVals {
	Random RAND = new Random(99);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextLong() * 10;
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}