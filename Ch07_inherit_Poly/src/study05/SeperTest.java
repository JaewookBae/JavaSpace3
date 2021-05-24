package study05;

class Sales extends Sawon {

	int commition;
	@Override
	String displayInfo() {
	
		return super.displayInfo() + ", 수당 : " + commition;
		}
}

public class SeperTest {

	public static void main(String[] args) {
		
		Sales s = new Sales();
		System.out.println(s.displayInfo());
	}
}

class Sawon {
	
	String name;
	String dept;
	int salary;
	
	String displayInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 연봉 : " +
				salary;	
	}
}
