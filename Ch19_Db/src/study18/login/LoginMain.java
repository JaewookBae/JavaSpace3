package study18.login;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		boolean isStop = false;
		LoginSVC ls = new LoginSVC();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("로그인 화면입니다");
			System.out.println("ID & PW를 입력하세요");
			System.out.println("아이디: ");
			String id = sc.next();
			System.out.println("비밀번호: ");
			String password = sc.next();
			User u = ls.login(id, password);

			if (u == null) {
				System.out.println("id,pw가 일치하지 않습니다");
			} else {
				System.out.println("로그인한 사용자 정보");
				System.out.println(u);
				isStop = true;
			}

		} while (!isStop);
		sc.close();
	}

}