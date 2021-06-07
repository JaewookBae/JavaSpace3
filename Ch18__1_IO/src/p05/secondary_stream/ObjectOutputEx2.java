package p05.secondary_stream;

//직렬화(Serialzable) 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputEx2 {

	public static void main(String[] args) {

		ObjectOutputStream ot = null;
		try {
			FileOutputStream fs = new FileOutputStream("object.dat");

			ot = new ObjectOutputStream(fs);
			ot.writeObject(new GoodStock("1111", 100));
			ot.writeObject(new GoodStock("2222", 200));
			ot.writeObject(new GoodStock("3333", 300));

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		try {
			ot.close();
		} catch (IOException e) {

		}

	}

}
