package p03.nchatting;

import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Application;
import javafx.stage.Stage;

public class ServerExample extends Application {

	ExecutorService executorService; // Thread Pool
	ServerSocket serverSocket;

	List<Client> connections = new Vector<>();

	// 1. 서버시작
	void startServer() {

	}

	// 2. 서버종료
	void stopServer() {

	}

	// 3. 중첩클래스(데이터 통신)
	class Client {

	}

	@Override
	public void start(Stage arg0) throws Exception {

	}

	void displayText(String text) {

	}

	public static void main(String[] args) {

		launch(args);
	}
}
