package p02.chatting2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sk = null;
		
		try {
			ss = new ServerSocket(5004);
			sk = ss.accept();
			
			Thread t1 = new SenderThread(sk);
			Thread t2 = new RecieverThread(sk);
			t1.start();
			t2.start();
		} catch (IOException e) {
			
		}finally {
			try {
				ss.close();
			} catch (IOException e) {
				
			}
		}

	}

}
