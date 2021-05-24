package p06.array;

public class Person {

	String name;//30 31 32
	int age;//홍길동0 홍길동1 홍길동2
	public Person(int age, String name) {
		super();//부모의 기본생성자
		this.name = name;
		this.age = age;
	}
	public Person() {
		
	}
	@Override   //---------5------------
	public String toString() {
		return name + " : " + age;
	}
	
	

	}
	

