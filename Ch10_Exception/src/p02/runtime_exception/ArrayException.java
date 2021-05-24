package p02.runtime_exception;

public class ArrayException {

	public static void main(String[] args) {

		int arr[] = { 5, 4, 3, 2, 1, 0 };
		for (int i = 0; i < 10; i++) {
			try {
				int result = 100 / arr[i];
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못된 Index입니다.");
			} catch (Exception e) {
				System.out.println("일반적인 예외");
			}
			System.out.println("Done");
		}

	}
}