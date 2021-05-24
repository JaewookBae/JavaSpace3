package study05;

class Sawon2 {

	String name;
	String dept;
	int salary;

	public Sawon2(String name, String dept, int salary) {

		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {

		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " + salary;
	}
}

class Sales2 extends Sawon2 {

	int commition;

	// 생성자
	public Sales2(String name, String dept, int salary, int commition) {

		super(name, dept, salary);
		this.commition = commition;
	}

	@Override
	String displayInfo() {

		return super.displayInfo() + ", 수당 : " + commition;
	}
}

public class SeperConstructorTest {

	public static void main(String[] args) {

		Sales2 s = new Sales2("홍길동", "영업부", 1000000, 100000);
		System.out.println(s.displayInfo());
	}
}
