package homework;

import java.util.Scanner;

public class SchoolMain {

		//프로그램 시작
		public static void main(String[] args) {
			
			Teacher te = new Teacher();//기본 생성자
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("1. 학생정보 입력");
				System.out.println("2. 학생총점 출력");
				System.out.println("3. 학생평균 출력");
				System.out.println("4. 프로그램 종료");
			
			
				int select = sc.nextInt();
				if(select == 1)
					te.input();
				else if(select == 2)
					te.sum();
				else if(select == 3)
					te.avg();
				else {
					System.out.println("프로그램 종료");
					break;
				}
			}
			sc.close();

	}

}
