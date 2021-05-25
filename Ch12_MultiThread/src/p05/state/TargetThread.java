package p05.state;

public class TargetThread extends Thread {

	@Override
	public void run() {
	
		for(long i = 0; i < 1000; i++)
			System.out.println("a");
		
		try {//Timed_Waiting
			Thread.sleep(1500);
			System.out.println("stop");
		} catch (InterruptedException e) {
			
		}
		
		for(long i = 0; i <1000; i++)
			System.out.println("b");
		
	}
}
