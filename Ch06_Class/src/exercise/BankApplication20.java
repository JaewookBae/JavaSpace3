package exercise;

import java.util.Scanner;

public class BankApplication20 {

	private static Scanner sc = new Scanner(System.in);
	private static Account20[] accountArray = new Account20[100];//배열의 크기

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1)
				createAccount();
			else if (selectNo == 2)
				BankApplication20.accountList();
			else if (selectNo == 3)
				deposit();
			else if (selectNo == 4)
				withdraw();
			else if (selectNo == 5)
				run = false;
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

	// 1.계좌 생성
	private static void createAccount() {
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");
		System.out.println("계좌번호");
		String ano = sc.next();
		System.out.println("예금주");
		String owner = sc.next();
		System.out.println("초기입금액");
		int balance = sc.nextInt();

		Account20 newAccount = new Account20(ano, owner, balance);//첫번째 배열
		for (int i = 0; i < accountArray.length; i++)
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;// 반복문장 탈출
			}
	}

	// 2.계좌 목록
	private static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록");
		System.out.println("----------------");

		for (int i = 0; i < accountArray.length; i++) {
			Account20 a = accountArray[i];
			if (a != null) {
				System.out.print(a.getAno() + " ");
				System.out.print(a.getOwner() + " ");
				System.out.print(a.getBalance());
				System.out.println();
			}
		}
	}

	// 3.예금
	private static void deposit() {

		System.out.println("----------------");
		System.out.println("입금");
		System.out.println("----------------");
		System.out.println("계좌번호");
		String ano = sc.next();
		System.out.println("입금액");
		int money = sc.nextInt();
		Account20 account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("예금 입금 성공!");
	}

	// 4.출금
	private static void withdraw() {

		System.out.println("-----------------");
		System.out.println("출금");
		System.out.println("----------------");
		System.out.println("계좌번호");
		String ano = sc.next();
		System.out.println("출금액");
		int money = sc.nextInt();
		Account20 account = findAccount(ano);
		if(account == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("예금 출금 성공!");
	}

	// 5.배열(계좌번호)과 입력(계좌번호) 비교한 객체 찾기
	private static Account20 findAccount(String ano) {

		Account20 a = null;
		for (int i = 0; i < accountArray.length; i++)
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					a = accountArray[i];
					break;
				}
			}
		return a;
	}
}
