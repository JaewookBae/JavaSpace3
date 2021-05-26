package p04.synchron_method;
//p.595
//공유영역(Shared Area): 일반클래스
//동기화(synchronized) 메소드
public class Calculator {

	private int memory;// u1:100->u2:50

	public int getMemory() {
		return memory;
	}

	//일시정지 : Waiting - Notify()실행이 돼야 사용가능
	//		: Blocked
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);//일시정지: Timed_Waiting
		} catch (InterruptedException e) {

		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}
