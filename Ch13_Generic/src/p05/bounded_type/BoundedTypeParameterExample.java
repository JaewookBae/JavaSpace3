package p05.bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);

		int result2 = Util.compare(10.0, 20);
		System.out.println(result2);
		
//		int result2 = Util.compare("10.0", "20");
//		System.out.println(result2);
	
	}

}
