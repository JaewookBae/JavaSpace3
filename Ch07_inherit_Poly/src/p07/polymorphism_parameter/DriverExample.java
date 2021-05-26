package p07.polymorphism_parameter;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		d.drive(b);
		d.drive(t);

	}

}
