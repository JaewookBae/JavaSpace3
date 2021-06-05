package p02_if_switch;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		//키보드 입력을 받아서
		//'A','a' : 사과
		//'P','p' : 배
		//'G','g' : 포도
		//그 나머지는 "?" 출력
		System.out.println("알파벳을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = str.charAt(0);
		
		switch (ch) {
		case 'A': 
		case 'a':	System.out.println("A,a : 사과"); break;
		case 'P': 
		case 'p':	System.out.println("P,p : 배"); break;
		case 'G': 
		case 'g':  	System.out.println("G,g : 포도"); break;
			
		default:
			System.out.println("?");
			break;
		}
		System.out.println("종료");
		sc.close();

	}

}
