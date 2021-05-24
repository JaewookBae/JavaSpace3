package p07.polymorphism;

//instanceof : 형변환 가능 여부 연산자
public class Emp {
//	Game b2 = new BaseBall();//상속관계에서만 가능
//	b2.type();//Promotion(자동형변환)
//	((BaseBall) b2).write();//Casting(강제형변환)

	// Parameter의 다형성
	public void taxRate(Emp e) {// e:주소값/Emp : Emp, SalesMan, Engineer Class 사용
		if (e instanceof SalesMan) {
			SalesMan s = (SalesMan) e;//Casting
			System.out.println("SalesMan 세금구하기");
		} else if (e instanceof Engineer) {
			Engineer en = (Engineer) e;
			System.out.println("Engineer 세금구하기");
		} else if (e instanceof Emp) {
			System.out.println("Emp 세금구하기");
		}
	}
}
