package p01.start;

// CPU - 메모리(RAM+ROM) - SSD
// 6MB       8GB        1000GB

//Class : 자동차 공장의 설계도, 벽돌 공장의 벽돌을 만드는 틀
public class Start {
	//메인메소드 : 프로그램의 시작
	public static void main(String[] args) {
		//참조(Reference) 변수 : RAM안에서 복사된 클래스가 있는 주소값
		Start s = new Start();//객체생성 - CPU에서 사용하기 위해서 RAM에 위치시키는 것
		System.out.println(s.b);
		System.out.println(a);
		System.out.println(s);
		
		//int c = 10,20,30,40;
		//Array
		int[] d = new int[] {10,20,30,40};
		System.out.println("Array: "+d[0]);
		
		String str = new String("abcd");
		
		System.out.println(str.charAt(0));//index = 0,1,2,3...
		System.out.println(str.charAt(1));//index = 0,1,2,3...
		
	}

	// 1. 변수
	// datatype 변수 = 리터럴
	// static : RAM
	//primitive 변수 : 실제값 저장
	static int a = 10;//static변수
	//RAM에 위치시키기 위해서 객체생성     
	double b = 10.1;//instence변수

	// 2. 메소드(함수)
	void abc() {
		System.out.println("abc");
	}

	// 3. 생성자
	public Start() {
	}

	// 4. 초기화 블럭
	static {
	}

}
