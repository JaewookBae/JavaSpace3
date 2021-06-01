package p05.search;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
//Search :  TreeMap - 자동정렬, Map.Entry 형태로 저장, 부모키값과 비교해서 작으면 왼쪽, 크면 오른쪽 위치해서 저장

public class TreeMapEx1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(new Integer(87), new String("홍길동1"));
		tm.put(new Integer(98), new String("홍길동2"));
		tm.put(new Integer(75), new String("홍길동3"));
		tm.put(new Integer(100), new String("홍길동4"));
		tm.put(new Integer(90), new String("홍길동5"));

		System.out.println(tm); // 자동 정렬 : 오름차순

		// 내림차순
		// NavigableMap<K,V> descendingMap() : 내림차순으로 정렬된 Map.Entry의 NavigableMap 리턴
		NavigableMap<Integer, String> nm = tm.descendingMap();
		Set<Map.Entry<Integer, String>> des = nm.entrySet();
		for (Map.Entry<Integer, String> entry : des)
			System.out.println(entry.getKey() + " : " + entry.getValue());
		System.out.println();
		// 오름차순

		NavigableMap<Integer, String> am = nm.descendingMap();
		Set<Map.Entry<Integer, String>> aes = am.entrySet();
		for (Map.Entry<Integer, String> entry : aes)
			System.out.println(entry.getKey() + " : " + entry.getValue());
	}

}
