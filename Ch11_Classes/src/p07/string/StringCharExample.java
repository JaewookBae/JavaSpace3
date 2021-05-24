package p07.string;

public class StringCharExample {

	public static void main(String[] args) {

		String ssn = new String("940318-1873982");
		String ssn2 = "940318-1873982";
		char k = ssn.charAt(7);
		switch (k) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
