package p02_if_switch;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// Scanner
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.next());
		char grade;
		
		switch (score / 10) {
		case 10: grade = 'S';
			break;
		case 9: grade = 'A';
			break;
		case 8: grade = 'B';
			break;
		case 7: grade = 'C';
			break;
		case 6: grade = 'D';
			break;

		default: grade = 'F';
			break;
		}
		System.out.println("학점은? = " + grade);

	}

}
