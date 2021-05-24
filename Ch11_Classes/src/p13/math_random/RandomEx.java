package p13.math_random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		// 난수 출력
		Random ran = new Random();
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());

		// 난수 출력
		Random ran2 = new Random(100L);// Long Seed : 종자값
		System.out.println(ran2.nextInt(100));
		System.out.println(ran2.nextInt(100));
		System.out.println(ran2.nextFloat());
		System.out.println(ran2.nextFloat());

		System.out.println("------------------");
		Random r1 = new Random(5);
		Random r2 = new Random(5);

		for (int i = 0; i < 3; i++)
			System.out.println("r1난수값 : " + r1.nextInt());
		System.out.println();
		for (int i = 0; i < 3; i++)
			System.out.println("r2난수값 : " + r2.nextInt());
		System.out.println();
	}

}
