package study05;

class Super {

	int x = 90;
	void superMethod() {
		System.out.println("super Method");
	}
}

class Sub extends Super {
//상속: 하나의 클래스를 부모로 놓고, 부모가 가진 변수, 메소드를 그대로 사용하든가,재정의해서 사용.
	int y = 10;
	void subMethod() {
		System.out.println("sub method");
	}
}

class Subsub extends Sub {

	int z = 20;
	void subSubMethod() {
		System.out.println("subSub method");
	}
}

public class ExtendsTest2 {

	public static void main(String[] args) {
		
		Subsub ss = new Subsub();
		System.out.println("ss.x = " + ss.x);
		System.out.println("ss.y = " + ss.y);
		System.out.println("ss.z = " + ss.z);
		ss.superMethod();
		ss.subMethod();
		ss.subSubMethod();
	}

}
