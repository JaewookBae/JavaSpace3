package exercise;

public class AccountEx19 {

	public static void main(String[] args) {
		
		Account19 a = new Account19();//저장 방법1
//		a.balance = 10000///저장 방법2
		a.setBalance(10000);//저장 방법3
		System.out.println("현재 잔고: "+ a.getBalance());
		
		a.setBalance(-100);
		System.out.println("현재 잔고: "+ a.getBalance());//기존값 출력
	
		a.setBalance(2000000);
		System.out.println("현재 잔고: "+ a.getBalance());

		a.setBalance(300000);
		System.out.println("현재 잔고: "+ a.getBalance());
	}

}
