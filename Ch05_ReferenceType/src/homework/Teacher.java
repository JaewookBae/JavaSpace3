package homework;

import java.util.Scanner;

public class Teacher {

	// 클래스 변수

		Scanner sc;
		Student st;

		// 기본생성자 : 객체 생성시 초기값 저장시 사용
		public Teacher() {
			sc = new Scanner(System.in);
			st = new Student();
		}

		// 학생정보 입력
		public void input() {
		System.out.println("학생이름 입력");
		st.name = sc.next();
		System.out.println(st.name+"의 국어점수");
		st.kor = sc.nextInt();
		System.out.println(st.name+"의 영어점수");
		st.eng = sc.nextInt();
		System.out.println(st.name+"의 수학점수");
		st.math = sc.nextInt();
		
		}
		// 합계(sum)
		public void sum() {
			int total = st.eng+st.kor+st.math;
			System.out.println(st.name+"의 총점"+total);
		}

		// 평균(avg)
		public void avg() {
			int total = st.eng+st.kor+st.math;
			int avg = total/3;
			System.out.println(st.name+"의 평균"+avg);
		}
}
