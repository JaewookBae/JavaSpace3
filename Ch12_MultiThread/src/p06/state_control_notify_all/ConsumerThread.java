package p06.state_control_notify_all;

public class ConsumerThread extends Thread {

	private DataBox databox;

	public ConsumerThread(DataBox databox) {
		this.databox = databox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			databox.getData();
		}
	}
}
