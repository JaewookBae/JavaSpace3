package p03.priority;

public class PriorityExample {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			Thread thread = new ClacThread("thread" + i);
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}

	}

}
