package p01.basic;
//Runtime Exception: Unchecked Exception

//예외처리 : 자식 클래스 타입을 위에 설정하고, 부모 클래스 타입을 아래에 배치
public class UnCheckedException2 {

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		try {
			int result = 10 / num;
			System.out.println("result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("어떤수를 0으로 나눌수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이므로 값이 있어야합니다.");
		} catch (NumberFormatException e) {
			System.out.println("어떤수를 0으로 나누기 위해서 숫자형식이 입력되어야합니다.");
		} catch (Exception e) {
			System.out.println("일반적인 예외입니다.");
		}
		System.out.println("Done");
	}

}
