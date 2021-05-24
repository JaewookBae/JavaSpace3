package p05.system;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx1 {

	public static void main(String[] args) {

		InputStreamReader reader = new InputStreamReader(System.in);

		try {
			while (true) {

				char ch = (char) reader.read();
				System.out.println("입력된 문자: " + ch);
				if (ch == '.')
					break;
			}
		} catch (IOException e) {
			System.out.println("키보드 입력 에러");
		}
		System.out.println("Done");
	}

}
