package study14_hashmap;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		BoardSVC boardSVC = new BoardSVC();
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("##메뉴를 입력하세요##");
			System.out.println("1.게시판 글쓰기  2.글 목록 보기 3.글 삭제  4.종료");
			String menu = sc.next();
			
			switch (menu) {
			case "1": boardSVC.writeArticle(sc); break;
			case "2": boardSVC.listArticles(); break;
			case "3": boardSVC.removeArticle(sc); break;
			case "4": isStop = true;
			
			}
		} while (!isStop);
	}
}
