package p01.inherit.basic;
//상속대상: 변수, 메소드
//상속대상에서 제외: constructor(생성자), 초기화블럭, private
public class Child_Main {

	public static void main(String[] args) {
		//자식 클래스(부모클래스가있음)
		Child c1 = new Child();
		System.out.println(c1.pv);
		c1.pMethod();//Overriding
		System.out.println(c1.cv);
		c1.cMethod();
		
		//일반 클래스
		Parent p = new Parent();
		System.out.println(p.pv);
		p.pMethod();
	}

}
