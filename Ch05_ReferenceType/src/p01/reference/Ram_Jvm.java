package p01.reference;
//JVM에서 RAM 영역 나누기
//(1)Stack 영역 : 변수 저장
//(2)Heap 영역 : 생성 객체 저장
//(3)Method 영역 : 공유(static)
public class Ram_Jvm {

	static int a = 10; //메소드영역
	int b;//stack 영역
	public static void main(String[] args) {
	
		Point p = new Point();//Heap 영역
		
		String st1 = new String("객체1");
		String st2 = new String("객체2");
		String st3 = st2;
		String st4 = null;
		
		
		
	}

}
