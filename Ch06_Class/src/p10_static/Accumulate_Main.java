package p10_static;

public class Accumulate_Main {

	public static void main(String[] args) {
	//객체 2개 각각 생성해서 첫번째 객체에 10, 두번째객체에 20
	//total(2개출력), grandTotal출력	
		Accumulator a = new Accumulator();
		a.accumulate(10);
		System.out.println("a.total : "+a.total);
		System.out.println("Accumulator.GrandTotal() : "+Accumulator.GrandTotal());
		
		Accumulator a1 = new Accumulator();
		a1.accumulate(20);
		System.out.println("a1.total : "+a1.total);
		System.out.println("Accumulator.GrandTotal() : "+Accumulator.GrandTotal());
		
		
	
		
	}

}
