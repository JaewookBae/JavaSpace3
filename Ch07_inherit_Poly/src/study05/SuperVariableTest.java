package study05;

class Sawon3 {
	
	String name = "홍길동";
}

class Sales3 extends Sawon3 {
	
	String name = "AlphaGo";
	String displayInfoLocal() {
		String name = "hong";
		return name;
	}
}

public class SuperVariableTest {

	public static void main(String[] args) {
		
		Sales3 s = new Sales3();
		System.out.println(s.name);
		System.out.println(s.displayInfoLocal());
	}
}
