package p01_basic;

public class StudentMain {

	public static void main(String[] args) {
		
		//저장/출력1 - 변수 : 홍길동1, 10
		Student s1 = new Student();
		s1.name = "홍길동1";
		s1.age = 10;
		System.out.println("출력1 : "+s1.name);
		System.out.println("출력1 : "+s1.age);
		
		//저장/출력2 - 생성자 : 홍길동2, 20
		Student s2 = new Student("홍길동2",20);
		System.out.println("출력2 : "+s2.name);
		System.out.println("출력2 : "+s2.age);
		
		//저장/출력3 - getter()/setter() : 홍길동3, 30
		Student s3 = new Student();
		s3.setName("홍길동3");
		s3.setAge(30);
		System.out.println("출력3 : "+s3.getName());
		System.out.println("출력3 : "+s3.getAge());
		
		//메소드: 더하기 연산(5,6) 합계 출력
		Student s4 = new Student("알파고",6);
		int result = s4.add(5, 6);
		System.out.println("더하기연산 : "+ result);
	}

}
