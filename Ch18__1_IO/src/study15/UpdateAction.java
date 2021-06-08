package study15;

import java.util.Scanner;

// 3. 회원 정보 수정
public class UpdateAction implements Action {

	@Override
	public void execute(Scanner sc) {

		System.out.println("수정할 이름을 입력하세요?");
		System.out.println("이름: ");
		String name = sc.next();

		MemberVO member = getUpdateMember(name); // 홍길동 정보
		if (member == null) {
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		} else {
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("이메일 : ");
			String email = sc.next();
			System.out.println("국가 : ");
			String nation = sc.next();
			System.out.println("전화번호 : ");
			String tel = sc.next();

			member = new MemberVO(age, name, tel, email, nation);
			for (int i = 0; i < MemberMain.members.length; i++) {
				if (MemberMain.members[i].getName().equals(name))
					MemberMain.members[i] = member; // 배열의 해당 위치를 찾아서 수정된 내용 저장
			}

		}
	}

	private MemberVO getUpdateMember(String name) {// 홍길동을 입력하면 그에 따른 모든 정보를 return

		MemberVO[] members = MemberMain.members;
		MemberVO member = null;

		for (int i = 0; i < MemberMain.members.length; i++) {
			if (members[i].getName().equals(name))
				member = members[i];
		}
		return member;

	}
}
