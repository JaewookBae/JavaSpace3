package p08_method;

public class AMain {
	
	public static void main(String[] args) {
		System.out.println(A.sv);
		A a = new A();
		System.out.println(a.iv);
		
		A.stMethod();	
		//System.out.println(a.stMethod(100,200));
		int r2 = a.stMethod(100,200);
		System.out.println(r2);
		System.out.println("---------");
		
		a.itMethod();
//		System.out.println(a.itMethod());//불가
		a.itMethod("배", 7);
	}

}
