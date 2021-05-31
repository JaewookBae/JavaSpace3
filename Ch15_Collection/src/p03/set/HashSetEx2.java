package p03.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();
		hs.add(new String("abc"));
		hs.add(new String("abc"));
		hs.add(new Person("David", 10));// 반드시 hashcode(), equals() 재정의
		hs.add(new Person("David", 10));
		hs.add(new Float(3.14F));
		hs.add(234);

		System.out.println(hs);
		System.out.println(hs.size());// 3

		// Advanced for
		for (Object o : hs)
			System.out.print(o + " ");
		System.out.println();

		// iterator()
		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " , ");
		}

	}
}