package study05;
//하나의 파일안에 여러개 클래스를 만드는 경우(OLld) :
//(1) public 있는 클래스가 파일이 이름이 된다.
//(2) main()이 클래스가 파일이름이 된다.
class Parent {

	int parentVar = 10;
	
	void parentMethod() {
		System.out.println("parent Method");
	}
}

class Child extends Parent {

	int childVar = 20;
	void childMethod(){
		System.out.println("child Method");
	}
}

public class ExtendsTest {

	public static void main(String[] args) {
	
		Child c = new Child();
		System.out.println("child.parentVar = " + c.parentVar);
		System.out.println("child.childVar = " + c.childVar);
		c.parentMethod();
		c.childMethod();
	}

}
