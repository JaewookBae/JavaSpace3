package p05.try_with_resources;

public class TryWithResourcesExample {

	public static void main(String[] args) {

		//
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();// 강제적으로 예외발생
		} catch (Exception e) {
			System.out.println("예외처리 코드가 실행 되었습니다.");
		}
	}

}
