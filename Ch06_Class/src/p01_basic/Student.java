package p01_basic;

//Class : 틀(자동차 설계도) 
//Class 만들어진 결과: 객체
//만들어진 하나하나: 인스턴스
public class Student {

	//1. field: 속성, 변수
	String name;
	int age;
	
	
	//2. Constructor Overloading
	public Student(String name, int age) {
		 this.name = name;
		 this.age = age;
	}
	//2. 
	public Student() {

	}
	//3.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	//method: 동작, 기능
	int add(int a, int b) {
		
		int result = a + b;
		System.out.println(name+" : "+age);
		return result;
	}


}
