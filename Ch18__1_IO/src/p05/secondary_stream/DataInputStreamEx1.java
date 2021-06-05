package p05.secondary_stream;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {

		FileInputStream fi;
		DataInputStream di = null;
		try {
			// 상대경로 파일
//			fi = new FileInputStream("src/p05/secondary_stream/DataOutput.dat");
			//절대경로 파일1 : Window
//			fi = new FileInputStream("C:\\JavaSpace3\\Ch18__1_JO\\src\\p05\\secondary_stream/DataOutput.dat");
			//절대경로 파일2 : Linux
			fi = new FileInputStream("C:/JavaSpace3/Ch18__1_JO/src/p05/secondary_stream/DataOutput.dat");
			di = new DataInputStream(fi);
			while (true) {
				int data = di.readInt();
				System.out.print(data + " ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File is not found.");
		} catch (EOFException e) {
			System.out.println("THE END");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		try {
			di.close();
		} catch (IOException e) {
		
		}
	}

}
