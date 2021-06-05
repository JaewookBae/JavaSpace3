package p02.bytebased_input_outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx1 {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fi = null;
		try {
			fi = new FileInputStream("output.dat");
			while (true) {
				int data = fi.read();
				if (data == -1)
					break;
				System.out.print(data + " ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
		}
		try {
			fi.close();
		} catch (IOException e) {

		}
	}
}