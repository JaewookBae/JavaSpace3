package p03.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetLotto {

	public static void main(String[] args) {

		// Set 로또번호 넣고 출력하기(45, 30, 12, 5, 38, 44)
		HashSet<Integer> lt = new HashSet<>();

		for (int i = 0; 6 > lt.size(); i++) {
			int num = (int) (Math.random() * 45) + 1;
			lt.add(new Integer(num));
		}
		System.out.println(lt);

		// Set에서 순차정렬하기
		List<Integer> list = new LinkedList<>(lt);
		Collections.sort(list);
		System.out.println(list);
	}

}
