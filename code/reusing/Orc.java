package reusing;
//The protected keyword.

class Villain {
	private String name;
	protected void set(String nm) {name = nm;}
	public Villain(String name) {this.name = name;}
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}

public class Orc extends Villain{
	private int orcNumber;
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	public void change(String name, int orcNumber) {
		set(name);    // Available because it's protected
		this.orcNumber = orcNumber;
	}
	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 23);
		System.out.println(orc);
		orc.change("Jay", 56);
		System.out.println(orc);
	}

}

/**Output:
Orc 23: I'm a Villain and my name is Limburger
Orc 56: I'm a Villain and my name is Jay
*/
