package p03_for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class While_InputEx {

	public static void main(String[] args) throws IOException {
		
		System.out.println("만들어질 삼각형의 높이 입력하기?");

//		[결과]
//				x
//				xx
//				xxx
//				xxxx
//				xxxxx
//				xxxxxx
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int height = Integer.parseInt(str);
		int x = 1;
		int y = 1;
		
		while(x <= height) {
			while(y <= x) {
				System.out.print("x");
				y = y+1;
			}
			System.out.println();
			x = x+1;
			y=1;
		}
		System.out.println("---------------------");
		
//		Scanner sc2 = new Scanner(System.in);
//		String str2 = sc.next();
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			String str2 = br.readLine();
			
			int height2 = Integer.parseInt(str2);
			int x2 = 1;
			int y2 = 1;
			
			while(x2 <= height2) {
				while(y2 <= x2) {
					System.out.print("x");
					y2 = y2+1;
				}
				System.out.println();
				x2 = x2+1;
				y2=1;
			}
		} catch (NumberFormatException e) {
			
		} catch (IOException e) {
			
		}
	
		
	}

}
