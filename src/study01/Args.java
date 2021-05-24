package study01;

public class Args {

	int x;// 100 140

	// Method Overloading
	// add(int x)에서: parameter, local 변수
	void add(int x) {
		x = x + 50;
		// System.out.println(x);
	}

	void add(Args arg) {
		arg.x = arg.x + 40;
	}

	void add(int[] arr) {
		arr[0]++;
		// System.out.println("method[]: " + );
		// ++arr[0];
	}
	//일반 메소드
	void addNew(Args arg) {
		arg = new Args();
	}
}
