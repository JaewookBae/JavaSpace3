package p07.daemon;

public class DaemonExample {
	// Main Thread(주 Thread)
	public static void main(String[] args) {

		AutoSaveThread as = new AutoSaveThread();
		as.setDaemon(true);// 데몬(보조Thread: 주Thread가 종료하면 보조 Thread는 자동종료) 설정
		as.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("메인 쓰레드 종료.");
	}

}
