package study09;

import java.util.Scanner;

public class Mem {

	String name;
	int height, weight, age, tel;
	int c;// 비만도 측정 결과값

	Scanner sc = new Scanner(System.in);

	// 정보입력
	public void in() {
		System.out.println("이름? : ");
		name = sc.next();
		System.out.println(name + "님의 키?");
		height = sc.nextInt();
		System.out.println(name + "님의 몸무게?");
		weight = sc.nextInt();
		System.out.println(name + "님의 나이?");
		age = sc.nextInt();
		System.out.println(name + "님의 전화번호?");
		tel = sc.nextInt();
		System.out.println("----------------------");
	}

	// 입력된 정보 출력
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
		System.out.println("----------------------");
	}

	// 비만도 측정
	public int jung() {
		double b = (height - 100) * 0.9;
		if (weight > b) {
			System.out.println("과체중입니다.");
			c = (int) (weight - b);
		}else if(weight<b) {
			System.out.println("저체중입니다.");
			c = (int) (b - weight);			
		}else {
			System.out.println("표준체중입니다.");
		}
		return c;

	}
}