package p11.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayCopyExample {
	public static void main(String[] args) {

		char[] arr1 = { 'J', 'A', 'V', 'A' };
		System.out.println(arr1);

		// 일반 for
		for (int i = 0; i < arr1.length; i++)
			System.out.println(arr1[i]);
		// 향상된 for
		for (char c : arr1)
			System.out.println(c);
		System.out.println("---------------------");
		System.out.println(Arrays.toString(arr1));

		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));

		char[] arr3 = Arrays.copyOfRange(arr1, 0, 4);// -1
		System.out.println(Arrays.toString(arr3));

		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for (char c : arr4)
			System.out.print(c);

		// 방법5
		List<char[]> list = Arrays.asList(arr1);
		System.out.println(list);

		String[] str = { "D", "A", "B", "C" };
		List<String> list2 = Arrays.asList(str);
		System.out.println(list2);
	}
}
