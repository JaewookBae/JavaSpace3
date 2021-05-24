package study08;

public class NestedClassEx01 {

	public static void main(String[] args) {
		
		PiggyBank bank1 = new PiggyBank();
		bank1.slot.put(0);
		System.out.println("첫번째 저금통: " + bank1.total);
		PiggyBank bank2 = new PiggyBank();
		bank2.slot.put(100);
		System.out.println("두번째 저금통: " + bank2.total);		
		PiggyBank bank3 = new PiggyBank();
		bank3.slot.put(0);
		System.out.println("세번째 저금통: " + bank3.total);
	}

}
