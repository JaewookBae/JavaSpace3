package exercise;

import exercise.Car.Tire;

public class NestedClassExample {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		Car.Tire tire = mycar.new Tire();
		Car.Engine engine = new Car.Engine();

	}

}
