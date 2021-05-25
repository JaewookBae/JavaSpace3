package p02.multi_runnable_interface;

public class BeefPrintExample {

	public static void main(String[] args) {

		//Runnable를 사용하는 방법(p.580)
		BeepTask b = new BeepTask();
		Thread t1 = new Thread(b);
		t1.start();

		Runnable b2 = new BeepTask();
		Thread t2 = new Thread(b2);
		t2.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}

}
