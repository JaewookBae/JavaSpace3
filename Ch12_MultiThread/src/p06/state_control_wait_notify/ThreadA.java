package p06.state_control_wait_notify;

public class ThreadA extends Thread {

	private WorkObject w;

	public ThreadA(WorkObject w) {
		super();
		this.w = w;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			w.methodA();
	}
}
