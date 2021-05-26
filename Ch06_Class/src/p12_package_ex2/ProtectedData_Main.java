package p12_package_ex2;

import p12_package_ex1.ProtectedData;
//Protected : 하나의 패키지 안에서 접근 가능
//          : 패키지 다른 경우는 상속관계 설정에서 사용가능
//		             변수,생성자,메소드에서 앞에서 사용
public class ProtectedData_Main extends ProtectedData{

	void sub() {
		System.out.println(publicVar);
	}
	
	public static void main(String[] args) {
			
		ProtectedData_Main pd = new ProtectedData_Main();
		System.out.println(pd.publicVar);
		pd.sub();
		pd.add();

	}

}
