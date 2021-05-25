package p06.state_control_join;

public class JoinExample {

	public static void main(String[] args) {
		//Work Thread
		SumThread st = new SumThread();
		st.start();
		
		//방법1
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		
		//방법2
		try {
			st.join();//work Thread종료를 기다리고 있음
		} catch (InterruptedException e) {
		
		}
		
		//Main Thread
		System.out.println(st.getSum());

	}

}
