package interfaces.classprocessor;

import java.util.Arrays;

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {   // Covariant return
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {   // Covariant return
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println("Using Processor " + p.name());
		System.out.println(p.process(s));
	}
	public static String s = "Life is full of goodness and sadness";
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
}

/**Output:
Using Processor Upcase
LIFE IS FULL OF GOODNESS AND SADNESS
Using Processor Downcase
life is full of goodness and sadness
Using Processor Splitter
[Life, is, full, of, goodness, and, sadness]
*/
