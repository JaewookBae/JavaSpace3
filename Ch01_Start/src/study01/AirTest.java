package study01;

//Class 파일로 가능: (1) public class
//               (2) main()가 있는 클래스 
public class AirTest {

	public static void main(String[] args) {
		//1. 변수에 직접 저장
		Air Air0 = new Air();
		Air0.name="홍길동1";
		System.out.println(Air0.name);
		
		// 2. setter()를 통한 저장
		Air Air1 = new Air();
		
		Air1.setName("홍길동2");
		System.out.println(Air1.getName());

		String result = Air1.getName();
		System.out.println(result);

		//3. 생성자를 통한 데이터 저장
		Air Air2 = new Air("홍길동3");
		System.out.println(Air2.name);
		System.out.println(Air2.getName());
	}

}
