package p04.binary;

public class LogicalOperatorEx1 {

	public static void main(String[] args) {
		
		int charcode = 'A'; // 자동형변환
		System.out.println(charcode); // 65
		
		if(charcode >= 65 & charcode <= 90)
			System.out.println("대문자 입니다.");
		if(charcode >= 97 & charcode <= 122)
			System.out.println("소문자 입니다.");
		if(charcode >= 48 & charcode <= 57)
			System.out.println("0~9 입니다.");
		
		int value =6;
		if((value % 2 == 0)|(value % 3 ==0))
			System.out.println("2,3배수 입니다.");
		
		//"||" : 속도가 빠르다.
		if((value % 2 == 0)||(value % 3 ==0))
			System.out.println("2,3배수 입니다.");

	}

}
