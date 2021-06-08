package study15;

import java.util.Scanner;

// 1. 회원정보
public class AddAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("등록할 회원의 정보를 입력하세요.");
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("이메일 : ");
		String email = sc.next();
		System.out.println("국가 : ");
		String nation = sc.next();
		System.out.println("전화번호 : ");
		String tel = sc.next();

		MemberVO member = new MemberVO(age, name, tel, email, nation);

		addMember(member);
	}

// 	index : 0,1,2,3,,,,,
//	length : 1,2,3,4,,,,,
//	배열에 MemberVO단위 추가 
	private void addMember(MemberVO member) {
		System.out.println("MemberMain.members.length : " + MemberMain.members.length);
		MemberVO[] temp = new MemberVO[MemberMain.members.length + 1]; // 길이가 1, 새로운 배열
		for (int i = 0; i < MemberMain.members.length; i++)
			temp[i] = MemberMain.members[i];

		temp[temp.length - 1] = member; // MemberVO를 배열의 첫번쨰에 저장, temp.length = 1 
		MemberMain.members = temp; // 0 => 1
	}
}
