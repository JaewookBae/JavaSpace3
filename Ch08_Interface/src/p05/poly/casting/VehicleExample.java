package p05.poly.casting;

public class VehicleExample {

	public static void main(String[] args) {

		//1.OLD
		Bus b = new Bus();
		b.run();
		b.checkFare();

		//2.NEW:PolyMorphism
		Vehicle v = new Bus();
		v.run();
		((Bus) v).checkFare();//Casting

		//3.NEW:PolyMorphism2
		Vehicle v2 = new Bus();
		Bus b2 = (Bus) v2;
		b2.run();
		b2.checkFare();//Casting
	}

}
