package p05.api;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
//Consumer Interface : @FunctionalInterface
//					   accept(T t) : Parameter t는 함수 내부에서 연산만, return값이 없다.
	public static void main(String[] args) {

		// 1. Consumer 익명구현 객체
		Consumer<Integer> ci = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t + 10);
			}
		};
		ci.accept(20);

		// 2. Lambda Expression : Consumer 익명구현객체를 간단한 표현
		Consumer<Integer> ci2 = t -> System.out.println(t + 10);
		ci2.accept(20);
		
		//(10,20) : 합계연산 출력
		// 1. 익명구현객체
		BiConsumer<Integer, Integer> c1 = new BiConsumer<Integer, Integer>() {

			@Override
			public void accept(Integer t, Integer u) {
				int sum = t + u;
				System.out.println(sum);
			}
		};
		c1.accept(10, 20);

		//2. Lambda Expression
		BiConsumer<Integer, Integer> c2 = (t, u) -> System.out.println(t + u);
		c2.accept(10, 20);
	
		//ObjectIntConsumer : "java", 8
		ObjIntConsumer<String> c3 = new ObjIntConsumer<String>() {

			@Override
			public void accept(String t, int value) {
				System.out.println(t + value);
			}
		};
		c3.accept("java", 8);
	}

}
