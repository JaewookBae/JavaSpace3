package p05.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {

	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	//Function(T, R): T:입력객체, R:리턴객체
	public static void printString(Function<Student, String> function) {
		for (Student student : list) { // list에 저장된 항목 수만큼 루핑
			System.out.println(function.apply(student) + " ");// 람다식 실행
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) { // list에 저장된 항목 수만큼 루핑
			System.out.println(function.applyAsInt(student) + " ");// 람다식 실행
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt(t -> t.getEnglishScore());

		System.out.println("[학생 이름]");
		printInt(t -> t.getMathScore());
	}
}
