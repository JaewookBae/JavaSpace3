package p08_method;

public class Computer {

	int sum1(int[] values) {

		System.out.println();
		return 0;//리턴은 함수에서 마지막에 와야한다.
	}

	int sum2(int... values) {

		return 0;
	}
	
	int sum(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum0(int... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
