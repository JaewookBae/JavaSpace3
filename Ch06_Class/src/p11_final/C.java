package p11_final;
//변수 앞에 final: 고정상수(값 변경 불가)
public class C {

	public static final int NUM = 100;// 고정상수: 한번 입력값은 프로그램 종료시까지 유지(변경불가)

	public static void main(String[] args) {
		final double pi = 3.141592;
		System.out.println(NUM);
//		NUM = 200; 값을 변경 불가
//		pi = 5.5; 변경불가
	}
}
