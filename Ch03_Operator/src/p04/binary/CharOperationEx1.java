package p04.binary;

public class CharOperationEx1 {

	public static void main(String[] args) {
		
		char c1 = 'A' +1; // 65+1 = 66
		int i1 = c1;//66은 문자로 바뀐다
		System.out.println(c1);//B
		System.out.println(i1);//66
		
		char c2 = 'A';
		System.out.println(c2);
		
		char c3 = (char) (c2 + 1);//char + int =>int: 강제형변환
		System.out.println(c3);
	}

}
