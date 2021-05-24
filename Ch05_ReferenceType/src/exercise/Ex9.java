package exercise;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int sum = 0;
		double avg = 0;
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				
				System.out.println("학생수>");
				studentNum = sc.nextInt();
				scores = new int[studentNum];//학생수 = 배열의 크기
			
			}else if(selectNo == 2) {
			
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = sc.nextInt();		
				}
				
			} else if(selectNo == 3) {

				for(int i = 0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>" + scores[i]);				
				}				
			
			}else if(selectNo == 4) {
				
				for(int i = 0; i<scores.length; i++) {
					//if(max<scores[i]) max = scores[i];
					max = (max<scores[i])? scores[i] : max;
					sum += scores[i];
					}				
				avg = (double) sum/studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
		
			} else if(selectNo == 5) {
			run = false;
		}
	}
		System.out.println("프로그램 종료");
		sc.close();
	}
}