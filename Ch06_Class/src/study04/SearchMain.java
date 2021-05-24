package study04;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SearchService sv = new SearchService();//기본생성자 실행

		do {
			System.out.println("검색할 회원 이름을 입력하세요.");
			String name = sc.next();//홍길동
			boolean searchResult = sv.searchMember(name);//true
			if (searchResult)
				break;
			System.out.println("해당 회원이 없습니다.");
		} while (true);
		sc.close();
	}

}
