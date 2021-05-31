package exercise;

import java.util.function.IntBinaryOperator;

//Operator: 매개값(연산), 리턴(결과)이 있음
public class LambdaEx5 {

	private static int[] scores = { new Integer(10), new Integer(50), 3 };

	public static int maxOrMin(IntBinaryOperator op) {
		int result = scores[0];// 10
		for (int score : scores)// 10, 50, 3
			result = op.applyAsInt(result, score);// (10,10),(10,50),(50,3)...
		return result;
	}

	public static void main(String[] args) {

//		IntBinaryOperator op = new IntBinaryOperator() {
//
//			@Override
//			public int applyAsInt(int a, int b) { // 최대값
//				if (a >= b)
//					return a;
//				else
//					return b;
//				return 0;
//			}
//		};
//		op.applyAsInt(left, right);

		int max = maxOrMin((a, b) -> {// 최대값
			if (a >= b) return a;
			else return b;

		});
		System.out.println(max);
		int min = maxOrMin((a, b) -> {// 최소값
			if (a >= b) return b;
			else return a;
			
		});
		System.out.println(min);
	}

}
