package p13.math_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
//로또 : 1 ~ 45
	public static void main(String[] args) {

		// 선택번호 : 6개
		int[] selectNumber = new int[6];
		Random random = new Random(3L);
		System.out.print("선택 번호: ");// 난수사용
		for (int i = 0; i < selectNumber.length; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		// 당첨번호
		int[] winNumber = new int[6];
		Random r = new Random(5L);
		System.out.print("당첨 번호: ");
		for (int i = 0; i < winNumber.length; i++) {
			winNumber[i] = r.nextInt(45) + 1;
			System.out.print(winNumber[i] + " ");
		}
		System.out.println();
		// 당첨확인
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		boolean result = Arrays.equals(selectNumber, winNumber);
		if (result)
			System.out.println("당첨여부: 1등에 당첨되었습니다.");
		else
			System.out.println("당첨여부: 당첨되지않았습니다.");
	}

}
