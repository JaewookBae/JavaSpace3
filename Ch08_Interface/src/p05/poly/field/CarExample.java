package p05.poly.field;

public class CarExample {

	public static void main(String[] args) {
	
		Car c = new Car();
		c.run();
		c.frontLeftTire= new KumhoTire();
		c.frontRightTire= new KumhoTire();
		c.run();

	}

}
