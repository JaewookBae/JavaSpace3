package p05.poly.field;

public class Car {
	// String str2 = new String();//자기자신 객체생성 가능
	// String str = new Car(); 동등한 형제관계 객체생성 불가

	// Interface의 필드 다형성
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
