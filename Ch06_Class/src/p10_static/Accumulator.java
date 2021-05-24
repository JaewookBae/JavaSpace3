package p10_static;

public class Accumulator {
	int total;
	static int grandTotal;
	
	void accumulate(int amount) {//10 20
		total += amount;//10 20
		grandTotal += amount;//10 + 20
	}
	
	static int GrandTotal() {
		return grandTotal;
	}
}
