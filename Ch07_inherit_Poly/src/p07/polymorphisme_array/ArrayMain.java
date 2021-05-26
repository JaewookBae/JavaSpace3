package p07.polymorphisme_array;

public class ArrayMain {

	public static void main(String[] args) {
	
		ArrayMethod[] am = new ArrayMethod[2];
		am[0] = new ArrayMethodInheritA();
		am[1] = new ArrayMethodInheritB();
		
		for(int i=0; i < am.length; i++)
			am[i].showSleepStyle();
		
	}

}
