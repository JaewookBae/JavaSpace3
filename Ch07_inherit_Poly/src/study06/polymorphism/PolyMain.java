package study06.polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		Account obj1 = new Account("111-22-3333","임꺽정",10000);
		CheckingAccount obj2 = new CheckingAccount("444-55-666", "홍길동", 20000, "5555-666-777-888");
		CreditLineAccount obj3 = new CreditLineAccount("777-22-3333", "김선달", 3000, 2000000);
		BonusPointAccount obj4 = new BonusPointAccount("352-10-7650", "김미영", 0, 0);
		// 다양한 Type의 객체를 가지고 같은 메소드를 호출
		
		printAccountInfo(obj1);
		printAccountInfo(obj2);
		printAccountInfo(obj3);
		printAccountInfo(obj4);

		System.out.println("-Polymorphism 방법2--------------------------------");
		Account ob = null;
		ob = new Account("111-22-3333","임꺽정",10000);
		printAccountInfo(ob);
		ob = new CheckingAccount("444-55-666", "홍길동", 20000, "5555-666-777-888");
		printAccountInfo(ob);
		ob = new CreditLineAccount("777-22-3333", "김선달", 3000, 2000000);
		printAccountInfo(ob);
		ob = new BonusPointAccount("352-10-7650", "김미영", 0, 0);
		printAccountInfo(ob);
		// 다양한 Type의 객체를 가지고 같은 메소드를 호출
		
	}

	// 다양한 타입의 객체를 한 타입(Account obj)의 파라미터 변수로 받는다.
	static void printAccountInfo(Account obj1) {
		
		System.out.println("계좌번호: " + obj1.accountNo);
		System.out.println("예금주: " + obj1.ownerName);
		System.out.println("잔액: " + obj1.balance);
		System.out.println();
	}
}
