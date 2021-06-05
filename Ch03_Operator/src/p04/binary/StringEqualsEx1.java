package p04.binary;

public class StringEqualsEx1 {
	// "==" : 숫자 비교시 사용
	// equalsl() : 문자열 비교, 객체 비교시 사용
	// 모든 클래스의 부모 클래스인 object Class안에 있는 메소드, 모든클래스가 자동으로 상속받아 사용
	public static void main(String[] args) {
		// 제조사에서 만든 클래스
		String str1 = "홍길동";// 생성된 객체가 있으면 연결해서 사용
		String str2 = "홍길동";
		String str3 = new String("홍길동");// 객체생성
		String str4 = new String("홍길동");

		System.out.println(str1); // 주소값 => 생성자값 : 제조사 개발자 프로그램 변경
		System.out.println(str1.toString()); // 주소값 => 생성자값 : 제조사 개발자 프로그램 변경

		Hello h = new Hello("홍길동");// 우리가 만든 클래스
		System.out.println(h);
		System.out.println(h.toString());
		System.out.println("---------------------");
		System.out.println(str1 == str2);// true
		System.out.println(str1 == str3);// false
		System.out.println();

		System.out.println(str1.equals(str2));// true
		System.out.println(str1.equals(str3));// true

	}

}
