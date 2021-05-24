package p07.polymorphism;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

//부모(큰), 자식(작은)타입
public class PromotionExample {

	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;//Promtion(자동형변환)
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
//		B b2 = e;//상속관계가 아닌, 형식관계는 다형성 불가
		B b3 = (B) a1;//Casting(강제형변환)
	}

}
