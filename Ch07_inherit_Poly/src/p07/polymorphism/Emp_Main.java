package p07.polymorphism;

public class Emp_Main {

	public static void main(String[] args) {

		//메모리에 3개가 동시에 존재
		Emp ep = new Emp();
		SalesMan sa = new SalesMan();
		Engineer en = new Engineer();

		// Parameter의 다형성
		// Field의 다형성
		ep.taxRate(ep);
		sa.taxRate(sa);
		en.taxRate(en);

		//PolyMorphism: 하나의 부모 타입으로 생성된 여러 자식객체를 가리키는 것
		//메모리에 1개 존재
		//Field(변수)의 다형성		
		Emp emp = null;
		emp = new Emp();
		emp.taxRate(emp);
		emp = new SalesMan();
		emp.taxRate(emp);
		emp = new Engineer();
		emp.taxRate(emp);

	}

}
