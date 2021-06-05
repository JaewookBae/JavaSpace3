package p05.trinary;

import java.util.Scanner;

public class TrinaryEx1 {
	
	//Main()은  JVM(자바가상머신)이 호출해서 사용(실행)
	
	public static void main(String args[]) {

		System.out.println("String args[0] : " + args[0]);
		System.out.println("String args[1] : " + args[1]);
		System.out.println("String[0]+String[1] : " +(args[0] +args[1]));
		
		System.out.println("숫자로 출력하기::");
		int result1 = Integer.parseInt(args[0]);
		int result2 = Integer.parseInt(args[1]);
		int result3 = result1 + result2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int result4 = Integer.valueOf(args[0]);
		System.out.println(result4);
	
		//1. 배열의 첫번째 수를 받아서 삼항연산자를 이용한 짝수 홀수 출력하기
		String msg = (result1 % 2 ==0)?"짝수" : "홀수";
		System.out.println(result1 + "은" + msg+"입니다.");

		//scanner 사용한 입력
		Scanner sc = new Scanner(System.in);
		int results = sc.nextInt();
				
				
		
		//2. 배열의 첫번째 수를 받아서 삼항연산자를 이용한 짝수 홀수 출력하기
		String msg2 = (results % 2 ==0)?"짝수" : "홀수";
		System.out.println(results + "은" + msg2+"입니다.");
	}

}
