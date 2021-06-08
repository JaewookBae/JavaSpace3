package study15;

import java.util.Scanner;

// 2. 회원 목록 보기
public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {

		MemberVO[] members = MemberMain.members; // 회원가입한 배열
		System.out.println("members.length: " + members.length);// 1
		if (members.length >= 1) {
			for (int i = 0; i < members.length; i++) {
				System.out.println("이름: " + members[i].getName() + ", 나이: " + members[i].getAge() + ", 전화번호"
						+ members[i].getTel() + ", 국가: " + members[i].getNation() + ", 이메일: " + members[i].getEmail());
			}
		} else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

}
