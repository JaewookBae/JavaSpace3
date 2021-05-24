package p07.user_define_exception;

public class Account {

	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	// 예금
	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException { // 2단계
		if (balance < money)
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + " 모자람");// 1단계
		balance -= money;
	}
}
