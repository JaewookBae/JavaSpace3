package p03_for_while_dowhile;

public class ContinueEx {

	public static void main(String[] args) {
		
		for(int i = 0; i<=10; i++) {
			if(i%3 == 0) continue;
			System.out.println(" " +i);
		}
		
		System.out.println("=====1~500 짝수의 합 구하기(do-while)=====");
		int sum = 0;
		int count = 0;
		do {
			count++;
			if(count%2 != 0) continue;// 반복문장을 계속실행
			sum += count;//sum = sum+count;
				
		} while(count < 500);
		
		System.out.println("count:: " + count);
		System.out.println("1~500 짝수의 합 : " +sum);
	}

}
