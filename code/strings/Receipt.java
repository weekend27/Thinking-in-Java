package strings;

import java.util.Formatter;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle() {
		f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
		f.format("%-15s %5s %10s\n", "----", "---", "-----");
	}
	public void print(String name, int qty, double price) {
		f.format("%-15.15s %5d %10.2f\n", name, qty, price);
		total += price;
	}
	public void printTotal() {
		f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
		f.format("%-15s %5s %10s\n", "", "", "-----");
		f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Princess Peas", 6, 9.64);
		receipt.print("Lovely cookie", 2, 13.2);
		receipt.print("Turtle milk", 1, 8.796);
		receipt.printTotal();
	}

}

/**Output:
Item              Qty      Price
----              ---      -----
Princess Peas       6       9.64
Lovely cookie       2      13.20
Turtle milk         1       8.80
Tax                         1.90
                           -----
Total                      33.53
*/