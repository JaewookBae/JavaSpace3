package study10;
//교재 p.618까지 정리

//Synchronized Block, Synchronized Method 구현하기
//은행계좌 클래스
public class Account {

	String accountNo;// 계좌번호
	String ownerName;// 예금주
	int balance;// 잔고

	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 입금
	void deposit(int amount) {
		balance += amount;
	}

	// 출금
	int withdraw(int amount) {
		if (balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
}
