package study01;

//자바 대소문자 구분
//class
public class AirCon {

	int a = 10;
	// 1. 변수 정의
	String company;
	String color;
	int price;
	int size;
	int temp;

	// 2. 메소드 정의
	void powerOn() {
		System.out.println("power on");
	}

	void powerOff() {
		System.out.println("power off");
	}

	void tempUp() {
		temp++;
	}

	void tempDown() {
		temp--;
	}
	//getter(): 저장된 데이터 가져오기
	public String getColor() {
		return color;
	}
	//setter(): 데이터 저장하기
	public void setColor(String color) {
		//this : 현재클래스
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
	//3. 생성자
	//4. 초기화 블럭
}
