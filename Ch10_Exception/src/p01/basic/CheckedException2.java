package p01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException2 {
	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("some.txt");
		
				reader.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수가 없습니다.");
		}catch (IOException e) {
			System.out.println("입출력 에러가 발생합니다.");
		}finally {
			System.out.println("정상적인 실행");
		}
		System.out.println("Done");
	}

}
