package exercise;

public class Account19 {

	static final int min_balance = 0;
	static final int max_balance = 1000000;
	private int balance;//잔고
	
	public int getBalance() {
		return balance;
	}
	//계좌저장
	public void setBalance(int balance) {
		if(balance < Account19.min_balance || balance > Account19.max_balance)
			return;
		this.balance = balance;
	}
}
