package p02.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
//Vector : Synchronized 메소드로 구성
public class VectorEx2 {

	public static void main(String[] args) {

		Vector<Woman> v1 = new Vector<Woman>();

		v1.add(new Woman("알파고", 10));
		v1.add(new Woman("베타고", 20));

		System.out.println(v1);
		System.out.println("----------");

		// for
		for (int i = 0; i < v1.size(); i++) {
			System.out.println(v1.elementAt(i) + " ");
		}
		System.out.println("----------");
		// elements()
		Enumeration<Woman> e = v1.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
		System.out.println("----------");

		for (Enumeration<Woman> e2 = v1.elements(); e2.hasMoreElements();)
			System.out.println(e2.nextElement());
		System.out.println("----------");

		// iterator()
		Iterator<Woman> it = v1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
