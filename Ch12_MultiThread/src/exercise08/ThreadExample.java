package exercise08;

public class ThreadExample {

	public static void main(String[] args) {
		//Work Thread 시작
		Thread thread = new MovieThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		thread.interrupt();//쓰레드의 안전한 종료 new, old: stop()
	}

}
