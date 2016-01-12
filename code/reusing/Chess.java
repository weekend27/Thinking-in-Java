package reusing;
//Inheritance, constructors and arguments.

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class Chess extends BoardGame{
	Chess() {
		super(1234);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Chess x = new Chess();
	}

}

/**Output:
Game constructor
BoardGame constructor
Chess constructor
*/
