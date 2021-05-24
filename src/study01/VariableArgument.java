package study01;

public class VariableArgument {
	
	void printInfo(String...infos) {//Parameter:infos
		if(infos.length !=0) {
			for (int i = 0; i < infos.length; i++) {//0~9
				System.out.println(infos[i]);
			}			
		}else {
			System.out.println("인자가 없네요.");
		}
	}
	//Method Overloading: 같은이름을 가진 메소드로 파라미터의 타입의 갯수, 순서가 각각 다른것
	//void printInfo(){
	//System.out.println("()");
	//}
	//
	// void printInfo(String str1){
	//System.out.println(str1);
	//}
	
	//void printInfo(String str2, String str1){
	//
	//}
	//일반메소드: 인스턴스 메소드	
	void printInfo(String str1, String str2, String str3) {
			System.out.println(str1 + " : " + str2 + " : " +str3);
		}
	
	
	//static메소드: 프로그램 시작
	public static void main(String[] args) {
		
		VariableArgument vt = new VariableArgument();
		}

}
