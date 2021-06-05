package study02;

public class OperationTest7 {
//시프트 연산자 테스트
	public static void main(String[] args) {
		
		int x = 3;
		int result = 0;
		
		// <<
		result = x<<2;
		System.out.println("x << 2 = " + result);
		
		// >>
		x = -1;
		result = x>>1;
		System.out.println("x >> 1 = " + result);
		
		// >>>
		result = x>>>1;
		System.out.println("x >>> 1 = " + result);
	}

}
