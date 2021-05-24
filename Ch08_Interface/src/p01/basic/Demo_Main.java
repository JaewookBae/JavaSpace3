package p01.basic;

public class Demo_Main {

	public static void main(String[] args) {
		// 1. 기존의 객체 생성 방식
		DemoImpl d = new DemoImpl();
		d.print();
		d.write();

		// 2. PolyMorphism 방식
		ADemo a = new DemoImpl();
		a.write();
		((DemoImpl) a).print();

		BDemo b = new DemoImpl();
		((DemoImpl) b).write();
		b.print();

		// 3. 익명 구현 객체
		ADemo a2 = new ADemo() {

			@Override
			public void write() {
				System.out.println("Anonymous write()");
			}

			// 사용불가
			public void print() {
				System.out.println("print()");
			}
		};
		a2.write();
		// (() a2).print(); 사용불가
	}
}
