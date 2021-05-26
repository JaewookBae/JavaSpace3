package p04.inherit_overriding;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return super.areaCircle(r);
	}
}
