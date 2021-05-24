package p07_constructor;

public class Motor {

	String color,gearType;
	int door;

	//생성자: 클래스 이름 사용,return 없음, 객체생성시 초기값 저장 용도 
	//최초의 기본생성자 : 컴파일러에 의해서 자동으로 만들어짐, 
	//              그러나 파라미터가 있는 생상자가 만들어지면 반드시 기본생성자 개발자 만들기
	
	//Constructor Overloading: 파라미터의 갯수,순서,타입 각각 다른 생성자 모임
	//기본생성자
	public Motor() {
	
	}
	//파라미터 생성자
	public Motor(String color) {
		this.color = color;
	}
//	위와같은 타입(String)이므로 에러 발생
//	public Motor(String c) {
//		this.color = color;
//	}
	public Motor(int c) {
		this.door = c;
	}

	public Motor(String color, String gearType) {
		this(color);//현재 다른 생성자 호출, 생성자 호출은 반드시 첫줄에 작성
		//this.color = color;
		this.gearType = gearType;
	}

	public Motor(String color, String gearType, int door) {
		this(color, gearType);//현재클래스의 다른생성자 호출
//		this() 현재 클래스의 기본생성자 호출
//		this.color = color;
//		this.gearType = gearType;
		this.door = door;
	}
	
	//일반 메소드: 반환형타입, return타입
	public int motor() {
		return 100;
	}	
}
