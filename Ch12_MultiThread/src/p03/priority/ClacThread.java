package p03.priority;

public class ClacThread extends Thread {

	public ClacThread(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 20000000; i++) {

		}
		System.out.println(getName());
	}
}
