package exercise;

public class StringBuilderExample {

	public static void main(String[] args) {

		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);

		// 개선 코드 작성 위치
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i);// 맨끝에 추가
		}
		System.out.println(sb);
	}

}
