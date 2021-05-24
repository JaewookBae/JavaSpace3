package p07.polymorphism;

public class Employee_Main {

	public static void main(String[] args) {
		//Polymorphism 사용전 방법
		Manager m = new Manager("홍길동", 4500);

		//Poly 사용 방법
		Employee e1 = new Manager("홍길동2", 4000);
		Employee m1 = new Manager("홍길동2", 4000,"개발부");
		System.out.println(e1.getEmployee());
		System.out.println(m1.getEmployee());
	}

}
