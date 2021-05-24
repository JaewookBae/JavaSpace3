package p03_for_while_dowhile;

public class For_Array {

	public static void main(String[] args) {
		
		String str[] = {"홍길동1","홍길동2","홍길동3"};
	
		int[] arr = {10,20,30,40,50};		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
	System.out.println("------for1-----");
		
		for(int i = 0; i<=4; i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println("---for2:일반for------");
		System.out.println("arr.length()::"+arr.length);

		for(int i = 0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}System.out.println("---for2:일반for - 예외발생하는 경우------");
		System.out.println("ArratIndexOutOfBoundsException:배열의 범위를 벗어났을때 발생");
			
			for(int i = 0; i<arr.length; i++ ) {
				System.out.println(arr[i]);
	}
	System.out.println("---for3:향상된 for-------");
	
	for(int s : arr) {
		System.out.println(s);
	}	
		}
			}
