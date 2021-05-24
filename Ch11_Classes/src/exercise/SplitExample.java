package exercise;

import java.util.StringTokenizer;

import p08.stringtokenizer.StringTokenizeEx1;

public class SplitExample {

	public static void main(String[] args) {

		String str = "아이디, 이름, 패스워드";

		// 방법1: split() 메소드 이용
		String[] name = str.split(",");
		for (String s : name)
			System.out.println(s);

		System.out.println();

		// 방법2: StringTokenizer 이용
		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken(","));
		}

	}

}
