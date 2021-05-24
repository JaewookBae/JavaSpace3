package p05.poly.parameter;

public class Driver {
	
	//Interface 다형성: Parameter의 다형성
	public void drive(Vehicle v) {//Parameter: Vehicle,Bus,Taxi
		v.run();
	}
	
	//Parameter: 불합리 =>  PolyMorphism
	public void drive2(Bus b) {
		b.run();
	}
	public void drive3(Taxi t) {
		t.run();
	}
}
