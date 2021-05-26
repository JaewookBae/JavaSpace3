package study10;

//계좌 잔액합계를 출력하는 Thread Class-3번반복
public class PrintThread extends Thread {

	SharedArea sa;

	public PrintThread(SharedArea sa) {
		super();
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			int sum = sa.a1.balance + sa.a2.balance;
			System.out.println("계좌 잔액 합계: " + sum);
		}
	}
}
