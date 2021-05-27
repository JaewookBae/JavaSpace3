package p01.lambda_basic;

//Lambda Expression : 익명구현객체를 간단히 표현, "->"
//Lambda Expression 조건 : (1) 인터페이스
//						 (2) 추상메소드가 하나인 인터페이스
//						 (3) 인터페이스 위에 @FunctionalInterface 쓰여 있으면 가능
//						 (예) @FunctionalInterface
//								public interface Runnable
@FunctionalInterface// : Lambda식에 가능한 인터페이스 
public interface MyInterface {

	// 1. 고정 상수
	static final int A = 100;

	// 2. 추상메소드
	void add();
	//void div();
	
	// 3. default()
	default int sub() {
		return 0;
	}

	// 4. static()
	static int mul() {
		return 0;
	}
}
