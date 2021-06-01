package exercise;
//Function 인터페이스 : 매개값, 리턴값, 주로 타입변환

//ToIntFunction<T> : 객체 T => int로 형변환

import java.util.function.ToIntFunction;

public class LambdaEx6 {

	private static Student s[] = { new Student("홍길동", 90, 96), new Student("알파고", 95, 93) };

	public static double avg(ToIntFunction<Student> tf) {

		int sum = 0;
		for (Student st : s)
			sum += tf.applyAsInt(st);
		double avg = (double) sum / s.length;
		return avg;
	}

	public static void main(String[] args) {

//		ToIntFunction<Student> tf = new ToIntFunction<Student>() {
//			@Override
//			public int applyAsInt(Student s) {
//				s.getEnglishScore();
//				return 0;
//			}
//		};
//		tf.applyAsInt(s);

		double engavg = avg(s -> s.getEnglishScore());
		System.out.println("영어평균점수: " + engavg);

		double mathavg = avg(s -> s.getMathScore());
		System.out.println("수학평균점수: " + mathavg);
	}

}
