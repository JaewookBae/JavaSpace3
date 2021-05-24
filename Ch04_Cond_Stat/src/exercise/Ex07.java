package exercise;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;//잔고
		
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			int money = 0;
			
			switch(number){
				case 1:
					System.out.println("예금액>");
					money = sc.nextInt();//b = b+i				
					balance += money;
					break;//반복문 탈출
				case 2:
					System.out.println("출금액>");
					money = sc.nextInt();//b = b+i
					balance -= money;
					break;//반복문 탈출
				case 3:
					System.out.println("잔고> " + balance);
					break;//반복문 탈출
				case 4:
					run = false;
					break;//반복문 탈출
			}
			
		}

		System.out.println("프로그램 종료");
	}

}
