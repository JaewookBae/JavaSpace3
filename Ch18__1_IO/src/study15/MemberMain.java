package study15;

public class MemberMain {

	static MemberVO[] members;
	
	public static void main(String[] args) {
		

		boolean isStop = false;
		do {
			System.out.println("[다음 메뉴 중 하나를 입력하세요.]");
			System.out.println("1.회원 가입 2.회원 목록 보기 3.회원 정보 수정 4.회원 삭제 5.종료");
		}while(!isStop);
	}

}
