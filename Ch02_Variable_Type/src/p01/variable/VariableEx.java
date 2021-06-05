package p01.variable;

//자바는 대소문자를 구분해서 사용하는 언어
//Variable(변수) : 하나의 값을 지정할수 있는 메모리(RAM)
//				    선언된 범위 안에서만 사용.

//null : unknown (알수없는 어떤 값 : 0도아닌, 빈문자열도 아님)

public class VariableEx {
	//전역(field)변수 - 초기화 불필요
	//Instance 변수 - 객체를 생성해야 사용할수 있는 변수
	int a ; //기본값(0) 저장됨
	boolean b; //false가 들어있음
	float c; //
	
	int result;
	//int while;예약어는 사용불가
	
	//Static(정적) 변수 - "클래스명.변수" 형태로 사용
	public static void main(String[] args) {
		
		String str = null; //default
		
		//primitive type variable : 실제값
		int value = 10;//초기화 된 것
		//Reference type variable : 주소값
		String s = new String("홍길동");
		
		//local variable(지역) : 메소드 안에서 선언된 변수, 반드시 초기화 - 시작할때 값이 있어야 한다.
		VariableEx v = new VariableEx();
		v.result = value + 10;
		
		
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.c);
		
		int r2 = v.add(5.0, 4.1f);//Argument(인수)
		System.out.println(r2);
		System.out.println(v.r);
		
		str = new String("abcd");
		System.out.println(str.toUpperCase());
	}
	
	int r = a + result;
	
	//Parameter 변수 : double a, float b
	//local 변수
	int add(double a, float b) { //5.0, 4.1f
		double result = a+b; //9.1
		return (int) result; //강제 형변환(casting)
	}
}
