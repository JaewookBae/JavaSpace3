package study06.polymorphism;

public class CreditLineAccount extends Account {

	public int creditLine;
	
	
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}


	//인출한다 기능을 다시 구현하는메소드
	public int withdraw(int amount) throws Exception{//2단계
		if (balance+creditLine < amount)
			throw new Exception("인출이 불가능합니다.");//1단계
		balance -= amount;//b = b-a
		return amount;
		
	}
}
