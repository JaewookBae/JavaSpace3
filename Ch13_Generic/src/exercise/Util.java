package exercise;

public class Util {

	// 방법 1
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if (p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}

//	// 방법 2
//	public static <P extends Pair<K, V>, K, V> V getValue(P p, K k) {
//		if (p.getKey() == k) {
//			return p.getValue();
//		} else {
//			return null;
//		}
//	}
}
