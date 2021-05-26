package study10.synchronize_method;

//공유영역
public class SharedArea {
	// 그냥 선언에 불과하다 - 객체로 생성하는것x
	Account a1;
	Account a2;

	synchronized void transfer(int amount) {
		a1.withdraw(1000000);
		System.out.print("알파고 계좌: 100만원 인출, ");
		a2.deposit(1000000);
		System.out.println("베타고 계좌: 100만원 입금");
	}

	synchronized int getTotal() {
		return a1.balance + a2.balance;
	}
}
