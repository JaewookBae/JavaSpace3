package study06.polymorphism;

public class CheckingAccount extends Account {

	String cardNo;//직불 카드번 호
	
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

//인출
	int pay(String cardNo, int amount) throws Exception {//예외 2단계
		if (!cardNo.equals(this.cardNo) || balance < amount)
			throw new Exception("인출이 불가능합니다.");//예외 1단계
		
		return withdraw(amount);
	}
}
