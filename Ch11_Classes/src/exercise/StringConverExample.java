package exercise;

public class StringConverExample {

	public static void main(String[] args) {

		String str1 = new String("200");
		String str2 = "200";
		String str3 = "200a";

		try {
			int intdata1 = Integer.parseInt(str3);
			System.out.println(intdata1 + 10);
			String stringdata = String.valueOf(150);// 숫자 => 문자형
			System.out.println(stringdata + 10);
		} catch (NumberFormatException e) {
			System.out.println("문자형 숫자를 입력해주세요....");
		}
	}

}
