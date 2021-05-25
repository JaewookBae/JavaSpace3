package exercise;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		
		String str = "95";
		// Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<String, String> hashMap = new HashMap<String, String>();

		// new Student("1")의 점수 95를 저장
		hashMap.put(new String("1"), new String("95"));
		
		// new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new String("1"));
		System.out.println("1번 학생의 총점: " + score);

		
		HashMap<Student, String> hashMap2 = new HashMap<Student, String>();
		// new Student("1")의 점수 95를 저장
		hashMap2.put(new Student("1"), "95");
		
		// new Student("1")로 점수를 읽어옴
		String score2 = hashMap2.get(new Student("1"));
		System.out.println("1번 학생의 총점: " + score2);
	}

}
