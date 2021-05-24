package p07.polymorphisme.casting;
//p.326
public class ChildExample {

	public static void main(String[] args) {
		Parent p1 = new Parent();//자식이란 개념 없음
		
		Parent p2 = new Child();
		p2.method1();
		p2.method2();
		((Child) p2).method3();//Casting

		Parent p3 = new Child();
		Child c3 = (Child) p3;
		c3.method1();
		c3.method2();
		c3.method3();

	}

}
