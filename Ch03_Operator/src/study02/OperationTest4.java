package study02;

public class OperationTest4 {
//논리 연산자 테스트
	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		boolean result = false;
		
		
		System.out.println("x < y && y >=200 = " + (x < y && y >=200));
		System.out.println("x < y && y <200 = " + (x < y && y <200));
		System.out.println("x > y && y++ >200 = " + (x > y && y++ >200));
		System.out.println("y = " + y);
		System.out.println("x < y || y >=200 = " + (x < y || y >=200));
		System.out.println("x < y || y <200 = " + (x < y || y <200));
		System.out.println("x > y || y++ >200 = " + (x > y || y++ >200));
		System.out.println("y = " + y);
		System.out.println("x < y || y++ >200 = " + (x < y || y++ >200));
		System.out.println("y = " + y);
		System.out.println("!(x>y) = " + !(x>y));
		
	}

}
