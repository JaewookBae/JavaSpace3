package study01;
//변수 종류 테스트
public class Variablekind {
		
		//인스턴스 멤버 변수 - 객체생성이 되어야만 사용가능,RAM(X)
		int memVar;//0
		
		//static 멤버 변수 : 공용변수(공유,정적),RAM(O)
		static int staticVar;//0 20
		
	public static void main(String[] args) {
		
		int localVar = 0;//지역(로컬)변수, 반드시 초기화
		
		Variablekind vk1 = new Variablekind();
		
		System.out.println("vk1.memVar = " + vk1.memVar);

		vk1.memVar = 100;
		System.out.println("vk1.memVar = " + vk1.memVar);//
		//System.out.println("vk1.staticVar = " + vk1.staticVar);
		System.out.println("vk1 Variablkind.staticVar = " + Variablekind.staticVar);//0
		System.out.println("vk1 staticVar = " + staticVar);//같은클래스인 경우 "클래스명"생략
		
		
		Variablekind vk2 = new Variablekind();
		
		vk2.staticVar = 20;
		
		System.out.println("vk2.memVar = " + vk2.memVar);//0
		vk2.memVar = 300;
		System.out.println("vk1.memVar = " + vk1.memVar);//0
		System.out.println("vk2.memVar = " + vk2.memVar);//300
		System.out.println("vk2.staticVar = " + vk2.staticVar);
		//System.out.println("localVar = " + localVar);
	
		System.out.println("----------------------------------");
		System.out.println(localVar);
		System.out.println(vk1.memVar);
		System.out.println(staticVar);
		System.out.println(vk1.staticVar);
		System.out.println(vk2.staticVar);
		
		
	}

}
