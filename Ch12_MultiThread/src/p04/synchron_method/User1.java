package p04.synchron_method;

//작업Thread1
public class User1 extends Thread {

	private Calculator c;// 공유영역

	public void setC(Calculator c) {
		this.setName("User1");// Thread Name 저장
		this.c = c;
	}

	@Override
	public void run() {
		c.setMemory(100);
	}
}
