package study02;

public class OperationTest6 {
//비트 연산자 테스트
	public static void main(String[] args) {
	
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		
	/*	비트로 변경
		8 : 00000000 00000000 00000000 00001000
		3 : 00000000 00000000 00000000 00000011 */
		
		//&
		result = x & y;
		System.out.println("x & y = " + result);
		bResult = true & false;
		System.out.println("x & y = " + bResult);
		
		//|
		result = x | y;
		System.out.println("x | y = " + result);
		bResult = true | false;
		System.out.println("x | y = " + bResult);

		//^
		result = x ^ y;
		System.out.println("x ^ y = " + result);
		bResult = true ^ false;
		System.out.println("x ^ y = " + bResult);

	}

}
