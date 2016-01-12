// Downcasting & Runtime type information (RTTI).
// {ThrowsException}
package polymorphism;

class Useful {
	public void f() {}
	public void g() {}
}

class MoreUseful extends Useful {
	public void f() {}
	public void g() {}
	public void u() {}
	public void t() {}
	public void k() {}
}

public class RTTI {
	public static void main(String[] args) {
		try {
			Useful[] x = {
					new Useful(),
					new MoreUseful()
			};
			x[0].f();
			x[1].g();
			((MoreUseful)x[1]).k();  // Downcast/RTTI
			((MoreUseful)x[0]).k();  // Exception thrown
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

/**Output:
java.lang.ClassCastException: polymorphism.Useful cannot be cast to polymorphism.MoreUseful
at polymorphism.RTTI.main(RTTI.java:28)
*/