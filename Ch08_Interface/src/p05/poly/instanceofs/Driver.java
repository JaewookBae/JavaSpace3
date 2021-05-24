package p05.poly.instanceofs;

public class Driver {
	
	//Interface 다형성: Parameter의 다형성
	//instanceof: PolyMorphism에서 형변환 가능 여부
	public void drive(Vehicle v) {//Parameter: Vehicle,Bus,Taxi
		if(v instanceof Bus) {
			Bus b = (Bus) v;//casting
			b.checkFare();
		}
		System.out.println("---------");
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
