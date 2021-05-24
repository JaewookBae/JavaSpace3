package p02_if_switch;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {

		int score = 30;
		if (score >= 90) {
			System.out.println("A");
			System.out.println("최고 등급입니다.");
		} else if (score >= 80) 
			System.out.println("B");
		else if (score >= 70) 
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	
		//Math.random() : 난수 얻기(0.0~0.9999999999...)
		int num = (int) (Math.random()*6) + 1;//로또번호는 *45
		System.out.println(num);
			
			System.out.println("----------------------");
		
		//Scanner 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("x 입력? ");
		int x = sc.nextInt(); 

		System.out.println("y 입력? ");
		int y = sc.nextInt(); 

		System.out.println("z 입력? ");
		int z = sc.nextInt(); 

		
		if(y>x) {
			if(z>y) 
					System.out.println("y는 x보다 크고, z보다 작다.");
			else
				System.out.println("y는 x보다 크고, z보다 작다.");
			
		}else {
			System.out.println("y는 x보다 작다.");
		}
		
		}
}
