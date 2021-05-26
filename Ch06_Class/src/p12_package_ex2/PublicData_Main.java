package p12_package_ex2;

import p12_package_ex1.PublicData;
//public: 다른 패키지에 접근 가능
//		    클래스,변수,생성자,메소드에서 앞에서 사용
public class PublicData_Main {

	public static void main(String[] args) {
		
		PublicData pd = new PublicData();
		System.out.println(pd.publicVar);
		pd.add();

	}

}
