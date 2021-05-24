package study08;

import study08.PiggyBank.Slot;

public class NestedClassEx02 {

	public static void main(String[] args) {
		
		PiggyBank bank1 = new PiggyBank();
		PiggyBank bank2 = new PiggyBank();
		
		PiggyBank.Slot temp = bank1.slot;
		bank1.slot = bank2.slot;
		bank2.slot = temp;
		
		bank1.slot.put(10000);
		bank2.slot.put(10);
		System.out.println("첫번째 저금통: " + bank1.total);		
		System.out.println("두번째 저금통: " + bank2.total);		

	}

}
