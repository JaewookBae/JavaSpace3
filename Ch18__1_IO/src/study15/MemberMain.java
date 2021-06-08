package study15;

import java.util.Scanner;

// 배열크기(고정) => 배열크기(가변)
public class MemberMain {

	static MemberVO[] members; //temp 배열변수

	public static void main(String[] args) {

		MemberService memberservice = new MemberService();
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		members = new MemberVO[0]; // 배열의 길이가 0, 시작1

		do {
			System.out.println("[다음 메뉴 중 하나를 입력하세요.]");
			System.out.println("1.회원 가입 2.회원 목록 보기 3.회원 정보 수정 4.회원 삭제 5.종료");
			String command = sc.next();
			switch (command) {
			case "1":
				AddAction addaction = new AddAction();
				memberservice.process(addaction, sc);
				break;
			case "2":
				ListAction listaction = new ListAction();
				memberservice.process(listaction, sc);
				break;
			case "3":
				UpdateAction updateaction = new UpdateAction();
				memberservice.process(updateaction, sc);
				break;
			case "4":
				DeleteAction deleteaction = new DeleteAction();
				memberservice.process(deleteaction, sc);
				break;
			case "5":
				isStop = true;
				System.out.println("프로그램을 종료합니다.");
			}

		} while (!isStop);
	}

}
