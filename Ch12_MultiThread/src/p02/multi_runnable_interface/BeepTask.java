package p02.multi_runnable_interface;

import java.awt.Toolkit;

//Thread를 만드는 방법2
//Runnable: start()가 없으므로 Thread 객체생성해서 start사용
public class BeepTask implements Runnable {

	@Override
	public void run() {

		Toolkit tk = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tk.beep();
			System.out.println("ㅠㅠㅠ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
