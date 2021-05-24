package p01.start;

public class Start2 {
	//System.out.println(b);불가 - 반드시 메소드안에서 사용
	short b = 20;
	
	// 메인 메소드 : 프로그램 시작
	public static void main(String[] args) {

		int a = 10;
		System.out.println(a);
		
		Start2 s2 = new Start2();//주소값 : s, 참조형
		int s = s2.b;
		System.out.println(s);
		
		//System.out.println(s.add());
		s2.add();
		System.out.println(s2.add3());
		
		Start2.add2();//클래스가 다른 경우 반드시 "클래스명.메소드" 형태
		add2(); //같은 클래스안에 있는 static메소드인 경우 사용: 클래스명 생략.
		
		
		
		/*char[] c = new char[]{'a','b','c'};
		System.out.println(c[1]);*/
		char[] c = {'a','b','c'};
		//static String	copyValueOf(char[] data)
		String s1 = String.copyValueOf(c);
		System.out.println("s1::" +s1);
	}

	void add() {
		System.out.println(5 + 4);
	}
	boolean add3() {
		return false;
		//System.out.println(5 + 4);
	}

	static void add2() {
		System.out.println(4);
	}
}
