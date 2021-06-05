package p04.binary;

public class BitReverseOperatorEx {

	public static void main(String[] args) {
		BitReverseOperatorEx bo = new BitReverseOperatorEx();
		
		int v1 = 10; //00000000 00000000 00000000 00001010
		int v2 = ~v1; // ~ : not : 0101 = -11
		int v3 = ~v1+1; // ~ : not : 0110 = -10
		System.out.println(bo.toBinaryString(v1)+"(십진수: " + v1 + ")");
		System.out.println(bo.toBinaryString(v2)+"(십진수: " + v2 + ")");
		System.out.println(bo.toBinaryString(v3)+"(십진수: " + v3 + ")");
		System.out.println();

		
		int v4 = -10; 
		int v5 = ~v4; // 9
		int v6 = ~v4+1; // 10
		System.out.println(bo.toBinaryString(v4)+"(십진수: " + v4 + ")");
		System.out.println(bo.toBinaryString(v5)+"(십진수: " + v5 + ")");
		System.out.println(bo.toBinaryString(v6)+"(십진수: " + v6 + ")");
		System.out.println();
	}

	public String toBinaryString(int value) {

		String str = Integer.toBinaryString(value);
		System.out.println("str: " + str); //1010
		System.out.println("length() : " + str.length());
		while(str.length() < 32) {
			str = "0" +str;
			System.out.println(str.length()); //4
		}
		return str;
	}
}
