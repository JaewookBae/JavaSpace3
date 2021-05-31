package exercise;

import java.util.function.IntSupplier;

//Supplier : 매개값은 없고, 리턴값은 있을때 사용
public class LambdaEx4 {

	public static void main(String[] args) {

		System.out.println(method(3, 5));

	}

	public static int method(int x, int y) {// x,y : Parameter변수, Local변수(초기값)

//		IntSupplier is = new IntSupplier() {
//
//			@Override
//			public int getAsInt() {
//				// x = x*10; //x=x*10;
//				int result = x + y;
//				return result;
//			}
//		};
		
		IntSupplier is = () -> {
				int result = x + y;
				return result;
		};
		int result = is.getAsInt();//getAsInt() 안에 있는 return
		return result; //method()리턴값
	}
}
