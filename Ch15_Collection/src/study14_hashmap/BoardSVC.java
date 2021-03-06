package study14_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BoardSVC {

	ArrayList<HashMap<String, String>> boardList; // 클래스 안에있기때문에 null 안써도됨(써도되고 안써도됨) 메소드 안에서는 null값 입력

	// 1. 기본생성자
	public BoardSVC() {
		boardList = new ArrayList<>();
	}

	// 2. 입력
	public void writeArticle(Scanner sc) {
		System.out.println("[게시판 글을 작성하세요.");
		System.out.println("작성자: ");
		String register = sc.next();
		System.out.println("이메일: ");
		String email = sc.next();
		System.out.println("비밀번호: ");
		String password = sc.next();
		System.out.println("제목: ");
		String subject = sc.next();
		System.out.println("글내용: ");
		String content = sc.next();

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("작성자", register);
		hm.put("이메일", email);
		hm.put("비밀번호", password);
		hm.put("제목", subject);
		hm.put("글내용", content);
		
		addArticle(hm);		
		//BoardVO boardVO = new BoardVO(register, subject, email, content, password); // 가장중요 핵심!!
		//addArticle(boardVO);
	}

	// 3. 입력 내용을 ArrayList에 넣기
	private void addArticle(HashMap<String, String> hm) {
		boardList.add(hm);
	}

	// 4. 글 목록 보기
	public void listArticles() {
		if (boardList.size() > 0) {
			for (int i = 0; i < boardList.size(); i++)
				System.out.println(boardList.get(i));
		} else
			System.out.println("등록된 글이 없습니다.");
	}

	// 5. 글 삭제 위한 입력
	public void removeArticle(Scanner sc) {
		System.out.println("[제거할 글의 작성자와 비밀번호를 입력하세요]");
		System.out.println("작성자: ");
		String register = sc.next();
		System.out.println("비밀번호: ");
		String password = sc.next();

		removeArticle(register, password);
	}

	// 6. 글삭제 동작(실행)
	public void removeArticle(String register, String password) {
		if (boardList.size() > 0) {
			int index = -1;
			for (int i = 0; i < boardList.size(); i++) {
				if (boardList.get(i).get("작성자").equals(register)) {
					if (boardList.get(i).get("비밀번호").equals(password)) {
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
			}
			if (index == -1) {
				System.out.println("해당 작성자가 없거나 비밀번호가 일치하지 않습니다.");
				return;
			}
		} else {
			System.out.println("작성된 글이 존재하지 않습니다.");
		}
	}

}
