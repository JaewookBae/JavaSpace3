package p03.functional_interface;

public class MyInterface_Main {

	public static void main(String[] args) {

		// 1. 구현객체
		MyInterface_impl mi = new MyInterface_impl();
		mi.calculate(3, 4);

		// 2. 익명구현객체
		MyInterface m1 = new MyInterface() {

			@Override
			public void calculate(int x, int y) {
				int result = x * y;
				System.out.println(result);
			}
		};
		m1.calculate(3, 4);
		
		// 3. Lambda Expression
		MyInterface m2 = (x, y) -> {
			int result = x * y;
				System.out.println(result);
			
		};
		m2.calculate(3, 4);
		
		// 4. Lambda Expression : return 표현
		MYInterface2 m3 = (x, y) -> {
				return x * y;
		};
		m3.calculate(5, 6);
	}

}
