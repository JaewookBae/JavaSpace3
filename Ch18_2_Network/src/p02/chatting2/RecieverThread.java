package p02.chatting2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RecieverThread extends Thread {

	Socket sk;

	public RecieverThread(Socket sk) {
		super();
		this.sk = sk;
	}

	@Override
	public void run() {

		try {
			InputStreamReader ir = new InputStreamReader(sk.getInputStream());// 주 스트림
			BufferedReader br = new BufferedReader(ir);// 보조스트림

			while (true) {
				String str = br.readLine();
				if (str == null) // "bye" 입력하면 채팅종료
					break;
				System.out.println("수신>" + str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
