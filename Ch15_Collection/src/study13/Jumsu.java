package study13;

import java.util.Scanner;

public class Jumsu {

	public static void main(String[] args) {

		boolean check = false;
		Scanner sc = new Scanner(System.in);
		String name = null;
		int kor = 0, eng = 0, math = 0, sum = 0;
		double avg = 0.0;

		int dbId = 1111;
		int dbPw = 0000;

		for (int i = 0; i < 5; i++) {

			System.out.println("ID를 입력하세요");
			int uId = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int uPw = sc.nextInt();
			if (uId == dbId && uPw == dbPw) {
				System.out.println("로그인 성공!");
				i = 5; // 반복문 탈출
				check = !check;
			}
		}

		while (check) {// 로그인이 되었을 때
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생총점출력");
			System.out.println("3. 학생평균출력");
			System.out.println("4. 프로그램종료");

			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("이름 입력: ");
				name = sc.next();
				System.out.println("국어점수 입력: ");
				kor = sc.nextInt();
				System.out.println("영어점수 입력: ");
				eng = sc.nextInt();
				System.out.println("수학점수 입력: ");
				math = sc.nextInt();
			} else if (select == 2) {
				sum = kor + eng + math;
				System.out.println(name + "의 총점: " + sum);
			} else if (select == 3) {
				avg = sum / 3.0;
				System.out.println(name + "의 평균: " + avg);
			} else if (select == 4) {
				System.out.println("프로그램종료.");
				break;
			}
		}
	}
}
