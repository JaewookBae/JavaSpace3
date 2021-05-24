package p06.array;

public class Array_String {

	public static void main(String[] args) {
		System.out.println("---String 배열 생성---");
		// 배열의 형태: "홍길동1", "홍길동2", "홍길동3"
		// (1)
		String[] arr1 = {"홍길동1","홍길동2","홍길동3"};
		System.out.println("배열의 크기: " + arr1.length);
		System.out.println("배열의 첫번째: " + arr1[0]);// index = 0,1,2,,,,

		// (2)
		String arr2[] = new String[3];// 크기(갯수)
		arr2[0] = "홍길동1";
		arr2[1] = "홍길동2";
		arr2[2] = "홍길동3";
		System.out.println(arr2[0]);

		// (3)
		String[] arr3 = new String[] {"홍길동1","홍길동2","홍길동3" };
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);

		// 일반 for
		System.out.println("---일반for---");
		for (int i = 0; i < arr3.length; i++)
			System.out.println(arr3[i]);

		// 향상된 for
		System.out.println("---향상된 for---");
		for (String i : arr3)
			System.out.println(i);

	}

}
