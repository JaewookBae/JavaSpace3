package p02.basic;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() 호출");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() 호출");

	}

	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println(Thread.currentThread().getName() + ": start() 호출");

	}

	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": stop() 호출");

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": Main() 호출");
		launch(args);
	}
}
