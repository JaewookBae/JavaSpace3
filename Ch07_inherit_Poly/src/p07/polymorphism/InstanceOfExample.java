package p07.polymorphism;
//InstanceOf 연산자::PolyMorphism 사용을 위한 형변환 가능여부 판별
public class InstanceOfExample {

	public static void method1(Parent p) {
		if (p instanceof Child) {
			Child c = (Child) p;
			System.out.println("강제형변환 가능 - PolyMorphism");
		} else {
			System.out.println("형변환 불가 - PolyMorphism");
		}
	}

	public static void method2(Parent p) {

		try {
			Child c = (Child) p;
			System.out.println("강제형변환 가능 - PolyMorphism");
		} catch (ClassCastException e) {
			System.out.println("형변환 불가:: PolyMorphism");
		} catch (Exception e) {
			System.out.println("일반적 불가:: PolyMorphism");
		}
	}

	public static void main(String[] args) {

		Parent p1 = new Child();// 부모 = 생성된 자식 : 상속관계
		method1(p1);
		method2(p1);

		Parent p2 = new Parent();// 부모 = 생성된 자식 : 상속관계
		method1(p2);
		method2(p2);
		
		System.out.println("------PolyMorphism형식으로 작성하기(instanceOf 사용제외)-----");
		Parent p3 = new Child();
		//자식클래스의 변수 = (자식) 부모 클래스 타입
		Child c3      = (Child) p3;
	}

}
