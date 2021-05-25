package exercise;

import java.util.regex.Pattern;
//첫 번째는 알파벳으로 시작하고 두 번째부터 숫자와 알파벳으로 구성된 8자~12자 사이의 ID값인지 검사하고 싶다.
//알파벳은 대소문자를 모두 허용할 경우에 정규 표현식을 이용해서 검증하는 코드를 작성해보자.
public class PatternMatcherExample {

	public static void main(String[] args) {

		String id = "5Angel1004";
		String regExp = "[a-zA-Z][a-zA-z0-9] {7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

	}

}
