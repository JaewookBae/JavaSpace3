package exercise;

public class IntegerCompareExample {

	public static void main(String[] args) {

		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;

		// 조건 사용("=="): byte,int,short 타입의 값의 범위: -128~127
		System.out.println(obj1 == obj2);// true
		System.out.println(obj3 == obj4);// false
		// 사용
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));

		// 이유 : int 값이 -128~127 사이라면 내부의 값을 비교 가능하지만
		// 범위를 벗어나면 객체의 번지를 비교하기 때문이다.
	}
}
