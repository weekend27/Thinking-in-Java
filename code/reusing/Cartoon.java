package reusing;
//Constructor calls during inheritance.

class Art {
	Art() {System.out.println("Art constructor");}
}

class Drawing extends Art {
	Drawing() {System.out.println("Drawing constructor");}
}

public class Cartoon extends Drawing{
	public Cartoon() {System.out.println("Cartoon constructor");}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Cartoon x = new Cartoon();
	}

}

/**Output:
Art constructor
Drawing constructor
Cartoon constructor
 */
