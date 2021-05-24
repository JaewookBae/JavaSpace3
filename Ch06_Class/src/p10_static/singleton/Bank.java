package p10_static.singleton;
//private: 클래스내에서만 사용되는 제어자
//public: 모든 패키지에서 사용가능
//Singleton: 클래스내에서 생성된 객체를 메소드에서 호출해서 사용하는 형태
//           (생성된 객체 주소값 반복적 호출)
public class Bank {

	String name;

	private static Bank b = new Bank("국민은행");//한번의 객체 생성
	
	//파라미터 생성자
	private Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	//일반 static메소드
	public static Bank getBank() {
		
		return b;		
	}
}
