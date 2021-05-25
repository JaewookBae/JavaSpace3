package p06.state_control_notify_all;

public class ProducerThread extends Thread {

	private DataBox databox;

	public ProducerThread(DataBox databox) {
		this.databox = databox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			databox.setData(data);
		}
	}
}
