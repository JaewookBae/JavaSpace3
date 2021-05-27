package exercise10;

public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new MovieThread();
		thread.setDaemon(true);//Main Thread가 종료하면, 보조Thread(Daemon) 자동종료
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}

	}

}
