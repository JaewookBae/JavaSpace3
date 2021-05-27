package exercise02;

public class ThreadExample {

	public static void main(String[] args) {
		
//		MovieThread thread1 = new MovieThread();
//		MusicThread thread2 = new Thread(new MusicRunnable());
//		thread1.start();
//		thread2.start();
//
//		Thread thread1 = new MovieThread();
//		Thread thread2 = new MusicRunnable();
//		thread1.start();
//		thread2.start();
		
		Thread thread1 = new MovieThread();
		Thread thread2 = new Thread(new MusicRunnable());
		thread1.start();
		thread2.start();

	}

}
