package p01.start;
//Class : 틀

//CPU - RAM - SSD
public class Start4 {
	//main() : 프로그램 시작
	public static void main(String[] args) {
		System.out.println("2. main : 메인 실행");
		
		Start4 s = new Start4();
		
		
		System.out.println(s.a);
		System.out.println(Start4.b);//b
		s.mul();
		Start4.mul2();//mul2();
		
}
	//1. 변수
	int a = 10; //SSD에 위치 => RAM : 객체생성
	static double b = 20; //RAM에 위치
	//2. 메소드
	void mul() {
		System.out.println("mul");
	}
	static void mul2() {
		System.out.println("mul2");
	}
	
	//3.생성자 : 객체 생성시 초기값 저장
	public Start4() {
		System.out.println("4.기본 생성자 : 객체생성");
	}
	
	//4. 초기화 블럭 : 실행시 가장 먼저 실행
	{
		System.out.println("3.인스턴스 초기화 블럭 : 객체생성시 마다 먼저 실행");
	}
	static {
		System.out.println("1.static 초기화 블럭 : 객체생성과 관계없이 가장먼저 실행");
	}
	

}
