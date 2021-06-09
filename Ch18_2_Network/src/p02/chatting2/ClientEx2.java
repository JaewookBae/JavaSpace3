package p02.chatting2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx2 {

	public static void main(String[] args) {
		Socket sk = null;
		
		try {
			sk = new Socket("127.0.0.1", 5004);
			Thread t1 = new SenderThread(sk);// 송신
			Thread t2 = new RecieverThread(sk);// 수신
			t1.start(); //SenderThread 찾아가서 실행
			t2.start(); //RecieverThread 찾아가서 실행
			
		} catch (UnknownHostException e) {
		
		} catch (IOException e) {
		
		}

	}

}
