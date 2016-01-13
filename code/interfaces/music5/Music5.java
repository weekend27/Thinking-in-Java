// Interfaces.
package interfaces.music5;

import polymorphism.music.Note;

interface Instrument {
	// Compile-time constant:
	int VALUE = 7;   // static & final
	// Cannot have method definitions:
	void play(Note n);   // Automatically public
	void adjust();
}

class Wind implements Instrument {

	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	public String toString() {
		return "Wind";
	}
	
}

class Percussion implements Instrument {

	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	public String toString() {
		return "Percussion";
	}
	
}

class Stringed implements Instrument {
	
	@Override
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	@Override
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	public String toString() {
		return "Stringed";
	}
	
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}

public class Music5 {

		static void tune(Instrument i) {
			// ...
			i.play(Note.MIDDLE_C);
		}
		static void tuneAll(Instrument[] e) {
			for(Instrument i : e) {
				tune(i);
			}
		}
		public static void main(String[] args) {
			// Upcasting during addition to the array:
			Instrument[] orchestra = {
					new Wind(),
					new Percussion(),
					new Stringed(),
					new Brass(),
					new Woodwind()
			};
			tuneAll(orchestra);
		}

}

/**Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*/
