package p01.generic_basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Generic_No {

	public static void main(String[] args) {
		// 0. 배열: 배열크기 결정, 자료가 순차적으로 중복적
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		// 1. Generic No: 타입에 관계없이 저장 가능,강제형번환(Casting) 필요
		// ArrayList: 동적배열 크기, 자료가 순차적이고 중복적
		ArrayList a1 = new ArrayList();
		a1.add(new String("홍길동"));
		a1.add(10);
		a1.add(new Integer(10));
		a1.add(12.55);
		a1.add('a');
		a1.add(new Phone());
		
		// 출력1
		System.out.println("1---------------");
		System.out.println(a1);
		
		// 출력2
		System.out.println("2---------------");
		for (int i = 0; i < a1.size(); i++)
			System.out.println(a1.get(i));
		
		// 출력3
		System.out.println("3---------------");
		for (Object s : a1)
			System.out.println(s);
		
		// 출력4
		System.out.println("4---------------");		
		Iterator it = a1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 출력2 + 출력4 = 출력5
		System.out.println("5---------------");		
		for (Iterator it2 = a1.iterator();it.hasNext();) {
			Object name = it2.next();
			System.out.println(name);
		}
		
		String s = (String) a1.get(0);//Casting
		int in = (int) a1.get(1);
		System.out.println(s);
		
		Phone p = (Phone) a1.get(5);
	}

}
