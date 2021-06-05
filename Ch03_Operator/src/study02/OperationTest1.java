package study02;

public class OperationTest1 {
//산술 연산자 테스트
	public static void main(String[] args) {
		
		int result = 0;
		//main()에서 입력 받아서 처리하기
		//int var_int1 = 10;
		//int var_int2 = 2;

		//메인 스트링안에 입력된값 입력하기 : 패키지 익스플로어에서 run as - configure- argument 배열 순서대로 값입력후 띄어쓰기
		int var_int1 = Integer.parseInt(args[0]);
		int var_int2 = Integer.parseInt(args[1]);
		
		
		

		result = var_int1 + var_int2;
		System.out.println("var_int1 + var_int2 = " + result);
		result  = var_int1 - var_int2;
		System.out.println("var_int1 - var_int2 = " + result);
		System.out.println("var_int1 * var_int2 = " + var_int1 * var_int2);
		System.out.println("var_int1 / var_int2 = " + var_int1 / var_int2);
		System.out.println("var_int1 % var_int2 = " + var_int1 % var_int2);

	}

}
