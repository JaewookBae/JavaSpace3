package p07.string;

public class StringEx1 {

	public static void main(String[] args) {

		String str = "자바커피";

		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 4));

		String fullName = "Hello.java";
		// indexOf(), substring()
		int index = fullName.indexOf('.');
		String str1 = fullName.substring(0, index);
		String str2 = fullName.substring(index + 1);

		System.out.println(fullName + "의 확장자를 제외한 이름은? " + str1);
		System.out.println(fullName + "의 확장자는? " + str2);
	}
}
