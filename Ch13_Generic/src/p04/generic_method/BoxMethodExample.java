package p04.generic_method;

public class BoxMethodExample {

	public static void main(String[] args) {
		Box<Integer> b1 = Util.boxing(100);
		int intvalue = b1.getT();
		System.out.println(intvalue);

		Box<String> b2 = Util.boxing("홍길동");
		String name = b2.getT();
		System.out.println(name);

	}

}
