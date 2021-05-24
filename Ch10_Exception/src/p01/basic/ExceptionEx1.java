package p01.basic;
//Runtime Exception(Unchecked Exception): 컴파일 에러는 발생X, 실행시 에러발생O
//										: 개발자가 스스로 예외처리
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int num1 = 3, num2 = 0;
		try {
			int result = num1/num2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("컴퓨터는 숫자를 0으로 나눌수 없습니다.");
		}
		System.out.println("Done");
	}

}
