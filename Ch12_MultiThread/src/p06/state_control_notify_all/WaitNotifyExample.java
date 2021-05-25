package p06.state_control_notify_all;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
	}

}
